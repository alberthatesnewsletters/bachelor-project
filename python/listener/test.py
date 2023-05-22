# For Listener traversal of an AST

import antlr4 as antlr
from CSVLexer import CSVLexer
from CSVParser import CSVParser
from listener import Listener
import datetime
import pyRAPL
import memory_profiler
import sys
import time

def run(iterations):
    files = ['data/1000.csv',
            'data/2000.csv',
            'data/4000.csv',
            'data/8000.csv']

    # if running directly
    # files = ['../data/1000.csv',
    # '../data/2000.csv',
    # '../data/4000.csv',
    # '../data/8000.csv']

    iterations = int(iterations)
    
    pyRAPL.setup()
    csv_output = pyRAPL.outputs.CSVOutput('../listener rapl.csv')

    @pyRAPL.measureit(output = csv_output)
    def timeTrial(tree, walker, listener):
        walker.walk(listener, tree)

    # txt files for memory and runtime results
    mem_output = open('../listener mem.txt', 'w+')
    runtime = open('../listener_runtime.txt', 'w+')

    @memory_profiler.profile(stream = mem_output)
    def memTrial(tree, walker, listener):
        walker.walk(listener, tree)

    print('Running Listener tests...')

    # iterating through files
    for file in files:
        print('\n=== Working on file', file, '===')
        print(datetime.datetime.now(), ': Parsing file...')

        input = antlr.FileStream(file, 'utf-8')
        lexer = CSVLexer(input)
        tokens = antlr.CommonTokenStream(lexer)
        parser = CSVParser(tokens)

        print(datetime.datetime.now(), ': Building tree...')
        tree = parser.csvFile() # root/entry rule/entry
        print(datetime.datetime.now(), ': Observing/Listening tree; energy tests commencing...')

        for _ in range(iterations):
            walker = antlr.ParseTreeWalker()
            listener = Listener()
            timeTrial(tree, walker, listener)

        print(datetime.datetime.now(), ': Energy tests complete. Memory tests commencing...')

        for _ in range(iterations):
            walker = antlr.ParseTreeWalker()
            listener = Listener()
            memTrial(tree, walker, listener)

        print(datetime.datetime.now(), ': Memory tests complete. Runtime tests commencing...')
    
        for _ in range(iterations):
            walker = antlr.ParseTreeWalker()
            listener = Listener()
            start = time.time()
            walker.walk(listener, tree)
            end = time.time()
            elapsed = (end - start) * 1000000 # micro
            runtime.write(str(round(elapsed, 3)) + "\n")

        print(datetime.datetime.now(), ': Runtime tests complete.')

        csv_output.save()
        print(f"\n{datetime.datetime.now()} : Done with {file}")

    mem_output.close()
    runtime.close()

if __name__ == "__main__":
    run(sys.argv[1])
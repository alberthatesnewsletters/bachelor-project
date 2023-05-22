# For patternless traversal of an AST
# In practice, it uses the algorithm sprawl that visitor solves

import antlr4 as antlr
from CSVLexer import CSVLexer
from CSVParser import CSVParser
from patternless import patchParserWithGetValueFunction, patchAntlrBaseClass
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
    # '../data/8000.csv'

    iterations = int(iterations)

    # CSVParser class is patched with patternless methods
    patchParserWithGetValueFunction(CSVParser)

    # Adding getValue method to the base tree node class
    patchAntlrBaseClass(antlr)

    pyRAPL.setup()
    csv_output = pyRAPL.outputs.CSVOutput('../patternless rapl.csv')

    @pyRAPL.measureit(output = csv_output)
    def timeTrial(tree):
        tree.getValue()

    # txt files for memory and runtime results
    mem_output = open('../patternless mem.txt', 'w+')
    runtime = open('../patternless_runtime.txt', 'w+')

    @memory_profiler.profile(stream = mem_output)
    def memTrial(tree):
        tree.getValue()

    print('Running patternless tests...')

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
        print(datetime.datetime.now(), ': Walking tree patternlessly; energy tests commencing...')
        
        for _ in range(iterations):
            timeTrial(tree)

        print(datetime.datetime.now(), ': Energy tests complete. Memory tests commencing...')

        for _ in range(iterations):
            memTrial(tree)

        print(datetime.datetime.now(), ': Memory tests complete. Runtime tests commencing...')

        for _ in range(iterations):
            start = time.time()
            tree.getValue()
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
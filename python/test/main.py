# For verifying that the patterns agree on the results. Not for measuring.
# Grammar is compiled to work with all three.

import antlr4 as antlr
from CSVLexer import CSVLexer
from CSVParser import CSVParser
from patternless import patchParserWithGetValueFunction, patchAntlrBaseClass
from visitor import Visitor
from listener import Listener
import datetime

# difference between two dictionaries
def difference(dict1, dict2, name1, name2):
    if dict1 != dict2:
        keys1 = set(dict1.keys())
        keys2 = set(dict2.keys())
        print(f"Keys in {name1} but not {name2} dictionary:  {keys1 - keys2}")
        print(f"Keys in {name2} but not {name1} dictionary:  {keys2 - keys1}")
    else:
        print(f"{name1} and {name2} dictionaries have equal keys")


files = ['../data/1000.csv',
         '../data/2000.csv',
         '../data/5000.csv',
         '../data/10000.csv']

# CSVParser class is patched with patternless methods
patchParserWithGetValueFunction(CSVParser)

# Adding getValue method to the base tree node class
patchAntlrBaseClass(antlr)

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

    # Listener
    listener = Listener()
    walker = antlr.ParseTreeWalker()
    print(datetime.datetime.now(), ': Observing/Listening tree...')
    walker.walk(listener, tree)

    # Visitor
    visitor = Visitor()
    print(datetime.datetime.now(), ': Visiting tree...')
    visitor.visit(tree)

    # Patternless aka manual
    print(datetime.datetime.now(), ': Walking tree patternlessly...')
    patternlessResult = tree.getValue()

    # Results
    print(f"\n{datetime.datetime.now()} : Comparing dictionaries...")
    difference(patternlessResult, visitor.dict, "Patternless", "Visitor")
    difference(patternlessResult, listener.dict, "Patternless", "Listener")
    print(f"\n{datetime.datetime.now()} : Done with {file}")
import os
import sys

iterations = sys.argv[1]

print('=== RUNNING ALL TESTS WITH', iterations, 'ITERATIONS ===')

os.system("python3 listener/test.py " + iterations)
os.system("python3 patternless/test.py " + iterations)
os.system("python3 visitor/test.py " + iterations)
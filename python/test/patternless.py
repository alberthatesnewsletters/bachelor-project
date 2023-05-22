from antlr4 import *

# Adds all institutions from a row to a set
# +1 to dict for each name in the set

def csvFileContextGetValue(self):
    dict = {}
    nameSet = set()
    for child in self.children:
        child.getValue(nameSet)
        for name in nameSet:
            if name in dict:
                dict[name] += 1
            else:
                dict[name] = 1
        nameSet.clear()
    return dict

def hdrContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def rowContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def fieldContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def quotedFieldContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def nameFieldContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)
       
def coauthorContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def nameContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def localIdContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def affiliationContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)
            
def affiliationSegmentContextGetValue(self, set):
    set.add(self.getText())
    for child in self.children:
        child.getValue(set)

def abbreviationContextGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def restFieldsGetValue(self, set):
    for child in self.children:
        child.getValue(set)

def defaultGetValue(self, set):
    pass


# This method is called in main.py in order to patch "add" the above-defined functions to the CSVParser class (class not object)
def patchParserWithGetValueFunction(CSVParser):
    CSVParser.CsvFileContext.getValue = csvFileContextGetValue
    CSVParser.HdrContext.getValue = hdrContextGetValue
    CSVParser.RowContext.getValue = rowContextGetValue
    CSVParser.FieldContext.getValue = fieldContextGetValue
    CSVParser.QuotedFieldContext.getValue = quotedFieldContextGetValue
    CSVParser.NameFieldContext.getValue  = nameFieldContextGetValue
    CSVParser.CoauthorContext.getValue = coauthorContextGetValue
    CSVParser.NameContext.getValue = nameContextGetValue
    CSVParser.LocalIdContext.getValue = localIdContextGetValue
    CSVParser.LocalIdContext.getValue = localIdContextGetValue
    CSVParser.AffiliationContext.getValue = affiliationContextGetValue
    CSVParser.AffiliationSegmentContext.getValue = affiliationSegmentContextGetValue
    CSVParser.AbbreviationContext.getValue = abbreviationContextGetValue
    CSVParser.RestFieldsContext.getValue = restFieldsGetValue

# This is so that we don't get crashes when iterating over commas etc
# Alternatively, make the iterators skip TerminalNode classes
def patchAntlrBaseClass(antlr):
    antlr.tree.Tree.TerminalNode.getValue = defaultGetValue
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CSVParser import CSVParser
    from .CSVVisitor import CSVVisitor
else:
    from CSVParser import CSVParser
    from CSVVisitor import CSVVisitor

class Visitor(CSVVisitor):
    def __init__(self):
        self.dict = {}
        self.names = set()

    def addToDict(self):
        for name in self.names:
            if name in self.dict:
                self.dict[name] += 1
            else:
                self.dict[name] = 1
  
    def visitNameField(self, ctx: CSVParser.NameFieldContext):
        self.visitChildren(ctx)
        self.addToDict()
        self.names.clear()
    
    def visitAffiliationSegment(self, ctx: CSVParser.AffiliationSegmentContext):
        self.names.add(ctx.getText())
        self.visitChildren(ctx)
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CSVParser import CSVParser
    from .CSVListener import CSVListener
else:
    from CSVParser import CSVParser
    from CSVListener import CSVListener
  
class Listener(CSVListener):
    def __init__(self):
        self.dict = {}
        self.names = set()

    def addToDict(self):
        for name in self.names:
            if name in self.dict:
                self.dict[name] += 1
            else:
                self.dict[name] = 1

    def exitNameField(self, ctx:CSVParser.NameFieldContext):
        self.addToDict()
        self.names.clear()

    def enterAffiliationSegment(self, ctx:CSVParser.AffiliationSegmentContext):
        self.names.add(ctx.getText())
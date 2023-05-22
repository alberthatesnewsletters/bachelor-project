# Generated from CSV.g by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CSVParser import CSVParser
else:
    from CSVParser import CSVParser

# This class defines a complete generic visitor for a parse tree produced by CSVParser.

class CSVVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CSVParser#csvFile.
    def visitCsvFile(self, ctx:CSVParser.CsvFileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#hdr.
    def visitHdr(self, ctx:CSVParser.HdrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#row.
    def visitRow(self, ctx:CSVParser.RowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#field.
    def visitField(self, ctx:CSVParser.FieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#quotedField.
    def visitQuotedField(self, ctx:CSVParser.QuotedFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#nameField.
    def visitNameField(self, ctx:CSVParser.NameFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#coauthor.
    def visitCoauthor(self, ctx:CSVParser.CoauthorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#name.
    def visitName(self, ctx:CSVParser.NameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#localId.
    def visitLocalId(self, ctx:CSVParser.LocalIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#affiliation.
    def visitAffiliation(self, ctx:CSVParser.AffiliationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#affiliationSegment.
    def visitAffiliationSegment(self, ctx:CSVParser.AffiliationSegmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#abbreviation.
    def visitAbbreviation(self, ctx:CSVParser.AbbreviationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CSVParser#restFields.
    def visitRestFields(self, ctx:CSVParser.RestFieldsContext):
        return self.visitChildren(ctx)



del CSVParser
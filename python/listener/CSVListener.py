# Generated from CSV.g by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CSVParser import CSVParser
else:
    from CSVParser import CSVParser

# This class defines a complete listener for a parse tree produced by CSVParser.
class CSVListener(ParseTreeListener):

    # Enter a parse tree produced by CSVParser#csvFile.
    def enterCsvFile(self, ctx:CSVParser.CsvFileContext):
        pass

    # Exit a parse tree produced by CSVParser#csvFile.
    def exitCsvFile(self, ctx:CSVParser.CsvFileContext):
        pass


    # Enter a parse tree produced by CSVParser#hdr.
    def enterHdr(self, ctx:CSVParser.HdrContext):
        pass

    # Exit a parse tree produced by CSVParser#hdr.
    def exitHdr(self, ctx:CSVParser.HdrContext):
        pass


    # Enter a parse tree produced by CSVParser#row.
    def enterRow(self, ctx:CSVParser.RowContext):
        pass

    # Exit a parse tree produced by CSVParser#row.
    def exitRow(self, ctx:CSVParser.RowContext):
        pass


    # Enter a parse tree produced by CSVParser#field.
    def enterField(self, ctx:CSVParser.FieldContext):
        pass

    # Exit a parse tree produced by CSVParser#field.
    def exitField(self, ctx:CSVParser.FieldContext):
        pass


    # Enter a parse tree produced by CSVParser#quotedField.
    def enterQuotedField(self, ctx:CSVParser.QuotedFieldContext):
        pass

    # Exit a parse tree produced by CSVParser#quotedField.
    def exitQuotedField(self, ctx:CSVParser.QuotedFieldContext):
        pass


    # Enter a parse tree produced by CSVParser#nameField.
    def enterNameField(self, ctx:CSVParser.NameFieldContext):
        pass

    # Exit a parse tree produced by CSVParser#nameField.
    def exitNameField(self, ctx:CSVParser.NameFieldContext):
        pass


    # Enter a parse tree produced by CSVParser#coauthor.
    def enterCoauthor(self, ctx:CSVParser.CoauthorContext):
        pass

    # Exit a parse tree produced by CSVParser#coauthor.
    def exitCoauthor(self, ctx:CSVParser.CoauthorContext):
        pass


    # Enter a parse tree produced by CSVParser#name.
    def enterName(self, ctx:CSVParser.NameContext):
        pass

    # Exit a parse tree produced by CSVParser#name.
    def exitName(self, ctx:CSVParser.NameContext):
        pass


    # Enter a parse tree produced by CSVParser#localId.
    def enterLocalId(self, ctx:CSVParser.LocalIdContext):
        pass

    # Exit a parse tree produced by CSVParser#localId.
    def exitLocalId(self, ctx:CSVParser.LocalIdContext):
        pass


    # Enter a parse tree produced by CSVParser#affiliation.
    def enterAffiliation(self, ctx:CSVParser.AffiliationContext):
        pass

    # Exit a parse tree produced by CSVParser#affiliation.
    def exitAffiliation(self, ctx:CSVParser.AffiliationContext):
        pass


    # Enter a parse tree produced by CSVParser#affiliationSegment.
    def enterAffiliationSegment(self, ctx:CSVParser.AffiliationSegmentContext):
        pass

    # Exit a parse tree produced by CSVParser#affiliationSegment.
    def exitAffiliationSegment(self, ctx:CSVParser.AffiliationSegmentContext):
        pass


    # Enter a parse tree produced by CSVParser#abbreviation.
    def enterAbbreviation(self, ctx:CSVParser.AbbreviationContext):
        pass

    # Exit a parse tree produced by CSVParser#abbreviation.
    def exitAbbreviation(self, ctx:CSVParser.AbbreviationContext):
        pass


    # Enter a parse tree produced by CSVParser#restFields.
    def enterRestFields(self, ctx:CSVParser.RestFieldsContext):
        pass

    # Exit a parse tree produced by CSVParser#restFields.
    def exitRestFields(self, ctx:CSVParser.RestFieldsContext):
        pass



del CSVParser
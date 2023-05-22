grammar CSV;

csvFile: hdr row+ EOF ;

hdr : field (',' field)* LINE_BREAK ;


row:
    field ',' nameField ',' restFields LINE_BREAK ;


field: 
    quotedField
    | WORD;

quotedField: '"' (WORD | WORD_EXTRA | ',')* '"';

nameField:
    '"' coauthor '"'
    | '"' coauthor (';' coauthor)+ '"';

// sometimes 2 localids
coauthor:
    name (' ' localId)* (' ' affiliation)*; 

name:
    WORD (' ' WORD)* (', ' WORD (' ' WORD)*)*;
    
localId:
    '[' WORD ']';


affiliation: 
    '(' (' ')? affiliationSegment (' ' localId) (', ' affiliationSegment (' ' localId))* (' ')? ')'
    | '(' (' ')? affiliationSegment (' ' localId)? ((' ; ' | ';' | ' ;' | '; ') affiliationSegment (' ' localId)?)* (' ')? ')';


affiliationSegment:
    WORD ((', ' | ' ' | ',' | ',  ' | ',, ') WORD?)* (' ' abbreviation)?;

abbreviation:
    '(' WORD ')';

restFields:
    ~LINE_BREAK*;

WORD: (~["()[\],;\p{White_Space}] | ' ' | ' ' | ' ' | ' ' | '　' | ' ' | ' ' | ' ')+;

WORD_EXTRA: [.<>/:+—];

LINE_BREAK : '\r'? '\n' | '\r';

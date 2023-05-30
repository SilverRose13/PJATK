#define VARIABLE 257
#define SYSTEM 258
#define INTEGER 259
#define BINTOKEN 260
#define DECTOKEN 261
#define HEXTOKEN 262
#ifdef YYSTYPE
#undef  YYSTYPE_IS_DECLARED
#define YYSTYPE_IS_DECLARED 1
#endif
#ifndef YYSTYPE_IS_DECLARED
#define YYSTYPE_IS_DECLARED 1
typedef union YYSTYPE {
    int intValue;
	char variable;
    char system[20];
} YYSTYPE;
#endif /* !YYSTYPE_IS_DECLARED */
extern YYSTYPE yylval;

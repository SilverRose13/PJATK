%{
 #include "y.tab.h"
 #include<stdio.h>
 #include<stdlib.h>

 extern YYSTYPE yylval;

%}

integer "-"?[0-9]+
binNumber "-"?[0-1]+
hexNumber "-"([0-9]|[a-f])+

binary  ("binary"|"Binary")
decimal (D|d)(E|e)(C|c)(I|i)(M|m)(A|a)(L|l)
hexadecimal ("hexadecimal"|"Hexadecimal")

%Start BINARY DECIMAL HEXADECIMAL

%%

{binary}    BEGIN BINARY; return BINTOKEN;
{decimal}   BEGIN DECIMAL; return DECTOKEN;
{hexadecimal}   BEGIN HEXADECIMAL; return BINTOKEN;


<BINARY>{binNumber} {
            int num = atoi(yytext);
            int binNum = 0;

            while (num > 0) {
                binNum = binNum * 10 + (num % 2);
                num = num / 2;
            }

            yylval.intValue = binNum;
            BEGIN 0;
            return INTEGER;

}


<DECIMAL>{integer}  {
            yylval.intValue = atoi(yytext);
            BEGIN 0;
            return INTEGER;

}



<HEXADECIMAL>{hexNumber}    {
            char hex[yyleng];

            for(int i = 0; i < yyleng; i++){
                hex[i] = yytext[i];
            }

            int dec = 0, base = 1;
            int i = 0, value, length;

            length = strlen(hex);
            for(i = length--; i >= 0; i--)
            {
                if(hex[i] >= '0' && hex[i] <= '9')
                {
                    dec += (hex[i] - 48) * base;
                    base *= 16;
                }
                else if(hex[i] >= 'A' && hex[i] <= 'F')
                {
                    dec += (hex[i] - 55) * base;
                    base *= 16;
                }
                else if(hex[i] >= 'a' && hex[i] <= 'f')
                {
                    dec += (hex[i] - 87) * base;
                    base *= 16;
                }
            }

            yylval.intValue = dec;
            BEGIN 0;
            return INTEGER;

}


[-+*/]	return *yytext;

%%

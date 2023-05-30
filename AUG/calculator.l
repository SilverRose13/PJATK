#define INTEGER 276
#define SYSTEM 277

%{
#include "y.tab.h"
extern int yylval;
%}

integer "-"?[0-9]+
binary  ("binary"|"Binary")
decimal (D|d)(E|e)(C|c)(I|i)(M|m)(A|a)(L|l)



%%
{integer}   {
        yylval = atoi(yytext);
        return INTEGER;
            }

[-+*/]	return *yytext;
%%

int main() {

    return yyparse();


    return 0;
}
%{
#include<stdio.h>
#include <stdlib.h>

#define ADD 12345
#define VAL1 32345
#define VAL2 44523
#define SUBTRACT 6543
#define MULTIPLY 73549
#define DIVIDE 83668
#define EQUAL 55532
#define BINARY 98755
#define DECIMAL 87664

%}

integer "-"?[0-9]+
add "+"
subtract    "-"
multiply    "*"
divide  "/"
equals  "="
binary  ("binary"|"Binary")
decimal (D|d)(E|e)(C|c)(I|i)(M|m)(A|a)(L|l)

value1 {integer}
value2 {integer}{equals}{1}


%%
{binary} {return BINARY;}
{decimal} {return DECIMAL;}
{value1}    {return VAL1;}
{add}   {return ADD;}
{subtract}  {return SUBTRACT;}
{multiply}  {return MULTIPLY;}
{divide}    {return DIVIDE;}
{value2}    {return VAL2;}
{equals}    {return EQUAL;}


%%

int main() {
    int token;
    int val1;
    int val2;
    int result;
    //int count = 0;
    int sign;

    do{
        //count++;
        token = yylex();
        switch (token){
            case BINARY:
                break;
            case DECIMAL:
                switch(token){
                    case VAL1:
                        val1 = atoi(yytext);
                        printf("int1 : %d\n", val1);
                        break;
                    case VAL2:
                        val2 = atoi(yytext);
                        printf("int2 : %d\n", val2);
                        //printf("remainder : %s", yytext);
                        //break;
                    case EQUAL:
                        switch(sign){
                            case 1:
                                printf("result : %d", val1 + val2);
                                break;
                            case 2:
                                printf("result : %d", val1 - val2);
                                break;
                            case 3:
                                printf("result : %d", val1 * val2);
                                break;
                            case 4:
                                printf("result : %d", val1 / val2);
                                break;
                        }
                        break;
                    case ADD:
                        sign = 1;
                        break;
                    case SUBTRACT:
                        sign = 2;
                        break;
                    case MULTIPLY:
                        sign = 3;
                        break;
                    case DIVIDE:
                        sign = 4;
                        break;

                }
                //printf("count %d\n", count);
                break;
        }
    }while(token != 0);



    return 0;
}
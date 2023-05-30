%{
#include <stdio.h>
#include <stdlib.h>
int yylex();
void yyerror(const char *s);
%}

%union {
    int intValue;
	char variable;
    char system[20];
};

%token <variable> VARIABLE
%token <system> SYSTEM 
%token <intValue> INTEGER
%token <system> BINTOKEN
%token <system> DECTOKEN
%token <system> HEXTOKEN

%right '='
%left '+' '-'
%left '*' '/'

%type<intValue> expression 

%%
program:
                program BINTOKEN expression decToBin '\n'       
|               program DECTOKEN {printf("\nResult=%d\n", expression);}'\n'                
|               program HEXTOKEN expression decToHex '\n'        
|               
;

expression:
                INTEGER
|               expression '+' expression        { $$ = $1 + $3; }
|               expression '-' expression        { $$ = $1 - $3; }
|               expression '*' expression        { $$ = $1 * $3; }
|               expression '/' expression        { $$ = $1 / $3; }
;

decToBin: {decToBin(INTEGER);}
                

decToHex: {decToHex(INTEGER);}


%%

void yyerror(const char *s) {
    fprintf(stderr, "error with: %s", s);
    exit(1);
}

int main(void){
    return yyparse();
}

    /*function for calculating the binary form of a number*/
int decToBin(int n){
    int result = 0;
    while(n > 0){
        if(n % 2 == 1){
            result = result*10 + 1;
        } else {
            result *= 10;
        }
        n /= 2;
    }
	printf("%d",result);

    return result;
}

    /*function for calculating the hexadecimal form of a number*/
char[] decToHex(int n){
	int i=0;
	char hexadecimalNumber[100];

	while(n!=0) {
		int temp = n % 16;

		//To convert integer into character
		if( temp < 10){
		    temp =temp + 48;
        }else{
		    temp = temp + 55;
        }

		hexadecimalNumber[i++]= temp;
		n = n / 16;
	}
    for (int j = i -1 ;j> 0;j--)
	    printf("%c",hexadecimalNumber[j]);
	return hexadecimalNumber;
}
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
 
int main(void)
{
     int i, j;
     int valores[50000];
     int aleatorio;
     FILE *fp;
     
     //Abrir arquivo
     fp = fopen ("TesteRandC.txt", "w");
 
     printf("Gerando valores aleatorios:\n\n");
 
 	for(j = 0; j < 20; j++)
 	{
 		
	     for (i = 0; i < 50000; i++)
	     {
	           aleatorio = rand()%2;
			   
			   /* gerando valores aleatórios entre zero e 2 */
	           printf("%d \n", i);
	           
	           valores[i] = aleatorio;
	     }
	     
	     //Escrever os valores
	     for(i=0; i<50000; i++)
		 {
		 	if(valores[i]==0)
		 		fputc((int) '0', fp);
		 	else
		 		fputc((int) '1', fp);
		 }
		 
		 
	}
	
     fclose (fp);
 
     getch();
     return 0;
}

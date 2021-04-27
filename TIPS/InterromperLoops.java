/*BREAK 
pode ser usado para sair fora de um loop quando uma condicao ocorrer 
Exemplo:*/
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
  
/*CONTINUE
pode ser usado para interromper uma iteracao e continuar o laco na proxima iteracao
O exemplo abaixo nao exibe o valor da variavel i quando o valor de i for igual a 4
*/

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

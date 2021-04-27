//Declaracao de um array multidimensional:
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

//Acessando elementos
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7

//Loops em Arrays Multidimensionais
for (int i = 0; i < myNumbers.length; ++i) {
  for(int j = 0; j < myNumbers[i].length; ++j) {
     System.out.println(myNumbers[i][j]);
  }
}

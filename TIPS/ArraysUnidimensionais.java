/*EM JAVA os arrays sao declarados assim:*/

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo


//nomeArray.length retorna a quantidade de elementos do array
System.out.println(cars.length);
// Outputs 4

//For em arrays
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
//ForEach em arrays
for (String i : cars) {
  System.out.println(i);
}

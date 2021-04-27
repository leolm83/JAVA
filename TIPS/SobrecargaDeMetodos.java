/*
Method Overloading
Com sobrecarga de metodos, varios metodos podem ter o mesmo nome com diferentes parametros
exemplo*/

int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
Consider the following example, which have two methods that add numbers of different type:

Example
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
//Aa inves de definir dois metodos que fazem a mesma coisa, é melhor sobrecarregar um unico metodo
//Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
//o Exemplo abaixo sobrecarrega o metodos plusMethod para que sirva para int e para double


static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
} 
 

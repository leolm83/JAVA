//SE VOCE DESEJA QUE UM VALOR NAO SEJA JAMAIS ALTERADO DECLARE ELE USANDO A PALAVRA FINAL

Example
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
 

//The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

//The final keyword is called a "modifier". You will learn more about these in the Java Modifiers Chapter.

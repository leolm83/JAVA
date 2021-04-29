class Main {  
  public class Kata {
  public static int findEvenIndex(int[] arr) {
    int left=0;
    int right=0;
    int x;
    for(x=0;x<arr.length;x++){
      for(left=0;left<x;left++){
        left+=arr[left];
      }
      for(right=arr.length;right>x;right--){
        right+=arr[right];
      }
      if(left==right){
        System.out.println(x);
        return x;
      }
    }
    System.out.println("-1");
    return -1;
  }
}
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 

    int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
     Kata.findEvenIndex(iniciaValores);
}
}

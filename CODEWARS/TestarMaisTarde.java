verificar se ons numeros após e antes do valor  somados dao o mesmo resultado ou nao
/*https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java*/
public class Kata {
  public static int findEvenIndex(int[] arr) {
    int left=0;
    int right=0;
    for(int x=0;x<arr.length;x++){
      for(left=0;left<x;left++){
        left+=arr[left];
      }
      for(right=arr.length;right>x;right--){
        right+=arr[right];
      }
      if(left==right){
        return x;
      }
    }
      return -1;
  }
}

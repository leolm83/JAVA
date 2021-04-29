class TriangleTester{
  /*BASEADO NO Triangle Inequality Theorem*/
  public static boolean isTriangle(int a, int b, int c){
    if(a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b){
      return true;
    }
    else{
      return false;
    }
  }
}

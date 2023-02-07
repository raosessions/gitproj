public class HelloWorld {
  public static void main(String[] args) {
    int x, y ;
    x = 10 ;
    y = 20 ;
    int sum ;
    if ( y != 0 ) {
      sum = x / y ; 
    } else {
      sum = -1 ;
    }
    System.out.println("Result: " + sum);
  }
}

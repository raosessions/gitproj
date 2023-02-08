public class HelloWorld {
  public static void main(String[] args) {

    {
      Length s1 = new Length();
      System.out.println("The length of the string is: " + s1.length());
    }
    int x, y ;
    x = 10 ;
    y = 20 ;
    int result ;
    if ( y != 0 ) {
      result = x / y ; 
    } else {
      result = -1 ;
    }
    System.out.println("Result: " + result);
  }


}

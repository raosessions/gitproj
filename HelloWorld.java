public class HelloWorld {
  public static void main(String[] args) {

    {

      UpperCase w= new UpperCase();
      
       String word = "this is java class";

       System.out.println("the word is in upper case :" + w.upperCase(word) );
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

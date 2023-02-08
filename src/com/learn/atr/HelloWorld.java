package com.learn.atr ;

public class HelloWorld {
  public static void main(String[] args) {
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

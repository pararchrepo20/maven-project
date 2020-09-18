package com.example;

/**
 * This is a class for greeting
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /** 
   THis is a greeting message method
    */
  public String greet( final String someone) {
    return String.format("Hi , %s!", someone);
  }
}

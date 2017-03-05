package seleniumdemo.myseleniumapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestClass {
  
 @Test
  public void f() {
	 System.out.println("hi this is first test case");
  }
 
 @Test
 public void f2() {
	 System.out.println("hi this is second test case");
 }

 
 @Test
 public void f3() {
	 System.out.println("hi this is third test case");
 }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  int i=10/0;
	  System.out.println("after test method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}

package Class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {
    //first test case
    @Test
    public void AFirstTestCase(){
  System.out.println("I am the first test case");
    }
    @Test
    public void BSeconTestCase(){
        System.out.println("I am second test case");
    }

    @Test
    public void ThirdTestcase(){

        System.out.println(" I am  third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am a before method");
    }

    @AfterMethod
    public void afterMEthod(){
        System.out.println("I am a after method");
    }

}

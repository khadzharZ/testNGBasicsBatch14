package Class1;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 3,groups = "regression")
    public void Atest() {
        System.out.println("I am A test");
    }

    @Test(priority = 1)
    public void Btest() {

    System.out.println("I am B test");
}
   @Test(priority = 2)
    public void Ctest(){
    System.out.println("I am C test ");
}
  //by default priority is 0
    @Test
    public void Dtest(){
        System.out.println("I am D test");
    }
    @Test
    public void ABtest(){
        System.out.println("I am AB test");
    }


    }



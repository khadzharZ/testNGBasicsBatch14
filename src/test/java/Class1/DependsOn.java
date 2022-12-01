package Class1;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login(){
        System.out.println("I have logged in successfully");
    }
    @Test(dependsOnMethods = {"Login"})
    public void DashBoardVerification(){
        System.out.println(" after login i am verifying the dashboard page");
    }
}

package com.nbhirud.restaurantautomationsystem;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminLoginPageTest {
    
    public AdminLoginPageTest() {
    }
    
   
    @Test
    public void testClose() {
        System.out.println("close");
        AdminLoginPage instance = new AdminLoginPage();
        instance.close();
        
    }

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminLoginPage.main(args);
        
    }
    
}

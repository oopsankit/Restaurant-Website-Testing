package com.nbhirud.restaurantautomationsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ChefLoginPageTest {
    
    public ChefLoginPageTest() {
    }
    @Test
    public void testClose() {
        System.out.println("close");
        ChefLoginPage instance = new ChefLoginPage();
        instance.close();
        
    }

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ChefLoginPage.main(args);
        
    }
    
}

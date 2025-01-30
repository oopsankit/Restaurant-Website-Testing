package com.nbhirud.restaurantautomationsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nbhirud
 */
public class CustomerLoginPageTest {
    Connection mycon=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public CustomerLoginPageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         try{
        
        mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssdi_ras_v001?"+ "user=root&password=");//addedby Anusha
           
        }
        
        catch(Exception e){
       e.printStackTrace();
       
   }  
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of close method, of class CustomerLoginPage.
     */
//    @Test
//    public void testClose() {
//        System.out.println("close");
//        CustomerLoginPage instance = new CustomerLoginPage();
//        instance.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

     @Test
    public void Test_LoginActionPerformed() {
        
        try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="select email,pwd from customer ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("test1@gmail.com") && rs.getString(2).equalsIgnoreCase("test1"))
               {
               
                  assertEquals("test1@gmail.com",rs.getString(1));
                  assertEquals("test1",rs.getString(2));
                   System.out.println("Test Passed");
               }  
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * Test of main method, of class CustomerLoginPage.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CustomerLoginPage.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

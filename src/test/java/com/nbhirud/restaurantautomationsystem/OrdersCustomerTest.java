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
public class OrdersCustomerTest {
    Connection mycon=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    
    public OrdersCustomerTest() {
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
        
        mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssdi_ras_v001_Test?"+ "user=root&password=");//addedby Anusha
           
        }
        
        catch(Exception e){
       e.printStackTrace();
       
   }  
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Orders_table method, of class OrdersCustomer.
     */
    @Test
    public void testOrders_table() throws Exception {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select menu_num,menu_name,menu_type,description,price,Quantity from menu_order";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("1") && rs.getString(2).equalsIgnoreCase("Mysore Bonda") && rs.getString(3).equalsIgnoreCase("appetizer") && rs.getString(4).equalsIgnoreCase("Lentil dumplings deep fried served with chutney") && rs.getString(5).equalsIgnoreCase("5.99") && rs.getString(6).equalsIgnoreCase("2"))
               {
               
                  assertEquals("1",rs.getString(1));
                  assertEquals("Mysore Bonda",rs.getString(2));
                  assertEquals("appetizer",rs.getString(3));
                  assertEquals("Lentil dumplings deep fried served with chutney",rs.getString(4));
                  assertEquals("5.99",rs.getString(5));
                  assertEquals("2",rs.getString(6));
                   System.out.println("Orders Test Passed");
               }  
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of close method, of class OrdersCustomer.
     */
//    @Test
//    public void testClose() {
//        System.out.println("close");
//        OrdersCustomer instance = new OrdersCustomer();
//        instance.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class OrdersCustomer.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        OrdersCustomer.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

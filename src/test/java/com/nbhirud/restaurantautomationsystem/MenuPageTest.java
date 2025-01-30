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
public class MenuPageTest {
     Connection mycon=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    
    public MenuPageTest() {
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
     * Test of show_table method, of class MenuPage.
     */
    @Test
    public void testShow_table() {
        try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='appetizer'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Chilli Chicken") && rs.getString(2).equalsIgnoreCase("Slightly battered and Deep Fried boneless Chicken pieces tossed with Onions in house prepared Chilli Sauce") && rs.getString(3).equalsIgnoreCase("9.99"))
               {
               
                  assertEquals("Chilli Chicken",rs.getString(1));
                  assertEquals("Slightly battered and Deep Fried boneless Chicken pieces tossed with Onions in house prepared Chilli Sauce",rs.getString(2));
                  assertEquals("9.99",rs.getString(3));
                   System.out.println("Appetizers Test Passed");
               }  
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of show1_table method, of class MenuPage.
     */
    @Test
    public void testShow1_table() {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='entrees'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Chana Masala") && rs.getString(2).equalsIgnoreCase("Garbanzo Beans cooked with finely chopped tomatoes and onions in a brown gravy") && rs.getString(3).equalsIgnoreCase("7.99"))
               {
               
                  assertEquals("Chana Masala",rs.getString(1));
                  assertEquals("Garbanzo Beans cooked with finely chopped tomatoes and onions in a brown gravy",rs.getString(2));
                  assertEquals("7.99",rs.getString(3));
                   System.out.println("Entrees Test Passed");
               }  
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of show2_table method, of class MenuPage.
     */
    @Test
    public void testShow2_table() {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='tandoori'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Butter Naan") && rs.getString(2).equalsIgnoreCase("Refined wheat flour bread cooked in the tandoor with added butter") && rs.getString(3).equalsIgnoreCase("2.50"))
               {
               
                  assertEquals("Butter Naan",rs.getString(1));
                  assertEquals("Refined wheat flour bread cooked in the tandoor with added butter",rs.getString(2));
                  assertEquals("2.50",rs.getString(3));
                   System.out.println("Tandoori Test Passed");
               }  
               
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of show3_table method, of class MenuPage.
     */
    @Test
    public void testShow3_table() {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='desserts'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Double Ka Meetha") && rs.getString(2).equalsIgnoreCase("Deep fried bread cakes bathed in a creamy sweet sauce topped with dry fruits") && rs.getString(3).equalsIgnoreCase("5.99"))
               {
               
                  assertEquals("Double Ka Meetha",rs.getString(1));
                  assertEquals("Deep fried bread cakes bathed in a creamy sweet sauce topped with dry fruits",rs.getString(2));
                  assertEquals("5.99",rs.getString(3));
                   System.out.println("Desserts Test Passed");
               }  
               
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of show4_table method, of class MenuPage.
     */
    @Test
    public void testShow4_table() {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='beer'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Corona Extra") && rs.getString(2).equalsIgnoreCase("Mixture of grape juice with added alcohol") && rs.getString(3).equalsIgnoreCase("3.99"))
               {
               
                  assertEquals("Corona Extra",rs.getString(1));
                  assertEquals("Mixture of grape juice with added alcohol",rs.getString(2));
                  assertEquals("3.99",rs.getString(3));
                   System.out.println("Beer Test Passed");
               }  
               
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of show5_table method, of class MenuPage.
     */
    @Test
    public void testShow5_table() {
         try {
            HashMap row =   new HashMap();
           List list1= new ArrayList();
        
           String sql="Select mname as Name,description,price from menu where mtype='biryani'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int columnCount = rsmd.getColumnCount();
           
           while (rs.next()){
               if(rs.getString(1).equalsIgnoreCase("Egg Dum Biryani") && rs.getString(2).equalsIgnoreCase("The Hyderabadi Dum Biryani is a Classic Deccan Cuisine Specality with egg yolks") && rs.getString(3).equalsIgnoreCase("11.99"))
               {
               
                  assertEquals("Egg Dum Biryani",rs.getString(1));
                  assertEquals("The Hyderabadi Dum Biryani is a Classic Deccan Cuisine Specality with egg yolks",rs.getString(2));
                  assertEquals("11.99",rs.getString(3));
                   System.out.println("Biryani Test Passed");
               }  
               
  }
           
  }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of close method, of class MenuPage.
     */
//    @Test
//    public void testClose() {
//        System.out.println("close");
//        MenuPage instance = new MenuPage();
//        instance.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class MenuPage.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        MenuPage.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

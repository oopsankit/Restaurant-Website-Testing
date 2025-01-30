/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbhirud.restaurantautomationsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
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
public class FeedbackpageTest {
    Connection mycon=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public FeedbackpageTest() {
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
        
        mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/SSDIDB?" + "user=root&password=");//addedby Anusha
            System.out.println(mycon.getClientInfo());
        }
        
        catch(Exception e){
       e.printStackTrace();
       
   }    
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of close method, of class Feedbackpage.
     */
    @Test
    public void test_Open_table() {
       try {
           DefaultListModel model = new DefaultListModel(); 
           String sql="Select * from feedback ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           
           
//           while (rs.next()) {
//            for (int i = 1; i <= columnsNumber; i++) {
//             if (i > 1) System.out.print(",  ");
//            String columnValue = rs.getString(i);
//            System.out.print(columnValue + " " + rsmd.getColumnName(i));
//    }
//    System.out.println("");
//}
 //while(rs.next()){          
if(rs.isLast()) {
               System.out.println("ras1.FeedbackpageTest.test_Open_table()");
assertEquals("test 10 c0mments",rs.getString(2));
}
 //}   
 
 
 
           
//           while(rs.next()){
//              // System.out.println(rs.getString("comments"));    
//           model.addElement(rs.getString("comments"));
//           }
//           //feedbackList.setModel(model); //setModel(model);
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /**
     * Test of Open_table method, of class Feedbackpage.
     */
   // @Test
    public void test_submitfeedbackActionPerformed() {
         try {
          pst=mycon.prepareStatement("insert into feedback values(?,?)");
          pst.setString(1,"name"); //hard coded name
          pst.setString(2,"feedback"); //hard coded comments
          
          int r =pst.executeUpdate();  
             System.out.println(r);
           assertEquals(1,r);
           }
          
           
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Test of main method, of class Feedbackpage.
     */
    @Test
    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Feedbackpage.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

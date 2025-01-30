package com.nbhirud.restaurantautomationsystem;


import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;
public class MenuPage extends javax.swing.JFrame {
    Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
    public MenuPage() {
        initComponents();
        mycon=MySql.ConnectDB();
    }
    
    public void show_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='appetizer'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void show1_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='entrees'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
        public void show2_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='tandoori'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
          public void show3_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='desserts'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
            public void show4_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='beer'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
            
             public void show5_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='biryani'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Open_table = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        menu_id = new javax.swing.JTextField();
        appetizers = new javax.swing.JTextField();
        price_1 = new javax.swing.JTextField();
        entrees = new javax.swing.JTextField();
        price_2 = new javax.swing.JTextField();
        MENU = new javax.swing.JLabel();
        APPETIZERS = new javax.swing.JLabel();
        PRICE = new javax.swing.JLabel();
        ENTREES = new javax.swing.JLabel();
        PRICE_2 = new javax.swing.JLabel();
        DESERTS = new javax.swing.JLabel();
        PRICE_3 = new javax.swing.JLabel();
        deserts = new javax.swing.JTextField();
        price_3 = new javax.swing.JTextField();
        desserts_button = new javax.swing.JButton();
        beer_button = new javax.swing.JButton();
        biryani_buttom = new javax.swing.JButton();
        tandoori_button = new javax.swing.JButton();
        entrees_button = new javax.swing.JButton();
        appetizers_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("RESTAURANT AUTOMATION SYSTEM");

        jTextField2.setBackground(new java.awt.Color(204, 204, 0));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setText("MENU");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        Open_table.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        Open_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Open_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Open_table.setRowHeight(25);
        Open_table.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(Open_table);

        Back.setBackground(new java.awt.Color(0, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        edit.setText("ADD");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        update.setText("UPDATE");
        update.setActionCommand("");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        menu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_idActionPerformed(evt);
            }
        });

        price_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_2ActionPerformed(evt);
            }
        });

        MENU.setText("MENU_ID");

        APPETIZERS.setText("APPETIZERS");

        PRICE.setText("PRICE");

        ENTREES.setText("ENTREES");

        PRICE_2.setText("PRICE");

        DESERTS.setText("DESERTS");

        PRICE_3.setText("PRICE");

        desserts_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        desserts_button.setText("DESERTS");
        desserts_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desserts_buttonActionPerformed(evt);
            }
        });

        beer_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beer_button.setText("BEER & WINE");
        beer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beer_buttonActionPerformed(evt);
            }
        });

        biryani_buttom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        biryani_buttom.setText("DHUM BIRYANI");
        biryani_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biryani_buttomActionPerformed(evt);
            }
        });

        tandoori_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tandoori_button.setText("TANDOORI");
        tandoori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandoori_buttonActionPerformed(evt);
            }
        });

        entrees_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        entrees_button.setText("VEG ENTREES");
        entrees_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrees_buttonActionPerformed(evt);
            }
        });

        appetizers_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        appetizers_button.setText("APPETIZERS");
        appetizers_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizers_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(301, 301, 301)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(559, 559, 559))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(update)
                        .addGap(76, 76, 76)
                        .addComponent(delete)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(biryani_buttom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entrees_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appetizers_button, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tandoori_button, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(desserts_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beer_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PRICE_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DESERTS, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PRICE_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ENTREES, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(PRICE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price_1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deserts, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price_3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price_2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entrees, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(menu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(APPETIZERS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(appetizers, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delete)
                        .addComponent(edit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(appetizers_button)
                                .addGap(33, 33, 33)
                                .addComponent(entrees_button)
                                .addGap(38, 38, 38)
                                .addComponent(tandoori_button)
                                .addGap(46, 46, 46)
                                .addComponent(biryani_buttom))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menu_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(APPETIZERS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(appetizers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PRICE)
                                    .addComponent(price_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ENTREES)
                                    .addComponent(entrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PRICE_2)
                                    .addComponent(price_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deserts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DESERTS))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(price_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PRICE_3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(desserts_button)
                                .addGap(40, 40, 40)
                                .addComponent(beer_button)
                                .addGap(248, 248, 248))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void price_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_2ActionPerformed

    private void menu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_idActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from menu_admin where menu_id=?";
        try{
            pst=mycon.prepareStatement(sql);
            pst.setString(1,menu_id.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null,"Deleted");
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
        show_table();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try{
            String value1= menu_id.getText();
            String value2= appetizers.getText();
            String value3= price_1.getText();
            String value4= entrees.getText();
            String value5= price_2.getText();
            String value6= deserts.getText();
            String value7= price_3.getText();
            pst.setString(1,menu_id.getText());

            String sql=" update menu_admin set appetizers='"+value2+"',price_1='"+value3+"',entrees='"+value4+"',price_2='"+value5+"',deserts='"+value6+"',price_3='"+value7+"'  where menu_id='"+value1+"'";
            pst=mycon.prepareStatement(sql);
            int rs=pst.executeUpdate();
            if(rs<0)
            {
                JOptionPane.showMessageDialog(null,"Select menu_id");
            }
            else
            {
                JOptionPane .showMessageDialog(null, "Updated");
                show_table();
            }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Please insert the values and next click Update");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        String sql="insert into menu_admin values(?,?,?,?,?,?,?)";
        try{
            pst=mycon.prepareStatement(sql);
            pst.setString(1,menu_id.getText());
            pst.setString(2,appetizers.getText());
            pst.setString(3,price_1.getText());
            pst.setString(4,entrees.getText());
            pst.setString(5,price_2.getText());
            pst.setString(6,deserts.getText());
            pst.setString(7,price_3.getText());
            int r=pst.executeUpdate();
            if(r>0){
                JOptionPane.showMessageDialog(null,"New Menu Inserted");
                show_table();
            }
            else{
                JOptionPane.showMessageDialog(null,"registeration unsuccessful","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException | HeadlessException e){

            JOptionPane.showMessageDialog(null, "Please insert the values and next click add");
        }
    }//GEN-LAST:event_editActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:

        WelcomeAdmin wa= new WelcomeAdmin();
        wa.setVisible(true);
        // close();
    }//GEN-LAST:event_BackActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void desserts_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desserts_buttonActionPerformed
      show3_table();  // TODO add your handling code here:
    }//GEN-LAST:event_desserts_buttonActionPerformed

    private void appetizers_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizers_buttonActionPerformed
show_table();

    }//GEN-LAST:event_appetizers_buttonActionPerformed

    private void entrees_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrees_buttonActionPerformed
     show1_table();
    }//GEN-LAST:event_entrees_buttonActionPerformed

    private void tandoori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandoori_buttonActionPerformed
      show2_table();
    }//GEN-LAST:event_tandoori_buttonActionPerformed

    private void beer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beer_buttonActionPerformed
show4_table();        // TODO add your handling code here:
    }//GEN-LAST:event_beer_buttonActionPerformed

    private void biryani_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biryani_buttomActionPerformed
show5_table();
    }//GEN-LAST:event_biryani_buttomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APPETIZERS;
    private javax.swing.JButton Back;
    private javax.swing.JLabel DESERTS;
    private javax.swing.JLabel ENTREES;
    private javax.swing.JLabel MENU;
    private javax.swing.JTable Open_table;
    private javax.swing.JLabel PRICE;
    private javax.swing.JLabel PRICE_2;
    private javax.swing.JLabel PRICE_3;
    private javax.swing.JTextField appetizers;
    private javax.swing.JButton appetizers_button;
    private javax.swing.JButton beer_button;
    private javax.swing.JButton biryani_buttom;
    private javax.swing.JButton delete;
    private javax.swing.JTextField deserts;
    private javax.swing.JButton desserts_button;
    private javax.swing.JButton edit;
    private javax.swing.JTextField entrees;
    private javax.swing.JButton entrees_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField menu_id;
    private javax.swing.JTextField price_1;
    private javax.swing.JTextField price_2;
    private javax.swing.JTextField price_3;
    private javax.swing.JButton tandoori_button;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

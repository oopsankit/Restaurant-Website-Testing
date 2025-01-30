package com.nbhirud.restaurantautomationsystem;

import java.sql.*;
import java.util.LinkedList;

import javax.swing.JOptionPane;
public class Orders {


	public class IOrderListItem {
		int menu_id;
		int qty;

		/*
		 *TaBLE ORDER_LIST
		 *order_id	int(5)	NO	PRI
		 *menu_id	int(5)	NO	PRI
		 *quantity	int(3)	NO	
		 */

		public IOrderListItem(int mid, int qty) {
			this.menu_id = mid;
			this.qty = qty;
		}
		public int getMenuID() {
			return menu_id;
		}

		public int getQty() {
			return qty;
		}
	}


	int order_id;
	int table_id;
	String ostatus = new String();
	int cid;
	LinkedList<IOrderListItem> li = new LinkedList<IOrderListItem>();

	/*
	ORDERS table
	order_id	int(5)	NO	PRI
	table_id	int(5)	NO	MUL
	total_payable	float(5,2)	YES	
	timestamp_created	timestamp	NO	
	ostatus	varchar(20)	NO	
	cid	varchar(25)	NO	MUL

	 */

	public Orders(int table_id, int cid) {
		this.table_id = table_id;
		this.ostatus = "Thinking";
		this.cid = cid;	
		this.order_id = getOrderID();
	}

	public int getOrderID() {
		Connection mycon=null;
		PreparedStatement pst1, pst2=null;
		int pk = -1;
		try{
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			mycon = DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			String sql = new String("insert into orders (table_id, ostatus, cid) values("+table_id+", '"+ostatus+"', "+cid+")");
			pst1=mycon.prepareStatement(sql);
			boolean r=pst1.execute(sql);

			pst2 = mycon.prepareStatement("select LAST_INSERT_ID()");
			ResultSet rs = pst2.executeQuery();
			order_id = rs.getInt(1);
			if(r == true){
				JOptionPane.showMessageDialog(null,"order id is"+order_id);
			}		
		}
		catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,e);
		}
		return pk;
	}

	public void addNewLi(int menu_id, int qty) {
		IOrderListItem ol = new IOrderListItem(menu_id, qty);
		li.add(ol);
	}

	public void insertOrderListToTable() {
		String sql = new String("insert into order_list values ");
		int i = 0;
		for (IOrderListItem oli : li) {
			if (i == 0) {
				sql = sql + "("+order_id+", "+oli.getMenuID()+", "+oli.getQty()+")";
			}
			sql = sql + ",("+order_id+", "+oli.getMenuID()+", "+oli.getQty()+")";
		}
		try {
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst;
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			pst=mycon.prepareStatement(sql);
			boolean r=pst.execute(sql);
			if(r == true){
				JOptionPane.showMessageDialog(null,"order inserted successfully");
			}
		}
		catch (ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,e);

		}

		/*
		 * TaBLE ORDER_LIST
				order_id	int(5)	NO	PRI
				menu_id	int(5)	NO	PRI
				quantity	int(3)	NO	
		 */
		//System.out.println(oli + "\n");

	}
	public void updateOrderStatus(String status) {
		try {
			String sql = new String("update orders set ostatus = "+ status +"where order_id ="+ order_id);
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst;
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			pst=mycon.prepareStatement(sql);
			boolean r=pst.execute(sql);
			if(r == true){
				JOptionPane.showMessageDialog(null,"order inserted successfully");
			}
		}
		catch (ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,e);

		}
	}

}


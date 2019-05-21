package com.stackroute.db;

import java.sql.*;

public class ResultsetMetadataDemo {
    private Connection con;
    public void displayData() {
        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
            //create statement object
            System.out.println("got connected");


            PreparedStatement ps=con.prepareStatement("select * from customer");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));


//            //execute query
//            ResultSet rs=stmt.executeQuery("select * from customer");
//            //process result
//            rs.absolute(3);
//            while(rs.previous())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3));

        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayCustomrerByName(String name,String gender) {

        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
            //create statement object
            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Select * from customer where name = ? and gender= ?");
            stmt.setString(2,gender);
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            //execute query
            //  ResultSet rs=stmt.executeQuery("select * from customers");
            //process result
            while(rs.next())
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertCustomer(int id, String name) {

        //PreparedStatement
    }

}

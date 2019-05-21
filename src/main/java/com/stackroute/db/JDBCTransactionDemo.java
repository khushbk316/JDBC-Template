package com.stackroute.db;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public  class JDBCTransactionDemo {
    private Connection con;

    public void displayData() {




            try {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "Root@123");

                System.out.println("driver is loaded");
                Statement stmt = con.createStatement();
                con.setAutoCommit(false);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String Sql="insert into customer values(4,'priya',21,'f')";
                String Sql1="update customer set age=22 where id=1";
                stmt.executeUpdate(Sql);
                stmt.executeUpdate(Sql1);
                // int i3=stmt.executeUpdate("delete from student where sid=101");
                con.commit();
                System.out.println("Transaction is success");
                stmt.close();
            }//end of try
            catch (Exception e) {
                try {
                    con.rollback();
                    System.out.println("Trasaction is failed");

                    con.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }//end of catch

            System.out.println("connection is closed");

    }
}



package com.stackroute;

import com.stackroute.db.CrudOperation;
import com.stackroute.db.JDBCTransactionDemo;
import com.stackroute.db.ResultsetMetadataDemo;
import com.stackroute.db.RowsetDemo;
//import com.stackroute.db.RowsetDemo;

public class Main {
    public static void main(String[] args) {
//        CrudOperation crudOperation = new CrudOperation();
//          crudOperation.displayData();
//         crudOperation.displayCustomrerByName("khushbu","f");
//        ResultsetMetadataDemo resultsetMetadataDemo = new ResultsetMetadataDemo();
////        resultsetMetadataDemo.displayData();
//        RowsetDemo rowsetDemo=new RowsetDemo();
//        rowsetDemo.displayData();
        JDBCTransactionDemo jdbcTransactionDemo=new JDBCTransactionDemo();
        jdbcTransactionDemo.displayData();

    }
}

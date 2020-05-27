package com.iheart.training;

import sun.jvm.hotspot.ui.EditableAtEndDocument;

public class DatabaseHandler {
    //    Fails Open Closed Principle
//    private MySQLDatabase mySQLDatabase;
//    private OracleDatabase oracleDatabase;
    private Database database;

     public DatabaseHandler(Database database){
//         this.mySQLDatabase = new MySQLDatabase();
//         this.oracleDatabase = new OracleDatabase();
         this.database = database;
     }

     public void connect(){
//         this.mySQLDatabase.connect();
         this.database.connect();
     }

     public void disconnect(){
//         this.mySQLDatabase.disconnect();
         this.database.disconnect();
     }
}

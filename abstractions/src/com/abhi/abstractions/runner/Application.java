package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.JDBC;

public class Application  {
     private JDBC jdbc;
     public Application(JDBC jdbc){
         this.jdbc=jdbc;
         System.out.println(" running application...");
     }
     public void teaminfo(){
         if(jdbc !=null){
             jdbc.save();

         }else{
             System.out.println("jdbc is null");
         }

    }



}

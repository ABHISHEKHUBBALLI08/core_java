package com.abhi.stampede.repository;

import com.abhi.stampede.dto.StampedeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeRepoImpl implements StampedeRepo{

    @Override
    public boolean persist(StampedeDto stampedeDto) {
        if(stampedeDto!=null){
            String url="jdbc:mysql://localhost:3306/stampede";
            String userName="root";
            String password="abhi";
            //load driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // connecting to db
                Connection connection=DriverManager.getConnection(url,userName,password);
                //prepare statement
                String sql="insert into stampede_case values(0,'"+stampedeDto.getEvent()+"',"+stampedeDto.getDeaths()+","+stampedeDto.getInjuries()+")";
                Statement statement=connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }


            System.out.println("persist running in repo");
            return true;
        }
        return false;
    }
}

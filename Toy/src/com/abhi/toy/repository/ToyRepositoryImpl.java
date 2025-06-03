package com.abhi.toy.repository;

import com.abhi.toy.dto.ToyDto;
import com.abhi.toy.utils.ToyDatabase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ToyRepositoryImpl implements ToyRepository{
public ToyRepositoryImpl(){
    System.out.println("constructor in repository");
}
    @Override
    public boolean persist(ToyDto toyDto) {
        if(toyDto!=null){
            System.out.println("toyDto is not null");
            ToyDatabase toyDatabase=new ToyDatabase();
            try{
                Class.forName(toyDatabase.driverName);
                DriverManager.getConnection(toyDatabase.url,toyDatabase.userName,toyDatabase.password);
                System.out.println("connection success");
            }catch (Exception e){
                e.printStackTrace();
                return false;

            }

        }else {
            System.out.println("toy is null");
        }
        System.out.println("repository running in toyRepository");
        return true;
    }

}

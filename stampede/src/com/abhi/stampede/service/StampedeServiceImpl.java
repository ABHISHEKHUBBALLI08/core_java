package com.abhi.stampede.service;

import com.abhi.stampede.dto.StampedeDto;
import com.abhi.stampede.repository.StampedeRepo;
import com.abhi.stampede.repository.StampedeRepoImpl;

public class StampedeServiceImpl implements StampedeService{
    @Override
    public boolean save(StampedeDto stampedeDto) {
        if(stampedeDto!=null){
            System.out.println("runnign the service");
            StampedeRepo stampedeRepo=new StampedeRepoImpl();
            boolean result=stampedeRepo.persist(stampedeDto);

            if(Integer.parseInt(stampedeDto.getDeaths())<10){
                System.out.println("enter crt deaths");
            }else {
                System.out.println("crt death count");
            }
            if(Integer.parseInt(stampedeDto.getInjuries())<50){
                System.out.println("enter crt injuries");
            }else {
                System.out.println("crt injuries count");
            }
            System.out.println("saved successfully in serviceImpl");
            return result;
        }
        return false;
    }
}

package com.abhi.stampede.repository;

import com.abhi.stampede.dto.StampedeDto;

public interface StampedeRepo {
    boolean persist(StampedeDto stampedeDto);
}

package com.abhi.toy.repository;

import com.abhi.toy.dto.ToyDto;

public interface ToyRepository {
    boolean persist(ToyDto toyDto);
}

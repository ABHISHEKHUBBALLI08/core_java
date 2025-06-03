package com.abhi.gadget.repository;

import com.abhi.gadget.dto.GadgetDto;

public interface GadgetRepo {
    boolean Persist(GadgetDto gadget);
}

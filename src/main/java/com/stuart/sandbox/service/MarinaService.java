package com.stuart.sandbox.service;

import com.stuart.sandbox.model.Boat;
import com.stuart.sandbox.model.Marina;
import org.springframework.stereotype.Service;

@Service
public class MarinaService {

    public Marina addBoatToMarina(Marina marina, String name, Integer lengthFt) {
        marina.getBoats().add(Boat.builder()
                .name(name)
                .lengthFt(lengthFt)
                .build());
        return marina;
    }
}

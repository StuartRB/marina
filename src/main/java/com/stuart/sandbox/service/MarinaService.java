package com.stuart.sandbox.service;

import com.stuart.sandbox.model.Boat;
import com.stuart.sandbox.model.Marina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarinaService {

    public Marina addBoatToMarina(Marina marina, String name, Integer lengthFt) {
        // todo This works
//        List<Boat> boats = marina.getBoats();
//        boats.add(Boat.builder()
//                .name(name)
//                .lengthFt(lengthFt)
//                .build());
//        marina.setBoats(boats);

        // todo This doesn't work!
        marina.getBoats().add(Boat.builder()
                .name(name)
                .lengthFt(lengthFt)
                .build());

        return marina;
    }
}

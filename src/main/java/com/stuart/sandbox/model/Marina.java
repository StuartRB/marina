package com.stuart.sandbox.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Marina {
    private String name;
    private List<Boat> boats;

    public List<Boat> getBoats() {
        if (boats == null) {
            boats = new ArrayList<>();
        }
        return boats;
    }
}

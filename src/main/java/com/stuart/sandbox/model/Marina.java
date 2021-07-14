package com.stuart.sandbox.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Builder
public class Marina {
    private String name;
    private List<Boat> boats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoats(List<Boat> boats) {
        this.boats = boats;
    }

    public List<Boat> getBoats() {
        return boats == null ? new ArrayList<>() : boats;
    }
}

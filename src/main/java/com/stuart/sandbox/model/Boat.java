package com.stuart.sandbox.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Boat {
    private String name;
    private Integer lengthFt;
}

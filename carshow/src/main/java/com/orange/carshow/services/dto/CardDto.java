package com.orange.carshow.services.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data //Lombok's @Data annotation generates getter methods based on the exact field name
public class CardDto {

    private String thumbnail;
    private long makeID;
    private long modelID;
    @JsonAlias("make")
    private Details makerDetails;
    private Details model;
    private long year;
    private long price;
    private long carStatus;
}

package com.devsuperior.dslist.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
    private Long id;
    private String title;
    private String year;
 
    private String imgUrl;
    private String shortDescription;
}

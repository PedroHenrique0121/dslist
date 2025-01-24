package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameMinDTO {
    private Long id;
    private String title;
    private String year;

    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }
}

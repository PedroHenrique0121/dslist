package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

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
        BeanUtils.copyProperties(game, this);
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        BeanUtils.copyProperties(gameMinProjection, this);
        this.year = gameMinProjection.getGameYear();
    }
}

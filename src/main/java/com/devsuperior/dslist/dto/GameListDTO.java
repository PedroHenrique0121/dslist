package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList gameList) {
        BeanUtils.copyProperties(gameList, this);
    }
}

package com.noureddine.notification.notificationsystemprojectreactor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int scoreTeamA;
    private int scoreTeamB;
    private String message;
}

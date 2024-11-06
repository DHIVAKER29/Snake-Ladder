package com.scaler;

import com.scaler.Models.Game;
import com.scaler.Models.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game!");
        int dimension = 10;

        Player player1 = new Player("Dhivaker", 1);
        Player player2 = new Player("Priya", 1);

        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(dimension, players);

        game.launch();
    }
}
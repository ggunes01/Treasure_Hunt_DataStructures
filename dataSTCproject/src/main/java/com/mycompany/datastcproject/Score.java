/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class Score implements Comparable<Score>{
    String name;
    String level;
    int score;

    public Score(String name, String level, int score) {
        this.name = name;
        this.level = level;
        this.score = score;
    }

   
    @Override
    public int compareTo(Score other) {
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return name + ", " + level + ", " + score;
    }

    public String getName() {
        return name;
    }

   

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}

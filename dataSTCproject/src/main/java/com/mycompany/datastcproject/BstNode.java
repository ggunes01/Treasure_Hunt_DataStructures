/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class BstNode{
    
  
    int score;
    String name;
    String level;
    BstNode left;
    BstNode right;

    public BstNode(int score, String name, String level) {
        this.score = score;
        this.name = name;
        this.level = level;
        left = right=null;
    }
    
    @Override
public String toString() {
    return name + ", " + score + ", " + level;  
}
}

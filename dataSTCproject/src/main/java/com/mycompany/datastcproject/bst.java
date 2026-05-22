/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class bst {
    BstNode root;
    
    void insert(int score,String name, String level){
        root = insertRec(root,score,name,level);
    }
    
    private BstNode insertRec(BstNode root,int score,String name, String level){
        if (root==null) {
            return new BstNode(score, name, level);
        }
        if (score<root.score) {
            root.left=insertRec(root.left, score, name, level);
        }else{
            root.right= insertRec(root.right, score, name, level);
        }
        return root;
    }
    
    
    
    public BstNode findMin(String name){
        return findMinRec(root, normalizeName(name), null);
    }
    private BstNode findMinRec(BstNode node,String name,BstNode crrMin){
        if (node ==null) {
            return crrMin;
        }
        if (node.name.toLowerCase().equals(name)) {
            if (crrMin == null || node.score < crrMin.score) {
                crrMin = node;
            }
        }
        crrMin=findMinRec(node.left, name, crrMin);
        crrMin=findMinRec(node.right, name, crrMin);
        return crrMin;
    }
    
    public BstNode findMax(String name){
        return findMaxRec(root, normalizeName(name), null);
    }
    
    private BstNode findMaxRec(BstNode node,String name,BstNode crrMax){
        if (node ==null) {
            return crrMax;
        }
        if (node.name.toLowerCase().equals(name)) {
            if (crrMax == null || node.score > crrMax.score) {
                crrMax = node;
            }
        }
        crrMax = findMaxRec(node.left, name, crrMax);
        crrMax = findMaxRec(node.right, name, crrMax);
        return crrMax;
    }
    
    void listScores(String name, javax.swing.JTextArea textArea) {
    listScoresRec(root, normalizeName(name), textArea);
}

private void listScoresRec(BstNode node, String name, javax.swing.JTextArea textArea) {
    if (node == null) return;

    if (node.name.toLowerCase().equals(name)) {
        textArea.append("Score: " + node.score + ", Level: " + node.level + "\n");
    }
    
    listScoresRec(node.left, name, textArea);
    listScoresRec(node.right, name, textArea);
}

private String normalizeName(String name) {
    return name == null ? "" : name.trim().toLowerCase();
}

    
 
}

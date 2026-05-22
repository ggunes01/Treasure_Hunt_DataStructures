/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class DoubleLinkedList <T> {
    public DNode <T> head,tail;
    
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }
    

    void Nadd(DNode<T> node){
        if(head == null){
           head = tail = node;
        }else{
        node.next = head ;
        head.prev = node;
        head = node;
        }}
    
   DNode<T> meth2(DNode<T> node, int dice) {
    if (node == null) return null;
    
    DNode<T> temp = node;
    if (dice > 0) {
        for (int i = 0; i < dice; i++) {
            if (temp.next == null) return temp; 
            temp = temp.next;
        }
    } else if (dice < 0) {
        for (int i = 0; i < Math.abs(dice); i++) {
            if (temp.prev == null) return temp; 
            temp = temp.prev;
        }
    }
    return temp;
} 
   
 
  
    
    }

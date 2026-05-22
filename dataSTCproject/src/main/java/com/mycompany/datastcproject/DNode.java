/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class DNode<T> {
     DNode <T> prev;
      T data;
    DNode <T> next;
    

   public DNode(T info) {
    this.data = info;
    this.prev = null;
    this.next = null;
}
    
    
    
    
}

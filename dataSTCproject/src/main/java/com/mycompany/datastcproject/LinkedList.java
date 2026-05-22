/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastcproject;

/**
 *
 * @author Göktuğ Güneş
 */
public class LinkedList<T> {
    /*This class is created for first level of game*/
     public Node <T> head;

    public LinkedList() {
        head = null;
    }
  
    void add(Node<T> a){
        if(head==null){
        head=a;
        }else{
        a.next = head;
        head= a;
        }
}
    public int find(int target) {
    Node<T> temp = head;

    for (int i = 1; i < target; i++) {
        if (temp == null || temp.next == null) {
            return -1; // Geçersiz indeks
        }
        temp = temp.next;
    }

    if (temp == null || temp.data == null) {
        return -1; // Geçersiz veri
    }

    return (Integer) temp.data;
}
    
    Node<T> meth(Node<T> node, int dice) {
    Node<T> temp = node;
    for (int i = 0; i < dice; i++) {
        if (temp == null) {
            return null; // veya hata mesaj, ya da kırma burada
        }
        temp = temp.next;
    }
    return temp;
}


    
   
}

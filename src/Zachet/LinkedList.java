package Zachet;


public class LinkedList<T>{

    private Node ass;
    public void add(T value){
        if(ass == null){
            ass = new Node(value);

        }
    }
    }




class Node<T>{
    T value;
    Node next;

    public Node(T value){
        this.value = value;
    }
}
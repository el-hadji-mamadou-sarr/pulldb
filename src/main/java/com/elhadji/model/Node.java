package com.elhadji.model;

public class Node {
    private String Key;
    private String Value;
    private Node next;

    Node( String Key,String Value, Node next){
        this.Key = Key;
        this.Value = Value;
        this.next = next;
    }

    public String getKey() {
        return Key;
    }
    public void setKey(String Key) {
        this.Key = Key;
    }

    public String getValue() {
        return Value;
    }
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Key='" + Key + '\'' +
                ", Value='" + Value + '\'' +
                ", next=" + next +
                '}';
    }
}

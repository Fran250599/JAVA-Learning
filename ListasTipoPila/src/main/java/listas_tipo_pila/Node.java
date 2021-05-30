package listas_tipo_pila;

public class Node {
    
    
    //Parametros
    private Node next;
    private int data;

    public Node(){
        this.next = null;
        this.data = 0;
    }
    public Node(Node n, int d) {
        this.next = n;
        this.data = d;
    }
    public Node getNode(){
        return this;
    }
    public Node getNext(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    
    public void setData(int d){
        this.data = d;
    }
    public void setNext(Node n){
        this.next = n;
    }
    

    
}
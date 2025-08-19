// Custom List Implementation
import java.util.*;
class Node<T>{
    T data;
    Node<T>next;
    Node(T data){
        this.data = data;
    }
}
class CustomList<T>{
    Node<T> head;
    Node<T> tail;
    CustomList(){
        this.head = null;
        this.tail = null;
    }
    void insert(T data){
        Node<T>newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void print(){
        Node<T>curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
class Main{
    public static void main(String[] args){
        CustomList<Integer>custList = new CustomList<>();
        custList.insert(1);
        custList.insert(2);
        custList.insert(3);
        custList.insert(4);
        custList.print();
    }
}

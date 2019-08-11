import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(){
        this.data=0;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
class linklist{
    Node head=new Node();
    Node pointer=head;
    public void addNode(Node a){
        if(head.next==null){
            head.next=a;
            a.next=null;
        }else{
            while(pointer.next!=null){
                pointer=pointer.next;
            }
            pointer.next=a;
            a.next=null;
        }
    }
    public void traverse(){
        while(pointer.next!=null){
            System.out.println(pointer.data);
            pointer=pointer.next;
        }
    }

}
class Main{
    public static void main(String[] args){
        System.out.println("Enter the number to be added");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Node a = new Node(num,null);
        linklist ll=new linklist();
        ll.addNode(a);
        ll.traverse();
    }
}
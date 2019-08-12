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
    public void addNode(Node a){
        Node pointer = head;
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
        Node pointer=head;
        while(pointer.next!=null){
            pointer=pointer.next;
            System.out.println(pointer.data);
        }
    }

}
class Main{
    public static void main(String[] args){
        int x;
        linklist ll=new linklist();
        int i=0;
        while(i<5){
        System.out.println("Select the operation to be performed 1.add,2.traverse");
        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();
        switch(i){
            case 1:{
                x=sc.nextInt();
                Node a = new Node(x,null);
                ll.addNode(a);
                break;
            }
            case 2:
                ll.traverse();
            default:{
                break;
                }   
            }
        }
}
}
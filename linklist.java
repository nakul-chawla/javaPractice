import java.io.*;
import java.util.*;

import org.graalvm.compiler.nodes.NodeView.Default;

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
            System.out.println(pointer.data);
            pointer=pointer.next;
        }
    }

}
class Main{
    public static void main(String[] args){
        System.out.println("Select the operation to be performed 1.add,2.traverse");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int x;
        linklist ll=new linklist();
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
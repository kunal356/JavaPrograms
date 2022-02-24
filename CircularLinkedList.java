package com.practice;

public class CircularLinkedList {

    private class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    //get size of linkedlist
    public int getSize(){
        return this.size;
    }
    //adding at head
    public void addFirst(int data){
        Node n=new Node(data,null);
        n.next=this.head;
        this.head=n;
        if(size==0) this.tail=n;
        this.size++;

    }

//    adding at tail
    public void addLast(int data){
        if(size==0){
            addFirst(data);
            return;
        }
        Node n=new Node(data,null);
        this.tail.next=n;
        this.tail=n;
        n.next=this.head;
        this.size++;
    }

//    add at any index
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size){
            addLast(data);
            return;
        }
        Node prev= getNode(idx-1);
        Node n = new Node(data,null);
        n.next=prev.next;
        prev.next=n;
        this.size++;
    }

    public Node removeFirst(){
        if(size==1){
            Node temp=this.head;
            this.head=null;
            this.tail=null;
            this.size--;
            return temp;
        }
        Node temp=this.head;
        this.head=head.next;
        temp.next=null;
        this.tail.next=this.head;
        this.size--;
        return temp;
    }
//    remove at last
    public Node removeLast(){
        Node temp=this.tail;
        Node prev=getNode(size-2);
        prev.next=this.head;
        this.tail=prev;
        this.size--;
        return temp;

    }
//    remove at any index
    public Node remove(int idx){
        Node temp=getNode(idx);
        if(idx==0){
            removeFirst();
            return temp;
        }
        if(idx==this.size-1){
            removeLast();
            return temp;
        }
        Node prev =getNode(idx-1);
        prev.next=temp.next;
        this.size--;
        return temp;
    }
    public void set(int data, int idx){
        Node temp=getNode(idx);
        temp.data=data;

    }

//    get Node at any index
    public Node getNode(int idx){
        if(idx==0)return this.head;
        if(idx==this.size-1)return this.tail;
        Node temp = this.head;
        int tempIdx=0;
        while(tempIdx<idx){
            temp = temp.next;
            tempIdx++;
        }
        return temp;
    }

//    display function
    public void display(){
        if(size==0){
            System.out.println("null") ;
            return;
        }
        Node temp=this.head;
        while (temp!=tail){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}

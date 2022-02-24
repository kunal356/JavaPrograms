package com.practice;

public class DoublyLinkedList {
    private  class  Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

//    adding at first
    public void addFirst(int data){
        Node n=new Node(data);
        if(size==0){
            n.next=null;
            n.prev=null;
            this.head=n;
            this.tail=n;
            this.size++;
            return;
        }
        n.next=this.head;
        this.head.prev=n;
        this.head=n;
        this.size++;
    }

//    adding at last
    public void addLast(int data){
        Node n = new Node(data);
        this.tail.next=n;
        n.prev=this.tail;
        n.next=null;
        this.tail=n;
        this.size++;
    }

//    add at any position
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        if (idx==size){
            addLast(data);
            return;
        }
        Node left = getNode(idx-1);
        Node right=left.next;
        Node n = new Node(data);
        n.next = right;
        n.prev = left;
        right.prev = n;
        left.next = n;
    }

//    remove first
    public void removeFirst(){
        if(size==1){
            this.head=null;
            this.tail=null;
            this.size--;
            return;
        }

        Node after=this.head.next;
        this.head.next=null;
        after.prev=null;
        this.head=after;
        this.size--;
        if(size==1){
            this.tail=after;
        }
    }

//  remove at last
    public void removeLast(){
        if(this.size==1){
            removeFirst();
            return;
        }
        Node before = this.tail.prev;
        this.tail.prev=null;
        before.next=null;
        this.tail = before;

    }

//    remove at any index
    public void remove(int idx){
        if(idx==0){
            removeFirst();
            return;
        }if(idx==this.size-1){
            removeLast();
            return;
        }
        Node n= getNode(idx);
        Node before = n.prev;
        before.next=n.next;
        n.next.prev=before;
    }

//    update
    public void set(int data,int idx){
        Node n=getNode(idx);
        n.data=data;
    }


//    get Node at any index
    public Node getNode(int idx){
        Node temp=this.head;
        int tempIdx=0;
        while(tempIdx<idx){
            temp=temp.next;
            tempIdx++;
        }
        return temp;
    }

    public void display(){
        if(size==0) {
            System.out.println("null");
            return;
        }
        Node temp=this.head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}


package ldoublylinkedlistimpl;

import java.util.NoSuchElementException;
public class LDoublyLinkedListImpl<A> { 
private Node head;
    private Node tail;
    private int size;
     
    public LDoublyLinkedListImpl() {
        size = 0;
    }
    private class Node {
        A element;
        Node next;
        Node prev;
 
        public Node(A element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public int size() { return size; }
     public boolean isEmpty() { return size == 0; }
    public void addFirst(A element) {
        Node tmp = new Node(element, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
    public void addLast(A element) {
         
        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }
    public void iterateBackward(){
         
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }
    public A removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
    public A removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
     
    public static void main(String a[]){
         
        LDoublyLinkedListImpl<Integer> dll = new LDoublyLinkedListImpl<Integer>();
        dll.addFirst(20);
        dll.addFirst(41);
        dll.addLast(80);
        dll.addLast(470);
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();
    }
}



    

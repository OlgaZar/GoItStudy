package MyLinkedList_HW9;

import java.util.LinkedList;

public class MyLinkedList {
    Node first;
    Node last;


    public static class Node {
        Object data;
        Node prev;
        Node next;

        public <T> Node(Object data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }
}






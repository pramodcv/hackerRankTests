/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head){

        if(head==null||head.next==null||head.next.next==null){
        return false;
        }
        Node currentHead=head;
        Node nextHead=currentHead.next;
        boolean hasNextNode=false;
        while(!hasNextNode){
            if(nextHead.next.equals(currentHead)){
            return true;
            }
            currentHead=nextHead;
            nextHead=currentHead.next;
        }
            return false;}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockchain.utility;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author CristianM
 */
public class Lista {

    Node head = null;//Empty List

    /**
     * -- EMPTY --
     *
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Node temp = head;
        while (temp != null) {
            bw.write(temp.toString());
            temp = temp.next;
        }
        bw.flush();
    }

    public int Size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    public Node returnUltimate() {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        Lista ls = new Lista();
        int cont = 1;
        ls.insertAtBegin(new Node(cont, 1234, "dir1 dir2", "0000000000000000000000000000000000000000000000000000000000000000", "asldj67dasuj"));
        cont++;
        ls.insertAtBegin(new Node(cont, 1235, "dir2 dir3", "asldj67dasuj", "asd56asdh13"));
        ls.returnUltimate();
        ls.printList();
    }
}

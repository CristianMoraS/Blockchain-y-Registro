/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockchain.utility;

/**
 *
 * @author CristianM
 */
public class Node {

        // Atributos:
    public int code;
    public int nonce;
    public String data;
    public String anthash;
    public String prehash;

    //int* ponter = &a; en c/c++
    public Node next;// <--- Este es el puntero

    public Node() {
    }

    //nodo:
    public Node(int code, int nonce, String data, String anthash, String prehash) {
        this.code = code;
        this.nonce = nonce;
        this.data = data;
        this.anthash = anthash;
        this.prehash = prehash;
    }

    // metodo to string
    @Override
    public String toString() {
        return "code: " + this.code + "\tNonce: " + this.nonce + "\tData: " + this.data + "\tHash: " + this.anthash + "\tPreview Hash: " + this.prehash + "\n";
    }

}


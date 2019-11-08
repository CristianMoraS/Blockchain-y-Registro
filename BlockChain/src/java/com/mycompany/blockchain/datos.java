/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blockchain;

/**
 *
 * @author CristianM
 */
public class datos {
    
    int code, nonce;
    String data, anthash, posthash;
    
    public datos(){}
    public datos (int code, String data){
        super();
        this.code = code;
        this.data = data;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAnthash() {
        return anthash;
    }

    public void setAnthash(String anthash) {
        this.anthash = anthash;
    }

    public String getPosthash() {
        return posthash;
    }

    public void setPosthash(String posthash) {
        this.posthash = posthash;
    }
    @Override
    public String toString(){
        return "Bloque: " + "\t" + "# " + this.code + "\t" + "Nonce " + this.nonce 
                + "\t" + "Data: " + this.data + "\t" + "Hash anterior " + this.anthash 
                + "\t" + "Hash del bloque " + this.posthash;
    }
    
}

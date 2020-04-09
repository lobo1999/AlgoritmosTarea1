/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazadaDoble;

/**
 *
 * @author Luis Andrés
 */
public class clsNode {
    
    private int data;
    private clsNode next, previous;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public clsNode getNext() {
        return next;
    }

    public void setNext(clsNode next) {
        this.next = next;
    }

    public clsNode getPrevious() {
        return previous;
    }

    public void setPrevious(clsNode previous) {
        this.previous = previous;
    }
    
    
}

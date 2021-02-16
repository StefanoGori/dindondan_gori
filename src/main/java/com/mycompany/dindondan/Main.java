/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dindondan;

/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer c=0;
        Thread t1=new Thread(new incrementa(c));
        Thread t2=new Thread(new decrementa(c));
        
        t1.start();
        t2.start();
        
    }
    
}

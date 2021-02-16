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
public class decrementa implements Runnable{
    private int c;
    private boolean g=true;
    public decrementa(int c){
        this.c=c;
    }
    
    @Override
    public void run(){
        if(this.c==100){
            while(g=true){
                for(this.c=100;this.c>=0;this.c--){
                    System.out.println(this.c);
                }
            }
        }
    }
}

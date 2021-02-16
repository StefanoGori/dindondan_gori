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
public class incrementa implements Runnable{
    private int c;
    private boolean g=true;
    
    public incrementa(int c){
        this.c=c;
    }
    
    @Override
    public void run(){
        if(this.c==0){
            while(g=true){
                for(this.c=0;this.c<=100;this.c++){
                    System.out.println(this.c);
                }
            }
        }
    }
}
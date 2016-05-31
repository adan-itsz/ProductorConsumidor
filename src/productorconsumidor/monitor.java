/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

/**
 *
 * @author adan
 */
public class monitor {
    private char[] buffer;
    private int tope=0;
    boolean lleno=false;
    boolean vacio=true;
    public monitor(int capacidad){
    buffer= new char[capacidad];
    }
    
    public synchronized void poner(char c) throws Exception{
        
        while(lleno){
        wait();
        
        }
        buffer[tope++]=c;
        vacio=false;
        lleno=tope>=buffer.length;
        notifyAll();

    }
    
    public synchronized char quitar()throws Exception{
         while(vacio){
        wait();
        
        }
        char c= buffer[--tope];
         lleno=false;
        vacio=tope<=0;
       
        notifyAll();
        return c;
    }
    
}

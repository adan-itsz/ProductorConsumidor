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
public class productor extends Thread{
    private monitor buff;
    int n;
    int sleep;
    
    public productor(monitor bu,int numero,int sleep){
    this.buff=bu;
    this.n=numero;
    this.sleep=sleep;
    
    }
    
    public void run(){
        try{
        char c;
            for (int i = 0; i < n; i++) {
                c= (char)('A'+ i);
                buff.poner(c);
                System.out.println("se produjo : "+c);
                sleep((int)(Math.random()*sleep));
                
                
            }
        
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        
        }
    
    }
    
}

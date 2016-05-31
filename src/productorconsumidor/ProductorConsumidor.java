

package productorconsumidor;



public class ProductorConsumidor  {
    
    public static void main(String[] args) {
    monitor m= new monitor(10);
    productor p= new productor(m,6,2000);
    
    consumidor c= new consumidor(m,6,2000);
    p.start();
    c.start();
    System.out.println("final");
    }
}

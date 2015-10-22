package ejercicio14;
public class Ejercicio14 {
    public static void main(String[] args) {
       Producto p1=new Producto("C1",24);
       System.out.println("Datos producto 1");
       p1.factura();
       Producto p2=new Producto("H23",234);
       System.out.println("Datos producto 2");
       p2.factura();
       Producto p3=new Producto("M30",109);
       System.out.println("Datos producto 3");
       p3.factura();
       
       System.out.println("\n-----------\n");
      
       System.out.println("Datos producto 1");
       p1.factura();
       System.out.println("Datos producto 2");
       obx(p2);
       p2.factura();
       System.out.println("Datos producto 3");
       p3.factura();   
    }
    
    static void obx(Producto b){
        b.cambiarDatos("K123",247);
    }  
    
}

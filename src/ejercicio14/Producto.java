package ejercicio14;
public class Producto {
    private String codigo;
    private int precio;
    
    public Producto(){
    }
    
    public Producto(String c,int p){
        codigo=c;
        precio=p;
    }
    
    String devolverCodigo(){
        return codigo;
    }
    
    int devolverPrecio(){
        return precio;
    }
    
     public void cambiarDatos(String dcodigo,int dprecio){
        codigo=dcodigo;
        precio=dprecio;
    }
     
    public void factura(){
        System.out.println("Código: " +codigo+ " Precio: "+precio+" €");
        //System.out.println("Precio "+precio+" €");
    }
    
   
}

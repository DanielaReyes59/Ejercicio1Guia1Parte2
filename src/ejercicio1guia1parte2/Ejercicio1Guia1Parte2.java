
package ejercicio1guia1parte2;


public class Ejercicio1Guia1Parte2 {

    
    public static void main(String[] args) {
        
       Numero x = new Numero(5);
       
       if (x.esPar()){
        
           System.out.println("El número es par");
       }else     {
            System.out.println("Es impar");
        }
       
        System.out.println(x.esPositivo());
    }    
    
}

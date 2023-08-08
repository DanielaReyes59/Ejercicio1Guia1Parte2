
package ejercicio1guia1parte2;


public class Numero {
    
    //Atributos
    private int num;
    
    //Constructor

    public Numero(int num) {
        this.num = num;
    }
    
    //Metodos
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public boolean esPar(){
      return this.num % 2==0;
    }

    public boolean esPositivo() {
        return this.num % 2==0;
    }
    
    public boolean esMultiploDe(int otroNum){
        return otroNum % this.num==0;
    }
}

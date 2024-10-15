
package Clases;


public class Cadena extends Joya{
    private int largoCadena;

    public Cadena() {
    }

    public Cadena(int largoCadena, int numero, String nombre, String material) {
        super(numero, nombre, material);
        this.largoCadena = largoCadena;
    }

    public int getLargoCadena() {
        return largoCadena;
    }

    public void setLargoCadena(int largoCadena) {
        this.largoCadena = largoCadena;
    }

    @Override
    public String toString() {
        return "Cadena{" + "largoCadena=" + largoCadena +super.toString()+ '}';
    }
    @Override
    public void mensaje(){
        System.out.println("Linda cadena");
    }
    //1era Forma: 
    public void ValorDolar(){
        System.out.println("Valor: "+(250000/940)+"$");
    }
    //2da Forma: 
    public void ValorDolar(int dolar){
        System.out.println("Valor: "+(250000/dolar));
    }
    //3era Forma: 
    public int ValorDolar(int dolar, int pesos){
        return pesos/dolar;
    }
}

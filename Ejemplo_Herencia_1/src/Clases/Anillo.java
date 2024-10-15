
package Clases;


public class Anillo extends Joya{
    private int medida;

    public Anillo() {
    }

    public Anillo(int medida, int numero, String nombre, String material) {
        super(numero, nombre, material);
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Anillo{" + "medida=" + medida +super.toString()+ '}';
    }
    @Override
    public void mensaje(){
        System.out.println("Anillo bakan");
    }
    
}

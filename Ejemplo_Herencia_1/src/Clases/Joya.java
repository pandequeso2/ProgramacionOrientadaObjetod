
package Clases;


public class Joya {
    private int numero;
    private String nombre;
    private String material;

    public Joya() {
    }

    public Joya(int numero, String nombre, String material) {
        this.numero = numero;
        this.nombre = nombre;
        this.material = material;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Joya{" + "numero=" + numero + ", nombre=" + nombre + ", material=" + material + '}';
    }
    public void mensaje(){
        System.out.println("Es una linda joya...");
    }
    
}

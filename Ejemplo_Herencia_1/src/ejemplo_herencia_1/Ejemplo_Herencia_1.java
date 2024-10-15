
package ejemplo_herencia_1;

import Clases.Anillo;
import Clases.Cadena;


public class Ejemplo_Herencia_1 {

    
    public static void main(String[] args) {
        
        Cadena cad=new Cadena(60, 1,"Cadenita", "Plata");
        System.out.println("Cadena: \n Largo Cadena: "+cad.getLargoCadena()+"cm\n Nombre Cadena: "+cad.getNombre()+"\n Numero Cadena: "+cad.getNumero()+"\n Material: "+cad.getMaterial());
        cad.mensaje();
        Anillo ani = new Anillo(14, 2, "bodas", "Platino");
        ani.mensaje();
        cad.ValorDolar();
        cad.ValorDolar(980);
        int valor= cad.ValorDolar(940, 2500);
        System.out.println("Valor: "+valor);
        
    }
    
}

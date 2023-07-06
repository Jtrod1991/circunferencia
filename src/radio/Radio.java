//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).


package Radio;

import Circunferencia.Circunferencia;
import java.util.Scanner;


public class Radio {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
          Circunferencia circulo1 = new Circunferencia();
          
          circulo1.crearCircunferencia();
          
         circulo1.area();
         
         circulo1.perimetro();
         
         System.out.println("Conectado a git");
    }  
}

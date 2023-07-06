//
package Circunferencia;

//
import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int radio;

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;

    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {

        System.out.println("Ingrese el numero de Radio ");

        radio=leer.nextInt();
        //this.radio = leer.nextInt();
        
        System.out.println( "El radio es: " + radio);
        System.out.println("--------------------");

    }

    public void area() {

        double area = (Math.PI * Math.pow(getRadio(), 2));

        System.out.println(" El Area es :" + area);
        System.out.println("---------------------");

    }

    public void perimetro() {

        double perimetro = 2 * (Math.PI * getRadio());

        System.out.println("El perimetro es:  " + perimetro);

    }

}

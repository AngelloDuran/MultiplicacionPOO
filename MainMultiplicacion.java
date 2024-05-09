
// se importa la libreria Scanner
import java.util.Scanner;

// se declara la clase
public class MainMultiplicacion {
    // se agrega el metodo main
    public static void main(String[] args) {
        // se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingresa un numero");
        // se almacena el valor del usuario
        int a = n1.nextInt();
        // se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // se almacena el valor del usuario
        int b = n1.nextInt();
        // se hace la operacion con los datos ingresados por el usuario
        // se imprime el resultado de la operacion y se muestra en pantalla
        Multiplicacion m2 = new Multiplicacion();
        m2.setA(a);
        m2.setB(b);
        m2.multiplicar(a, b);
        m2.getA();
        m2.getB();
        m2.getR();
        System.out.println("El resultado es :" + m2.multiplicar(a, b));
        System.out.println(m2.toString());

        System.out.println(n1.toString());

        // se cierra el metodo mian
    }
    // se cierra clase
}
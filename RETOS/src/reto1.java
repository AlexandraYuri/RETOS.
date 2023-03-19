import java.util.Scanner;
public class reto1{
    public static void main(String[] args){
        
        double  fahrenheit ;
        double  grados ;
        double  num = 32;
        double num2 =1.8;
        
        Scanner lectura = new Scanner(System.in);
        

        System.out.print(" Ingrese la temperatura en grados:");
        grados = lectura.nextDouble();

        fahrenheit = (grados-num)/num2;

        System.out.println("Grados Fahrenheit: "+fahrenheit);
        lectura.close();

    }
}


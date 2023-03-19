import java.util.Scanner;

public class reto2 {
    
    public static void main(String[] args){
        
        int opcion;
        int computador;
        int tope=100;
        int apuesta=0;
        String nombre;

        Scanner lectura=new Scanner(System.in);

        System.out.println("jueguemos piedra, papel o tijera");

        System.out.println("ingrese su nombre");
        nombre = lectura.nextLine();

        System.out.println("opciones: piedra:1, papel:2, tijera:3");
        opcion=lectura.nextInt();

        System.out.println("cuanto va a apostar");
        apuesta=lectura.nextInt();

        computador=(int) (Math.random()*3)+1;
        
        if(computador==1 && opcion==1){
            System.out.println("respuesta piedra");
            System.out.println("empate");
        }
        else if(computador==2 && opcion==1){
            System.out.println("respuesta piedra");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ computador + " tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope-apuesta));
        }
        else if(computador==3 && opcion==1){
            System.out.println("respuesta es piedra");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ computador +" tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(computador==2 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println("empate");
        }
        else if(computador==1 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ computador +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(computador==3 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ computador +"tu respuesta es: " + opcion+" y tu valor final es de:"+ (tope-apuesta));
        }
        else if(computador==3 && opcion==3){
            System.out.println("respuesta tijera");
            System.out.println( "empate");
        }
        else if(computador==2 && opcion==3){
            System.out.println("respuesta tijera");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ computador +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(computador==1 && opcion==3){
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ computador +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope-apuesta));
        }
        System.out.println("!Gracias por jugar¡"); 

        
        lectura.close();
    }
}
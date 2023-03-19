import java.util.Scanner;
//nombre del documento
public class reto4 {
    public static void main(String[] args) {
        
        int tipoCara;
        int tiroAleatorio;
        int tope=100;
        int apuesta=0;
        String nombre;
        
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("jueguemos cara o cello");
    
        System.out.println("ingrese su nombre");
        nombre=lectura.nextLine();
        System.out.println("tira una moneda, cara:1 y sello:2");
        tipoCara=lectura.nextInt();
        System.out.println("cuanto va apostar");
        apuesta=lectura.nextInt();

        tiroAleatorio=(int) (Math.random()*2)+1;
        
        if(tiroAleatorio==1 && tipoCara==1){
            System.out.println(nombre+ "empate respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es" + tipoCara + "y tu valor final es" + apuesta);
        }
        else if(tiroAleatorio==1 && tipoCara==2){
            System.out.println(nombre+ " salio sello has perdido la respuesta de la maquina fue:"+tiroAleatorio+"tu respuesta es"+tipoCara+"y tu valor final es de:" +(tope-apuesta));
        }
        else if(tiroAleatorio==2 && tipoCara==1){
            System.out.println(nombre + "salio cara has ganado la respuesta de la maquina fue:"+tiroAleatorio+"tu respuesta es"+tipoCara+"y tu valor final es de:" + (tope+apuesta));
        }
        else if(tiroAleatorio==2 && tipoCara==2){
            System.out.println(nombre + "empate respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es" + tipoCara + "y tu valor final es" + apuesta);
        }
        System.out.println("Gracias por jugar");

        //Limpiar Buffer
        lectura.close();
    }
}
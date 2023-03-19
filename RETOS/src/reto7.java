import java.util.Scanner;
public class reto7 {
    
    public static void main(String[] args) throws Exception {
        
        int eleccion;
        int ComputadoraAleatorea;
        int i=0;
        int cantidad=0;
        int top=100000;
        int apuesta;
        String nombre;
        
        
        Scanner lectura=new Scanner(System.in);

        System.out.println("chimbupapas");

        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();

        System.out.println("ingrese la cantidad de veces que desea jugar");
        cantidad=lectura.nextInt();

        System.out.println("su top inicial para apuestas es de 100.000$");
        //crear condición
        for(i=0;i<cantidad ;i++){ 

            System.out.println("¿cuanto desea apostar?");
            apuesta=lectura.nextInt();

            System.out.println("chim....bum....papas... ¡¡YA!!");
            System.out.println("¡¡Elige una opcion RAPIDO!!");
            System.out.println("opciones: piedra:1, papel:2, tijera:3");
            eleccion=lectura.nextInt();

            ComputadoraAleatorea=(int) (Math.random()*3)+1;

        if(ComputadoraAleatorea==1 && eleccion==1){
            System.out.println("respuesta tijera");
            System.out.println("has ganado ahora tu top es de:"+(top-=apuesta));
        }
        else if(ComputadoraAleatorea==1 && eleccion==2){
            System.out.println("respuesta papel");
            System.out.println("has perdido tu top es ahora:"+(top-=apuesta));
        }
        else if(ComputadoraAleatorea==1 && eleccion==3){
            System.out.println("empate tu top es ahora:"+top);
        }
        else if(ComputadoraAleatorea==2 && eleccion==1){
            System.out.println("respuesta piedra");
            System.out.println("has ganado");
        }
        else if(ComputadoraAleatorea==2 && eleccion==2){
            System.out.println("respuesta tijera");
            System.out.println("has perdido");
        }
        else if(ComputadoraAleatorea==2 && eleccion==3){
            System.out.println("empate");
        }
        else if(ComputadoraAleatorea==3 && eleccion==1){
            System.out.println("respuesta piedra");
            System.out.println("has perdido");
        }
        else if(ComputadoraAleatorea==3 && eleccion==2){
            System.out.println("respuesta papel");
            System.out.println("has ganado");
        }
        else if(ComputadoraAleatorea==3 && eleccion==3){
            System.out.println("empate");
        }
    }
        System.out.println("!Gracias por jugar¡");

        
        lectura.close();
    }
}


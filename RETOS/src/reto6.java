import java.util.Scanner;
                                                                                
public class reto6 {
                                                                                
    public static void main(String[] args) throws Exception {

        int tipoCara;
        int tiroAleatorio;
        int tope=100;
        int apuesta=0;
        int i=0;
        int cantidad=0;
        String nombre;
                                                                                   
        System.out.println("juego del carillerazo");
       
        Scanner lectura=new Scanner(System.in);
 
        System.out.println("ingrese su nombre");
        nombre=lectura.nextLine();
                                                                 
        System.out.println("Porfavor ingrese la cantidad de veces que quiere jugar");
        cantidad=lectura.nextInt();

        tiroAleatorio=(int) (Math.random()*2)+1;
    
        for(i=0;i<cantidad;i++){ 
                                                                                                     
        System.out.println("cuanto va apostar");
        apuesta=lectura.nextInt();
                                                                                     
        System.out.println("tira una moneda, cara:1 y sello:2");
        tipoCara=lectura.nextInt();
                                            
       
    
          if (tiroAleatorio == 1 && tipoCara == 1) {
                
                System.out.println("salio cara ");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + tiroAleatorio + " la tuya es " + tipoCara+ " tu valor fina es  " + (tope += apuesta));
            } else if (tiroAleatorio == 2 && tipoCara == 2) {
                System.out.println("salio sello ");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + tiroAleatorio + " la tuya es " + tipoCara+ " tu valor fina es  " + (tope += apuesta));
            } else if (tiroAleatorio == 1 && tipoCara == 2) {
                System.out.println(" salio cara ");
                System.out.println(nombre + " has perdido la respuesta de la maquina es " + tiroAleatorio + " la tuya es "+ tipoCara + " tu valor fina es  " + (tope -= apuesta));
            } else if (tiroAleatorio == 2 && tipoCara == 1) {
                System.out.println("salio sello ");
                System.out.println(nombre + "has perdido la respuesta de la maquina es " + tiroAleatorio + " la tuya es "+ tipoCara + " tu valor fina es  " + (tope -= apuesta));
            }
        }                                                                             
        System.out.println( nombre+ " usted ha jugado " +cantidad+ " rondas , su tope final es de " + tope);                                                           
       
System.out.println("Gracias por jugar");

       
lectura.close();
}
}

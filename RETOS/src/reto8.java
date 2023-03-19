import java.util.Scanner;

public class reto8{
public static void main(String[] args){
Scanner lectura = new Scanner(System.in);
int turnos=3;
int aleatorio=0;
int num1=0;
aleatorio=(int) (Math.random()*100)+1;

for(turnos=0 ; turnos<=0 ; turnos++);
System.out.println("por favor ingrese el numero");
num1=lectura.nextInt();
if (aleatorio ==num1){
    System.out.println("lograste hacertar el numero " + aleatorio);
    System.out.println("con iso intentos " + turnos);
    
}
else if (turnos==0){
    System.out.println("lo siento has perdido el numero era " + aleatorio);
   
}
else if (aleatorio<num1){
    System.out.println("lo siento el numero es mayor al elejido");
}
else if (aleatorio>num1){
    System.out.println("lo siento el numero es menor al elejido");
}
lectura.close();
}
}










  

import java.util.Scanner;

public class reto3{
    public static void main(String[] args) {
        int peso;
        int meses;
        float vacuna;
		String nombb;
		String nomenfermera;
		String nomdoctor;
        String nomMama;

        Scanner lectura = new Scanner(System.in);

		System.out.println("ingrese nombre del doctor");
		nomdoctor=lectura.nextLine();

		System.out.println("ingrese nombre de la enfermera");
		nomenfermera=lectura.nextLine();

        System.out.println("ingrese nombre de la mama");
		nomMama=lectura.nextLine();

		System.out.println("ingrese nombre del bebe");
		nombb=lectura.nextLine();


        System.out.println("porfavor ingrese el peso del bebe");
        peso=lectura.nextInt();

        System.out.println("por favor digete los meses del bebe");
        meses=lectura.nextInt();

        vacuna= (((peso + 10) / (meses * 10))*8);
    
        System.out.println("el doctor es:"+nomdoctor);
        System.out.println("la enfermera es:"+nomenfermera);
        System.out.println("la mama del bebe es:"+nomMama);
        System.out.println("el bebe:"+nombb);

        System.out.println("se le aplica una docis de " + vacuna+ " ml");
        lectura.close();
    }
}
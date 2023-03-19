import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        // declarar variables
        int producto;
        int i;
        int n; 
        int suma = 0;
        double subtotal=0; 
        double total1;
        double total2;
        double iva=0.19;
        String nombreEmpleado;
        String nombreCliente;
        int documentoCliente;

        // instanciar clase
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado : ");
        nombreEmpleado = leer.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = leer.nextLine();

        System.out.println("Ingrese el documento del cliente ");
        documentoCliente = leer.nextInt();

        System.out.println("Cuantos productos desea digitar");
        n = leer.nextInt();

        // crear el bucle
        for (i = 1; i <= n; i++) {
            System.out.println("Digite precio del producto " + i);
            producto = leer.nextInt();
            suma = suma + producto;
        }
        System.out.println("El empleado que atendio su compra es: " + nombreEmpleado);
        
        System.out.println("Cliente " + nombreCliente);
        
        System.out.println("con número de documento : " + documentoCliente);
       

        subtotal = suma;
        System.out.println("Lleva " + n + "  productos");
        
        System.out.println("El subtotal de su compra es " + subtotal);

        total1 = subtotal * iva;
        total2 = total1 + subtotal;
        System.out.println("El total de su compra es: " + total2);

        leer.close();
    }
}



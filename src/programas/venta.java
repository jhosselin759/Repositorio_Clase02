package programas;
import java.util.Scanner;
public class Venta {
    public static void main(String[] args) {
        // Declarar variables
        String vendedor;
        double venta1, venta2, venta3, comision, sm, sn;
        Scanner lectura = new Scanner(System.in);
        // Entrada
        System.out.print("Ingresar vendedor: ");
        vendedor = lectura.nextLine();  
        System.out.print("Ingresar sueldo mensual: ");
        sm = lectura.nextDouble();   
        System.out.print("Ingresar venta 1: ");
        venta1 = lectura.nextDouble();
        System.out.print("Ingresar venta 2: ");
        venta2 = lectura.nextDouble();
        System.out.print("Ingresar venta 3: ");
        venta3 = lectura.nextDouble();
        // Proceso
        comision = (venta1 + venta2 + venta3) * 0.10;
        sn = sm + comision;
        //salida
        System.out.println("El nombre del vendedor es: " + vendedor);
        System.out.println("La comisión de la venta es: " + comision);
        System.out.println("El sueldo neto es: " + sn);
    }
}



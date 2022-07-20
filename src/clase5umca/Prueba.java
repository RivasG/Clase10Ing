package clase5umca;

import java.util.Date;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date fecha = new Date();
        int opcion;
        double retiro, saldo = 0;
        String respuesta = "s";
        while (respuesta.equals("S") || respuesta.equals("s")) {
            System.out.println("Cajero automatico Digite la opcion deseada  "
                    + "\n1) Deposito"
                    +"\n 2) Verificacion de saldo"
                    +"\n 3) Retiro de dinero"
                    +"\n 4) Impresion del monto final"
                      +"\n  5) Fecha y hora " );
             opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nDigite el monto del deposito: ");
                    saldo = entrada.nextDouble();
                    break;

                case 2:
                    System.out.println("\nVerificar saldo: " + saldo + " colones");
                    break;

                case 3:
                    System.out.println("\nCuanto dinero desea retirar: ");
                    retiro = entrada.nextDouble();
                    if ((saldo - retiro) >= 0) {
                        saldo -= retiro;

                        System.out.println("\nUsted ha retirado " + retiro + " colones");
                    } else {
                        System.out.println("\nSaldo insuficiente, vuelvalo a intentar");
                    }
                    break;
                case 4:
                    System.out.println("\nEl monto final es de: " + saldo + " colones");
                    break;
                case 5:
                    System.out.println("\nFecha y hora: " + fecha.toString());
                    break;
                default:
                    System.out.println("Digite un dato váliod");
                    System.out.println("Digite si desea continuar s/");
                    respuesta = entrada.next();
            }
        }
    }

}

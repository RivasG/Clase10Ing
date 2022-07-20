package clase5umca;
import java.util.Scanner;
public class datos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        try {
            System.out.println("Digite una edad ");
            edad = entrada.nextInt();
            System.out.println("Tiene excelnte edad");
        } catch (Exception e) {
            System.out.println("Digite un dato numerico");
        }
    }

}

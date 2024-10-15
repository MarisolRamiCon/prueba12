import java.util.Scanner;

public class Mayormenor {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu edad ");
        int edad= entrada.nextInt();
        String EsMayor=(edad>=18)?("Eres mayor de edad"):("Eres menor de edad");
        System.out.println(EsMayor);
    }
}

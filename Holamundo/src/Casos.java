import java.util.Scanner;

public class Casos {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1. Poemas");
        System.out.println("2. Leyendas");
        System.out.println("3. Cuentos");
        System.out.println("¿Que quieres leer?");
        System.out.println("Para salir teclea el 0");
        int opcion = en.nextInt();
        do{
            switch (opcion) {
                case 1:
                    System.out.println("Estas en la seccion de poemas");
                    break;
                case 2:
                    System.out.println("Estas en la sección de Leyendas");
                    break;
                case 3:
                    System.out.println("Estas en la sección de cuentos");
                    break;
                default:
                    System.out.println("No esta dentro del menu");
                    break;

            }
        System.out.println("¿Que quieres leer?");
        System.out.println("Para salir teclea el 0");
        opcion = en.nextInt();

    }while(opcion!=0);
    }
}

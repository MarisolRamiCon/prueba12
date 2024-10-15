import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        List <Double> calificaciones = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        //calificaciones.add(9.5); //añadir elementos
        //calificaciones.add(7.8);
        //calificaciones.add(7.0);
        for(int i=0;i<5;i++){
            System.out.println("Ingresa calificacion");
            double c= sc.nextDouble();
            calificaciones.add(c);
        }
        for(double cal:calificaciones){
            System.out.println("Calificacion: "+ cal);
        }

        /*System.out.println(calificaciones);
        calificaciones.remove(9.5);
        System.out.println(calificaciones);
        calificaciones.remove(1);
        System.out.println(calificaciones);
        calificaciones.set(0,8.3);// el primer argumento de set es el indice y el segundo el elemento a colocar
        System.out.println(calificaciones);
        calificaciones.add(7.5);
        System.out.println(calificaciones);
        calificaciones.clear();
        System.out.println(calificaciones);
*/





    }
}

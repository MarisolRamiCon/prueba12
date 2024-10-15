import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        Set <String> conjunto1 = new TreeSet<>();
        System.out.println("Ingresa tu nombre");
        String nombre= en.nextLine();
        System.out.println("Ingresa tu edad");
        String edad= en.nextLine();
        System.out.println("Ingresa tu sexo");
        String sexo= en.nextLine();
        System.out.println("Ingresa tu correo");
        String correo= en.nextLine();

        conjunto1.add("nombre: " + nombre);
        conjunto1.add("edad: "+edad);
        conjunto1.add("sexo: "+sexo);
        conjunto1.add("correo: " +correo);

        for(String dia: conjunto1){
            System.out.println(dia);
        }
        /*System.out.println(conjunto1.size()); // Con este metodo me dice cuantos objetos tengo en mi collection
        System.out.println(conjunto1);
        //conjunto1.add("lunes");
        System.out.println(conjunto1);
        //conjunto1.add("Lunes");

        //conjunto1.remove("lunes");
        System.out.println(conjunto1);*/
    }
}

import java.util.ArrayList;
import java.util.List;

public class Funcionl {
    public static void main(String[] args) {
        List<String> personas= new ArrayList<>();
        personas.add("Georgina");
        personas.add("Teresa");
        personas.add("Alicia");
        personas.add("Vanesa");
        personas.add("Samantha");
        System.out.println(personas.stream().filter((String nombre)->(nombre.contains("sa"))).toList());
        System.out.println(personas.stream().sorted().toList());







    }
}

import java.util.ArrayList;
import java.util.List;

public class Mapeado {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        System.out.println(numeros.stream().map((Integer num)->(num*num*num)).toList());

        System.out.println(numeros.stream().map((Integer num2)->(num2*num2)).toList());



    }
}

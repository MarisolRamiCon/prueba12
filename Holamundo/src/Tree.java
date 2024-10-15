import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {

                Map<String,String> numeros = new LinkedHashMap<>();
                numeros.put("cc","cinco");
                numeros.put("dd","cero");
                numeros.put("z","uno");
                numeros.put("k","dos");
                numeros.put("l","tres"); // el metodo put sirve para añadir elementos a los maps
                System.out.println(numeros);
                /*System.out.println(numeros.get(5)); //El metodo get sirve para acceder a los datos
                System.out.println(numeros.remove(0)); //"cero"
                System.out.println(numeros);
                System.out.println(numeros.remove(0,"cero"));//false
                //para recorrer este map
                System.out.println(numeros.keySet());//recuperar las llaves y colocarlas en una lista.
                for(Integer num: numeros.keySet()){
                    System.out.println(num +" -> "+ numeros.get(num));
                }
                System.out.println(numeros.values());//recuperar los valores y colocarlos en una lista
                System.out.println(numeros);

                System.out.println(numeros.containsKey(4)); //false*/
            }
        }


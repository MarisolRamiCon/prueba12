import java.util.ArrayList;

public class Bolsa <T>{

    private ArrayList<T> lista= new ArrayList<T>();

     public void add(T algo){
         lista.add(algo);
     }
    public ArrayList<T> getProductos() {
        return lista;
    }

}

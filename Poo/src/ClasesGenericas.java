import java.util.ArrayList;

public class ClasesGenericas {
    public static void main(String[] args) {
        Bolsa <Chocolate> bolsadechocolates= new Bolsa<Chocolate>();
        bolsadechocolates.add(new Chocolate("Chocolate1","negro"));
        bolsadechocolates.add(new Chocolate("Chocolate2","blanco"));
        Bolsa<Soda> bolsasoda= new Bolsa<Soda>();
        bolsasoda.add(new Soda("Soda1", "naranja"));
        bolsasoda.add(new Soda("Soda2", "Limon"));
        bolsadechocolates.getProductos().stream().forEach(chocolate -> System.out.println("Nombre: "+chocolate.getNombre()+" "+
                "Presentacion: "+chocolate.getPresentacion()));
        bolsasoda.getProductos().stream().forEach(soda -> System.out.println("El sabor de la soda es "+soda.getSabor()));



                //.stream().forEach(s-> System.out.println(s.getNombre()+ " ,"+s.getPresentacion()));


    }
}

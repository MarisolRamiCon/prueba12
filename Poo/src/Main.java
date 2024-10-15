import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* Perro perrito= new Perro("puff","café","tobi",3);
        perrito.Comer();
        Perro perro2= new Perro();
        perro2.setNombre("Bombon");
        perro2.setColor("Negro");
        System.out.println(perro2);
        System.out.println("El nombre del perro2 es "+ perro2.getNombre());
        System.out.println("La raza del perro2 es "+perro2.getRaza());
        perro2.Ladrar();*/
        /*Gato gatito= new Gato("Silver",3);
        gatito.mostrar();
        System.out.println(gatito.sumar());
        System.out.println(gatito.sumar(7.5,8.6));
        System.out.println(gatito.sumar(7,2));*/
        Chocolate choc= new Chocolate("1","blanco");
        ArrayList<Chocolate> lista= new ArrayList<>();
        Chocolate cho2= new Chocolate("2","negro");
        lista.add(choc);
        lista.add(cho2);
        for(Chocolate s: lista){
            System.out.println("Nombre: "+ s.getNombre() +" Presentacion: "+s.getPresentacion());

        }


    }
}
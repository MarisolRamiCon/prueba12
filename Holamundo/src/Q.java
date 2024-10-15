import java.util.LinkedList;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue <Integer> c1 = new LinkedList<>(); //int    [5,7]
        /*Wrapper
        * Integer Byte Short Long
        * String
        * Character Boolean Double Float */
        c1.offer(1);
        c1.add(5); //5 ;
        Integer aux=0;
        while(aux!=null){
            aux= c1.poll();
            System.out.println(aux);
        }


       /* System.out.println("El primer elemento del Queue: "+c1.peek());// muestra el primer elemento false
        System.out.println("El primer elemento en salir fue "+c1.poll()); //7 false
        System.out.println("El primer elemento en salir fue "+c1.poll()); //5true
        System.out.println("El primer elemento en salir fue "+c1.poll());//  Con poll si no hay elementos imprime null*/
       /* System.out.println(c1.remove());//false
        System.out.println(c1.remove());//true
        System.out.println(c1.remove());//error*/






    }
}

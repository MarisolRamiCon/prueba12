import java.util.PriorityQueue;
import java.util.Queue;

public class Prioridad {
    public static void main(String[] args) {
        Queue <Integer> pc1= new PriorityQueue<>();
        pc1.add(3);
        pc1.add(14);
        pc1.add(12);
        pc1.add(7);
        pc1.add(10);
        pc1.add(1);
        pc1.add(6);
        pc1.add(-8);
        pc1.add(9);
        pc1.add(5);
        Integer aux=0;
        while(aux!=null){
            aux= pc1.poll();
            System.out.println(aux);
            if(pc1.isEmpty()){
                break;
            }
        }
    }
}

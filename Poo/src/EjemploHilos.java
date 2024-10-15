public class EjemploHilos {
    public static void main(String[] args) {
        //Crear los hilos
        HiloTarea1 tarea1= new HiloTarea1();
        HiloTarea2 tarea2= new HiloTarea2();
        //iniciar los hilos
        tarea1.start();
        tarea2.start();
    }
}

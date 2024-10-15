public class HiloTarea1 extends Thread {
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("Tarea1: "+ i);
            try{
                Thread.sleep(1000);// esperar o pausar por 1 segundo
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

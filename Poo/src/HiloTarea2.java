public class HiloTarea2 extends Thread{
    @Override
    public void run() {
        for (char c='A';c<='Z';c++){
            System.out.println("Tarea 2: "+c);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

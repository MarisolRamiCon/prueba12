public class ClasesC {
    public static void main(String[] args) {
        Motor motor1= new Motor(4,16,"abc16");
        Coche micoche= new Coche("Chevrolet","AVO",2013,"rojo",motor1);
        micoche.mostrar();
    }
}

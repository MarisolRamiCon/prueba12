public class Principal {
    public static void main(String[] args) {
        Cuadrado c1= new Cuadrado(5);
        double areac1=c1.calcularArea();
        System.out.println(areac1);
        double perc1=c1.calcularPerimetro();
        System.out.println(perc1);
        c1.coloreaelcontorno("azul");

    }
}

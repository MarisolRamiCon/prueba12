public class Cuadrado implements Forma,Colorear{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }


    @Override
    public void coloreaelcontorno(String color) {
        System.out.println("Estoy coloreando de color "+ color);

    }
}

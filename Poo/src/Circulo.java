public class Circulo implements Forma,Colorear{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1416*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*3.1416*radio;
    }

    @Override
    public void coloreaelcontorno(String color) {

    }
}

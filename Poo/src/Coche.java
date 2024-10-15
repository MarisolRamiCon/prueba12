public class Coche {
    private String marca;
    private String modelo;
    private int a;
    private String color;
    private Motor motor;

    public Coche(String marca, String modelo, int a, String color, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.a = a;
        this.color = color;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void mostrar(){
        System.out.println("La marca de mi coche es " +getMarca() +" y el numero de serie de mi motor es "+ getMotor().getNumeroSerie());
    }
}

public class Perro extends Abstraccion {
    //atributos
    private String raza;
    private String color;
    private String nombre;
    private int edad;
    //Método constructor sin argumentos

    public Perro() {
    }

    //Método constructor
    public Perro(String raza, String color, String nombre, int edad){
        this.raza=raza;
        this.color=color;
        this.nombre=nombre;
        this.edad=edad;
    }
// Getter y Setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//Metodos propios de mi clase


    public void Comer(){
        System.out.println("El perro come croquetas");
    }

    @Override
    public void hablar() {
        System.out.println("El perro ladra");
    }

    @Override
    public void moverse() {
        System.out.println("El perro camina");

    }
}

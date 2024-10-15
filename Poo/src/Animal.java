public class Animal {
    protected String nombre;
    protected int edad;

    public Animal( String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
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

    public void comer(){
        System.out.println("Comiendo");
    }

    public int sumar(){
        int x=7;
        int y=10;
        int resultado=x+y;
        return resultado;
    }

    public int sumar(int a,int b){
        return a+b;
    }

    public double sumar(double a, double b){
        return a+b;
    }


    public void mostrar(){
        System.out.println("El animal es "+ getClass()+", se llama "+ getNombre()+" y tiene "+getEdad() +"años");
    }
}

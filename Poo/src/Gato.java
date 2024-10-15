public class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println("El gato come croquetas");
    }

    public void emitirSonido(){
        System.out.println("El gato maulla");
    }

}


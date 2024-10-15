public class Manejo {
    public static void main(String[] args) {
        int valor1=6;
        int valor2=3;
        int resultado;
        try {
            resultado = valor1 / valor2;
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("No se puede dividir entre cero");
        }finally{
            System.out.println("Fin del programa");
        }
    }
}

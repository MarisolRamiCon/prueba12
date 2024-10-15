

public class Funciones {
        public static void main(String[] args) {
            //Llamar a una función
            String saludas= saludar("Alex",25);
            System.out.println(saludas);
                    // Llamar a un método
            Funciones s = new Funciones();
            s.myMetodo("Hola Mundo");
        }        //Definición de una función
        //Static tipoDatoRetorno nombreFuncion(“argumento/parametro”)
        static String saludar(String nombre, int edad){
            return "Hola "+ nombre+" Desde la Función saludar";
        }
        //Definición de un Método
        public void myMetodo(String saludo){
            System.out.println(saludo);
        }

}

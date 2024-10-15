import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        float [] precios= {25.3f,32.8f,50.3f,60.0f};
        for(int indice=0; indice<precios.length; indice++){
            System.out.println(precios[indice]);
        }
        Arrays.sort(precios);
        System.out.println(" ");
        //for each
        for(float precio:precios){
            System.out.println(precio);
        }



    }
}

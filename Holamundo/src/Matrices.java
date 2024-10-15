public class Matrices {
    public static void main(String[] args) {
        int [][] numeros={{1,2,3,4,5},{2,4,6,8,10},{3,6,9,12,15}};
        for(int filas=0; filas<3;filas++){
            for(int cols=0;cols<5;cols++){
                System.out.print(numeros[filas][cols] + " ");
            }
            System.out.println(" ");
        }
    }
}

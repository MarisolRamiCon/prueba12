public class Sumas {
    static void Suma(int... numeros){
        int aux=0;
        for (int num: numeros){
            aux+=num;
        }
        System.out.println(aux);
    }


    public static void main(String[] args) {
        Suma(1);
        Suma(3,5);
        Suma(3,8,9,10,100);
    }
}

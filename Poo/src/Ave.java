public class Ave extends Abstraccion{
    private String especie;

    @Override
    public void hablar() {
        System.out.println("El ave grazna");
    }

    @Override
    public void moverse() {
        System.out.println("El ave vuela alto");
    }

}

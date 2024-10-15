public class Motor {
    private int noPistones;
    private int valvulas;
    private String numeroSerie;

    public Motor(int noPistones, int valvulas, String numeroSerie) {
        this.noPistones = noPistones;
        this.valvulas = valvulas;
        this.numeroSerie = numeroSerie;
    }

    public int getNoPistones() {
        return noPistones;
    }

    public void setNoPistones(int noPistones) {
        this.noPistones = noPistones;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}

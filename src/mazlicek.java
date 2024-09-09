public class mazlicek {
    private String jmeno;
    private String druh;
    private int vek;
    private double vaha;

    public mazlicek(String jmeno, String druh, int vek, double vaha) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
        this.vaha = vaha;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }


    @Override
    public String toString() {
        return jmeno + ": { druh='" + druh + "', vek='" + vek + "', vaha='" + vaha + "kg'}" ;
    }
}

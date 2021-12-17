package UB09.Aufgabe1;

public class Reifen {

    private double profilguete;
    private boolean platt;

    public Reifen(double profilguete, boolean platt) {
        this.profilguete = profilguete;
        this.platt = platt;
    }

    public double getProfilguete() {
        return profilguete;
    }

    public void setProfilguete(double profilguete) {
        this.profilguete = profilguete;
    }

    public boolean isPlatt() {
        return platt;
    }

    public void setPlatt(boolean platt) {
        this.platt = platt;
    }
}

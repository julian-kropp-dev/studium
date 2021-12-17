package UB09.Aufgabe1;

public class Reifen {

    private double profilgüte;
    private boolean platt;

    public Reifen(double profilgüte, boolean platt) {
        this.profilgüte = profilgüte;
        this.platt = platt;
    }

    public double getProfilgüte() {
        return profilgüte;
    }

    public void setProfilgüte(double profilgüte) {
        this.profilgüte = profilgüte;
    }

    public boolean isPlatt() {
        return platt;
    }

    public void setPlatt(boolean platt) {
        this.platt = platt;
    }
}

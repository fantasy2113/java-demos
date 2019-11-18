package demos.parallel.bankbetrieb;

public class Konto {

    private float kontostand;

    public void setzen(float betrag) {
        kontostand = betrag;
    }

    public float abfragen() {
        return kontostand;
    }
}

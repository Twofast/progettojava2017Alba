/**
 * Created by Alba on 08/05/17.
 */
public class Spregiudicata implements Donna {

    int a; int b; int c;

    private int figli = 0;

    private boolean gravidanza = false;

    private float contoInBanca = 0;

    Spregiudicata (int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void setGravidanza() {
        gravidanza = true;
        figli++;
        contoInBanca +=a;
    }

    @Override
    public void setGravidanzaOff() {
        gravidanza = false;
    }

    @Override
    public void cresciFiglioCon(Uomo u) {

        if (u.getClass().equals(Morigerato.class)) {
            contoInBanca -= (b/2);
        }
        else contoInBanca -= b;

    }

    @Override
    public void corteggiata() {

    }

    @Override
    public float getContoInBanca() {
        return contoInBanca;
    }

    @Override
    public boolean procreando() {
        return gravidanza;
    }

    @Override
    public int sizeFigli() {
        return figli;
    }
}

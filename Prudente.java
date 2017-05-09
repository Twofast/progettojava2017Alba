/**
 * Created by Alba on 08/05/17.
 */
public class Prudente implements Donna {

    int a; int b; int c;

    private int figli = 0;

    private boolean gravidanza = false;

    private float contoInBanca = 0;

    Prudente (int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public void setGravidanza() {
        figli++;
        gravidanza = true;
        contoInBanca +=a;
    }

    @Override
    public void setGravidanzaOff() {
        gravidanza = false;
    }

    @Override
    public void cresciFiglioCon(Uomo u) {
        contoInBanca -=(b/2);
    }

    @Override
    public void corteggiata() {
        contoInBanca -=c;
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

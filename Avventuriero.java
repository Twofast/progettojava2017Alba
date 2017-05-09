import java.util.*;

/**
 * Created by Alba on 08/05/17.
 */
public class Avventuriero implements Uomo {

    int a; int b; int c;

    private int figli = 0;

    private float contoInBanca = 0;

    private boolean impegnato = false;

    Avventuriero(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public boolean compatibile(Donna d) {
        if (d.getClass().equals(Spregiudicata.class)) return true;
        return false;
    }

    @Override
    public void corteggia(Donna d) {}; //non corteggia

    @Override
    public boolean corteggiando(Donna d) {
        return false;
    }

    @Override
    public Persona figlioCon(Donna d) {

        //può avere un figlio solo con la Spregiudicata

        double i = Math.random();
        if (i < 0.7 && d.sizeFigli()<5 && sizeFigli() <10) { //LIMITE FIGLI

            impegnato = true;
            d.setGravidanza(); //impegno donna true;

            figli++;

            contoInBanca +=a;

            d.cresciFiglioCon(this);

            impegnato = false;
            d.setGravidanzaOff();//impegno donna false;

            double j = Math.random();
            double k = Math.random();
            if (j < 0.5) { //Donna
                if (k < 0.3) {
                    return new Prudente(a,b,c);
                }
                else return new Spregiudicata(a,b,c);
            }
            else { //Uomo
                if (k < 0.3) {
                    return new Morigerato(a,b,c);
                }
                else return new Avventuriero(a,b,c);
            }
        }
        else return null;
    }

    @Override
    public void cresciFiglioCon(Donna d) {} //non cresce figli

    @Override
    public float getContoInBanca() {
        return contoInBanca;
    }

    @Override
    public boolean procreando() {
        return impegnato;
    }

    @Override
    public int sizeFigli() {
        return figli;
    }
}

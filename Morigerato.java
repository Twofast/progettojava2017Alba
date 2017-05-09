import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alba on 08/05/17.
 */
public class Morigerato implements Uomo {

    int a; int b; int c;

    private int figli = 0;

    private float contoInBanca = 0;

    private boolean impegnato = false;

    List<Donna> corteggiate = new ArrayList<>();

    Morigerato (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean compatibile(Donna d) {

        if (d.getClass().equals(Prudente.class)) {
            double i = Math.random();
            if (i < 0.2) return false; //20% di probabilità che si incontrino ma non si corteggino
        }
        return true;

    }

    @Override
    public void corteggia(Donna d) {

        if (d.getClass().equals(Prudente.class)) {

           if (!corteggiate.contains(d)) {

               corteggiate.add(d);

               contoInBanca -= c;

               //aspetta lasso di tempo

               corteggiate.remove(d);

           }
        }
    }

    @Override
    public boolean corteggiando(Donna d) {
        return corteggiate.contains(d);
    }

    @Override
    public Persona figlioCon(Donna d) {

        if (d.sizeFigli() < 5 && sizeFigli() < 10) { //LIMITE FIGLI
            if (d.getClass().equals(Prudente.class) && d.sizeFigli() < 5 && sizeFigli() < 10) { //se incontra una Prudente

                double i = Math.random();
                if (i < 0.7) {

                    impegnato = true;
                    d.setGravidanza(); //impegno donna true;
                    figli++;

                    contoInBanca += a;

                    impegnato = false;
                    d.setGravidanzaOff();

                    cresciFiglioCon(d);
                    d.cresciFiglioCon(this);

                    double j = Math.random();
                    double k = Math.random();
                    if (j < 0.5) { //Donna
                        if (k < 0.7) {
                            return new Prudente(a,b,c);
                        } else return new Spregiudicata(a,b,c);
                    } else { //Uomo
                        if (k < 0.7) {
                            return new Morigerato(a,b,c);
                        } else return new Avventuriero(a,b,c);
                    }
                } else return null;

            } else { //se incontra una Spregiudicata
                double i = Math.random();
                if (i < 0.7) {

                    impegnato = true;
                    d.setGravidanza(); //impegno donna true;

                    contoInBanca += a;

                    impegnato = false;
                    d.setGravidanzaOff();

                    cresciFiglioCon(d);
                    d.cresciFiglioCon(this);

                    double j = Math.random();
                    double k = Math.random();
                    if (j < 0.5) { //Donna
                        if (k < 0.5) {
                            return new Prudente(a,b,c);
                        } else return new Spregiudicata(a,b,c);
                    } else { //Uomo
                        if (k < 0.5) {
                            return new Morigerato(a,b,c);
                        } else return new Avventuriero(a,b,c);
                    }
                } else return null;
            }


        } else return null;
    }

    @Override
    public void cresciFiglioCon(Donna d) {
        contoInBanca -=(b/2);
    }

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

/**
 * Created by Alba on 08/05/17.
 */
public interface Donna extends Persona {

    void setGravidanza();

    void setGravidanzaOff();

    void cresciFiglioCon(Uomo u);

    void corteggiata();

    float getContoInBanca();

    boolean procreando();

    int sizeFigli();
}



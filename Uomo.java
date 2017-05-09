/**
 * Created by Alba on 08/05/17.
 */
public interface Uomo extends Persona {

    boolean compatibile(Donna d);

    void corteggia(Donna d);

    boolean corteggiando(Donna d);

    Persona figlioCon(Donna d);

    void cresciFiglioCon(Donna d);

    float getContoInBanca();

    boolean procreando();

    int sizeFigli();

}

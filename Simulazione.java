/**
 * Created by Alba on 08/05/17.
 */
public class Simulazione {

    int a;
    int b;
    int c;
    int bancarotta;

    /**
     *
     * @param a Guadagno figlio;
     * @param b Costo figlio;
     * @param c Costo corteggiamento;
     * @param pM percentuale iniziale di Morigerati;
     * @param pA percentuale iniziale di Avventurieri;
     * @param pS percentuale iniziale di Spregiudicate;
     * @param pP percentuale iniziale di Prudenti;
     */
    Simulazione (int a, int b, int c, float pM, float pA, float pS, float pP) {

        this.a = a;
        this.b = b;
        this.c = c;

       //  this.bancarotta = in proporzione ad a,b,c

    }

    Simulazione (float pM, float pA, float pS, float pP) { //Simulazione Dawkins

        this.a = 15;
        this.b = 20;
        this.c = 3;
        this.bancarotta = -50;
    }

    public Persona incontro(Uomo padre, Donna madre) {

        if (padre.compatibile(madre)) {

            padre.corteggia(madre);

            while (padre.corteggiando(madre)) {
                //non fare nulla;
            }

            while (padre.procreando() || madre.procreando()) { //se uno dei due è impegnato con altri
                //non fare nulla
            }

            return padre.figlioCon(madre);

        }

        return null;

    }

}

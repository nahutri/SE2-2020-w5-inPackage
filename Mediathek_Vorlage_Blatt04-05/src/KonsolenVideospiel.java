
public class KonsolenVideospiel extends AbstractVideospiel
{
    public KonsolenVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system);

    }

    /**
     * Hilfsmethode: berechnet den Zusatzpreis
     * @param mietTage
     * @return
     */
    private int zusatzPreis(int mietTage)
    {
        return (mietTage / 3) * 700;
    }

    @Override
    public int getPreisNachTagen(int anzahlTage)
    {

        return zusatzPreis(anzahlTage) + _BasisPreis;
    }

}

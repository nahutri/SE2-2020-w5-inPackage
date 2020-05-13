
public class PCVideospiel extends AbstractVideospiel
{
    public PCVideospiel(String titel, String kommentar, String system)
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
        if (mietTage < 8)
        {
            return 0;
        }
        return (mietTage / 5) * 500;
    }

    @Override
    public int getPreisNachTagen(int anzahlTage)
    {
        return _BasisPreis + zusatzPreis(anzahlTage);
    }

}

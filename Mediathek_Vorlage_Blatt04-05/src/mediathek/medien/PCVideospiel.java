package mediathek.medien;

/**
 * Klasse PcVideospiel
 * @author My-Anna
 *
 */
public class PCVideospiel extends AbstractVideospiel
{
    /**
     * Konstruktor der Klasse
     * @param titel
     * @param kommentar
     * @param system
     */
    public PCVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system);
    }

    @Override
    protected int getPreisNachTagen(int tage)
    {
        return Math.max(0, tage - 3) / 5 * 500;
    }

    @Override
    public String getMedienBezeichnung()
    {

        return "PCVideospiel";
    }

}

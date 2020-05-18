
public class KonsolenVideospiel extends AbstractVideospiel
{
    /**
     * Konstruktor der Klasse
     * @param titel
     * @param kommentar
     * @param system
     */
    public KonsolenVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system);

    }

    @Override
    public int getPreisNachTagen(int mietTage)
    {
        return (mietTage / 3) * 700;

    }

    @Override
    public String getMedienBezeichnung()
    {

        return "KonsolenVideospiel";
    }

}

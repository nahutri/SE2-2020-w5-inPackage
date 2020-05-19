/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team
 * @version SoSe 2012
 */
abstract class AbstractVideospiel extends AbstractMedium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;

    protected static final int BASIS_PREIS = 200;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
    
     * @require system != null
     * 
    
     * @ensure getSystem() == system
     */
    public AbstractVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar);

        assert system != null : "Vorbedingung verletzt: system != null";

        _system = system;

    }

    @Override
    public abstract String getMedienBezeichnung();

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String toString()
    {
        return getFormatiertenString();
    }

    @Override
    public String getFormatiertenString()
    {
        return super.getFormatiertenString() + "\n" + "    " + "System: "
                + _system + "\n";
    }

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        return new Geldbetrag(getPreisNachTagen(mietTage) + BASIS_PREIS);
    }

    /**
     * Berechnet den Preis nach Tagen
     * @param anzahlTage
     * @return int, Preis nach bestimmten Tagen
     */
    abstract protected int getPreisNachTagen(int anzahlTage);
}

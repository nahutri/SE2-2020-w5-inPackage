
public abstract class AbstractMedium implements Medium
{
    /**
     * Titel des Mediums
     */
    protected String _titel;
    /**
     * Kommentar des Mediums
     */
    protected String _kommentar;

    /**
     * Konstruktor des Mediums
     * @param titel
     * @param kommentar
     */
    public AbstractMedium(String titel, String kommentar)
    {
        _titel = titel;
        _kommentar = kommentar;

    }

    /**
     * Gibt die MedienBezeichnung
     */
    public abstract String getMedienBezeichnung();

    /**
     * Gibt den Kommentar
     */
    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * Setzt den Kommentar
     */
    public void setKommentar(String kommentar)
    {
        _kommentar = kommentar;
    }

    /**
     * Gibt den Titel
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Setzt den Titel
     */
    public void setTitel(String titel)
    {
        _titel = titel;
    }

    /**
     * Gibt alle Infos des Medium
     */
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + " " + "Titel:" + _titel + "\n"
                + " " + "Kommentar" + _kommentar + "\n";

    }

    /**
     * Berechnet die Mietgebühren
     */
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt";
        return new Geldbetrag(mietTage * 300);

    }

}

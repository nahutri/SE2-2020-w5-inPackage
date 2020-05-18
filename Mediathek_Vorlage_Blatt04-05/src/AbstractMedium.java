
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
    protected AbstractMedium(String titel, String kommentar)
    {
        _titel = titel;
        _kommentar = kommentar;

    }

    @Override
    public abstract String getMedienBezeichnung();

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public void setKommentar(String kommentar)
    {
        _kommentar = kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public void setTitel(String titel)
    {
        _titel = titel;
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + " " + "Titel:" + _titel + "\n"
                + " " + "Kommentar" + _kommentar + "\n";

    }

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt";
        return new Geldbetrag(mietTage * 300);

    }

}

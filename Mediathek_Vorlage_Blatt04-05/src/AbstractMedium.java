
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
     * 
     * @require titel !=null
     * @require kommentar != null
     * 
     * @ensure getTitel()==titel
     * @ensure getKommentar == kommentar
     */
    protected AbstractMedium(String titel, String kommentar)
    {
        assert titel != null : "Vorbedingung verletzt:titel ist null";
        assert kommentar != null : "Vorbedingung verletzt:kommentar ist null";
        _titel = titel;
        _kommentar = kommentar;

    }

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

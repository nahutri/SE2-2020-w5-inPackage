
public abstract class AbstractMedium implements Medium
{
    protected String _titel;
    protected String _kommentar;

    public AbstractMedium(String titel, String kommentar)
    {
        _titel = titel;
        _kommentar = kommentar;

    }

    public abstract String getMedienBezeichnung();

    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * 
     */
    public void setKommentar(String kommentar)
    {
        _kommentar = kommentar;
    }

    /**
     * 
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * 
     */
    public void setTitel(String titel)
    {
        _titel = titel;
    }

    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + " " + "Titel:" + _titel + "\n"
                + " " + "Kommentar" + _kommentar + "\n";

    }

}

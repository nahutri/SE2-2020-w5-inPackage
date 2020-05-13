import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private KonsolenVideospiel _KonsolenVideoSpiel;

    @Before
    public void setUp()
    {
        _KonsolenVideoSpiel = getMedium();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _KonsolenVideoSpiel.getTitel());
        assertEquals(KOMMENTAR, _KonsolenVideoSpiel.getKommentar());
        assertEquals(SYSTEM, _KonsolenVideoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung,
                _KonsolenVideoSpiel.getMedienBezeichnung());
    }

    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        AbstractVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        AbstractVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {

        assertEquals(_KonsolenVideoSpiel.berechneMietgebuehr(1),
                new Geldbetrag(200));
        assertEquals(_KonsolenVideoSpiel.berechneMietgebuehr(3),
                new Geldbetrag(900));
        assertEquals(_KonsolenVideoSpiel.berechneMietgebuehr(6),
                new Geldbetrag(1600));
        assertEquals(_KonsolenVideoSpiel.berechneMietgebuehr(9),
                new Geldbetrag(2300));

    }

}

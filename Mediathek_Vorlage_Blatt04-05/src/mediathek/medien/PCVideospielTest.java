package mediathek.medien;

/**
 * KLasse: PCVideospielTest
 * @author My-Anna
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mediathek.fachwerte.Geldbetrag;

/**
 */
public class PCVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "PCVideospiel";
    private static final String SYSTEM = "System";
    private PCVideospiel _PCVideoSpiel;

    @Before
    public void setUp()
    {
        _PCVideoSpiel = getMedium();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _PCVideoSpiel.getTitel());
        assertEquals(KOMMENTAR, _PCVideoSpiel.getKommentar());
        assertEquals(SYSTEM, _PCVideoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung,
                _PCVideoSpiel.getMedienBezeichnung());
    }

    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
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

        assertEquals(_PCVideoSpiel.berechneMietgebuehr(1), new Geldbetrag(200));
        assertEquals(_PCVideoSpiel.berechneMietgebuehr(8), new Geldbetrag(700));
        assertEquals(_PCVideoSpiel.berechneMietgebuehr(12),
                new Geldbetrag(700));

        assertEquals(_PCVideoSpiel.berechneMietgebuehr(13),
                new Geldbetrag(1200));
        assertEquals(_PCVideoSpiel.berechneMietgebuehr(18),
                new Geldbetrag(1700));

    }

}

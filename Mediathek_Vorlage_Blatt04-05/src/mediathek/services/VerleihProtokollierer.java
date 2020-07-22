package mediathek.services;

import java.io.FileWriter;
import java.io.IOException;

import mediathek.fachwerte.Datum;
import mediathek.fachwerte.VerleihEreignis;
import mediathek.materialien.Verleihkarte;

/**
 * Die Klasse VerleihProtkollierer: protokolliert die Ausleihe und Rückgabe auf einer Datei
 * @author My-Anna
 *
 */
public class VerleihProtokollierer
{
    //private VerleihServiceImpl _verleihService;

    /**
     * Protokolliert Ausleihe oder Rückgabe einer Verleihkarte
     * @param ereignis
     * @param verleihkarte
     */
    //public static void protokolliere(String ereignis, Verleihkarte verleihkarte)//bis 5.2.6

    public static void protokolliere(VerleihEreignis ereignis,
            Verleihkarte verleihkarte) throws ProtokollierException
    {
        //System.out.println("Protokolliert! Ausleihe oder Rückgabe");//5.2.3

        //Es wird xml Dateiendung genutzt für schöneres Formatieren als txt
        try (FileWriter protokoll = new FileWriter("./protokoll.xml", true))//Version mit try-with-resources
        {
            //if Ausleihe, protokoll.write("Ausleihe \n") oder 
            //_verleihService = new VerleihServiceImpl(kundenstamm, medienbestand, initialBestand);
            /*            if( _verleihService.istVerliehen(medium))
                System.out.println("Ausleihe \n");*/

            //if Rueckgabe, protokoll.write("Rueckgabe \n")

            //FileWriter protokoll = new FileWriter("./protokoll.xml", true);//ältere Version mit try-catch
            protokoll.write(verleihkarte.getFormatiertenString() + Datum.heute()
                    + "\n " + ereignis.toString() + "\n " + "----" + "\n");
            protokoll.close();
        }
        catch (IOException e)
        {
            /*System.err
                .println("Fehler beim Protokollieren,Datei existiert nicht.");//5.2.6
            */
            throw new ProtokollierException(e.getMessage());//nach 2ter Korrektur
        }

    }

}

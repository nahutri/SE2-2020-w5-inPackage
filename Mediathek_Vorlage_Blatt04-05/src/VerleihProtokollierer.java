import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{
    /**
     * Protokolliert Ausleihe oder Rückgabe einer Verleihkarte
     * @param ereignis
     * @param verleihkarte
     */
    public static void protokolliere(String ereignis, Verleihkarte verleihkarte)
    {
        //System.out.println("Protokolliert! Ausleihe oder Rückgabe");//5.2.3

        try
        {
            FileWriter protokoll = new FileWriter("./protokoll.xml", true);
            protokoll.write(verleihkarte.getFormatiertenString() + Datum.heute()
                    + "\n" + "----" + "\n");
            protokoll.close();
        }
        catch (IOException e)
        {
            System.err
                .println("Fehler beim Protokollieren,Datei existiert nicht.");//5.2.6
        }

    }

}


/**
 * Aggiungi qui una descrizione della classe Registro
 * 
 * @author Alighieri Lorenzo 
 * @version (un numero di versione o una data)
 */
import java.util.*;
import java.io.*;
public class Registro
{
    private LinkedList<Veicolo> registro;

    public Registro()
    {
        registro = new LinkedList<Veicolo>();
    }

    public void carica()
    {
        File f = new File("Veicoli.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            int nveicoli = Integer.parseInt(br.readLine());
            for (int i = 0; i<nveicoli; i++)
            {
                String cat = br.readLine();
                String ma = br.readLine();
                String mo = br.readLine();
                int cc = Integer.parseInt(br.readLine());
                Veicolo v =  new Veicolo(cat, ma, mo, cc);
                registro.add(v);
            }
        }
        catch (Exception e){}
    }
    
        
    public void stampa()
    {
      for(Object veicolo:registro)
      {
          System.out.println(veicolo.toString());
      }
    }
    
    public void stampa(String cat)
    {
      for(Object veicolo:registro)
      {
          if(((Veicolo)veicolo).getCategoria().equals(cat))System.out.println(veicolo.toString());
      }  
    }
    
    public void stampaOrdinata()
    {
        registro.sort(new ordinaMarca());
        for(Object veicolo:registro)
        {
            System.out.println(veicolo.toString());
        }
    }
    public void stampaOrdinataCC()
    {
        registro.sort(new ordinaCilindrata());
        for(Object veicolo:registro){
            System.out.println(veicolo.toString());
        }
    }
}

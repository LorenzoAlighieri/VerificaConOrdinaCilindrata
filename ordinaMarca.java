
/**
 * Aggiungi qui una descrizione della classe ordinaMarca
 * 
 * @author Alighieri Lorenzo 
 * @version (un numero di versione o una data)
 */
import java.util.*;

public class ordinaMarca implements Comparator<Veicolo>

{
    public int compare(Veicolo v, Veicolo v1)
    {
        return v.getMarca().compareTo(v1.getMarca());
    }
}

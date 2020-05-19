import java.util.*;

public class ordinaCilindrata implements Comparator<Veicolo>

{
    public int compare(Veicolo v, Veicolo v1)
    {
        return v.cilindrataToString().compareTo(v1.cilindrataToString());
    }
}
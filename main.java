
/**
 * Aggiungi qui una descrizione della classe main
 * 
 * @author Alighieri Lorenzo
 * @version (un numero di versione o una data)
 */
public class main
{
    public static void main (String args[]){
     Registro reg = new Registro();
     reg.carica();
     System.out.println("\nStampa Veicoli: 4");
     reg.stampa();
     System.out.println("\nStampa Autoveicoli: ");
     reg.stampa("Autoveicolo");
     System.out.println("\nVeicoli Ordinati Per Marca: ");
     reg.stampaOrdinata();
     System.out.println("\nStampa Per CC: ");
     reg.stampaOrdinataCC();
    }
        
}

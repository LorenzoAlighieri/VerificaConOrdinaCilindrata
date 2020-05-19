
/**
 * Aggiungi qui una descrizione della classe Veicolo
 * 
 * @author Alighieri Lorenzo 
 * @version (un numero di versione o una data)
 */
class Veicolo
{
    private String categoria;
    private String marca;
    private String modello;
    private int cilindrata;

    public Veicolo(String cat, String ma, String mo, int cc)
    {
    this.categoria = cat;
    this.marca = ma;
    this.modello = mo;
    this.cilindrata = cc;
    }
    public String getCat(){
        return categoria;
    }
    public String getMa(){
        return marca;
    }
    public String getMod(){
        return modello;
    }
    public int getCC(){
        return cilindrata;
    }
    public void setCat(String cat){
        cat = categoria;
    }
    public void setMa(String ma){
        ma = marca;
    }
    public void setMod(String mod){
        mod = modello;
    }
    public void setCC(int cc){
        cc = cilindrata;
    } 
    public String toString()
    {
        return categoria + "=" + marca + modello + "->" + Integer.toString(cilindrata);
    }
    public String getCategoria()
    {
        return categoria;
    }
    public String getMarca()
    {
        return marca;
    } 
    public String cilindrataToString()
    {
        return ""+getCC();
    }
}


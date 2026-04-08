package listas2_2024;
public class Nodo {  
    private int dataInt;    
    private Nodo link; //referencia
    public static final Nodo TIERRA = null;
       
    public Nodo(int data , Nodo link){
        this.dataInt = data;
        this.link = link;
    }
    
    public int getDataInt() {
        return dataInt;
    }
    public void setDataInt(int data) {
        this.dataInt = data;
    }
    public Nodo getLink() {
        return link;
    }
    public void setLink(Nodo link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dataInt=" + dataInt + ", link=" + link + '}';
    }   
}
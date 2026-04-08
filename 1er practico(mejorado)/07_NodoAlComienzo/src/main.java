/*7)Suponga que cabeza es una referencia a la cabeza de una lista enlazada de enteros. Escriba unas líneas de
código que añadan un nuevo nodo al comienzo de la lista (es decir a la cabeza de la lista).*/

public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra,cola=nodo.tierra;
        
        l=new nodo(21,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(6,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(93,nodo.tierra));
        cola=cola.getLink();
    
        System.out.println(l);
        
        //solucion del ejercicio
        nodo aux=new nodo(2,l);
        l=aux;
       
        System.out.println(l);
        
    }
}
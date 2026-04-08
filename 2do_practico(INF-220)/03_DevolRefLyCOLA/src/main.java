/*3)¿Qué técnica utilizarías si un método necesita devolver más de un Nodo, como por ejemplo un método que
devuelve una referencia a la cabeza y a la cola de una lista?*/
public class main {
    public static nodo[] devolverNodosExternos(nodo l){
        nodo[] v=new nodo[2];
        v[0]=l;
        nodo aux=l;
        while(aux.getLink()!=nodo.tierra){
            aux=aux.getLink();
        }
        v[1]=aux;
        return v;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
         cola.setLink(new nodo(16, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println(l);
        
        nodo[] extremos = devolverNodosExternos(l);
        int head = extremos[0].getNum();
        int tail = extremos[1].getNum();
        System.out.println("Cabeza: " +head + ", Cola: " +tail);
    }   
}
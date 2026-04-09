/*1)Implementa una función para fusionar dos listas enlazadas ordenadas en una sola lista
ordenada.*/
public class main {
    public static nodo fucionarLista(nodo l, nodo head){
        nodo aux=l;
        while(aux.getLink()!=nodo.tierra){
            aux=aux.getLink();
        }
        aux.setLink(head);
        return l;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        //primera lista
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        //segunda lista 
        nodo head=nodo.tierra,  tail=nodo.tierra;
        head=new nodo(3,nodo.tierra);
        tail=head;
       
        tail.setLink(new nodo(33,nodo.tierra));
        tail=tail.getLink();
        
        tail.setLink(new nodo(74,nodo.tierra));
        tail=tail.getLink();
        
        System.out.println(fucionarLista(l, head));
    }
}
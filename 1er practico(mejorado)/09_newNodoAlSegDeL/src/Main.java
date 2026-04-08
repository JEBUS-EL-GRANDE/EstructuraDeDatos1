/*9).-Suponga que cabeza es una referencia a la cabeza de una lista enlazada de enteros. Escriba unas líneas de
código que añadan un nuevo nodo con el número 23 como segundo elemento de la lista. (Si la lista estaba
originalmente vacía, entonces 23 debe ser añadido como el primer nodo en lugar del segundo).*/
public class Main {
    public static  nodo addSeNodo(nodo l){
        if (l!=nodo.tierra) {
            nodo aux=new nodo(23,l.getLink());
            l.setLink(aux);
            return aux=l;
        } else {
            //no hay ningun nodo en la lista
            l=new nodo(23,nodo.tierra);
            return l;
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,cola=nodo.tierra;
        
        l=new nodo(4,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(8,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2,nodo.tierra));
        cola=cola.getLink();
    
        System.out.println(l);
        
        //poniendo a 23 como segundo nodo de unalista enlazada
        nodo aux=new nodo(23,l.getLink());
        l.setLink(aux);
        System.out.println(l);//*/
    
        //aplicando una funcion static
        System.out.println("========================con funcion estatica");
        System.out.println(addSeNodo(l));
    
    }
}
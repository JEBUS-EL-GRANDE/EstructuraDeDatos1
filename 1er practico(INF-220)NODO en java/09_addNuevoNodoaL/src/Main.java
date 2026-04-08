/*9).-Suponga que cabeza es una referencia a la cabeza de una lista enlazada de enteros. Escriba unas líneas de
código que añadan un nuevo nodo con el número 23 como segundo elemento de la lista. (Si la lista estaba
originalmente vacía, entonces 23 debe ser añadido como el primer nodo en lugar del segundo).*/
public class Main {
    public static nodo segundoNodo(nodo l){
        //ya hay mas de un nodo en la lista 
        if(l!=nodo.tierra){
            nodo cabeza=new nodo(23,l.getLink());
            l.setLink(cabeza);
            cabeza=l;
            return cabeza;
        }else{
            //no hay ningun nodo en la lista 
            nodo cabeza=new nodo(23,nodo.tierra);
            return cabeza;
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,aux=nodo.tierra,ult=nodo.tierra;
        
        l=new nodo(57,nodo.tierra);
        ult=l;
        
        aux=new nodo(66,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo(88,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        System.out.println(l);
        System.out.println(segundoNodo(l));
        
        System.out.println("Ningun nodo en la lista:============================");
        l=new nodo ();
        System.out.println(segundoNodo(l));
        
    }   
}
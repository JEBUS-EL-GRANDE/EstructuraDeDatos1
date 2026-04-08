/*10).-Supongamos que cabeza es una referencia a la cabeza de una lista enlazada de enteros. Escriba unas líneas
de código que eliminen el segundo nodo de la lista. (Si la lista originalmente tenía un solo nodo, elimínelo;
si no tenía ningún nodo, deje la lista vacía).*/
public class main {
    public static nodo eliminarSegNodo(nodo l) {
        if(l.getLink()==nodo.tierra){
            l=nodo.tierra;
            return l;
        }else{
            l.setLink(l.getLink().getLink());
            return l;
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,aux=nodo.tierra,ult=nodo.tierra;
        
        l=new nodo (3, nodo.tierra);
        ult=l;
                
        aux = new nodo(29,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux = new nodo(44,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux = new nodo(15,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        System.out.println(l);
        System.out.println(eliminarSegNodo(l));
    }   
}
/*8)Suponga que cabeza es una referencia a la cabeza de una lista enlazada de enteros no vacía(por lo tanto,
cabeza no está en TIERRA o null). Escriba unas líneas de código que eliminen el primer nodo de la lista(es
decir remueve el nodo cabeza de la lista). ¿Funciona si la lista tiene un solo nodo?*/
public class main {
    public static nodo eliminarPrimer(nodo l) {
        if (l!=nodo.tierra) {
            return l.getLink();
        }
        System.out.println("La lista está vacía.");
            return null;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,aux=nodo.tierra,ult=nodo.tierra;
        
        l=new nodo(21,nodo.tierra);
        ult=l;
        
        aux=new nodo(2,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux =new nodo(92,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
           
        System.out.println(l);
        System.out.println(l.getLink());//utilizando solo la clase nodo 
        System.out.println(eliminarPrimer(l));
        

        //¿Funciona si la lista tiene un solo nodo?
        System.out.println("Con un nodo*******************************");
        l=new nodo(4323,nodo.tierra);
        System.out.println(l);
        System.out.println(eliminarPrimer(l));
        
        
    }
}
/*8)Suponga que cabeza es una referencia a la cabeza de una lista enlazada de enteros no vacía(por lo tanto,
cabeza no está en TIERRA o null). Escriba unas líneas de código que eliminen el primer nodo de la lista(es
decir remueve el nodo cabeza de la lista). ¿Funciona si la lista tiene un solo nodo?*/
public class main {
    public static nodo  eliminarNodoL(nodo l){
        if(l!=nodo.tierra){
            return l=l.getLink();
        }else{
            return null;
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,cola=nodo.tierra;
        
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(6,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(4,nodo.tierra));
        cola=cola.getLink();
    
        System.out.println(l);
        
        //solucion del ejercicio  (primer caso)
        l=l.getLink();
        System.out.println(l);
        
        
        //solucion segundo caso (con un solo nodo)
        nodo  aux=new nodo(3,nodo.tierra);
        aux=aux.getLink();
        System.out.println(aux);//funciona 
    
    
        
        //usando solucion por  funcion estatica 
        System.out.println(eliminarNodoL(l));
    
    }
}
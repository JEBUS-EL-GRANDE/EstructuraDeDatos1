/*10).-Supongamos que cabeza es una referencia a la cabeza de una lista enlazada de enteros. Escriba unas líneas
de código que eliminen el segundo nodo de la lista. (Si la lista originalmente tenía un solo nodo, elimínelo;
si no tenía ningún nodo, deje la lista vacía).*/
public class main {
    public  static  nodo eliminarSegNodo(nodo l){
        if(l!=nodo.tierra){
            l.setLink(l.getLink().getLink());
            return l;
        }else{
            l=nodo.tierra;
            return l;
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
        
        // Encontrar el segundo nodo
        nodo segundoNodo = l.getLink();
        // Enlazar el segundo nodo con el cuarto nodo
        segundoNodo.setLink(segundoNodo.getLink().getLink());
        System.out.println(l);
        //aplicando solucion (funcion para eliminar al segundo nodo)
        /*l.setLink(l.getLink().getLink());
        System.out.println(l);
        
        //la lista solo tiene un solo nodo
        nodo aux =new  nodo(44,nodo.tierra);
        System.out.println(aux);
        
        System.out.println(aux.getLink());
        //no hay ningun nodo
        nodo aux2=new nodo();
        System.out.println(aux2);
        
        //==========================aplicandolo en funcion
        System.out.println(eliminarSegNodo(l));*/
        
    }   
}
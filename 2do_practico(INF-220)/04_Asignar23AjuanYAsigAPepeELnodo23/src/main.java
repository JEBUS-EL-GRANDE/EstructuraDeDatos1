/*4)Supongamos que cabeza es una referencia a la cabeza de una lista enlazada. Supongamos también que juan
y pepe son otras dos variables Nodo. Escribe una sentencia de asignación que haga que juan se refiera al
primer nodo de la lista que contenga el número 23. Escribe una segunda sentencia de asignación que haga
que pepe se refiera al nodo 23avo de la lista. Si estos nodos no existen, entonces las asignaciones deben
establecer las variables en null.*/
public class main {
    public static nodo[] asignacion (nodo l){
        nodo[] v=new nodo[2];
        nodo juan=nodo.tierra,pepe=nodo.tierra;
        nodo aux=l;
        //posicionando al  nodo juan en algun nodo que contnga el numero 23
        while (aux!=nodo.tierra) {            
            if (aux.getNum()==23) {
                juan=aux;
                v[0]=juan;
            }
            aux=aux.getLink();
        }
        //con el nodo 23avo 
        aux =l;
        int i=1;
        while(aux!=nodo.tierra){
            if (i==23) {
                pepe=aux;
                v[1]=pepe;
            }
            i++;
            aux=aux.getLink();
        }
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
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(5, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(7, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(200, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(57, nodo.tierra));
        cola=cola.getLink();
        
        //10 nodos hasta aqui
        cola.setLink(new nodo(11, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(34, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(58, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(42, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(88, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(1, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(33, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(29, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(90, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(566, nodo.tierra));
        cola=cola.getLink();
        //20 nodos hasta aqui
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(99, nodo.tierra));//nodo 23avo 
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(5, nodo.tierra));
        cola=cola.getLink();
        
        nodo[] juPE = asignacion(l);
        int juan = juPE[0].getNum();
        int pepe = juPE[1].getNum();
        System.out.println(" El nodo Juan: " +juan + ", el nodo Pepe: " +pepe);
        
    }   
}
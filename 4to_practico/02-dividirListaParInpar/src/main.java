/*2)Implementa una función para dividir una lista enlazada en dos partes, de manera que la
primera lista contenga los nodos con valores pares y la segunda lista contenga los nodos
con valores impares.*/
public class main {
    public static nodo listasParInpar(nodo l){
        nodo[] par=new nodo[50]; 
        nodo[] inpar=new nodo[50]; 
        nodo aux=l;
        int num;
        while(aux!=nodo.tierra){
            num=aux.getNum();
            if(0==num%2){
                
            }else{
                
            }
            aux=aux.getLink();
        }
        return ;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(5, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(3, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(9, nodo.tierra));
        cola=cola.getLink();
        
        nodo[] par = listasParInpar(l);
    }
}
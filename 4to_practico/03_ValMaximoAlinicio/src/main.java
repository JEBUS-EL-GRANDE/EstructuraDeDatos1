/*3)Escribe una función para encontrar el no
do en una lista enlazada que contiene el valor
máximo y mueve ese nodo al principio de la lista.*/
public class main {
    public static nodo ValMAXinicio(nodo l){
        nodo aux=l,m=nodo.tierra;
        int n=0;
        while(aux!=nodo.tierra){
            if(n<=aux.getNum()){
                n=aux.getNum();
            }
            aux=aux.getLink();
        }
        m=new nodo(n,l);
        aux=m;
        while(aux.getLink()!=nodo.tierra){
            if(aux.getLink().getNum()==n){
                aux.setLink(aux.getLink().getLink());
                break;
            }
            aux=aux.getLink();
        }
        return m;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        l=new nodo(1,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(5, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(8, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println(ValMAXinicio(l));
    }
}
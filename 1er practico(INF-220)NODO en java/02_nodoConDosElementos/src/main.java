public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra,aux=nodo.tierra,ult=nodo.tierra;
        
        l=new nodo(32.3,23,nodo.tierra);
        ult=l;
        
        aux=new nodo(55.234,3,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo(66.111111,4,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo(582.49999999,90,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        System.out.println(aux);
        System.out.println(ult);
        System.out.println(l);
    }  
}
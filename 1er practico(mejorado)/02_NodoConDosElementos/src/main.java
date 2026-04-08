public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra, cola=nodo.tierra;
        
        l=new nodo(4.24,43,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(5.66,99,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(7.214,59,nodo.tierra));
        cola =cola.getLink();
        
        cola.setLink(new nodo(1.1314,44,nodo.tierra));
        
        System.out.println(l);
    }   
}
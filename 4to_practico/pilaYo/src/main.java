public class main {
    public static boolean esPalindomo(nodo l){
        nodo aux=l;
        pila p=new pila ();
        while(aux!=nodo.tierra){
            p.push(aux.getNum());
            aux=aux.getLink();
        }
        aux=l;
        while(aux!=nodo.tierra){
            if(aux.getNum()!=p.pop()){
                return false;
            }
            aux=aux.getLink();
        }
        return true;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink(); 
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        System.out.println(l);
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        pila P = new pila();
        //P.cargar();
        //System.out.println(P);
        
        
        /*pila Q= new pila(),R=new pila();
        int mitad = P.cant()/2;
        P = P.invertir();
        //dividir la pila
        for (int i = 1; i <=mitad; i++) {
            int x = P.pop();
            Q.push(x);
        }
        while(!P.vacia()){
            int x = P.pop();
            R.push(x);
        }
        System.out.println(Q);
        System.out.println(R); */
        
        
        System.out.println(esPalindomo(l));
    }   
}
package cola22024;
public class Cola {
    
    //Representación
    public static final int Max=50;
    private int V[];
    private int frente;
    private int atras;
    
    public Cola(){
        V = new int[Max+1];
        frente = atras = -1;
    }
    
    public boolean vacia(){
        return ((frente==-1)&&(atras==-1));
    }
    public boolean llena(){
        int aux=atras;
        aux++;
        if(aux>Max)
            aux=0;
        return (aux==frente);
    }
    public int cant(){
        if(atras >= frente){
            return atras-frente+1;
        }
        else
            return (atras+1)+(Max-frente+1);
    }
    public void encolar(int elemento){
        if (llena()){
            throw new ArrayStoreException("Cola llena");
        }
        if ((frente==-1)&&(atras==-1)){ // 1er Inserción
            frente = atras =0;
            V[atras]=elemento;
        }
        else{
            atras++;
            if( atras > Max)
                atras = 0;
            V[atras]=elemento;
        }
    }
    public int desEncolar(){
        if(vacia()){
            throw new ArrayStoreException("Cola vacia");
        }
        int elemento = V[frente];
        if(frente == atras){
            frente = atras = -1; // Queda en condición de vacía
        }
        else{
            frente++;
            if(frente>Max)
                frente=0;
        }
        return elemento;
    }
    
    @Override
    public String toString() {
        String cad ="Cola{ ";
        int pos = frente;
        while(pos != atras){
            cad += V[pos]+", ";
            pos++;
            if(pos>Max)
                pos = 0;
        }
        cad+=V[atras]+" }";
        return cad;
    }
}
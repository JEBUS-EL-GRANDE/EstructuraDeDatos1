/*2)Supongamos que cabeza es una referencia a la cabeza de una lista enlazada con un solo nodo. ¿Qué será
cabeza después de cabeza = cabeza.getLink( )?*/
public class Main {
    public static void main(String[] args) {
        nodo cabeza=nodo.tierra,  cola=nodo.tierra;
        cabeza=new nodo(8,nodo.tierra);
        cola=cabeza;
                 
        cabeza = cabeza.getLink( );
        System.out.println(cabeza);
        //como solo hay un nodo con la lie¿nea de cododigo cabeza = cabeza.getLink( ),
        //solo obtendremos el enlace de lo que esteapuntando cabeza que es NULL
    }   
}
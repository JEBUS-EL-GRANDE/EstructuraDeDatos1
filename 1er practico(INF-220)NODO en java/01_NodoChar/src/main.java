//1) escribe el inicio de la declaracion de nodo, el daato en cada nodo es un char

/*que es null

R.-null es un concepto clave en la programación que se usa para representar la 
ausencia de un valor o una referencia. No es lo mismo que "0" o una cadena vacía;
es una referencia que explícitamente indica que no hay nada allí, es decir, un "no valor".

0:    Representa un valor numérico.
"":   Representa una cadena vacía.
null: Representa la ausencia total de un valor o referencia.


Errores comunes: Uno de los errores más comunes en la programación es intentar 
acceder a propiedades o métodos de una referencia null. Como null no es un 
objeto, no tiene métodos ni atributos, y esto puede llevar a excepciones o 
errores de ejecución como el famoso NullPointerException en Java.
*/
public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra, aux=nodo.tierra, ult=nodo.tierra;
        
        l=new nodo('a',nodo.tierra);
        ult=l;
        
        aux=new nodo('e',nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo('i',nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo('o',nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo('u',nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        
        
        System.out.println("----------get------------");
        //get
        System.out.println(l.getData());
        System.out.println(l.getLink());
        System.out.println(aux.getData());
        System.out.println(aux.getLink());
        System.out.println(ult.getData());
        System.out.println(ult.getLink());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println(ult);
        System.out.println(aux);        
        System.out.println(l);        
    }
}
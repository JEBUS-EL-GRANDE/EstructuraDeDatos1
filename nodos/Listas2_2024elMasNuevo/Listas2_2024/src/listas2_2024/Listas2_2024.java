package listas2_2024;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Listas2_2024{
    public static void imprimir(Nodo L) {
        String cad = "Lista-->[";
        while (L != Nodo.TIERRA) {
            cad += L.getDataInt() + ", ";
            L = L.getLink();
        }
        cad += "]";
        System.out.println(cad);
    }

    public static Nodo crearLista() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));

        Nodo Cabeza = Nodo.TIERRA;
        Nodo Cola = Nodo.TIERRA;
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            if (i == 1) {
                Cabeza = new Nodo(val, Nodo.TIERRA);
                Cola = Cabeza;
            } else {
                Cola.setLink(new Nodo(val, Nodo.TIERRA));
                Cola = Cola.getLink();
            }
        }
        return Cabeza;
    }

    public static Nodo crearListaInvertida() {
        Nodo Cabeza = Nodo.TIERRA;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));

        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            Cabeza = new Nodo(val, Cabeza);
        }
        return Cabeza;
    }

    public static Nodo crearLista15() {

        Nodo Cabeza = Nodo.TIERRA;
        Nodo Cola = Nodo.TIERRA;
        for (int i = 1; i <= 15; i++) {

            if (i == 1) {
                Cabeza = new Nodo(i, Nodo.TIERRA);
                Cola = Cabeza;
            } else {
                Cola.setLink(new Nodo(i, Nodo.TIERRA));
                Cola = Cola.getLink();
            }
        }
        return Cabeza;
    }
    public static void main(String[] args) {

        /* Nodo p ,q, r; // Se crean 3 referencias
        
        p = new Nodo(1,Nodo.TIERRA);  //Crea un nodo para p con Data igual a 1  
        
        q = new Nodo(2,Nodo.TIERRA);  //Crea un nodo para q con Data igual a 2    
        
        p.setLink(q);  //Enlaza el nodo apuntado por p con el nodo q
        
        r = new Nodo(3,Nodo.TIERRA);  //Crea un nodo para r con Data igual a 3
        
        q.setLink(r);    //Enlaza el nodo apuntado por q con el nodo r
        
        Nodo t = p; // Se declara una referencia t que inicia en el nodo apuntado por p
        while(t!=Nodo.TIERRA){  
            System.out.print(t.getDataInt()+ ", ");
            t = t.getLink();
        }*/
        Nodo p = crearLista15();
        imprimir(p);
        Nodo q, r;
        q = p;
        r = p;
        
        for (int i = 1; i < 8; i++) {
            q = q.getLink();
        }
        while (r.getLink() != Nodo.TIERRA) {
            r = r.getLink();
        }

        System.out.println("Referencia p lista original: " + p.getDataInt());
        System.out.println("Referencia q lista original: " + q.getDataInt());
        System.out.println("Referencia r lista original: " + r.getDataInt());

        Nodo x, y, z;

        x = new Nodo(p.getDataInt(),
                new Nodo(p.getLink().getDataInt(),
                    new Nodo(p.getLink().getLink().getDataInt(),
                        new Nodo(p.getLink().getLink().getLink().getDataInt(),
                            new Nodo(p.getLink().getLink().getLink().getLink().getDataInt(),
                                new Nodo(p.getLink().getLink().getLink().getLink().getLink().getDataInt(),
                                    new Nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getDataInt(),
                                        new Nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getDataInt(), Nodo.TIERRA))))))));
        
        
        y = x.getLink().getLink().getLink().getLink().getLink().getLink().getLink();
        y.setLink(new Nodo(q.getLink().getDataInt(), new Nodo(q.getLink().getLink().
                getDataInt(), new Nodo(q.getLink().getLink().
                        getLink().getDataInt(), new Nodo(q.getLink().getLink().
                                getLink().getLink().getDataInt(), new Nodo(q.getLink().getLink().
                                        getLink().getLink().getLink().getDataInt(), new Nodo(q.getLink().getLink().
                                                getLink().getLink().getLink().getLink().getDataInt(), new Nodo(q.getLink().getLink().
                                                        getLink().getLink().getLink().getLink().getLink().getDataInt(), Nodo.TIERRA))))))));
        z = q.getLink().getLink().getLink().getLink().getLink().getLink().getLink();
        System.out.println("Referencia x de la copia: " + x.getDataInt());
        System.out.println("Referencia y de la copia: " + y.getDataInt());
        System.out.println("Referencia z de la copia: " + z.getDataInt());
        //System.out.println(p.getDataInt());
        System.out.print("Lista original: ");
        imprimir(p);
        System.out.print("Lista copia: ");
        imprimir(x);
       
        //imprimir(y);
    }

  
    
    
}

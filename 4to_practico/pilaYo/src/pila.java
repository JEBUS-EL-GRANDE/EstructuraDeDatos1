import javax.swing.JOptionPane;
public class pila {
    public static final int MAX = 50; //Constante Max
    //REPRESENTACIÓN
    private int V[];
    private int cima;

    public pila() {
        V = new int[MAX + 1];
        cima = -1;
    }
    public boolean vacia() {
        return (cima == -1);
    }
    public boolean llena() {
        return (cima == MAX);
    }

    public void push(int x) {
        // Pre: La pila no está llena
        if (llena()) {
            throw new ArrayStoreException("Error: Pila llena");
        }
        cima++;
        V[cima] = x;  // V[++cima]=x;
    }
    public void cargar(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n: "));
        for(int i=1;i<=n;i++){
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            push(val);
        }
    }
    public pila invertir(){
        pila Aux = new pila();
        while(!vacia()){
            int x = pop();
            Aux.push(x);            
        }
        return Aux;
    }
    public int pop() {
        // Pre: La pila no está vacía
        if (vacia()) {
            throw new NegativeArraySizeException("Error: Pila vacía");
        }
        int x = V[cima];
        cima--;
        return x;
    }
    public int cant() {
        return cima + 1;
    }
    public int tope() {
        // Pre: La pila no está vacía
        if (vacia()) {
            throw new NegativeArraySizeException("Error: Pila vacía");
        }
        return V[cima];
    }
    
    @Override
    public String toString() {
        String cad = "Pila\n[";
        for (int i = cima; i >= 0; i--) {
            cad += V[i] + ",\n";
        }
        cad += "]";
        return cad;
    }
}
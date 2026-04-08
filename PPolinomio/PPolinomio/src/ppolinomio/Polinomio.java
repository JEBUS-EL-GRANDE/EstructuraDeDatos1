package ppolinomio;
public class Polinomio implements Cloneable {

    public final int MAX = 50;

    private double COEF[];
    private int EXP[];
    private int n;

    Polinomio() {
        COEF = new double[MAX + 1];
        EXP = new int[MAX + 1];
        n = -1;
    }

    public Polinomio clone() {
        Polinomio resp;

        try {
            resp = (Polinomio) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clase no implementa interfaz Cloneable");
        }
        return resp;
    }

    void insertar(double coef, int exp) {
        if (n == -1) { // Primer inserción
            COEF[0] = coef;
            EXP[0] = exp;
            n = 0;
        } else {
            int pos = 0;
            while ((pos <= n) && (EXP[pos] > exp)) // busca la posición de exp en EXP
            {
                pos++;
            }
            if (pos > n) {
                COEF[pos] = coef;
                EXP[pos] = exp;
                n++;
            } else {
                if (EXP[pos] == exp) {//el término está en el polinomio
                    double suma = COEF[pos] + coef;
                    if (suma != 0) {
                        COEF[pos] = suma;
                    } else {
                        for (int i = pos; i <= n - 1; i++) {
                            COEF[i] = COEF[i + 1];
                            EXP[i] = EXP[i + 1];
                        }
                        n--;
                    }
                } else {
                    for (int i = n + 1; i > pos; i--) {
                        COEF[i] = COEF[i - 1];
                        EXP[i] = EXP[i - 1];
                    }
                    COEF[pos] = coef;
                    EXP[pos] = exp;
                    n++;
                }
            }
        }
    }

    @Override
    public String toString() {
        String cad = "";
        if (n == -1) {
            cad = " 0";
        } else {
            for (int i = 0; i <= n; i++) {
                cad = cad + COEF[i] + "X^" + EXP[i] + " + ";
            }
        }
        return cad;
    }

    int grado() {
        if (n == -1) {
            System.out.println("Polinomio nulo no tiene grado");
            System.exit(0);
        }
        return EXP[0];
    }

    public static Polinomio suma(Polinomio A, Polinomio B) {// retorna la Suma de A+B
        Polinomio Temp = new Polinomio();
        for (int i = 0; i <= A.n; i++) {
            Temp.insertar(A.COEF[i], A.EXP[i]);
        }
        for (int i = 0; i <= B.n; i++) {
            Temp.insertar(B.COEF[i], B.EXP[i]);
        }
        return Temp;
    }

    public static Polinomio resta(Polinomio A, Polinomio B) {// retorna la Diferencia A-B
        Polinomio Temp = new Polinomio();
        for (int i = 0; i <= A.n; i++) {
            Temp.insertar(A.COEF[i], A.EXP[i]);
        }
        for (int i = 0; i <= B.n; i++) {
            Temp.insertar((-1) * B.COEF[i], B.EXP[i]);
        }
        return Temp;
    }
    //multiplicacion 
    public static Polinomio multiplicar(Polinomio A, Polinomio B) {
    Polinomio resultado = new Polinomio(); // Polinomio para almacenar el resultado

    for (int i = 0; i <= A.n; i++) { // Recorremos todos los términos de A
        for (int j = 0; j <= B.n; j++) { // Recorremos todos los términos de B
            double nuevoCoef = A.COEF[i] * B.COEF[j]; // Multiplicamos los coeficientes
            int nuevoExp = A.EXP[i] + B.EXP[j]; // Sumamos los exponentes
            resultado.insertar(nuevoCoef, nuevoExp); // Insertamos el término al resultado
        }
    }

    return resultado; // Devolvemos el resultado
}
//división 
public static Polinomio dividir(Polinomio A, Polinomio B) {
    if (B.n == -1) {
        throw new IllegalArgumentException("No se puede dividir por un polinomio nulo");
    }

    Polinomio cociente = new Polinomio(); // Polinomio para el cociente
    Polinomio residuo = A.clone(); // Clonamos A como residuo inicial

    while (residuo.n != -1 && residuo.EXP[0] >= B.EXP[0]) {
        double coefCociente = residuo.COEF[0] / B.COEF[0]; // Dividimos coeficientes
        int expCociente = residuo.EXP[0] - B.EXP[0]; // Restamos exponentes

        Polinomio terminoCociente = new Polinomio();
        terminoCociente.insertar(coefCociente, expCociente); // Término del cociente

        cociente = suma(cociente, terminoCociente); // Sumar el término al cociente
        Polinomio producto = multiplicar(terminoCociente, B); // Producto de término y divisor
        residuo = resta(residuo, producto); // Actualizamos el residuo
    }

    return cociente; // Devolvemos el cociente (puedes devolver el residuo si lo necesitas)
}





    
    // Nueva función: derivar el polinomio recibido como parámetro
    public static Polinomio derivar(Polinomio P) {
        Polinomio derivado = new Polinomio();
        for (int i = 0; i <= P.n; i++) {
            if (P.EXP[i] != 0) { // La derivada de una constante (exp=0) es 0
                derivado.insertar(P.COEF[i] * P.EXP[i], P.EXP[i] - 1);
            }
        }
        return derivado;
    }
}
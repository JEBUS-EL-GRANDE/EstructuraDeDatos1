package ppolinomio;

import javax.xml.transform.Source;

public class main {
    public static void main(String[] args) {
        Polinomio P = new Polinomio();  // Produce P(x) = 0
        //System.out.println("P(x)= "+P);
        
        P.insertar(10, 5);   // P(x) = P(x) + 2x^3
        //System.out.println("P(x)= "+P);
        
        P.insertar(2, 3);  // P(x) = P(x) + -3x^2 ==> P(x) = 2x^3 - 3x^2
        //System.out.println("P(x)= "+P);
        
        P.insertar(1, 2);   // P(x) = P(x) + 5x^8 ==> P(x) = 5x^8 + 2x^3 - 3x^2
        //System.out.println("P(x)= "+P);
        
        P.insertar(-6, 1);  // P(x) = P(x) + -9x^0 ==> P(x) = 5x^8 + 2x^3 - 3x^2 - 9
        //System.out.println("P(x)= "+P);
        
        P.insertar(-3, 0);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
        System.out.println("P(x)= "+P);
        
        //seundo polinomio  *****************************************************

        Polinomio Q = new Polinomio();
        
        Q.insertar(8, 4);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
        //System.out.println("P(x)= "+P);
        Q.insertar(2, 3);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
       // System.out.println("P(x)= "+P);
        Q.insertar(-5, 2);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
        Q.insertar(6, 1);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
        //Q.insertar(-5, 2);   // P(x) = P(x) + 2x^1 ==> P(x) = 5x^8 + 2x^3 - 3x^2 + 2x - 9
        System.out.println("Q(x)= "+Q);
        
        //creamos oo polinomio para las sumas y restas 
        
        Polinomio R = new Polinomio();
        
        R = Polinomio.suma(P, Q);
        System.out.println("R(x)= "+R);
        
        R = Polinomio.resta(P, Q);
        System.out.println("R(x)= "+R);
        
        System.out.println(P);
        R = Polinomio.derivar(P);

        System.out.println(R);
        
        
        
        
        
        
        
        
        
        
        
        
        /*P.insertar(8, 6);   // P(x) = P(x) + 8x^6 ==> P(x) = 5x^8 + 8x^6 + 2x^3 - 3x^2 - 9
        P.insertar(2, 6);   // P(x) = P(x) + 8x^6 ==> P(x) = 5x^8 + 8x^6 + 2x^3 - 3x^2 - 9
        System.out.println("P(x)= "+P);
        
        P.insertar(-8, 3);  // P(x) = P(x) + -2x^3 ==> P(x) = 5x^8 + 8x^6 - 3x^2 - 9
        System.out.println("P(x)= "+P);*/
//        Polinomio Q = new Polinomio();

//        System.out.println("Q(x)= "+Q);

       // P.completo();
        
       // System.out.println("El grado del polinomio P(x) es: "+P.grado());
                
    }
    
}

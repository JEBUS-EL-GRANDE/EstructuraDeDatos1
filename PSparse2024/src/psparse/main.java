package psparse;
public class main {
    public static void main(String[] args) {
        // Modo Usuario
        
        Sparse S, T;

        S = new Sparse();// Crea una Matriz Sparse vacía
        T = new Sparse();

        S.setDim(5, 4); // S = 5 x 4
        T.setDim(2, 3); // T = 2 x 3

        S.set(1, 2, 3); // S[1][2] = 3
        S.set(3, 1, 9.5f); // S[3][1] = 9.5
        S.set(4, 1, 12.5f); //S[4][1] = 12.5
        S.set(5, 4, 67);
        S.set(2, 2, 15);
        S.set(2, 2, 33);
        
        

        for (int i = 1; i <= S.getFilas(); i++) {
            for (int j = 1; j <= S.getCols(); j++) {
                System.out.print(S.get(i, j) + "   ");
            }
            System.out.println("");
        }
//        System.out.println("--------------------------------------");
//        for (int i = 1; i <= S.getFilas(); i++) {
//            for (int j = 1; j <= S.getCols(); j++) {
//                System.out.print(S.get(i, j) + "   ");
//            }
//            System.out.println("");
//        }
    }
}

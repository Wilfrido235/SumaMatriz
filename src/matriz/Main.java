package matriz;

public class Main {
    
    public static void main(String[] args) {
        Matriz m = new Matriz(3, 3);
        m.llenaMatriz1();
        m.llenaMatriz2();
        m.imprimirMatriz(m.enteros1);        
        m.imprimirMatriz(m.enteros2);
        m.sumarMatrices(m.enteros1,m.enteros2);
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class ParcialArboles_BFS {
    public static int diferenciaParesImpares(BinaryTree<Integer> arbol) {
        int res = 0;
        if(arbol != null && !arbol.isEmpty()) {
            Queue<BinaryTree<Integer>> cola = new LinkedList<>();
            BinaryTree<Integer> aux;
            cola.add(arbol);
            while (!cola.isEmpty()) {
                aux = cola.remove();
                if (aux.hasLeftChild() && aux.hasRightChild()) {
                    if (aux.getData() % 2 == 0) {
                        res += aux.getData();
                    }
                } else if (aux.hasLeftChild() || aux.hasRightChild()) {
                    if (aux.getData() % 2 != 0) {
                        res -= aux.getData();
                    }
                }
                if (aux.hasLeftChild()) {
                    cola.add(aux.getLeftChild());
                }
                if (aux.hasRightChild()) {
                    cola.add(aux.getRightChild());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> raiz = new BinaryTree<>(2);

        BinaryTree<Integer> nodo3 = new BinaryTree<>(3);
        BinaryTree<Integer> nodo5 = new BinaryTree<>(5);

        BinaryTree<Integer> nodo1 = new BinaryTree<>(1);
        BinaryTree<Integer> nodo6 = new BinaryTree<>(6);
        BinaryTree<Integer> nodo8 = new BinaryTree<>(8);

        BinaryTree<Integer> nodo7 = new BinaryTree<>(7);
        BinaryTree<Integer> nodo4 = new BinaryTree<>(4);

        raiz.addLeftChild(nodo3);
        raiz.addRightChild(nodo5);

        nodo3.addLeftChild(nodo1);
        nodo3.addRightChild(nodo6);

        nodo5.addRightChild(nodo8);

        nodo6.addLeftChild(nodo7);
        nodo6.addRightChild(nodo4);

        System.out.println("Ejecutando prueba...");
        int resultado = diferenciaParesImpares(raiz);

        System.out.println("Resultado obtenido: " + resultado);
        System.out.println("Resultado esperado: 3");

        if (resultado == 3) {
            System.out.println("¡Prueba superada exitosamente!");
        } else {
            System.out.println("Hay un error en la lógica.");
        }
    }
}

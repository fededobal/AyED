public class ParcialArboles_DFS {
    public static int diferenciaParesImpares(BinaryTree<Integer> arbol) {
        int res = 0;
        if(arbol != null && !arbol.isEmpty()) {
            res = _diferenciaParesImpares(arbol,res);
        }
        return res;
    }

    private static int _diferenciaParesImpares(BinaryTree<Integer> arbol, int res) {
        if(arbol.hasLeftChild() && arbol.hasRightChild()) {
            if(arbol.getData() % 2 == 0) {
                res += arbol.getData();
            }
        } else if(arbol.hasLeftChild() || arbol.hasRightChild()) {
            if(arbol.getData() % 2 != 0) {
                res -= arbol.getData();
            }
        }
        if(arbol.hasLeftChild()) {
            res = _diferenciaParesImpares(arbol.getLeftChild(),res);
        }
        if(arbol.hasRightChild()) {
            res = _diferenciaParesImpares(arbol.getRightChild(),res);
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

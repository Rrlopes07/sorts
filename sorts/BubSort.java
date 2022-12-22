package sorts;

public class BubSort {

    public int[] doBubbleSort (int[] vector) {
        // Executa ordenação e verifica se está ordenado
        vector = organize(vector);
        boolean isOrganized = isOrdered(vector);

        // Caso esteja ordenado, retorna o vetor
        // Caso contrário, executa a função recursivamente
        if (isOrganized) {
            return vector;
        } else {
            doBubbleSort(vector);
        }

        return vector;
    }

    private int[] organize(int[] vector) {
        // Compara se o valor do atual é maior que o próximo
        // Caso positivo, executa a alteração
        // -1 no for para não sair do indice da lista, provocando erro
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i+1]) {
                int lower = vector[i+1];
                int higher = vector[i];

                vector[i] = lower;
                vector[i+1] = higher;
            }
        }

        return vector;
    }

    private boolean isOrdered(int[] vector) {
        // Estabelece contador para verificar
        int counter = 0;

        // Quando há valor fora de ordem, incrementa o contador
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i+1]) {
                counter++;
            }
        }

        // Retorna um booleano indicando se a lista está ordenada
        if (counter == 0) {
            return true;
        }
        return false;
    }
}

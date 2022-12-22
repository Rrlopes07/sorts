package sorts;

public class SelecSort {

    public int[] doSelectionSort (int[] vector) {
        for (int current = 0; current < vector.length; current++) {
            // Localiza o menor valor na lista
            int lower = obtainLowest(vector, current);

            // Captura os valores na posição atual e a referente ao menor valor
            int currentValue = vector[current];
            int lowestValue = vector[lower];

            // realiza a troca de posições
            vector[current] = lowestValue;
            vector[lower] = currentValue;
        }
        return vector;
    }

    private int obtainLowest (int[] vector,  int initialPosition) {
        int lower = initialPosition; // Define valor inicial para comparação

        for (int current = initialPosition; current < vector.length; current++) {
            // Verificar se valor na posição atual é menor que o valor anterior
            // Caso seja, atualiza o menor valor encontrado na lista
            if (vector[current] < vector[lower]) {
                lower = current;
            }
        }

        return lower;
    }
}

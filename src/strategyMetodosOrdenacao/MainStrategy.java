package strategyMetodosOrdenacao;

import java.util.Arrays;

/**
 *
 * @author geovane.saraujo
 */
public class MainStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Strategy ordenar = new Strategy();

        System.out.print("Blubble: ");
        Bubble bubble = new Bubble();
        int bubbleV[] = {5, 3, 2, 1};
        System.out.println(Arrays.toString(ordenar.ordenar(bubbleV, bubble)));

        System.out.print("Insertion: ");
        Insertion insertion = new Insertion();
        int InsertionV[] = {5, 3, 2, 1};
        System.out.println(Arrays.toString(ordenar.ordenar(InsertionV, insertion)));

        System.out.print("Selection: ");
        Selection selection = new Selection();
        int selectionV[] = {7,5, 3, 2, 1};
        System.out.println(Arrays.toString(ordenar.ordenar(selectionV, selection)));
    }

}

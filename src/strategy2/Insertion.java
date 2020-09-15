package strategy2;

import java.util.Arrays;

/**
 *
 * @author geovane.saraujo
 */
public class Insertion implements InterfaceOrdenar {

    @Override
    public int[] ordenar(int v[]) {
        int i, j;
        int n = v.length;
        int temp;
        for (i = 1; i < n; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
        return v;
    }
}

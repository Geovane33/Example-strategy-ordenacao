package strategy2;

/**
 *
 * @author geovane.saraujo
 */
public class Strategy {
    
    public int[] ordenar(int v[], InterfaceOrdenar InterfaceOrdenar){
        return InterfaceOrdenar.ordenar(v);
    }
    
}

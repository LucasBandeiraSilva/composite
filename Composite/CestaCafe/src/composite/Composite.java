package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> lista = new ArrayList();

    public void adicionar(Component c){
        lista.add(c);
    }

    public void remover(Component c){
        lista.remove(c);
    }
    
    
    @Override
    public double getPreco() {
        double total = 0.0;
        for(Component c: lista){
          total += c.getPreco();   
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composite [lista=" + lista + "]";
    }
}

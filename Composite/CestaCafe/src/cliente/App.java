package cliente;

import composite.Component;
import composite.Composite;
import composite.Leaf;

public class App {
    public static void main(String[] args) throws Exception {
        
        Composite cesta = new Composite();
        Component p1 = new Leaf("café",19.34);
        Component p2 = new Leaf("Leite",9.89);
        Component p3 = new Leaf("Torrada",11.6);
        Component p4 = new Leaf("Caneca",21.5);

        cesta.adicionar(p1);
        cesta.adicionar(p2);
        cesta.adicionar(p3);
        cesta.adicionar(p4);

        Component p5 = new Leaf("BomBom Cereja",4.5);
        Component p6 = new Leaf("BomBom Licor",8.5);

        Composite caixa = new Composite();
        caixa.adicionar(p5);
        caixa.adicionar(p6);
        cesta.adicionar(caixa);

        System.out.println("total  " + cesta.getPreco());
        System.out.println(cesta);
    }
}

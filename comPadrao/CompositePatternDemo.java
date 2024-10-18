package comPadrao;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Folhas individuais
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");

        // Composite que contém folhas
        Composite composite1 = new Composite("Composite 1");
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        // Composite que contém outro composite e uma folha
        Composite composite2 = new Composite("Composite 2");
        composite2.addComponent(composite1);
        composite2.addComponent(leaf3);

        // Exibindo detalhes da estrutura completa
        composite2.showDetails();
    }
}

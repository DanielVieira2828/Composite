public class WithoutCompositeDemo {
    public static void main(String[] args) {
        // Folhas individuais
        SimpleLeafWithoutComposite leaf1 = new SimpleLeafWithoutComposite("Leaf 1");
        SimpleLeafWithoutComposite leaf2 = new SimpleLeafWithoutComposite("Leaf 2");
        SimpleLeafWithoutComposite leaf3 = new SimpleLeafWithoutComposite("Leaf 3");

        // Composite que contém folhas
        SimpleCompositeWithoutComposite composite1 = new SimpleCompositeWithoutComposite("Composite 1");
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        // Composite que contém outro composite e uma folha
        SimpleCompositeWithoutComposite composite2 = new SimpleCompositeWithoutComposite("Composite 2");
        composite2.addComponent(composite1);
        composite2.addComponent(leaf3);

        // Exibindo detalhes da estrutura completa
        composite2.showDetails();
    }
}

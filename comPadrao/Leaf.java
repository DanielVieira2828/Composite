package comPadrao;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Leaf: " + name);
    }
}

import java.util.ArrayList;
import java.util.List;

public class SimpleCompositeWithoutComposite {
    private String name;
    private List<Object> components = new ArrayList<>();

    public SimpleCompositeWithoutComposite(String name) {
        this.name = name;
    }

    public void addComponent(Object component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("SimpleComposite: " + name);
        for (Object component : components) {
            if (component instanceof SimpleLeafWithoutComposite) {
                ((SimpleLeafWithoutComposite) component).showDetails();
            } else if (component instanceof SimpleCompositeWithoutComposite) {
                ((SimpleCompositeWithoutComposite) component).showDetails();
            }
        }
    }
}

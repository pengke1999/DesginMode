package decorator.example.decorator;

import decorator.example.Decorator;
import decorator.example.VisualComponent;

/**
 * @author penko.peng
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public String getDisplay() {
        return super.getDisplay() + ",边框";
    }

    @Override
    public void resize() {
        super.resize();
        System.err.println("邊框尺寸调整");
    }
}

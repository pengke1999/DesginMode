package decorator.example.decorator;

import decorator.example.Decorator;
import decorator.example.VisualComponent;

/**
 * @author peng
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public String getDisplay() {
        return super.getDisplay() + ",滚动";
    }

    @Override
    public void resize() {
        System.err.println("調整滚动条尺寸");
    }
}

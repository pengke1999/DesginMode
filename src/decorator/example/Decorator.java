package decorator.example;

import lombok.Data;

/**
 * @author penko.peng
 */
public abstract class Decorator implements VisualComponent{

    VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    public  String getDisplay() {
        return component.getDisplay();
    }

    /**
     * 尺寸
     */
    public void resize() {
        component.resize();
    };

}

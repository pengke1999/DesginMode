package decorator.example;

import lombok.Data;

/**
 * @author penko.peng
 */
public interface VisualComponent {

    String display = "";

    /**
     * 视图
     */
    public String getDisplay();

    /**
     * 尺寸
     */
    public abstract void resize();
}

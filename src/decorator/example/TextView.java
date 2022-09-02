package decorator.example;

public class TextView implements VisualComponent{

    String display = "文本窗口";
    public TextView() {
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void resize() {
        System.err.println("文本窗口尺寸");
    }
}

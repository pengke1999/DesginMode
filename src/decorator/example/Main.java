package decorator.example;

import decorator.example.decorator.BorderDecorator;
import decorator.example.decorator.ScrollDecorator;

public class Main {

    public static void main(String[] args) {
        VisualComponent textView = new TextView();

        textView = new ScrollDecorator(new BorderDecorator(textView));

        System.err.println(textView.getDisplay());
    }

}

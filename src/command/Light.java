package command;

import lombok.Data;

@Data
public class Light {

    private String name = "default light";

    public void on() {
        System.out.println("light on!");
    }

    public void off() {
        System.err.println("light off");
    }
}

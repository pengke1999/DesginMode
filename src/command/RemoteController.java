package command;

import lombok.Data;

@Data
public class RemoteController {

    Command command;

    public RemoteController() {

    }

    public RemoteController(Command command) {
        this.command = command;
    }

    public void clickOn() {
        command.execute();
    }
}

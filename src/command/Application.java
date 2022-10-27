package command;

public class Application {

    public static void main(String[] args) {
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(lightCommand);
        remoteController.clickOn();
    }
}

public class SmartHome {
    private LightSwitchIF lightSwitch;
    private BulbIF bulb;

    public SmartHome(LightSwitchIF lightSwitch, BulbIF bulb) {
        this.lightSwitch = lightSwitch;
        this.bulb = bulb;
    }

    public void run() {
        if (lightSwitch.isOn() == false) {
            bulb.turnOff();
            return;
        }
        bulb.turnOn();

    }
}

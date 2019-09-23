import org.junit.Test;

import static org.junit.Assert.*;

public class SmartHomeTest {
    private LightSwitchStub lightSwitchStub = new LightSwitchStub();
    private BulbSpy bulbSpy = new BulbSpy();

    @Test
    public void スイッチがONの時バルブがつく() {
        SmartHome smartHome = new SmartHome(lightSwitchStub, bulbSpy);


        smartHome.run();


        assertEquals(bulbSpy.turnOnWasCalled, true);
        assertEquals(bulbSpy.turnOffWasCalled, false);
    }

    @Test
    public void スイッチがOFFの時バルブが消える() {
        SmartHome smartHome = new SmartHome(lightSwitchStub, bulbSpy);
        lightSwitchStub.setIsOnReturnValue(false);

        smartHome.run();


        assertEquals(bulbSpy.turnOffWasCalled, true);
        assertEquals(bulbSpy.turnOnWasCalled, false);
    }
}
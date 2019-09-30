import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmartHomeTest {
    private LightSwitchStub lightSwitchStub;
    private BulbSpy bulbSpy;

    @Before
    public void setUp() throws Exception {
        lightSwitchStub = new LightSwitchStub();
        bulbSpy = new BulbSpy();
    }

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
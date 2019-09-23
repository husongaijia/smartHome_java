public class BulbSpy implements BulbIF {
    public boolean turnOnWasCalled = false;
    public boolean turnOffWasCalled = false;
    @Override
    public void turnOn() {
        turnOnWasCalled = true;
    }

    @Override
    public void turnOff() {
        turnOffWasCalled = true;
    }
}

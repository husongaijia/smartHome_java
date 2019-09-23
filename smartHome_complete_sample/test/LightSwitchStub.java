public class LightSwitchStub implements LightSwitchIF {
    private boolean isOnReturnValue = true;

    @Override
    public boolean isOn() {
        return isOnReturnValue;
    }

    public void setIsOnReturnValue(boolean isOnReturnValue) {
        this.isOnReturnValue = isOnReturnValue;
    }
}

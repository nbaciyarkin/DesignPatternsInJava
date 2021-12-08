package AbstractFactoryPattern;

public class ClickySwitch extends Switch{

    SwitchComponentFactory switchComponentFactory;

    public ClickySwitch(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }
    @Override
    void gatherParts() {

        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Heavy);

    }
}

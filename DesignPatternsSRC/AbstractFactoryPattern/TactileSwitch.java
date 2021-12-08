package AbstractFactoryPattern;

public class TactileSwitch extends Switch {

    SwitchComponentFactory switchComponentFactory;

    public TactileSwitch(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }

    @Override
    void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Medium);

    }
}

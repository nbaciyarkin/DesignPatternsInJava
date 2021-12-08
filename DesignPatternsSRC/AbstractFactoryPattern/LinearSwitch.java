package AbstractFactoryPattern;

public  class LinearSwitch extends Switch {
    SwitchComponentFactory switchComponentFactory;

    public LinearSwitch(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }

    @Override
    void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Light);

    }
}

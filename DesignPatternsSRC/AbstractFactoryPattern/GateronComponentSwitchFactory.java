package AbstractFactoryPattern;

public class GateronComponentSwitchFactory implements SwitchComponentFactory{
    @Override
    public KeyCap createKeyCap() {
        return null;
    }

    @Override
    public Stem createStem() {
        return null;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {

        return null;
    }
}

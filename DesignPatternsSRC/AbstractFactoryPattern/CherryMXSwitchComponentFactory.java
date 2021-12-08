package AbstractFactoryPattern;

public class CherryMXSwitchComponentFactory implements SwitchComponentFactory {


    @Override
    public KeyCap createKeyCap() {
        return new CherryMXKeyCap();
    }

    @Override
    public Stem createStem() {
        return new CherryStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
      return new CherryMXCoilSpirng(45);
    }
}

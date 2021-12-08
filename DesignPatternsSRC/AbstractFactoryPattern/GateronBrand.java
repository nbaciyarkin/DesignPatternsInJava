package AbstractFactoryPattern;

public class GateronBrand extends SwitchMaker {


    @Override
    protected Switch createSwitch(String type) {
        Switch switch_;
        switch_ = null;

        SwitchComponentFactory switchComponentFactory = new GateronComponentSwitchFactory();

        if(type.equals("tactile")){
            return new TactileSwitch(switchComponentFactory);
        } else if(type.equals("linear")){
            return new TactileSwitch(switchComponentFactory);
        } else if(type.equals("clicky")){
            return new ClickySwitch(switchComponentFactory);
        }
        return switch_;
    }

    @Override
    protected Switch assembleSwitch(String type) {
        SwitchComponentFactory switchComponentFactory = new GateronComponentSwitchFactory();

        Switch swicth = null;

        if(type.equals("tactile")){
            swicth = createSwitch("tacticle");
            swicth.gatherParts();
            swicth.name = "Gateron";
        } else if(type.equals("linear")){
            createSwitch("linear");
            swicth.gatherParts();
            swicth.name = "Gateron";
        } else if(type.equals("clicky")){
            createSwitch("linear");
            swicth.gatherParts();
            swicth.name = "Gateron";
        }
        swicth.placeCoilSpring();
        swicth.placeStem();
        swicth.placeKeyCap();
        return swicth;
    }
}

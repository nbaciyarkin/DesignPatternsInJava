package AbstractFactoryPattern;

public class CherryMXBrand extends SwitchMaker{
    @Override
    protected Switch createSwitch(String type) {
        Switch switch_;
        switch_ = null;

        SwitchComponentFactory switchComponentFactory = new CherryMXSwitchComponentFactory();


        if(type.equals("tactile")){
            switch_ =  new TactileSwitch(switchComponentFactory);
        } else if(type.equals("linear")){
            switch_ = new LinearSwitch(switchComponentFactory);
        } else if(type.equals("clicky")){
            switch_ = new ClickySwitch(switchComponentFactory);
        }
        return switch_;
    }

    @Override
    protected Switch assembleSwitch(String type) {
        SwitchComponentFactory switchComponentFactory = new CherryMXSwitchComponentFactory();

        Switch switch_ = null;

        if(type.equals("tactile")){

            switch_ = createSwitch("tacticle");
            switch_.gatherParts();
            switch_.name = "CherrMX";

        } else if(type.equals("linear")){
            switch_ = createSwitch("linear");
            switch_.gatherParts();
            switch_.name = "CherrMX";
        } else if(type.equals("clicky")){
            switch_ = createSwitch("linear");
            switch_.gatherParts();
            switch_.name = "CherrMX";
        }
        switch_.placeCoilSpring();
        switch_.placeStem();
        switch_.placeKeyCap();

        return switch_;


    }
}

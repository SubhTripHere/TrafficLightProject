public class GreenLightHandler extends LightHandler{

    LightHandler nextHandler;

    GreenLightHandler(LightHandler lightHandler){
        super(lightHandler);
        this.nextHandler=lightHandler;;
    }

    @Override
    public void switchLight() {
        System.out.println("Green Light Switch");
    }
}

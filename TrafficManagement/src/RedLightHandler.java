public class RedLightHandler extends LightHandler{



    RedLightHandler(LightHandler next){
        super(next);
        this.color=1;
    }

    @Override
    public void switchLight() {
        System.out.println("Switched to red light");
    }

}

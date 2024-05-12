public abstract class LightHandler {

    int color; //1 for red, 2 for yellow and 3 for green
    LightHandler nextHandler;

    LightHandler(LightHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void switchLight();

    public void perform(){
        switchLight();
        nextHandler.perform();
    }


}

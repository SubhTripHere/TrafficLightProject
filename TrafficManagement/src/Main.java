public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TrafficManager trafficManager = new TrafficManager();

        LightObserver left=new LeftDirection();
        LightObserver right=new RightDirection();

        trafficManager.registerLightObserver(left);
        trafficManager.registerLightObserver(right);


        trafficManager.updateLight(greenlightHandler,leftDirection);

        LightHandler greenlightHandler=null;
        LightHandler redlightHandler=null;
        redlightHandler= new RedLightHandler(greenlightHandler);
        greenlightHandler=new GreenLightHandler(redlightHandler);

        greenlightHandler.perform();

        Direction leftDirection =new Direction(1);
        Direction rightDirection =new Direction(2);

        trafficManager.updateLight(greenlightHandler,leftDirection);

    }
}
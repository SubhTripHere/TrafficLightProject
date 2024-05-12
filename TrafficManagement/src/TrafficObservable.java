import java.util.Observer;

public interface TrafficObservable {
    public void registerLightObserver(LightObserver observer);
    public void removeLightObserver(LightObserver observer);
    public void updateLight(LightHandler light,Direction direction);
}

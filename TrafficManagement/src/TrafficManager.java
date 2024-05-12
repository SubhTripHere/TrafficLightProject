import java.util.*;

public class TrafficManager implements  TrafficObservable{

    Set<LightObserver> lightObserversList;
    TrafficManager(){
        this.lightObserversList=new HashSet<>();
    }

    public void registerLightObserver(LightObserver lightObserver){
        lightObserversList.add(lightObserver);
    }


    @Override
    public void removeLightObserver(LightObserver observer) {
        lightObserversList.remove(observer);
    }


    @Override
    public void updateLight(LightHandler light,Direction direction) {
        for(LightObserver lightObserver : lightObserversList){
            lightObserver.updateTraffic(light,direction);
        }
    }

}

public class RightDirection implements LightObserver{

    LightHandler lightHandler;

    @Override
    public void updateTraffic(LightHandler light,Direction direction) {
        if (direction.direction==2 && light.color==2)
            System.out.println("Traffic allowed from Right Direction.......youhuuuu........");
        else if(light.color==1){
            System.out.println("Hey  now you wait huh.....");
        }else{
            System.out.println("Hey now you get ready brooo.....");
        }
    }

}

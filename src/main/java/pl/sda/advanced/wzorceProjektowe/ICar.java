package pl.sda.advanced.wzorceProjektowe;


public interface ICar {

    int MIN = 10;
    String getDescription();

    int getMaxSpeed();

    default String getModel() {
        return "generic model";

    }

    String getOwnerName();

    static int getSpeedLimit(){
        return 200;
    }

}

package service;

public class Bicycle extends Truck {
    public void updateTyre() {

        System.out.println("Меняем покрышку, количество = " + getWheelsCount());
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}

package service;

public class Car extends Truck {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку, количество = " + getWheelsCount());
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}


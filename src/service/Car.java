package service;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void serv() {
        super.serv();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}


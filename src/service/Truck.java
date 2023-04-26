package service;

public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void serv() {
        super.serv();
        checkEngine();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }
}


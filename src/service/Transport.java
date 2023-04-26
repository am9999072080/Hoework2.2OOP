package service;

public abstract class Transport implements Serviced {
    private final String modelName;
    private final int wheelsCount;

    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    protected void updateTyre() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Меняем покрышку, количество = " + wheelsCount + " штук");
    }

    @Override
    public void serv() {
        updateTyre();

    }
}
package service;

public class ServiceStation implements ServiceStations {

    @Override
    public void check(Car[] cars, Truck[] trucks, Bicycle[] bicycles) {

        if (cars != null) {

            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                System.out.println("Обслуживаем " + car.getModelName());
                car.updateTyre();
                car.checkEngine();
                System.out.println(car.getModelName());

            }
        } else if (trucks != null) {
            for (int i = 0; i < trucks.length; i++) {
                Truck truck = trucks[i];
                System.out.println("Обслуживаем " + truck.getModelName());
                truck.updateTyre();
                truck.checkEngine();
                truck.checkTrailer();
            }
        } else {
            if (bicycles != null) {

                for (int i = 0; i < bicycles.length; i++) {
                    Bicycle bicycle = bicycles[i];
                    System.out.println("Обслуживаем " + bicycle.getModelName());
                    bicycle.updateTyre();
                }
            }
        }
    }
}




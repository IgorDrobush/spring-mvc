package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GetCars {

    private static final List<Car> carList = CreateCarList.getCarList();

    public static List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        if (count != null && count <= 5) {
            cars = carList.subList(0, count);
        } else {
            cars = carList;
        }

        return cars;
    }
}

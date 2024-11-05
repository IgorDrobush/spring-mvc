package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CreateCarList {

    private static final List<Car> carList = createCarList();

    private static List<Car> createCarList() {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("Лада", "Веста", 2023);
        list.add(car1);
        Car car2 = new Car("Урал", "Некст", 2021);
        list.add(car2);
        Car car3 = new Car("Газель", "Некст", 2024);
        list.add(car3);
        Car car4 = new Car("Камаз", "54902-B5", 2022);
        list.add(car4);
        Car car5 = new Car("Комбат", "Т-98", 2015);
        list.add(car5);

        return list;
    }

    public static List<Car> getCarList() {
        return carList;
    }
}

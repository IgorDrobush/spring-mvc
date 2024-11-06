package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

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

    public List<Car> getCars(Integer count) {
        if (count != null && count <= 5) {
            return carList.subList(0, count);
        } else {
            return  carList;
        }
    }
}

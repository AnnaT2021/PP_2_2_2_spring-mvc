package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Component
public class CarServiceImpl implements CarService{

    private static List<Car> listCars = new ArrayList<>();

    static {
        listCars.add(new Car("Model1", 123, "Red"));
        listCars.add(new Car("Model2", 456, "Green"));
        listCars.add(new Car("Model3", 789, "Black"));
        listCars.add(new Car("Model4", 987, "White"));
        listCars.add(new Car("Model5", 546, "Red"));
    }
    @Override
    public List<Car> getListCars(int count){
        if (count > 1 && count < 5) {
            return listCars.stream().limit(count).collect(Collectors.toList());
        }
        else return listCars;
    }

}

package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", 1234, 2010));
        cars.add(new Car("model2", 4567, 2012));
        cars.add(new Car("model3", 8910, 2014));
        cars.add(new Car("model4", 1112, 2016));
        cars.add(new Car("model5", 1314, 2018));
    }

    public CarDaoImp() {
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}

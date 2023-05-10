package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> carList = Arrays.asList(new Car(7, "Escort", 99),
                                        new Car(8, "Focus", 90),
                                        new Car(9, "Fiesta", 95),
                                        new Car(10, "Superb", 110),
                                        new Car(11, "Yeti", 95));

    public List<Car> getCarsFromList(Integer count) {
        if(count == null || count > 5) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}

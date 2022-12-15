package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
public class CarsController {
    private CarDao carDao;
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("cars", carDao.getCars(count));
        return "cars";
    }
}

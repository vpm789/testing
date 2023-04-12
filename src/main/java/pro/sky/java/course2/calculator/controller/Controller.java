package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculateService;

@RestController
public class Controller {
    private CalculateService calculateService;

    public Controller(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/calculator")
    public String welcomeCalculator() {
        return calculateService.welcomeCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.calculatePlus(num1, num2) ;
    }
    @GetMapping(path = "/calculator/minus")
    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.calculateMinus(num1, num2) ;
    }
    @GetMapping(path = "/calculator/multiply")
    public String calculateMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.calculateMultiply(num1, num2) ;
    }
    @GetMapping(path = "/calculator/divide")
    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.calculateDivide(num1, num2) ;
    }
}

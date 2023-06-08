package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculateService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculateService calculateService;

    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String welcomeCalculator() {
        return calculateService.welcomeCalculator();
    }
    @GetMapping(path = "/plus")
    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculateService.calculatePlus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculateService.calculateMinus(num1, num2) ;
    }
    @GetMapping(path = "/multiply")
    public String calculateMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculateService.calculateMultiply(num1, num2) ;
    }
    @GetMapping(path = "/divide")
    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //if (num2 != 0) {
            return num1 + " / " + num2 + " = " + calculateService.calculateDivide(num1, num2);

        /*} else {
            return "Division by 0 is not allow";
        }*/
    }
}

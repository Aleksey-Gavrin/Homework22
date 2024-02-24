package pro.sky.Homework22.calculatorcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework22.calculatorservice.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService service = new CalculatorService();
    @GetMapping()
    public String welcomeUser() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam int x, @RequestParam int y) {
        return x + " + " + y + " = " + service.sum(x, y);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int x, @RequestParam int y) {
        return x + " - " + y + " = " + service.minus(x, y);
    }@GetMapping(path = "/divide")
    public String divide(@RequestParam int x, @RequestParam int y) {
        return x + " / " + y + " = " + service.divide(x, y);
    }@GetMapping(path = "/multiply")
    public String multiply(@RequestParam int x, @RequestParam int y) {
        return x + " * " + y + " = " + service.multiply(x, y);
    }
}

package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calc calculator;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("the result is " + calculator.sum(1, 2));
    }
}
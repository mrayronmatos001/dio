package main.java.dio.classs;

import org.springframwork.boot.CommandLineRunner;

import main.java.dio.classs.model.User;
import main.java.dio.classs.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("GlEYDSON");
        user.setUsername("glysns");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}

package dio.classs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import dio.classs.model.User;
import dio.classs.repository.UserRepository;

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

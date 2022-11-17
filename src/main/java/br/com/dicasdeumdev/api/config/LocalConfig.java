package br.com.dicasdeumdev.api.config;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserReposity reposity;
    @Bean
    public void startDB() {
        User u1 = new User(null, "Manoel","manoel@gmail.com","123");
        User u2 = new User(null , "Aline","aline@gmail.com","123");

        reposity.saveAll(List.of(u1, u2));
    }
}

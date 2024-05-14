package utilities;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class RandomUser {
//Password: must contain 1 uppercase, 1 number
    private final Faker faker = new Faker();

    String username;
    String email;
    String password;

    public RandomUser () {
        this.username = faker.pokemon().name();
        this.email = faker.internet().emailAddress();
        this.password = "L" + faker.internet().password(true);
    }
}

package utilities;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class RandomContent {

    private final Faker faker = new Faker();

    public String postTitle;
    public String postContent;

    public RandomContent () {
        this.postTitle = faker.lorem().sentence(5);
        this.postContent = faker.lorem().paragraph(20);
    }

}

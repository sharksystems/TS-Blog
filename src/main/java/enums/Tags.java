package enums;

import lombok.Getter;

@Getter
public enum Tags {

    UNCATEGORIZED("Uncategorized"),
    LIFESTYLE("Lifestyle"),
    HOLIDAYS("Holidays"),
    FOOD("Food");

    private final String name;
    Tags(String name) {
        this.name = name;
    }
}

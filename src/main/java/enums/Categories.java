package enums;

import lombok.Getter;

@Getter
public enum Categories {

    UNCATEGORIZED("Uncategorized"),
    LIFESTYLE("Lifestyle"),
    HOLIDAYS("Holidays"),
    FOOD("Food");

    private final String name;
    Categories(String name) {
        this.name = name;
    }
}

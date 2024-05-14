package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Tags {

    UNCATEGORIZED("Uncategorized"),
    LIFESTYLE("Lifestyle"),
    HOLIDAYS("Holidays"),
    FOOD("Food");

    private final String name;
}

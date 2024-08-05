package lld.drinkmachine;

import org.omg.DynamicAny.DynEnumHelper;

public enum Drinks {
    COFFEE("MEDIUM", "MEDIUM"),
    TEA("SMALL", "SMALL"),
    MILKSHAKE("LARGE", "LARGE");

    private final String size;
    private final String sugar;

    Drinks(String size, String sugar) {
        this.size = size;
        this.sugar = sugar;
    }

    public static Drinks forValue(String value){
        return Enum
    }

}



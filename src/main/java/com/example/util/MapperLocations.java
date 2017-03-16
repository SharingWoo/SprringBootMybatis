package com.example.util;

/**
 * Created by SharingWoo on 2017/3/15.
 */
public class MapperLocations {

    public enum Type {
        BS, HOME,SHARING
    }

    private transient Type type;
    private transient String[] locations;

    public MapperLocations(final String... locations) {
        this(Type.BS, locations);
    }

    public MapperLocations(final Type type, final String... locations) {
        this.type = type;
        this.locations = locations;
    }

    public String[] getLocations(final Type type) {
        return this.type.equals(type) ? locations : new String[]{};
    }

}

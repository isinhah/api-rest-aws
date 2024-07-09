package com.spring.api_rest.mapper;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private static org.modelmapper.ModelMapper mapper = new org.modelmapper.ModelMapper();

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
        List<D> destionationObjects = new ArrayList<>();
        for (O o : origin) {
            destionationObjects.add(mapper.map(o, destination));
        }
        return destionationObjects;
    }
}

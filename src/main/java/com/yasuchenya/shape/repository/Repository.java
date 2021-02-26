package com.yasuchenya.shape.repository;

import com.yasuchenya.shape.entity.AbstractShape;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository {
    private List<AbstractShape> items;

    public boolean add(AbstractShape item){
        return items.add(item);
    }

    public AbstractShape get(int index){
        return items.get(index);
    }

    public AbstractShape set(int index, AbstractShape element){
        return items.set(index, element);
    }

    public List<AbstractShape> query(Specification specification){
        List<AbstractShape> list = items.stream().filter(o -> specification.specify(o)).collect(Collectors.toList());
        return list;
    }
}

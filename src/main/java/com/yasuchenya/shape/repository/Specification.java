package com.yasuchenya.shape.repository;

import com.yasuchenya.shape.entity.AbstractShape;

public interface Specification {
    boolean specify(AbstractShape shape);
}

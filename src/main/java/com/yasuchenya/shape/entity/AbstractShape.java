package com.yasuchenya.shape.entity;

import java.util.UUID;

public abstract class AbstractShape {
    private UUID id;

    public AbstractShape(){
        id = UUID.randomUUID();
    }

    public UUID getId(){
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public int hashCode(){
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + id.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        AbstractShape temp = (AbstractShape) o;

        return o != null && o.getClass() == getClass() && id.equals(temp.id);
    }

    @Override
    public String toString(){
        return "AbstractShape:" +
                "id=" + id;
    }
}

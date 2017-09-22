package com.company;

public class Pair<T extends Number> {
    private T field1;
    private T field2;

    public void setField1(T field1) {

        this.field1 = field1;
    }
    public void setField2(T field2) {
        this.field2 = field2;
    }

    public T getField1() {

        return field1;
    }
    public T getField2() {

        return field2;
    }

    public Number plus(T obj1, T obj2){

        this.field1 = obj1;
        this.field2 = obj2;

        return ((Double)this.field1 + (Integer)this.field2);
    }

    public Number minus(T obj1, T obj2){

        this.field1 = obj1;
        this.field2 = obj2;

        return ((Double)this.field1 - (Integer)this.field2);
    }

    public Number multiply(T obj1, T obj2){

        this.field1 = obj1;
        this.field2 = obj2;

        return ((Double)this.field1 * (Integer)this.field2);
    }

    public Number divide(T obj1, T obj2){

        this.field1 = obj1;
        this.field2 = obj2;

        return ((Double)this.field1 % (Integer)this.field2);
    }
}

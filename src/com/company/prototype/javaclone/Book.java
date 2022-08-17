package com.company.prototype.javaclone;

public class Book implements Cloneable{

    private int id;

    public Book(int id) {
        this.id = id;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}

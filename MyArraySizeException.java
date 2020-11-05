package ru.homework2;

public class MyArraySizeException extends Exception{

   private final int length;

    public MyArraySizeException(String s, int length) {
        super(s);
        this.length = length;
    }

    @Override
    public String getMessage() {

        return super.getMessage() + " Размер массива: " + length;
    }

    @Override
    public int hashCode() {

        return 1;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Exception) {
            return getMessage().equals(((Exception) c).getMessage());
        }
        return false;
    }
}

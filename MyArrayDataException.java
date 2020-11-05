package ru.homework2;

public class MyArrayDataException extends Exception {

    private final int x;
    private final int y;
    private final String value;

    public MyArrayDataException(String message, String value, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
        this.value = value;
    }

    @Override
    public String getMessage() {

        return super.getMessage() + String.format(" value[%s][%s]=%s", x, y, value);
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

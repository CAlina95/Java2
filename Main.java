package ru.homework2;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
*/
public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"38", "92", "63", "44"},
                {"50", "26", "17", "98"},
                {"19", "100", "8", "126"},
                {"15", "50", "69", "70"}
        };

        try {
            int sum = Sum(arr);
            System.out.println("Сумма: " + sum);
        } catch (MyArraySizeException exception) {
            System.out.println("Проблема размера массива: " + exception.getMessage());
        } catch (MyArrayDataException exception) {
            System.out.println("Неверные данные: " + exception.getMessage());
        }
    }


    private static int Sum(String[][] data)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        if (data.length != 4) throw new MyArraySizeException("Неверныи размер массива: ", data.length);

       for (int x = 0; x < data.length; x++) {
            String[] v = data[x];
            for (int y = 0; y < v.length; y++) {
                if (v.length != 4)
                    throw new MyArraySizeException("Неверныи размер массива: ", data.length);

                try {
                    sum += Integer.parseInt(v[y]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("Неверное значение: ", v[y], x, y);
                }
            }

        }
        return sum;
    }
}

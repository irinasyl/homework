package Lesson2;

public class MainClass {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"},
                {"5", "w", "7", "8"},
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "9"}};
        try {
            System.out.println(arraySum(array1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int arraySum(String[][] array1) throws MyArraySizeException, MyArrayDataException {

        if (array1.length != 4)
            throw new MyArraySizeException ("Invalid size of array");
        if (array1[0].length !=4)
            throw new MyArraySizeException("Invalid size of array");

        int sum = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array1[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException ("Wrong element in [" + i  + "][" + j+"]");
                    }
                }
            }

        return sum;
    }
}

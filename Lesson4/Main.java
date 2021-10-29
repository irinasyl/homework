package Lesson4;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet <String> stringLinkedHashSet = new LinkedHashSet<>(Arrays.asList
                    ("Яблоко","Апельсин","Мандарин",
                    "Банан","Мандарин","Арбуз",
                    "Дыня","Груша","Яблоко","Арбуз"));
        System.out.println(stringLinkedHashSet);
    }
}
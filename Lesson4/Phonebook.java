package Lesson4;

import java.util.HashMap;

public class Phonebook {
    public static void main(String[] args) {
    HashMap<String,String> contacts = new HashMap<>();
    contacts.put("Александров", "+79999909090");
    contacts.put("Иванов","+79999909091");
    contacts.put("Сидоров","+79999909092");
    contacts.put("Иванов","+79999909093");
    contacts.put("Васильев","+79999909094");
    contacts.put("Шмидт","+79999909095");

        System.out.println(contacts.get("Иванов"));


    }


}

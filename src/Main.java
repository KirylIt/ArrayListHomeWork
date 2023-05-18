import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Необходимо создать ArrayList из целых чисел.
        // Затем следует перебрать коллекцию, если число чётное, добавить его в список с чётными числами,
        // если нечетное - в список с нечётными числами соответственно.
        // Вывести оба списка на экран, использовать метод для нахождения числа элементов в списке и сравнить, какой список больше.
        List <Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(0,3);
        listOfInteger.add(1,5);
        listOfInteger.add(2,7);
        listOfInteger.add(3,8);
        listOfInteger.add(4,10);
        listOfInteger.add(5,11);
        listOfInteger.add(6,15);
        listOfInteger.add(7,4);

        List <Integer> listChet = new ArrayList<>();
        List <Integer> listNeChet = new ArrayList<>();
        int count = 0;
        int count1 = 0;

        for (int i : listOfInteger) {
            if (i%2==0){
                listChet.add(i);
                count++;
            }else {
                listNeChet.add(i);
                count1++;
            }
        }

        System.out.println("ArrayList: " + Arrays.toString(listOfInteger.toArray()));
        System.out.println();
        System.out.println("Четные числа: " + Arrays.toString(listChet.toArray()) + " Количество :" + count);
        System.out.println("Нечетные числа: " + Arrays.toString(listNeChet.toArray()) + " Количество :" + count1);

        if (count>count1){
            System.out.println("Четных чисел больше");
        }else if (count1>count) {
            System.out.println("Нечетных чисел больше");
        }else
            System.out.println("Четных и нечетных поравну");


    }
}
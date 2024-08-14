package com.ivanalimin;

import java.util.HashMap;
import java.util.Map;

/*
Напишите метод, который получает на вход массив элементов и возвращает Map ключи в котором - элементы,
а значения - сколько раз встретился этот элемент
 */
public class App {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Privet", "Kak dela", "Hello World", "Hello", "World", "Hello"};
        System.out.println(countOfElements(strings));
    }

    public static <T> Map<T, Integer> countOfElements(T[] array) {
        Map<T, Integer> countOfElements = new HashMap<>();
        for (T element : array) {
            countOfElements.merge(element, 1, Integer::sum);
        }
        return countOfElements;
    }
}

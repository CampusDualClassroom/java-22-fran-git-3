package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    // Método que crea y devuelve una lista de tipo ArrayList
    public static List<String> createArrayList() {
        List<String> list = new ArrayList<>();
        // Poblando la lista con elementos
        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");
        return list;
    }

    // Método para añadir un nuevo elemento a la lista
    public static boolean addElementToList(List<String> list, String element) {
        return list.add(element); // Añadir el elemento y devolver el resultado
    }

    // Método que recorre la lista y muestra los elementos y sus índices
    public static void printElementsAndIndex(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", Element: " + list.get(i));
        }
    }

    public static void main(String[] args) {
        // Crear y poblar la lista
        List<String> myList = createArrayList();

        // Añadir un nuevo elemento
        String newElement = "AAAAA";
        boolean isAdded = addElementToList(myList, newElement);
        System.out.println("Element added: " + newElement + " | Success: " + isAdded);

        // Imprimir los elementos y sus índices
        printElementsAndIndex(myList);
    }
}

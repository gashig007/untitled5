package com.company;

public class Main {

    public static void main (String[] args) {
        String[] phones = {"Nokia", "Samsung", "Iphone"};
        for (int i = 0; i < phones.length; i++) {
            System.out.println(createObject("Nokia"));
            System.out.println(createObject("Samsung"));
            System.out.println(createObject("Iphone"));
            break;
        }
    }

    public static String createObject(String className){
        Nokia nokia = new Nokia("Good");
        Samsung samsung = new Samsung("Samsung x6");
        Iphone iphone = new Iphone("Iphone x10pro");
        switch (className){
            case "Nokia":
                return "Nokia: " + nokia.print();
            case "Samsung":
                return "Samsung: " + samsung.print();
            case "Iphone":
                return "Iphone: " + iphone.print();
        }
        return className;

    }
}

package Generyki;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        GenericType<Integer> obj1 = new GenericType<>(123);
        GenericType<String> obj2 = new GenericType<>("Hello");

        Cake cake = new Cake();
        Box<Cake> box = new Box<>();
        box.put(cake);

        GenericType obj3 = new GenericType("H");
        System.out.println();

        NonGenericClass instance = new NonGenericClass("Hello");
        String str = (String)instance.get();
        Object obj = instance.get();
        //ok System.out.println(str);
        //ok System.out.println(obj);
    }
}

class Cake { }

class Pie { }

class Tart { }
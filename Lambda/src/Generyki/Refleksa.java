package Generyki;

public class Refleksa {

    public static <T> T method(T t) throws Exception{
        return (T) t.getClass().newInstance(); //jak widac nie powinno sie tak robic
    }

    public static void main(String[] args) {

    }
}

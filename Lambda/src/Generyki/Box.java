package Generyki;

class Box<T> {

    private T t;

//    public Box(T t) {
//        this.t = t;
//    }

    public void put(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

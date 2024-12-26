package task3;

public interface Transformation<T, R> {

    public abstract R transformer(T t);
}

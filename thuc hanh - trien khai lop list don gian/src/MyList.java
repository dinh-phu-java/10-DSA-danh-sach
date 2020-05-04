import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private int size=0;
    private int DEFAULT_CAPACITY=2;
    private T[] element;

    public MyList(){
        this.element = (T[]) new Object[this.size];
    }

    public void add(T e) throws Exception {
        if(this.size <DEFAULT_CAPACITY){
            this.element[size++]=e;
        }else{
           this.ensureCap(10);
           this.add(e);
        }
    }

    public void ensureCap(int newCapacity){
        this.DEFAULT_CAPACITY+=newCapacity;
        this.element= Arrays.copyOf(this.element,this.DEFAULT_CAPACITY);
    }

    public T get(int index) throws Exception {
        if(index >= 0 && index < this.size){
            return this.element[index];
        }else{
            throw new Exception("Can't get element");
        }
    }

    public int getSize(){
        return this.size;
    }
    public int getDEFAULT_CAPACITY(){
        return this.DEFAULT_CAPACITY;
    }

}

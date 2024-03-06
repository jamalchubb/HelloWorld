package Notes;

public class Generics <T extends Comparable<T>> {
    public T data;

    public Generics(T data){
        this.data = data;
    }
    
    public <E>  void print(E value){
        System.out.println(value);
    }

    public void print(E value){
        System.out.println(value);
    }

    public static void main(String[] args) throws Exception{

        System.out.println("Hello World!");
        
    }
}

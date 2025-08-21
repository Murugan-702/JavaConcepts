 // Different Types of Method Refereneces
import java.util.function.*;
class Dog{
    private String name;
    Dog(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void print(){
        System.out.println(name);
    }
}
public class Main{
    public static int findElement(int arr[] , int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                return i;
            }
        }
            return -1;
    }
    public static void main(String[] args){
        // Static Methods With Two Arguments and One Argumennts Return Type
        
        Function<String,Integer>findLen = String::length;
        System.out.println(findLen.apply("Hello"));
        BiFunction<int[],Integer,Integer>searchElement = Main::findElement;
        System.out.println(searchElement.apply(new int[]{1,2,3,4},4));
        Dog obj = new Dog("jack");
        
        // No Arguments and Return Type 
        
        Supplier<String>findName = obj::getName;
        System.out.println(findName.get());
        
        // No Args and No Return Type 
        Runnable x = obj::print;
        x.run();
        
        
        
    }
}

                     // STREAMS PRACTICE -01
import java.util.*;
import java.util.stream.*;
class Main{
    public static void main(String[] args){
        List<Integer>arr = List.of(12,2,13,24,2,3,5);
        
        // Taking Streams from Collections
        Stream<Integer>stream = arr.stream();
        
        // Exerciese 01 : Skip the 3 elements and print
        arr.stream().skip(3).forEach(x->System.out.print(x+" "));
        System.out.println();
        
        //Exercise 02 : Sort the based on natrutal Ordering
        arr.stream().sorted().forEach((x)->System.out.print(x+" "));
        System.out.println();
        
        // Exercise 03: Limit the first 2 elements 
        arr.stream().limit(2).forEach((x)->System.out.print(x+" "));
        System.out.println();
        
        //Exercise 04 : Distinct Elements 
        arr.stream().distinct().sorted().forEach((x)->System.out.print(x+" "));
        
        
        
    }
}

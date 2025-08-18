import java.util.*;

  
class CustomArray<T> {
     private T[] array;
     // Giving Fixed Size
     @SuppressWarnings("unchecked")
     public CustomArray(int n){
        array =(T[]) new Object[n];
     }
     public T get(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= array.length){
             throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        return array[index]; 
     }
     public void put(int index , T element) throws ArrayIndexOutOfBoundsException{
         if(index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index out of range");
         }
         array[index] = element;
     }
     public void print(){
        for(T ele:array){
             System.out.print(ele+" ");
        }
              
        System.out.println();
     }

 }          
          

    

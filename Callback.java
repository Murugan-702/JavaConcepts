import java.util.*;
interface Processer{
    public void start();
    public void run();
    public void stop();
}
class Main{
    public static void getProcess(Processer process){
        process.start();
        process.run();
        process.stop();
    }
    public static void processData(){
        getProcess(new Processer(){
            @Override
            public void start(){
                System.out.println("Process Started");
            }
            @Override
            public void run(){
                System.out.println("Process is Running!!!");
            }
            @Override
            public void stop(){
                System.out.println("Process is Stopping!!!");
            }
            
        });
    }
    public static void main(String[] args){
      processData();
      
    }
}


/* Expalin about java.lang.Object*/
class Person implements Cloneable{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int hashCode(){
        return name.hashCode()+Integer.hashCode(age);
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Person){
            Person person = (Person)obj;// downcasted to subclass
            return person.name.equals(this.name) && person.age == this.age;
        }
        return false;
    }
    public String toString(){
        return "The Person name is "+name+" and his age is "+age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p1 = new Person("Ramesh",25);
        Person p2 = new Person("Ramesh",25);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        Person p3 = (Person)p1.clone();
        System.out.println(p3);
        System.out.println(p1==p3);
        System.out.println(p1.equals(p2));
        
    }
}

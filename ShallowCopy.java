// Illustrating Shallow Copy
class Address{
    String street;
    String city;
    String state;
    String country;
    Address(String street,String city,String state,String country){
        this.city = city;
        this.street = street;
        this.country = country;
        this.state = state;
    }
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Address){
            Address address = (Address)obj;
            return address.city.equals(this.city) && address.street.equals(this.street) && address.state.equals(this.state) && address.country.equals(this.country);
        }
        return false;
    }
    public int hashCode(){
        return street.hashCode()+city.hashCode()+state.hashCode()+country.hashCode();
    }
    public String toString(){
        String message = "Street : "+street+"\n City: "+city+"\n State: "+state+"\n Country : "+country+"\n";
        return message;
    }
}
class Person implements Cloneable{
    String name;
    int age;
    Address address;
    Person(String name,int age,Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    
    @Override
    public int hashCode(){
        return name.hashCode()+Integer.hashCode(age)+address.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Person){
            Person person = (Person)obj;// downcasted to subclass
            return person.name.equals(this.name) && person.age == this.age && address.equals(this.address);
        }
        return false;
    }
    public String toString(){
        return "The Person name is "+name+" and his age is "+age+"\n"+address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p1 = new Person("Ramesh",25,new Address("street-01","city-01","state-01","country-01"));
        Person p2 = new Person("Ramesh",25,new Address("street-01","city-01","state-01","country-01"));
        System.out.println(p1.equals(p2));
        // Shallow Copy
        Person p3 = (Person)p1.clone();
        System.out.println(p3);
        System.out.println(p1.equals(p3));
        System.out.println(p1 == p3);
        p1.address.street = "street-03";
        System.out.println(p3);
        
        
    }
}

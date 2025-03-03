class Person implements Cloneable{
    String name;
    int age;
    String gender;
    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // public void display(){
    //     System.out.println("Name = " + this.name + "\nAge = "+this.age + "\nGender = " +this.gender);
    //     System.out.println();
    // }
    @Override
    public Object clone(){  
        try{  
            return super.clone();  
        }catch(CloneNotSupportedException e){ 
            return null; 
        }
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return this.age == p.age;
    }

    @Override
    public String toString() {
        
        return "Name = " + this.name + "\nAge = "+this.age + "\nGender = " +this.gender;
    }   

    
}


public class PersonDriver {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p1 = new Person("Sunny", 32, "Male");
        
        System.out.println(p1); // Person@fd4565465
        
        
        Person p2 = new Person("Raja", 32, "Male");

        System.out.println(p1.getClass().getName()); // Class Person
        System.out.println(Integer.toHexString(p1.hashCode())); 
        if(p1.equals(p2)){
            System.out.println("Both objects are same");
        }
        else{
            System.out.println("Both objects are not same");
        }
        

        Person p = (Person)p1.clone();
        System.out.println(p);

        p.name = "Raja";
        System.out.println(p);
        System.out.println(p1);
        
    }
}


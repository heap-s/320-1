public class Children{
    private String name;
    private int age;

    public Children(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void printDetails(){
        System.out.println("Name: " + name + " Age: " + age);
    }
    public static void main(String[] args){
        Children child1 = new Children("John", 5);
        Children child2 = new Children("Jane", 7);
        Children child3 = new Children("Jack", 9);

        child1.printDetails();
        child2.printDetails();
        child3.printDetails();
}
    
}


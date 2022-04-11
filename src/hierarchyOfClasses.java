public class hierarchyOfClasses {
    public static void main(String[] args) {

        Person joji = new Person("Joji");
        joji.display();
        Person sarah = new Employee("Sarah", "Meta");
        sarah.display();
        Person bill = new Programmer("Bill", "Miscrosofy","Java");
        bill.display();

        Phone first = new Phone("Samsung");
        first.display();
        Phone second = new MobilePhone("Samsung", 2);
        second.display();
        Phone third = new SamsungPhone("Samsung", 1,"A21");
        third.display();
    }
}
// класс человека
class Person {
    private String name;
    public String getName() { return name; }
    public Person(String name){
        this.name=name;
    }
    public void display(){
        System.out.printf("Main Person %s \n", name);
    }
}
class Employee extends Person{
    private String company;
    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    public String getCompany(){ return company; }
    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}

// служащий некоторой компании
class Programmer extends Employee{
    private String language;
    public Programmer(String name, String company, String language) {
        super(name, company);
        this.language = language;
    }
    public String getLanguage(){ return language; }
    public void display(){
        System.out.printf("Programmer %s works in %s and knows %s \n", super.getName(), super.getCompany(), language);
    }
}
// second Hierarchy
class Phone{
    private String brand;
    public String getBrand() {return brand;}
    public  Phone(String brand){this.brand = brand;}
    public void display() {
        System.out.printf("The brand %s \n", brand );
    }
}

class MobilePhone extends Phone{
    private int NumberOfSim;
    public MobilePhone(String brand, int NumberOfSim) {
        super(brand);
        this.NumberOfSim = NumberOfSim;
    }
    public int getNumberOfSim() {return NumberOfSim;}
    public void display(){
        System.out.printf("Phone brand %s has %o SIM-card/-s \n", super.getBrand(), NumberOfSim);
    }
}
 class SamsungPhone extends MobilePhone{
    private String model;
    public SamsungPhone(String brand, int NumberOfSim, String model)
    {
        super(brand, NumberOfSim);
        this.model = model;
    }
    public String getModel() {return model;}
     public void display(){
        System.out.printf("Phone brand %s has %o SIM-card/-s and model is %s \n", super.getBrand(), super.getNumberOfSim(), model);
     }

 }

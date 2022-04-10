public class hierarchyOfClasses {
    public static void main(String[] args) {

        Person joji = new Person("Joji");
        joji.display();
        Person sarah = new Employee("Sarah", "Meta");
        sarah.display();
        Person bill = new Programmer("Bill", "Miscrosofy","Java");
        bill.display();
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
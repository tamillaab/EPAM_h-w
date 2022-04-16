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

        PersonHospital Jack = new PersonHospital("Jack Smith", 35, "male");
        Jack.display();
        PersonHospital JackWorker = new Worker("Jack Smith", 35, "male", 205, 50000, 7);
        JackWorker.display();
        PersonHospital JackDoctor = new Doctor("Jack Smith", 35, "male", 205, 50000, 7, "Dermatology", 4545, "second");
        JackDoctor.display();
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
        System.out.printf("Phone brand %s has %d SIM-card/-s \n", super.getBrand(), NumberOfSim);
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
        System.out.printf("Phone brand %s has %d SIM-card/-s and model is %s \n", super.getBrand(), super.getNumberOfSim(), model);
     }
 }

     class PersonHospital {
         private String FIO;
         private int ageHosp;
         private String sex;
         public  PersonHospital(String FIO, int ageHosp, String sex){
             this.FIO = FIO;
             this.ageHosp = ageHosp;
             this.sex = sex;
         }
         public String getFIO() { return FIO;}
         public int getAgeHosp() { return ageHosp;}
         public String getSex() { return sex;}
         public void display(){
             System.out.printf("Person's FIO is%s and %d y.o., sex is %s,  \n", FIO, ageHosp, sex);
         }
     }

     class Worker extends PersonHospital{
        private int numberOfWorker;
        private int salary;
        private int workExperience;
        public Worker(String FIO, int ageHosp, String sex, int numberOfWorker, int salary, int workExperience){
            super(FIO, ageHosp, sex);
            this.numberOfWorker = numberOfWorker;
            this.salary = salary;
            this.workExperience = workExperience;
         }
         public int getNumberOfWorker() { return numberOfWorker;}
         public int getSalary() { return salary;}
         public int getWorkExperience() { return workExperience;}
         public void display(){
             System.out.printf("Person's FIO is %s and %d y.o., sex is %s. %s as worker has number %d, salary %d, workExperience in %d ages  \n", super.getFIO(), super.getAgeHosp(), super.getSex(), super.getFIO(), numberOfWorker, salary, workExperience);

         }
     }

     class Doctor extends Worker{
        private String specialization;
        private int numberOfPatient;
        private String category;
        public  Doctor(String FIO, int ageHosp, String sex, int numberOfWorker, int salary, int workExperience, String specialization, int numberOfPatient, String category){
            super(FIO, ageHosp, sex, numberOfWorker, salary, workExperience);
            this.specialization = specialization;
            this.numberOfPatient = numberOfPatient;
            this.category = category;
        }
         public void display(){
             System.out.printf("Person's FIO is%s and %d y.o., sex is %s. %s as worker has number %d, salary %d, workExperience in %d ages. Specialization of doctor is %s, this doctor's patient's number is %o, and category is %s \n", super.getFIO(), super.getAgeHosp(), super.getSex(), super.getFIO(), super.getNumberOfWorker(), super.getSalary(), super.getWorkExperience(), specialization, numberOfPatient, category);

         }
     }
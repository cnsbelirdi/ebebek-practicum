public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary > 1000){
            double tax = this.salary * 0.03;
            this.salary -= tax;
            System.out.println("Total tax => " + tax + " TL");
        }
    }

    public void bonus(){
        if(this.workHours > 40){
            int bonus = (this.workHours - 40) * 30;
            this.salary += bonus;
            System.out.println("Total bonus => " + bonus + " TL");
        }
    }

    public void raiseSalary(){
        int year = 2021 - this.hireYear;
        bonus();
        tax();
        if(year < 10){
            this.salary += this.salary * 0.05;
        }
        if( year > 9 && year < 20){
            this.salary += this.salary * 0.1;
        }
        if( year > 19){
            this.salary += this.salary * 0.15;
        }
        System.out.println("New Salary => " + this.salary);
    }

    public String toString(){
        System.out.println("-----EMPLOYEE-----");
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hours : " + this.workHours);
        System.out.println("Hired Year : " + this.hireYear);
        return null;
    }
}

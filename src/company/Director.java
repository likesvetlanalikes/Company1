package company;

import java.util.Arrays;

public class Director extends Employeer {


    public Director(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.DIRECTOR;
    }

    public void addworker(Employeer employee) {
        if (employees == null) {
            employees = new Employeer[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public int getSalary() {
        if (employees == null) return super.getSalary();
        else {
            return super.getSalary() + (employees.length * 100);
        }

    }

    @Override
    public String toString() {
        return "Director{" +
                "profession=" + profession +
                ", salary = " + getSalary() +
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}

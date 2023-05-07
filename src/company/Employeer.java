package company;

import java.util.Arrays;

public abstract class Employeer extends Person {

    private int exp;
    protected PROFESSION profession;
    private final int basic = 1000;

    Employeer[] employees;

    public void addWorker(Employeer employeer){
        if(employees == null) {
            employees = new Employeer[1];
            employees[0] = employeer;
        }else
        {
            employees = Arrays.copyOf(employees, employees.length +1);
                employees[employees.length -1] = employeer;
        }
    }
    public Employeer (String name, String surname, int exp) {
        super(name, surname);
        this.exp = exp;
        setProfession();
    }

    public int getSalary() {
        return basic * profession.getKoef() * exp;
    }

    public abstract void setProfession();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", exp=" + exp +
                ", profession=" + profession +
                ", salary=" + getSalary() +
                '}';
    }

    protected int getSalary(int i) {
        return 0;
    }

    public abstract Employeer[] getEmployeers();
}

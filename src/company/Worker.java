package company;

import java.util.Arrays;

public class Worker extends Employeer {

    public Worker(String name, String surname, int exp) {
        super(name, surname, exp);
        System.out.println("Это воркер");
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.WORKER;
    }

    @Override
    public void addWorker(Employeer employeer) {
        if (employeer.profession.equals(PROFESSION.TRAINEE)) {
            super.addWorker(employeer);
        } else {
            System.out.println("Можно привязать только стажеров");
        }
    }

    @Override
    public int getSalary() {
        if (employees == null) {
            return super.getSalary();
        } else {
            return super.getSalary(+(employees.length * 50));
        }

    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession=" + profession +
                ", salary = " + getSalary() +
                " employees=" + Arrays.toString(employees) +
                '}';
    }

    @Override
    public Employeer[] getEmployeers() {
        return new Employeer[0];
    }
}

package company;

public class Worker extends Employee{

    public Worker(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.WORKER;
    }
}

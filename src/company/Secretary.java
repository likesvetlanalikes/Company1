package company;

public class Secretary extends Employee{

    public Secretary(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.WORKER;
    }
}

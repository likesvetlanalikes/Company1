package company;

public class Secretary extends Employeer{

    public Secretary(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.WORKER;
    }

    @Override
    public Employeer[] getEmployeers() {
        return new Employeer[0];
    }
}

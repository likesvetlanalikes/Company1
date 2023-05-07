package company;

public class Trainee extends Employeer{
    public Trainee(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.TRAINEE;
    }

    @Override
    public Employeer[] getEmployeers() {
        return new Employeer[0];
    }
}

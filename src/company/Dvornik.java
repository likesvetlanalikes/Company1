package company;

public class Dvornik extends Worker{

    @Override
    public void setProfession() {
        super.setProfession();
    }

    public Dvornik(String name, String surname, int exp) {

        super(name, surname, exp);
    }

    @Override
    public int getSalary() {
        return 1100;
    }
}

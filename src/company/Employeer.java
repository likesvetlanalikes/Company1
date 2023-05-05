package company;

public abstract class Employee extends Person {

    private int exp;
    protected PROFESSION profession;
    private final int basic = 1000;

    public Employee(String name, String surname, int exp) {
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
}

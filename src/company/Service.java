package company;

public class Service implements FindeInterface{

    public boolean finde(Employeer employeer, String name){
        Employeer[] employeers = employeer.getEmployeers();
        for (Employeer empl : employeers){
            String emplName = empl.name;
            if(emplName.equals(name)) {
                return true;
            }
        }return false;
    }
}

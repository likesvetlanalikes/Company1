import company.*;
import company.Employeer;

public class Main {
    public static void main(String[] args) {

        Employeer worker1 = new Worker("W1", "WS1", 1);
        Employeer worker2 = new Worker("W2", "WS2", 2);
        Employeer worker3 = new Worker("W3", "WS3", 3);
        Employeer worker4 = new Worker("W4", "WS4", 4);
        Employeer worker5 = new Secretary("S5", "SS5", 1);
        Employeer trainee1 = new Trainee("T1", "TS1", 1);
        Employeer dvornik = new Dvornik("D1", "DS1", 2);

        Employeer director1 = new Director("D1", "DS1", 1);
        Employeer director2 = new Director("D2", "DS1", 2);


        ((Director)director1).addworker(worker1);
        ((Director)director1).addworker(worker2);
        ((Director)director1).addworker(worker3);

        ((Director)director2).addworker(worker4);

        ((Director)director1).addworker(director2);

         worker1.addWorker(trainee1);

        System.out.println(director1);

    }
}
package company;

public enum PROFESSION {
    WORKER(2),

    TRAINEE(1),
    DIRECTOR(3);

    private int koef;

    PROFESSION(int koef) {
        this.koef = koef;
    }

    public int getKoef() {
        return koef;
    }
}


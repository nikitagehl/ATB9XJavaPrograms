package Task.Nov.ex_08_nov;

public class ATB {

    String name;
    int id;
    boolean is_fees;


    public ATB(String name, int id, boolean is_fees) {
        this.name = name;
        this.id = id;
        this.is_fees = is_fees;
    }

    @Override
    public String toString() {
        return "StudentATB [name=" + this.name + ", id=" + this.id + "]";
    }
}

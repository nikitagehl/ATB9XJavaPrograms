package Nov.ex_21_nov_linkedList_realex;

public class Students {

    private String name;
    private Integer rol_no;

    public Students(String name, Integer rol_no) {
        this.name = name;
        this.rol_no = rol_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRol_no() {
        return rol_no;
    }

    public void setRol_no(Integer rol_no) {
        this.rol_no = rol_no;
    }


    public  void pritDetails(){
        System.out.println("name of studnts : "+ this.name);
        System.out.println("roll_num :"+ this.rol_no);
    }
}

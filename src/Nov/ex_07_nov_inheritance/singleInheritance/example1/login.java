package Nov.ex_07_nov_inheritance.singleInheritance.example1;

public class login {

    int login_id;
    String token;

    int login( int id, String tkn){



        this.login_id=id;
        this.token= tkn;
        if(this.login_id>0 && this.token=="jwt"){
        System.out.println("successfull login...");
        }
        else System.out.println(" sorrry .....");
        return id;
    }


}

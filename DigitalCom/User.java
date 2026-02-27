package Day1.DigitalCom;

public class User implements IValidate {
    String userid;
    String password;

    void addUser(String userid,String password){
        this.userid=userid;
        this.password=password;
    }
    @Override
    public boolean IsAuthenticated(String userid,String password){
        if(this.userid.equalsIgnoreCase(userid) && this.password.equalsIgnoreCase(password)){
            return true;
        }
        return false;
    }
}

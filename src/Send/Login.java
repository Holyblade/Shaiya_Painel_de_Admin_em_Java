package Send;
public class Login {
    public Login(){
        
    }
    
    public Login(String Username, String Pw){
        this.Username = Username;
        this.Pw = Pw;
    }
    private int AdminLevel;
    private String Username;
    private String Pw;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPw() {
        return Pw;
    }

    public void setPw(String Pw) {
        this.Pw = Pw;
    }


    public int getAdminLevel() {
        return AdminLevel;
    }

    public void setAdminLevel(int AdminLevel) {
        this.AdminLevel = AdminLevel;
    }
}

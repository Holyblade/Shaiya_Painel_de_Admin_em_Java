/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
public class Dados {

    public Dados(String IPDatabase, String Databasename, String Databasepassword) {
        this.IPDatabase = IPDatabase;
        this.Databasename = Databasename;
        this.Databasepassword = Databasepassword;
    }

    public Dados() {
    }
    private String IPDatabase;
    private String Databasename;
    private String Databasepassword;

    /**
     * @return the IPDatabase
     */
    public String getIPDatabase() {
        return IPDatabase;
    }

    /**
     * @param IPDatabase the IPDatabase to set
     */
    public void setIPDatabase(String IPDatabase) {
        this.IPDatabase = IPDatabase;
    }

    /**
     * @return the Databasename
     */
    public String getDatabasename() {
        return Databasename;
    }

    /**
     * @param Databasename the Databasename to set
     */
    public void setDatabasename(String Databasename) {
        this.Databasename = Databasename;
    }

    /**
     * @return the Databasepassword
     */
    public String getDatabasepassword() {
        return Databasepassword;
    }

    /**
     * @param Databasepassword the Databasepassword to set
     */
    public void setDatabasepassword(String Databasepassword) {
        this.Databasepassword = Databasepassword;
    }
}

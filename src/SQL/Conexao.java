package SQL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
 
public class Conexao {

    private Connection Conexao;

    public Conexao() throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url = "jdbc:jtds:sqlserver://IPDASUAHOSPEDAGEMCOMAPORTA";
        Conexao = DriverManager.getConnection(url, "SQLUSERNAME", "SALPASSWORD");

    }

    public Connection getConexao() {
        return Conexao;
    }

    public static void Leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void Escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();

    }
}

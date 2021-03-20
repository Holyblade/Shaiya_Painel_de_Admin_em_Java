/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Monster.Monster;
import java.sql.SQLException;
import Send.Enviar;
import java.sql.PreparedStatement;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
public class EnviarData {
    public boolean incluir(Enviar obj) throws SQLException, Exception{
      Conexao con = new Conexao();
      String SQL = "insert into PS_GameData.dbo.UserStoredPointItems values(?,?,?,?,05/03/2016)";
      PreparedStatement ps = con.getConexao().prepareStatement(SQL);
      ps.setString(1, obj.getUserUID());
      ps.setString(2, obj.getSlot());
      ps.setString(3, obj.getItemID());
      ps.setString(4, obj.getQuantidade());
      int registros = ps.executeUpdate();
      if(registros>0){
          return true;
      }else{
          return false;
      }
    }
public boolean MonsterEdit(Monster obj) throws SQLException, Exception{
    Conexao con = new Conexao();
    String SQL = "update PS_GameDefs.dbo.MobItems set Grade=?, DropRate=? where MobID=? and ItemOrder=?";
    PreparedStatement ps = con.getConexao().prepareStatement(SQL);
    ps.setString(1, obj.getG());
    ps.setString(2, obj.getD());
    ps.setString(3, obj.getM());
    ps.setString(4, obj.getI());
    int registros = ps.executeUpdate();
    if(registros>0){
        return true;
    }else{
        return false;
        }
    }
}
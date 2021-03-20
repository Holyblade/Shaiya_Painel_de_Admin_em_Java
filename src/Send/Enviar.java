/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Send;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
public class Enviar {

    public Enviar() {
    }

    public Enviar(String ItemID, String Quantidade, String Slot, String UserUID) {
        this.ItemID = ItemID;
        this.Quantidade = Quantidade;
        this.Slot = Slot;
        this.UserUID = UserUID;
    }
    private String ItemID;
    private String Quantidade;
    private String Slot;
    private String UserUID;

    /**
     * @return the ItemID
     */
    public String getItemID() {
        return ItemID;
    }

    /**
     * @param ItemID the ItemID to set
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * @return the Quantidade
     */
    public String getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the Slot
     */
    public String getSlot() {
        return Slot;
    }

    /**
     * @param Slot the Slot to set
     */
    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

    /**
     * @return the UserUID
     */
    public String getUserUID() {
        return UserUID;
    }

    /**
     * @param UserUID the UserUID to set
     */
    public void setUserUID(String UserUID) {
        this.UserUID = UserUID;
    }
}

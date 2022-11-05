package Finance.ConsumerFinanceSystem.Models;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Carddetails")
@DynamicUpdate
public class CardDetails {
    @Id
    @Column(name="reg_id")
    private long reg_id;
    @Column(name="cardno")
    private int cardno;

    @Column(name="cardtype")
    private String cardtype;
    @Column(name="validity")
    private Date validity;
    @Column(name="initialbal")
    private int initialbal;
    @Column(name="availbal")
    private int availbal;

    public CardDetails() {
    }

    public CardDetails(long reg_id, int cardno, String cardtype, Date validity, int initialbal, int availbal) {
        this.reg_id = reg_id;
        this.cardno = cardno;
        this.cardtype = cardtype;
        this.validity = validity;
        this.initialbal = initialbal;
        this.availbal = availbal;
    }

    public long getReg_id() {
        return reg_id;
    }

    public void setReg_id(long reg_id) {
        this.reg_id = reg_id;
    }

    public int getCardno() {
        return cardno;
    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public int getInitialbal() {
        return initialbal;
    }

    public void setInitialbal(int initialbal) {
        this.initialbal = initialbal;
    }

    public int getAvailbal() {
        return availbal;
    }

    public void setAvailbal(int availbal) {
        this.availbal = availbal;
    }
}

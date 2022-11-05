package Finance.ConsumerFinanceSystem.Models;

import javax.persistence.*;

@Entity
@Table(name="userdetails")
public class RegisteredUser {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "userid_sequence1", allocationSize = 1, name = "CUST_SEQ")

    @Id
    @Column(name = "reg_id")
    private long reg_id;
    private String user_name;
    private Long phone;
    private String email;
    private String user_password;
    private String address;
    private String cardtype;
    private String bankname;
    private long acc_no;
    private String ifsc_code;
    @Column(name="isverified")
    private String isVerified="False";

    public RegisteredUser() {
        super();
    }

    public String getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(String isVerified) {
        this.isVerified = isVerified;
    }

    public long getReg_id() {
        return reg_id;
    }

    public void setReg_id(long reg_id) {
        this.reg_id = reg_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }


    public RegisteredUser(long reg_id, String user_name, long phone, String email, String user_password, String address,
                          String cardtype, String bankname, long acc_no, String ifsc_code)
    {
        super();
        this.reg_id = reg_id;
        this.user_name = user_name;
        this.phone = phone;
        this.email = email;
        this.user_password = user_password;
        this.address = address;
        this.cardtype = cardtype;
        this.bankname = bankname;
        this.acc_no = acc_no;
        this.ifsc_code = ifsc_code;
    }

}

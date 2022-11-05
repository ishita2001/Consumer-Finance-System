package Finance.ConsumerFinanceSystem.Models;


import javax.persistence.*;

@Entity
@Table(name="adminlogin")
public class AdminLogin {

    @Id
    private long adminid;
    private String admin_name;
    private String admin_pass;


    public AdminLogin() {
    }

    public AdminLogin(long adminid, String admin_name, String admin_pass) {
        this.adminid = adminid;
        this.admin_name = admin_name;
        this.admin_pass = admin_pass;
    }

    public long getAdminid() {
        return adminid;
    }

    public void setAdminid(long adminid) {
        this.adminid = adminid;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }


}

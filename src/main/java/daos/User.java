package daos;

public class User {
    private String Rname;
    private Integer Rid;
    private Integer Rage;
    private boolean Rsex;
    private Integer Pid;

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    @Override
    public String toString() {
        return "User{" +
                "Rname='" + Rname + '\'' +
                ", Rid=" + Rid +
                ", Rage=" + Rage +
                ", Rsex=" + Rsex +
                ", Pid=" + Pid +
                '}';
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public Integer getRid() {
        return Rid;
    }

    public void setRid(Integer rid) {
        Rid = rid;
    }

    public Integer getRage() {
        return Rage;
    }

    public void setRage(Integer rage) {
        Rage = rage;
    }

    public boolean isRsex() {
        return Rsex;
    }

    public void setRsex(boolean rsex) {
        Rsex = rsex;
    }
}

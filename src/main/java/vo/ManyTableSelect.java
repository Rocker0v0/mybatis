package vo;

public class ManyTableSelect {
    private Integer Pid;
    private String Pname;
    private String Rname;

    @Override
    public String toString() {
        return "ManyTableSelect{" +
                "Pid=" + Pid +
                ", Pname='" + Pname + '\'' +
                ", Rname='" + Rname + '\'' +
                '}';
    }

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }
}

package com.taotaojava.pojo;

/**
 * Created by Administrator on 2019\2\26 0026.
 */
public class Students {

    private  String sNO;

    private  String sName;

    private  String sBirthday;

    private String sClass;

    public String getsNO() {
        return sNO;
    }

    public void setsNO(String sNO) {
        this.sNO = sNO;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(String sBirthday) {
        this.sBirthday = sBirthday;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sNO='" + sNO + '\'' +
                ", sName='" + sName + '\'' +
                ", sBirthday='" + sBirthday + '\'' +
                ", sClass='" + sClass + '\'' +
                '}';
    }
}

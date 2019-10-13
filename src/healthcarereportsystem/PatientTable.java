/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

/**
 *
 * @author sajal
 */
class PatientTable {
    private int pid;
    private String uname,fname,lname,bg,sex,dob,phone,country,division,district,village,thana,road,house;
    
    
    public PatientTable(int pid, String uname, String fname, String lname, String bg, String sex, String dob, String phone, String country, String division, String district, String village, String thana, String road, String house){
        this.pid=pid;
        this.uname=uname;
        this.fname=fname;
        this.lname=lname;
        this.bg=bg;
        this.sex=sex;
        this.dob=dob;
        this.phone=phone;
        this.country=country;
        this.division=division;
        this.district=district;
        this.village=village;
        this.thana=thana;
        this.road=road;
        this.house=house;
    }

    public int getPid() {
        return pid;
    }

    public String getUname() {
        return uname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getBg() {
        return bg;
    }

    public String getSex() {
        return sex;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getDivision() {
        return division;
    }

    public String getDistrict() {
        return district;
    }

    public String getVillage() {
        return village;
    }

    public String getThana() {
        return thana;
    }

    public String getRoad() {
        return road;
    }

    public String getHouse() {
        return house;
    }
    
    
    
}

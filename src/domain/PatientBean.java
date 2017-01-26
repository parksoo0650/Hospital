package domain;

import java.util.Calendar;

import domain.MemberBean;

public class PatientBean extends MemberBean {
    private String patJob, height, weight, bloodType, docId, nurId, cm, kg;

    public void setDocId(String docId) {
	this.docId = docId;
    }

    public String getDocId() {
	return docId;
    }

    public void setNurId(String nurId) {
	this.nurId = nurId;
    }

    public String getNurId() {
	return nurId;
    }

    public void setCm(String cm) {
	this.cm = cm;
    }

    public String getCm() {
	return cm;
    }

    public void setKg(String kg) {
	this.kg = kg;
    }

    public String getKg() {
	return kg;
    }

    public void setPatJob(String patJob) {
	this.patJob = patJob;
    }

    public String getPatJob() {
	return patJob;
    }

    public void setBloodType(String bloodType) {
	this.bloodType = bloodType;
    }

    public String getBloodType() {
	return bloodType;
    }

    /*
     * public void setPatId(int patId) { this.patId = patId; }
     * 
     * public int getPatId() { return patId; }
     */

    /*
     * public void setPatName(String patName){ this.patName=patName; } public
     * String getPatName(){ return patName; }
     */
    /*
     * public int CalcAge(){ Calendar cal = Calendar.getInstance(); int year =
     * (Integer.parseInt(ssn.substring(0,2))); int result = 0; int age = 0;
     * result = cal.get(Calendar.YEAR)-year ; if(result>=2000){ age = (result -
     * 2000) + 1; }else{ age = (result - 1900) + 1; } return age; }
     */

    /*
     * public void setPatGen(String patGen){ this.patGen=patGen; } public String
     * getPatGen(){ return patGen; } public void setPatEmail(String patEmail){
     * this.patEmail=patEmail; } public String getPatEmail(){ return patEmail; }
     * public void setPatPhone(String patPhone){ this.patPhone=patPhone; }
     * public String getPatPhone(){ return patPhone; }
     */

    /*
     * public void setPatAddr(String patAddr){ this.patAddr=patAddr; } public
     * String PatAddr(){ return patAddr; }
     */

    public String toString() {
	return String.format("%s 님 진료 접수 되었습니다.", name);
    }
}

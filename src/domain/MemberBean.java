package domain;

public class MemberBean { // getter setter abstract 걸 필요 없음 doctor,
			  // patients, nurses 상속 받는 구조
    protected String uid, name, ssn, phone, email, addr;

    /*
     * public String CalcGender(){ char ch = ssn.charAt(7); String docGen="";
     * switch(ch){ case '1' : case '3' : docGen = "남자"; break; case '2' :case
     * '4' : docGen = "여자"; break; case '5' : case '6' : docGen = "외국인"; break;
     * } return docGen; }
     */

    public void setUid(String uid) {
	this.uid = uid;
    }

    public String getUid() {
	return uid;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    /*
     * public void setSsn(String ssn) { this.ssn = ssn; }
     * 
     * public String getSsn() { return ssn; }
     * 
     * public void setPhone(String phone) { this.phone = phone; }
     * 
     * public String getPhone() { return phone; }
     * 
     * public void setEmail(String email) { this.email = email; }
     * 
     * public String getEmail() { return email; }
     * 
     * public void setAddr(String addr) { this.addr = addr; }
     * 
     * public String getAddr() { return addr; } public void setMajorTreat(String
     * majorTreat){ this.majorTreat=majorTreat; } public String getMajorTreat(){
     * return majorTreat; }
     */
    @Override
    public String toString() {
	return String.format("%s", name);
    }
}

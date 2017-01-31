package serviceImpl;

import service.HospitalService;
import domain.DoctorBean;
import domain.MemberBean;
import domain.PatientBean;
import domain.NurseBean;

public class HospitalServiceImpl implements HospitalService {
    MemberBean member;
    MemberBean[] arr;
    DoctorBean[] doctors;
    NurseBean[] nurses;
    private int count;
    
   public HospitalServiceImpl(){
       arr = new MemberBean[10];
       count=0;
   }
    @Override
    public String getBmi(PatientBean pat) {
	double cm = Integer.parseInt(pat.getCm()) / 100;
	double kg = Integer.parseInt(pat.getKg());
	double bmi = 0;
	String result = "";
	bmi = kg / (cm * cm);
	if (bmi > 30.0) {
	    result = "고도비만";
	} else if (bmi > 25.0) {
	    result = "비만";
	} else if (bmi > 23.0) {
	    result = "과체중";
	} else if (bmi > 18.5) {
	    result = "정상";
	} else {
	    result = "저체중";
	}
	return result;
    }

    @Override
    public void regist(MemberBean member) {
	
	if(count==arr.length){
	   
	    MemberBean[] list = new MemberBean[10];
	    for(int i=0;i<count;i++){
		 list[i]=arr[i];
	    }
	    arr=list;
	}
	arr[count++]=member;
    }

    @Override
    public MemberBean findById(MemberBean member) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MemberBean[] findByName(String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public DoctorBean[] doctorList() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public NurseBean[] nurseList() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int count() {
	// TODO Auto-generated method stub
	return count++;
    }

    @Override
    public void change(MemberBean member) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void remove(MemberBean member) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean exist(MemberBean member) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public int countByName(MemberBean member) {
	// TODO Auto-generated method stub
	return 0;
    }
    @Override
    public void checkInstance(MemberBean member) {
	if(member instanceof DoctorBean){
	    DoctorBean Doclist = (DoctorBean)member;
	    regist(Doclist);
	}else if(member instanceof NurseBean){
	    NurseBean Nurlist = (NurseBean)member;
	    regist(Nurlist);
	}else{}
	
    }

   
}

package serviceImpl;
import service.HospitalService;
import java.util.Calendar;
import domain.PatientBean;
public class HospitalServiceImpl implements HospitalService{
 /*   PatientBean[] list=null;
   
    public HospitalServiceImpl(){
	list = new PatientBean[6];
    }
  
    public PatientBean registPatients(int uid, String name, double cm, double kg){
	PatientBean patBean = new PatientBean();
	patBean.setUid(uid);
	patBean.setName(name);
	patBean.setCm(cm);
	patBean.setKg(kg);
	list[0]=patBean;
	return patBean;
    }*/
   @Override
    public String getBmi(PatientBean pat) {
       	double cm = Integer.parseInt(pat.getCm()) / 100;
       	double kg = Integer.parseInt(pat.getKg());
	double bmi = 0;
   	String result = "";
   	bmi = kg / (cm *cm);
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
}

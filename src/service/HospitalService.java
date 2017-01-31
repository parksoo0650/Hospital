package service;

import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import domain.PatientBean;
public interface HospitalService {
    public String getBmi(PatientBean pat);
    //create
    public void regist(MemberBean member);
    //read
    public MemberBean findById(MemberBean member);
    public MemberBean[] findByName(String name);//똑같은 이름이 있을 때
 
    public DoctorBean[] doctorList();
    public NurseBean[] nurseList();
    public int count();
    //update
    public void change(MemberBean member);
    //delete
    public void remove(MemberBean member); //비밀번호 노출,공개키
    //util
    //validation
    public boolean exist(MemberBean member);
    public int countByName(MemberBean member);
    public void checkInstance(MemberBean member);
}

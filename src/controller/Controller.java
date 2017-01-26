package controller;

import javax.swing.*;

import domain.*;
import service.HospitalService;
import serviceImpl.HospitalServiceImpl;
import java.util.Calendar;
import constants.Hospital;
public class Controller {

    public void start() {
	/*
	 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 [간호사] 박신혜(여) 25세,
	 * park@test.com, 010-1234-5678 [환자] 홍길동(남) 15세, hong@test.com,
	 * 010-1234-5678
	 */

	HospitalService service = new HospitalServiceImpl();
	DoctorBean doctor =null;
	NurseBean nurses = null;
	PatientBean pat = null;
	while (true) {
	    switch (JOptionPane.showInputDialog(Hospital.EXE_OPTION)) {
	    case "0" : return;
	    case "1": 
		/*
		doctor = new DoctorBean();
		DoctorBean doctor = new DoctorBean();
		String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
		String[] docInfoArr = docInfo.split(",");
		// bmi.name = s.next();
		doctor.setUid(Integer.parseInt(docInfoArr[0]));
		doctor.setMajorTreat(docInfoArr[1]);
		doctor.setName(docInfoArr[2]);
		doctor.setSsn(docInfoArr[3]);
		doctor.setPhone(docInfoArr[4]);
		doctor.setEmail(docInfoArr[5]);
		doctor.setDocPostion(docInfoArr[6]);
		JOptionPane.showMessageDialog(null, doctor.toString());*/
		break;
	    case "2":
		nurses = new NurseBean();
		String nurInfo = JOptionPane.showInputDialog(Hospital.NUR_SPEC);
		String[] nurInfoArr = nurInfo.split(",");
		// bmi.name = s.next();
		nurses.setUid((nurInfoArr[0]));
		nurses.setName(nurInfoArr[1]);
		JOptionPane.showMessageDialog(null, nurses.getUid());
		/*
		 * Nurses nurses = new Nurses();
		 * nurses.setNurName(JOptionPane.showInputDialog("이름?"));
		 * nurses.setNurGen(JOptionPane.showInputDialog(
		 * "주민번호(800101-1)?"));
		 * nurses.setNurEmail(JOptionPane.showInputDialog("이메일?"));
		 * nurses.setNurPhone(JOptionPane.showInputDialog("전화번호?"));
		 * JOptionPane.showMessageDialog(null, ("[간호사]" +
		 * nurses.getNurName() + "[" + nurses.CalcGender() + "]" +
		 * nurses.CalcAge() + nurses.getNurEmail() +
		 * nurses.getNurPhone()));
		 */
		break;
	    case "3":
		pat = new PatientBean();
		
		//아이디,이름,키,몸무게
		//홍길동님 진료 접수 되었습니다.
		String patInfo = JOptionPane.showInputDialog(Hospital.PAT_SPEC);
		String[] patInfoArr = patInfo.split(",");
		// bmi.name = s.next();
		/*pat = service.registPatients(Integer.parseInt(patInfoArr[0]), patInfoArr[1], 
			Double.parseDouble(patInfoArr[2]),Double.parseDouble(patInfoArr[3]));
		*/
		pat.setUid((patInfoArr[0]));
		pat.setName(patInfoArr[1]);
		pat.setCm((patInfoArr[2]));
		pat.setKg((patInfoArr[3]));
		JOptionPane.showMessageDialog(null, pat.toString());
		/*
		 * Patients patients = new Patients();
		 * patients.setPatName(JOptionPane.showInputDialog("이름?"));
		 * patients.setPatGen(JOptionPane.showInputDialog(
		 * "주민번호(800101-1)?"));
		 * patients.setPatEmail(JOptionPane.showInputDialog("이메일?"));
		 * patients.setPatPhone(JOptionPane.showInputDialog("전화번호?"));
		 * JOptionPane.showMessageDialog(null, ("[간호사]" +
		 * patients.getPatName() + "[" + patients.CalcGender() + "]" +
		 * patients.CalcAge() + patients.getPatEmail() +
		 * patients.getPatPhone()));
		 */
		break;
	    case "4":
		//키와 몸무게롤 입력하세요
		 while (true) { // 한석규(남) 과체중 //
		/* double cm = Integer.parseInt(JOptionPane.showInputDialog("키?")); 
		 double kg = Integer.parseInt(JOptionPane.showInputDialog("몸무게?"));*/
		 JOptionPane.showMessageDialog(null, pat.getName() + ":" + service.getBmi(pat));
		//홍길동: 정상
		 break;
	    }
	}
    }
    }
}

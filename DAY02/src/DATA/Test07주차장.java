package DATA;

public class Test07주차장 {

	public static void main(String[] args) {
        //요금
		int pay = 1500;
		
		//들어올때
		int inhour = 11;
		int inminute = 50;
		//나갈때
		int outhour =12;
		int outminute = 0;
		//분으로 바꾸기
		int intime = inhour * 60 + inminute;
		int outtime = outhour * 60 + outminute;
		int totaltime = outtime - intime;
		//최종 시간 ,분
		int totalHour = totaltime / 60;
		int totalMinute = totaltime % 60;
		System.out.println(totalHour);	
		System.out.println(totalMinute);
		//지출된 요금
		int parkingtimepay = (totaltime / 10) * pay;
		System.out.println(parkingtimepay);

		//검토 		
	}

}

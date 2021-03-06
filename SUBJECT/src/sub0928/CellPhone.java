package sub0928;

class FindMinusException extends IllegalArgumentException {
	String str ="";
	public FindMinusException() {
		str = "통화";
	}
	public FindMinusException(int i) {
		str = "충전";
	}
	public String getMessage() {
		return  str+"시간입력오류";
	}
}


public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}

	void call(int time) throws FindMinusException{
		if(time<0) {
			throw new FindMinusException();
		}
		else {
			System.out.println("통화 시간 : "+time+" 분");
			battery -= time*0.5;
			if(battery<0) {
				battery = 0;
			}
		}
	}
	
	void charge(int time) throws FindMinusException{
		if(time<0) {
			throw new FindMinusException(1);
		}
		else {
			System.out.println("충전시간 : "+time+" 분");
			battery += time*3;
			if(battery>100) {
				battery = 100;
			}
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CellPhone) {
			if(((CellPhone) obj).model == this.model) { // this.model.equals( ((CellPhone)obj).model) )
				return true;															// 객체는 상태값 비교
			}
			else {
				return false;
			}
		}
		else
			return false;
	}
}
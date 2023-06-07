package com.yedam.inherit;

public class DmbCellPhone extends CellPhone{
	private int Channel;
	
	public DmbCellPhone() {
		super();			//부모클래스의 생성자
	}
	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.Channel = channel;
	}
	public void setChannel(int channel) {
		this.Channel = channel;
	}
	public int getChannel() {
		return this.Channel;
	}
	//재정의.
	@Override
	public void powerOn() {
		System.out.println("Dmb 전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("Dmb 전원을 끕니다.");
	}
	@Override		//Override >> 부모클래스가 가지고있는 메소드를 재정의하겠다는 의미
	public String toString() {
		return "모델은 " +  this.getModel() + " 이고 컬러는 " + this.getColor() + " 이다.";
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

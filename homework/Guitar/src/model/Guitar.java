package model;
//���ݵ�����,,,,�򵥵������ࡢpo�ࡢα�ࡢ��Ҫ�����ڳ־ò�ת��
public class Guitar {
	//���еļ�������
	private String serialNumber;
	private Double price;
	private String builder;
	private String type;
	private String backwood;
	private String topwood;
//set��get����
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackwood() {
		return backwood;
	}
	public void setBackwood(String backwood) {
		this.backwood = backwood;
	}
	public String getTopwood() {
		return topwood;
	}
	public void setTopwood(String topwood) {
		this.topwood = topwood;
	}
}

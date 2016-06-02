package model;

import allenum.Builder;
import allenum.Type;
import allenum.Wood;
public class Guitar {

	


	private String serialNumber;
	  private double price;
	  //����Guitarspec
	  GuitarSpec spec;

	  
	  //�����������캯��
		 public Guitar() {
				// TODO Auto-generated constructor stub
		}
		//���ι��캯����
	 public Guitar(String serialNumber, double price, GuitarSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }

	  

	
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }
	  public String getSerialNumber() {
			return serialNumber;
		}
		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
	  
	  public GuitarSpec getSpec() {
	    return spec;
	  }
	}


package model;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import idao.InventoryIDao;

public class Inventory {
  private static List guitars;
  private InventoryIDao   inventoryIDao ;
  public Inventory() {
    guitars = new LinkedList();
  }
//¿â´æÔö¼Ó£º
  public void addGuitar(String serialNumber, double price,
                        GuitarSpec spec) {
  Guitar guitar = new Guitar(serialNumber, price, spec);
  guitars.add(guitar);
  System.out.println("wohao"+guitars.size());
  
  }

  public static List search(GuitarSpec searchSpec) {
    List matchingGuitars = new LinkedList();
    System.out.println("nihao"+guitars.size());
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
     System.out.println("gagagagagaga"+guitar.getSerialNumber());
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
  
  
  public Guitar getGuitar(String serialNumber) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSerialNumber().equals(serialNumber)) {
	        return guitar;
	      }
	    }
	    return null;
	  }
}


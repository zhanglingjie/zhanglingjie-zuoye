package guitar.servlet;

import java.util.Iterator;
import java.util.List;

import Dao.Impl.InventoryImpl;
import model.Guitar;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("staring");	
		Guitar guitar=new Guitar();
		guitar.setType("3");
		InventoryImpl inventoryImpl=new InventoryImpl();
		try {
			List<Guitar> matchreasult=inventoryImpl.searchGuitar(guitar);
			Iterator mt = matchreasult.iterator();
			while (mt.hasNext()) {
			Guitar guitar2=(Guitar) mt.next();
			System.out.println(guitar2.getType());
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ending");	
	}

}

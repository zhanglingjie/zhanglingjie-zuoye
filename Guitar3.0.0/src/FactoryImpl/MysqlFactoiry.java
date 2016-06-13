package FactoryImpl;

import Dao.Impl.MysqlGuitarDaoImpl;
import Dao.Impl.MysqlInventoryDaoImpl;
import IFactory.IDaoFactory;
import idao.GuitarIDao;
import idao.InventoryIDao;

public class MysqlFactoiry  implements IDaoFactory {
	
	@Override
	public GuitarIDao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlGuitarDaoImpl();
	}
	@Override
	public InventoryIDao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlInventoryDaoImpl();
	}

}

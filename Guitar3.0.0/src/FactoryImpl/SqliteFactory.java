package FactoryImpl;

import Dao.impl.SqliteGuitarDaoImpl;
import Dao.impl.SqliteInventoryDaoImpl;
import IFactory.IDaoFactory;
import idao.GuitarIDao;
import idao.InventoryIDao;
import model.Guitar;

public class SqliteFactory implements IDaoFactory {

	@Override
	public GuitarIDao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteGuitarDaoImpl();
	}

	@Override
	public InventoryIDao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteInventoryDaoImpl();
	}

}

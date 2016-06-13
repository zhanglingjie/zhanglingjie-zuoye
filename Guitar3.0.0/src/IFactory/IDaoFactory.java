package IFactory;
import Dao.impl.SqliteGuitarDaoImpl;
import Dao.impl.SqliteInventoryDaoImpl;
import idao.GuitarIDao;
import idao.InventoryIDao;
public interface IDaoFactory {
public  GuitarIDao GetGuitarInstance() throws Exception;
public  InventoryIDao GetInventoryInstance() throws Exception;
}




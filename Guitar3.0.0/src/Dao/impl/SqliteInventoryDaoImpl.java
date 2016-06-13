package Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import allenum.Builder;
import allenum.Type;
import allenum.Wood;
import idao.InventoryIDao;
import model.Inventory;
import util.connection.DataConnection;
import model.Guitar;
import model.GuitarSpec;

public class SqliteInventoryDaoImpl implements InventoryIDao  {
	

	@Override
	 public List<Guitar> loaddata() throws Exception {
		// TODO Auto-generated method stub
		//泛型
		List<Guitar> result = new ArrayList<Guitar>();
		String sql = "select * from guitar where 1=1 ";
		Connection conn=DataConnection.getConnection("sqlite");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ResultSet rs = ptmt.executeQuery();
		Guitar guitar = null;
		while (rs.next()) {
				guitar=new Guitar(rs.getString("serialNumber"),rs.getDouble("price"), 
						new GuitarSpec(Builder.valueOf(rs.getString("builder")), rs.getString("model"), Type.valueOf(rs.getString("type")),rs.getInt("numStrings"), 
								Wood.valueOf(rs.getString("backwood")), Wood.valueOf(rs.getString("topwood")))
					              );
		result.add(guitar);
		}
		ptmt.close();
		return result;
	}
}


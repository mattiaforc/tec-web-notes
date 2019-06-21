package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.unibo.tw.es2.beans.DescrizioneMacchina;

public class MacchinaRepository {

private DataSource dataSource;

	public MacchinaRepository(int databaseType) {
		dataSource = new DataSource(databaseType);
	}

	public DescrizioneMacchina get(String targa) throws PersistenceException {
		DescrizioneMacchina macchina = new DescrizioneMacchina();
		Connection connection = this.dataSource.getConnection();
		PreparedStatement statement = null;
		String query = "select * from macchina where targa = ?";
		try {
			statement = connection.prepareStatement(query);
			statement.setString(1, targa);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				macchina.setColore(result.getString("colore"));
				macchina.setModello(result.getString("modello"));
			}
		}
		catch (SQLException e) {
			throw new PersistenceException(e);
		}
		finally {
			try {
				if (statement != null) 
					statement.close();
				if (connection!= null)
					connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
		return macchina;
	}
}

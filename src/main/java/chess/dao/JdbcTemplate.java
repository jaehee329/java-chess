package chess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplate {

	private static final JdbcConnector connectionManager = new JdbcConnector();

	public void executeUpdate(final String query, final List<Object> parameters) {
		try (
			final Connection connection = connectionManager.getConnection();
			final PreparedStatement preparedStatement = connection.prepareStatement(query)
		) {
			for (int i = 1; i <= parameters.size(); i++) {
				preparedStatement.setObject(i, parameters.get(i - 1));
			}
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public <T> T executeQuery(final String query, final RowMapper<T> rowMapper, final List<Object> parameters) {
		try (
			final Connection connection = connectionManager.getConnection();
			final PreparedStatement preparedStatement = connection.prepareStatement(query)
		) {
			for (int i = 1; i <= parameters.size(); i++) {
				preparedStatement.setObject(i, parameters.get(i - 1));
			}
			final ResultSet resultSet = preparedStatement.executeQuery();
			return rowMapper.collectTo(resultSet);
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}

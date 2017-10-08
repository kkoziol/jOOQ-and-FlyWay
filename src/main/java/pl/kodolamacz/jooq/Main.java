package pl.kodolamacz.jooq;

//For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static pl.kodolamacz.generated.Tables.NOTEBOOKS;
import static pl.kodolamacz.generated.Tables.USERS;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.SelectConditionStep;
import org.jooq.impl.DSL;

public class Main {
	public static void main(String[] args) {
		String userName = "sa";
		String password = "";
		String url = "jdbc:h2:~/test";

		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {

			DSLContext create = DSL.using(conn, SQLDialect.H2);
			
			Result<Record> result = create.select().from(NOTEBOOKS).fetch();

			for (Record r : result) {
				Integer id = r.getValue(NOTEBOOKS.ID);
				String model = r.getValue(NOTEBOOKS.MODEL);
				int resolution = r.getValue(NOTEBOOKS.RESOLUTION);

				System.out.println("ID: " + id + " model: " + model + " resolution: " + resolution);
			}

//			SelectConditionStep<Record> select = create.select().from(USER).where(USER.USER_ID.le(10));
//			System.out.println(select.getSQL());
//			Result<Record> fetch = select.fetch();
//			System.out.println(fetch.formatInsert());
		}

		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
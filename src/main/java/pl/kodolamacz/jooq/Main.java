package pl.kodolamacz.jooq;

//For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static pl.kodolamacz.generated.Tables.AUTHOR;
import static pl.kodolamacz.generated.Tables.BOOK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.SelectConditionStep;
import org.jooq.impl.DSL;

public class Main {
	public static void main(String[] args) throws SQLException {
		String userName = "sa";
		String password = "";
		String url = "jdbc:h2:~/flyway-test";

		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {

			DSLContext create = DSL.using(conn, SQLDialect.H2);
			Result<Record> result = create.select().from(AUTHOR).fetch();

			for (Record r : result) {
				Integer id = r.getValue(AUTHOR.ID);
				String firstName = r.getValue(AUTHOR.FIRST_NAME);
				String lastName = r.getValue(AUTHOR.LAST_NAME);

				System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
			}

		}
		
		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}

		
		
		try (Connection c =
	        		DriverManager.getConnection("jdbc:h2:~/flyway-test", "sa", "")) {
	        		            Result<?> result =
	        		            DSL.using(c)
	        		               .select(
	        		                   AUTHOR.FIRST_NAME,
	        		                   AUTHOR.LAST_NAME,
	        		                   BOOK.ID,
	        		                   BOOK.LONG_TITLE
	        		               )
	        		               .from(AUTHOR)
	        		               .join(BOOK)
	        		               .on(AUTHOR.ID.eq(BOOK.AUTHOR_ID))
	        		               .orderBy(BOOK.ID.asc())
	        		               .fetch();

	        		            System.out.println(result);
	        		        }
			
			
	}
}
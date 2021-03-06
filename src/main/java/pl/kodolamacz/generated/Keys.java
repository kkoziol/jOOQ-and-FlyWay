/**
 * This class is generated by jOOQ
 */
package pl.kodolamacz.generated;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import pl.kodolamacz.generated.tables.Author;
import pl.kodolamacz.generated.tables.Book;
import pl.kodolamacz.generated.tables.records.AuthorRecord;
import pl.kodolamacz.generated.tables.records.BookRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>FLYWAY_TEST</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AuthorRecord> PK_AUTHOR = UniqueKeys0.PK_AUTHOR;
	public static final UniqueKey<BookRecord> PK_BOOK = UniqueKeys0.PK_BOOK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR_ID = ForeignKeys0.FK_BOOK_AUTHOR_ID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AuthorRecord> PK_AUTHOR = createUniqueKey(Author.AUTHOR, Author.AUTHOR.ID);
		public static final UniqueKey<BookRecord> PK_BOOK = createUniqueKey(Book.BOOK, Book.BOOK.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR_ID = createForeignKey(pl.kodolamacz.generated.Keys.PK_AUTHOR, Book.BOOK, Book.BOOK.AUTHOR_ID);
	}
}

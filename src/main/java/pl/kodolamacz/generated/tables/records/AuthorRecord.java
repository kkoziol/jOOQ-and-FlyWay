/**
 * This class is generated by jOOQ
 */
package pl.kodolamacz.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import pl.kodolamacz.generated.tables.Author;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record6<Integer, String, String, Date, Integer, String> {

	private static final long serialVersionUID = -417087494;

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.FIRST_NAME</code>.
	 */
	public void setFirstName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.FIRST_NAME</code>.
	 */
	public String getFirstName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.LAST_NAME</code>.
	 */
	public void setLastName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.LAST_NAME</code>.
	 */
	public String getLastName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public void setDateOfBirth(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public Date getDateOfBirth() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public void setYearOfBirth(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public Integer getYearOfBirth() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>FLYWAY_TEST.AUTHOR.ADDRESS</code>.
	 */
	public void setAddress(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>FLYWAY_TEST.AUTHOR.ADDRESS</code>.
	 */
	public String getAddress() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Author.AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Author.AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Author.AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return Author.AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Author.AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Author.AUTHOR.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value2(String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value3(String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value4(Date value) {
		setDateOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value5(Integer value) {
		setYearOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord value6(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorRecord values(Integer value1, String value2, String value3, Date value4, Integer value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AuthorRecord
	 */
	public AuthorRecord() {
		super(Author.AUTHOR);
	}

	/**
	 * Create a detached, initialised AuthorRecord
	 */
	public AuthorRecord(Integer id, String firstName, String lastName, Date dateOfBirth, Integer yearOfBirth, String address) {
		super(Author.AUTHOR);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, dateOfBirth);
		setValue(4, yearOfBirth);
		setValue(5, address);
	}
}

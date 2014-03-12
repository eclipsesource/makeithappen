/**
 */
package com.eclipsesource.makeithappen.model.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nationality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getNationality()
 * @model
 * @generated
 */
public enum Nationality implements Enumerator {
	/**
	 * The '<em><b>German</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GERMAN_VALUE
	 * @generated
	 * @ordered
	 */
	GERMAN(0, "German", "German"),

	/**
	 * The '<em><b>French</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	FRENCH(0, "French", "French"),

	/**
	 * The '<em><b>UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UK_VALUE
	 * @generated
	 * @ordered
	 */
	UK(0, "UK", "UK"),

	/**
	 * The '<em><b>US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_VALUE
	 * @generated
	 * @ordered
	 */
	US(0, "US", "US"),

	/**
	 * The '<em><b>Spanish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH(0, "Spanish", "Spanish"),

	/**
	 * The '<em><b>Italian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIAN_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIAN(0, "Italian", "Italian"),

	/**
	 * The '<em><b>Russian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_VALUE
	 * @generated
	 * @ordered
	 */
	RUSSIAN(0, "Russian", "Russian");

	/**
	 * The '<em><b>German</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>German</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GERMAN
	 * @model name="German"
	 * @generated
	 * @ordered
	 */
	public static final int GERMAN_VALUE = 0;

	/**
	 * The '<em><b>French</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>French</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRENCH
	 * @model name="French"
	 * @generated
	 * @ordered
	 */
	public static final int FRENCH_VALUE = 0;

	/**
	 * The '<em><b>UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UK_VALUE = 0;

	/**
	 * The '<em><b>US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>US</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #US
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int US_VALUE = 0;

	/**
	 * The '<em><b>Spanish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spanish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH
	 * @model name="Spanish"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_VALUE = 0;

	/**
	 * The '<em><b>Italian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Italian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIAN
	 * @model name="Italian"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIAN_VALUE = 0;

	/**
	 * The '<em><b>Russian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Russian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN
	 * @model name="Russian"
	 * @generated
	 * @ordered
	 */
	public static final int RUSSIAN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Nationality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Nationality[] VALUES_ARRAY =
		new Nationality[] {
			GERMAN,
			FRENCH,
			UK,
			US,
			SPANISH,
			ITALIAN,
			RUSSIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Nationality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Nationality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nationality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nationality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nationality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nationality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nationality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nationality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nationality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nationality get(int value) {
		switch (value) {
			case GERMAN_VALUE: return GERMAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Nationality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Nationality

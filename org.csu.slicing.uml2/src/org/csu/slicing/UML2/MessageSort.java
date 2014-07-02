/**
 */
package org.csu.slicing.UML2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Sort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2.UML2Package#getMessageSort()
 * @model
 * @generated
 */
public enum MessageSort implements Enumerator {
	/**
	 * The '<em><b>Synch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCH_SIGNAL(1, "synchSignal", "synchSignal"),

	/**
	 * The '<em><b>Synch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCH_CALL(2, "synchCall", "synchCall"),

	/**
	 * The '<em><b>Asynch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNCH_CALL(3, "asynchCall", "asynchCall"),

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNCH_SIGNAL(4, "asynchSignal", "asynchSignal");

	/**
	 * The '<em><b>Synch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synch Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCH_SIGNAL
	 * @model name="synchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_SIGNAL_VALUE = 1;

	/**
	 * The '<em><b>Synch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synch Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCH_CALL
	 * @model name="synchCall"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_CALL_VALUE = 2;

	/**
	 * The '<em><b>Asynch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynch Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_CALL
	 * @model name="asynchCall"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_CALL_VALUE = 3;

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynch Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_SIGNAL
	 * @model name="asynchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_SIGNAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSort[] VALUES_ARRAY =
		new MessageSort[] {
			SYNCH_SIGNAL,
			SYNCH_CALL,
			ASYNCH_CALL,
			ASYNCH_SIGNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSort> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(int value) {
		switch (value) {
			case SYNCH_SIGNAL_VALUE: return SYNCH_SIGNAL;
			case SYNCH_CALL_VALUE: return SYNCH_CALL;
			case ASYNCH_CALL_VALUE: return ASYNCH_CALL;
			case ASYNCH_SIGNAL_VALUE: return ASYNCH_SIGNAL;
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
	private MessageSort(int value, String name, String literal) {
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
	
} //MessageSort

/**
 */
package org.csu.slicing.UML2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pseudostate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2.UML2Package#getPseudostateKind()
 * @model
 * @generated
 */
public enum PseudostateKind implements Enumerator {
	/**
	 * The '<em><b>Deep History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	DEEP_HISTORY(1, "deepHistory", "deepHistory"),

	/**
	 * The '<em><b>Shallow History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	SHALLOW_HISTORY(2, "shallowHistory", "shallowHistory"),

	/**
	 * The '<em><b>Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOICE(3, "choice", "choice"),

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(4, "join", "join"),

	/**
	 * The '<em><b>Exit Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT_POINT(5, "exitPoint", "exitPoint"),

	/**
	 * The '<em><b>Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATE(6, "terminate", "terminate"),

	/**
	 * The '<em><b>Fork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_VALUE
	 * @generated
	 * @ordered
	 */
	FORK(7, "fork", "fork"),

	/**
	 * The '<em><b>Junction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	JUNCTION(8, "junction", "junction"),

	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(9, "initial", "initial"),

	/**
	 * The '<em><b>Entry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY_POINT(10, "entryPoint", "entryPoint");

	/**
	 * The '<em><b>Deep History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deep History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY
	 * @model name="deepHistory"
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_HISTORY_VALUE = 1;

	/**
	 * The '<em><b>Shallow History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shallow History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_HISTORY
	 * @model name="shallowHistory"
	 * @generated
	 * @ordered
	 */
	public static final int SHALLOW_HISTORY_VALUE = 2;

	/**
	 * The '<em><b>Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Choice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @model name="choice"
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE_VALUE = 3;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 4;

	/**
	 * The '<em><b>Exit Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exit Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT
	 * @model name="exitPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_POINT_VALUE = 5;

	/**
	 * The '<em><b>Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @model name="terminate"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE_VALUE = 6;

	/**
	 * The '<em><b>Fork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fork</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @model name="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK_VALUE = 7;

	/**
	 * The '<em><b>Junction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Junction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUNCTION
	 * @model name="junction"
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION_VALUE = 8;

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model name="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 9;

	/**
	 * The '<em><b>Entry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entry Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT
	 * @model name="entryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_POINT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PseudostateKind[] VALUES_ARRAY =
		new PseudostateKind[] {
			DEEP_HISTORY,
			SHALLOW_HISTORY,
			CHOICE,
			JOIN,
			EXIT_POINT,
			TERMINATE,
			FORK,
			JUNCTION,
			INITIAL,
			ENTRY_POINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PseudostateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudostateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudostateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudostateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudostateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudostateKind get(int value) {
		switch (value) {
			case DEEP_HISTORY_VALUE: return DEEP_HISTORY;
			case SHALLOW_HISTORY_VALUE: return SHALLOW_HISTORY;
			case CHOICE_VALUE: return CHOICE;
			case JOIN_VALUE: return JOIN;
			case EXIT_POINT_VALUE: return EXIT_POINT;
			case TERMINATE_VALUE: return TERMINATE;
			case FORK_VALUE: return FORK;
			case JUNCTION_VALUE: return JUNCTION;
			case INITIAL_VALUE: return INITIAL;
			case ENTRY_POINT_VALUE: return ENTRY_POINT;
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
	private PseudostateKind(int value, String name, String literal) {
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
	
} //PseudostateKind

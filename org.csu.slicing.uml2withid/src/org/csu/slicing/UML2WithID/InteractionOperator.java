/**
 */
package org.csu.slicing.UML2WithID;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOperator()
 * @model
 * @generated
 */
public enum InteractionOperator implements Enumerator {
	/**
	 * The '<em><b>Consider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSIDER_VALUE
	 * @generated
	 * @ordered
	 */
	CONSIDER(1, "consider", "consider"),

	/**
	 * The '<em><b>Par</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAR_VALUE
	 * @generated
	 * @ordered
	 */
	PAR(2, "par", "par"),

	/**
	 * The '<em><b>Opt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(3, "opt", "opt"),

	/**
	 * The '<em><b>Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP(4, "loop", "loop"),

	/**
	 * The '<em><b>Alt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(5, "alt", "alt"),

	/**
	 * The '<em><b>Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BREAK(6, "break", "break"),

	/**
	 * The '<em><b>Assert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERT(7, "assert", "assert"),

	/**
	 * The '<em><b>Strict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICT_VALUE
	 * @generated
	 * @ordered
	 */
	STRICT(8, "strict", "strict"),

	/**
	 * The '<em><b>Seq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQ_VALUE
	 * @generated
	 * @ordered
	 */
	SEQ(9, "seq", "seq"),

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(10, "ignore", "ignore"),

	/**
	 * The '<em><b>Neg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEG_VALUE
	 * @generated
	 * @ordered
	 */
	NEG(11, "neg", "neg"),

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(12, "critical", "critical");

	/**
	 * The '<em><b>Consider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSIDER
	 * @model name="consider"
	 * @generated
	 * @ordered
	 */
	public static final int CONSIDER_VALUE = 1;

	/**
	 * The '<em><b>Par</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Par</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAR
	 * @model name="par"
	 * @generated
	 * @ordered
	 */
	public static final int PAR_VALUE = 2;

	/**
	 * The '<em><b>Opt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @model name="opt"
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 3;

	/**
	 * The '<em><b>Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @model name="loop"
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_VALUE = 4;

	/**
	 * The '<em><b>Alt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model name="alt"
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 5;

	/**
	 * The '<em><b>Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Break</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @model name="break"
	 * @generated
	 * @ordered
	 */
	public static final int BREAK_VALUE = 6;

	/**
	 * The '<em><b>Assert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERT
	 * @model name="assert"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERT_VALUE = 7;

	/**
	 * The '<em><b>Strict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICT
	 * @model name="strict"
	 * @generated
	 * @ordered
	 */
	public static final int STRICT_VALUE = 8;

	/**
	 * The '<em><b>Seq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Seq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQ
	 * @model name="seq"
	 * @generated
	 * @ordered
	 */
	public static final int SEQ_VALUE = 9;

	/**
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ignore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model name="ignore"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 10;

	/**
	 * The '<em><b>Neg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEG
	 * @model name="neg"
	 * @generated
	 * @ordered
	 */
	public static final int NEG_VALUE = 11;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Interaction Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionOperator[] VALUES_ARRAY =
		new InteractionOperator[] {
			CONSIDER,
			PAR,
			OPT,
			LOOP,
			ALT,
			BREAK,
			ASSERT,
			STRICT,
			SEQ,
			IGNORE,
			NEG,
			CRITICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperator get(int value) {
		switch (value) {
			case CONSIDER_VALUE: return CONSIDER;
			case PAR_VALUE: return PAR;
			case OPT_VALUE: return OPT;
			case LOOP_VALUE: return LOOP;
			case ALT_VALUE: return ALT;
			case BREAK_VALUE: return BREAK;
			case ASSERT_VALUE: return ASSERT;
			case STRICT_VALUE: return STRICT;
			case SEQ_VALUE: return SEQ;
			case IGNORE_VALUE: return IGNORE;
			case NEG_VALUE: return NEG;
			case CRITICAL_VALUE: return CRITICAL;
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
	private InteractionOperator(int value, String name, String literal) {
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
	
} //InteractionOperator

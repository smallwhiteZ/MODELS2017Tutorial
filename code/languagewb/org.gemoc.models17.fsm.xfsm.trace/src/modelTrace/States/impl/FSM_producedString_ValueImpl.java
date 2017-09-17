/**
 */
package modelTrace.States.impl;

import java.util.Collection;

import modelTrace.States.FSM_producedString_Value;
import modelTrace.States.State;
import modelTrace.States.StatesPackage;

import modelTrace.States.model.ModelPackage;
import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM produced String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.impl.FSM_producedString_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_producedString_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_producedString_ValueImpl#getProducedString <em>Produced String</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_producedString_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSM_producedString_ValueImpl extends MinimalEObjectImpl.Container implements FSM_producedString_Value {
	/**
	 * The default value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected String producedString = PRODUCED_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSM_producedString_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FSM_PRODUCED_STRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFSM getParent() {
		if (eContainerFeatureID() != StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT) return null;
		return (TracedFSM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedFSM newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedFSM newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE, TracedFSM.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducedString() {
		return producedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedString(String newProducedString) {
		String oldProducedString = producedString;
		producedString = newProducedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING, oldProducedString, producedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES, StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedFSM)otherEnd, msgs);
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE, TracedFSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				return getParent();
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING:
				return getProducedString();
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				setParent((TracedFSM)newValue);
				return;
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING:
				setProducedString((String)newValue);
				return;
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				setParent((TracedFSM)null);
				return;
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING:
				setProducedString(PRODUCED_STRING_EDEFAULT);
				return;
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				getStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING:
				return PRODUCED_STRING_EDEFAULT == null ? producedString != null : !PRODUCED_STRING_EDEFAULT.equals(producedString);
			case StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (producedString: ");
		result.append(producedString);
		result.append(')');
		return result.toString();
	}

} //FSM_producedString_ValueImpl
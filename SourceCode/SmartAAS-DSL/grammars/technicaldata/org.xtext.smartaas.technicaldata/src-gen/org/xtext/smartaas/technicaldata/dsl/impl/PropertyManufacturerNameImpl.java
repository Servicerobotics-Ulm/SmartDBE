/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smartaas.technicaldata.dsl.DslPackage;
import org.xtext.smartaas.technicaldata.dsl.PropertyManufacturerName;
import org.xtext.smartaas.technicaldata.dsl.SID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Manufacturer Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.PropertyManufacturerNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.PropertyManufacturerNameImpl#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyManufacturerNameImpl extends MinimalEObjectImpl.Container implements PropertyManufacturerName
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSemanticId() <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticId()
   * @generated
   * @ordered
   */
  protected SID semanticId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyManufacturerNameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.PROPERTY_MANUFACTURER_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_MANUFACTURER_NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SID getSemanticId()
  {
    return semanticId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSemanticId(SID newSemanticId, NotificationChain msgs)
  {
    SID oldSemanticId = semanticId;
    semanticId = newSemanticId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID, oldSemanticId, newSemanticId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSemanticId(SID newSemanticId)
  {
    if (newSemanticId != semanticId)
    {
      NotificationChain msgs = null;
      if (semanticId != null)
        msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID, null, msgs);
      if (newSemanticId != null)
        msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID, null, msgs);
      msgs = basicSetSemanticId(newSemanticId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID, newSemanticId, newSemanticId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID:
        return basicSetSemanticId(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.PROPERTY_MANUFACTURER_NAME__NAME:
        return getName();
      case DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID:
        return getSemanticId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.PROPERTY_MANUFACTURER_NAME__NAME:
        setName((String)newValue);
        return;
      case DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID:
        setSemanticId((SID)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.PROPERTY_MANUFACTURER_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID:
        setSemanticId((SID)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.PROPERTY_MANUFACTURER_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.PROPERTY_MANUFACTURER_NAME__SEMANTIC_ID:
        return semanticId != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyManufacturerNameImpl

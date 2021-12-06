/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.smartaas.technicaldata.dsl.DslPackage;
import org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyTextStatement;
import org.xtext.smartaas.technicaldata.dsl.PropertyValidDate;
import org.xtext.smartaas.technicaldata.dsl.SID;
import org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element Collection Further Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionFurtherInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionFurtherInformationImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionFurtherInformationImpl#getTextStatement <em>Text Statement</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionFurtherInformationImpl#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelElementCollectionFurtherInformationImpl extends MinimalEObjectImpl.Container implements SubmodelElementCollectionFurtherInformation
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
   * The cached value of the '{@link #getTextStatement() <em>Text Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextStatement()
   * @generated
   * @ordered
   */
  protected EList<MultiLanguagePropertyTextStatement> textStatement;

  /**
   * The cached value of the '{@link #getValidDate() <em>Valid Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidDate()
   * @generated
   * @ordered
   */
  protected PropertyValidDate validDate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubmodelElementCollectionFurtherInformationImpl()
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
    return DslPackage.Literals.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
        msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID, null, msgs);
      if (newSemanticId != null)
        msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID, null, msgs);
      msgs = basicSetSemanticId(newSemanticId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID, newSemanticId, newSemanticId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MultiLanguagePropertyTextStatement> getTextStatement()
  {
    if (textStatement == null)
    {
      textStatement = new EObjectContainmentEList<MultiLanguagePropertyTextStatement>(MultiLanguagePropertyTextStatement.class, this, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT);
    }
    return textStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyValidDate getValidDate()
  {
    return validDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidDate(PropertyValidDate newValidDate, NotificationChain msgs)
  {
    PropertyValidDate oldValidDate = validDate;
    validDate = newValidDate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE, oldValidDate, newValidDate);
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
  public void setValidDate(PropertyValidDate newValidDate)
  {
    if (newValidDate != validDate)
    {
      NotificationChain msgs = null;
      if (validDate != null)
        msgs = ((InternalEObject)validDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE, null, msgs);
      if (newValidDate != null)
        msgs = ((InternalEObject)newValidDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE, null, msgs);
      msgs = basicSetValidDate(newValidDate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE, newValidDate, newValidDate));
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID:
        return basicSetSemanticId(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT:
        return ((InternalEList<?>)getTextStatement()).basicRemove(otherEnd, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE:
        return basicSetValidDate(null, msgs);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__NAME:
        return getName();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID:
        return getSemanticId();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT:
        return getTextStatement();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE:
        return getValidDate();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__NAME:
        setName((String)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID:
        setSemanticId((SID)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT:
        getTextStatement().clear();
        getTextStatement().addAll((Collection<? extends MultiLanguagePropertyTextStatement>)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE:
        setValidDate((PropertyValidDate)newValue);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID:
        setSemanticId((SID)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT:
        getTextStatement().clear();
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE:
        setValidDate((PropertyValidDate)null);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__SEMANTIC_ID:
        return semanticId != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__TEXT_STATEMENT:
        return textStatement != null && !textStatement.isEmpty();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_FURTHER_INFORMATION__VALID_DATE:
        return validDate != null;
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

} //SubmodelElementCollectionFurtherInformationImpl

/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smartaas.nameplate.dsl.DslPackage;
import org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection;
import org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyPublicKey;
import org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyTypeOfPublickKey;
import org.xtext.smartaas.nameplate.dsl.PropertyEmailAddress;
import org.xtext.smartaas.nameplate.dsl.PropertyTypeOfEmailAddress;
import org.xtext.smartaas.nameplate.dsl.SID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getTypeOfEmailAddress <em>Type Of Email Address</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.EmailSubmodelElementCollectionImpl#getTypeOfPublickKey <em>Type Of Publick Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailSubmodelElementCollectionImpl extends MinimalEObjectImpl.Container implements EmailSubmodelElementCollection
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
   * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailAddress()
   * @generated
   * @ordered
   */
  protected PropertyEmailAddress emailAddress;

  /**
   * The cached value of the '{@link #getTypeOfEmailAddress() <em>Type Of Email Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeOfEmailAddress()
   * @generated
   * @ordered
   */
  protected PropertyTypeOfEmailAddress typeOfEmailAddress;

  /**
   * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicKey()
   * @generated
   * @ordered
   */
  protected MultiLanguagePropertyPublicKey publicKey;

  /**
   * The cached value of the '{@link #getTypeOfPublickKey() <em>Type Of Publick Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeOfPublickKey()
   * @generated
   * @ordered
   */
  protected MultiLanguagePropertyTypeOfPublickKey typeOfPublickKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmailSubmodelElementCollectionImpl()
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
    return DslPackage.Literals.EMAIL_SUBMODEL_ELEMENT_COLLECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
        msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID, null, msgs);
      if (newSemanticId != null)
        msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID, null, msgs);
      msgs = basicSetSemanticId(newSemanticId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID, newSemanticId, newSemanticId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyEmailAddress getEmailAddress()
  {
    return emailAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmailAddress(PropertyEmailAddress newEmailAddress, NotificationChain msgs)
  {
    PropertyEmailAddress oldEmailAddress = emailAddress;
    emailAddress = newEmailAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS, oldEmailAddress, newEmailAddress);
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
  public void setEmailAddress(PropertyEmailAddress newEmailAddress)
  {
    if (newEmailAddress != emailAddress)
    {
      NotificationChain msgs = null;
      if (emailAddress != null)
        msgs = ((InternalEObject)emailAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS, null, msgs);
      if (newEmailAddress != null)
        msgs = ((InternalEObject)newEmailAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS, null, msgs);
      msgs = basicSetEmailAddress(newEmailAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS, newEmailAddress, newEmailAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyTypeOfEmailAddress getTypeOfEmailAddress()
  {
    return typeOfEmailAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeOfEmailAddress(PropertyTypeOfEmailAddress newTypeOfEmailAddress, NotificationChain msgs)
  {
    PropertyTypeOfEmailAddress oldTypeOfEmailAddress = typeOfEmailAddress;
    typeOfEmailAddress = newTypeOfEmailAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS, oldTypeOfEmailAddress, newTypeOfEmailAddress);
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
  public void setTypeOfEmailAddress(PropertyTypeOfEmailAddress newTypeOfEmailAddress)
  {
    if (newTypeOfEmailAddress != typeOfEmailAddress)
    {
      NotificationChain msgs = null;
      if (typeOfEmailAddress != null)
        msgs = ((InternalEObject)typeOfEmailAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS, null, msgs);
      if (newTypeOfEmailAddress != null)
        msgs = ((InternalEObject)newTypeOfEmailAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS, null, msgs);
      msgs = basicSetTypeOfEmailAddress(newTypeOfEmailAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS, newTypeOfEmailAddress, newTypeOfEmailAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiLanguagePropertyPublicKey getPublicKey()
  {
    return publicKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPublicKey(MultiLanguagePropertyPublicKey newPublicKey, NotificationChain msgs)
  {
    MultiLanguagePropertyPublicKey oldPublicKey = publicKey;
    publicKey = newPublicKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY, oldPublicKey, newPublicKey);
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
  public void setPublicKey(MultiLanguagePropertyPublicKey newPublicKey)
  {
    if (newPublicKey != publicKey)
    {
      NotificationChain msgs = null;
      if (publicKey != null)
        msgs = ((InternalEObject)publicKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY, null, msgs);
      if (newPublicKey != null)
        msgs = ((InternalEObject)newPublicKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY, null, msgs);
      msgs = basicSetPublicKey(newPublicKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY, newPublicKey, newPublicKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiLanguagePropertyTypeOfPublickKey getTypeOfPublickKey()
  {
    return typeOfPublickKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeOfPublickKey(MultiLanguagePropertyTypeOfPublickKey newTypeOfPublickKey, NotificationChain msgs)
  {
    MultiLanguagePropertyTypeOfPublickKey oldTypeOfPublickKey = typeOfPublickKey;
    typeOfPublickKey = newTypeOfPublickKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY, oldTypeOfPublickKey, newTypeOfPublickKey);
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
  public void setTypeOfPublickKey(MultiLanguagePropertyTypeOfPublickKey newTypeOfPublickKey)
  {
    if (newTypeOfPublickKey != typeOfPublickKey)
    {
      NotificationChain msgs = null;
      if (typeOfPublickKey != null)
        msgs = ((InternalEObject)typeOfPublickKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY, null, msgs);
      if (newTypeOfPublickKey != null)
        msgs = ((InternalEObject)newTypeOfPublickKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY, null, msgs);
      msgs = basicSetTypeOfPublickKey(newTypeOfPublickKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY, newTypeOfPublickKey, newTypeOfPublickKey));
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
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID:
        return basicSetSemanticId(null, msgs);
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS:
        return basicSetEmailAddress(null, msgs);
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS:
        return basicSetTypeOfEmailAddress(null, msgs);
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY:
        return basicSetPublicKey(null, msgs);
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY:
        return basicSetTypeOfPublickKey(null, msgs);
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
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__NAME:
        return getName();
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID:
        return getSemanticId();
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS:
        return getEmailAddress();
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS:
        return getTypeOfEmailAddress();
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY:
        return getPublicKey();
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY:
        return getTypeOfPublickKey();
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
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__NAME:
        setName((String)newValue);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID:
        setSemanticId((SID)newValue);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS:
        setEmailAddress((PropertyEmailAddress)newValue);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS:
        setTypeOfEmailAddress((PropertyTypeOfEmailAddress)newValue);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY:
        setPublicKey((MultiLanguagePropertyPublicKey)newValue);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY:
        setTypeOfPublickKey((MultiLanguagePropertyTypeOfPublickKey)newValue);
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
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID:
        setSemanticId((SID)null);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS:
        setEmailAddress((PropertyEmailAddress)null);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS:
        setTypeOfEmailAddress((PropertyTypeOfEmailAddress)null);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY:
        setPublicKey((MultiLanguagePropertyPublicKey)null);
        return;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY:
        setTypeOfPublickKey((MultiLanguagePropertyTypeOfPublickKey)null);
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
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID:
        return semanticId != null;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__EMAIL_ADDRESS:
        return emailAddress != null;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_EMAIL_ADDRESS:
        return typeOfEmailAddress != null;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__PUBLIC_KEY:
        return publicKey != null;
      case DslPackage.EMAIL_SUBMODEL_ELEMENT_COLLECTION__TYPE_OF_PUBLICK_KEY:
        return typeOfPublickKey != null;
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

} //EmailSubmodelElementCollectionImpl

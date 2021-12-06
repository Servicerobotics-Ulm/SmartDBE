/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl.impl;

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

import org.xtext.smartaas.nameplate.dsl.DslPackage;
import org.xtext.smartaas.nameplate.dsl.PropertyArbitrary;
import org.xtext.smartaas.nameplate.dsl.PropertyGuidelineForConformityDeclaration;
import org.xtext.smartaas.nameplate.dsl.SID;
import org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionGuidelineSpecificProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element Collection Guideline Specific Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.SubmodelElementCollectionGuidelineSpecificPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.SubmodelElementCollectionGuidelineSpecificPropertiesImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.SubmodelElementCollectionGuidelineSpecificPropertiesImpl#getGuidelineForConformityDeclaration <em>Guideline For Conformity Declaration</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.impl.SubmodelElementCollectionGuidelineSpecificPropertiesImpl#getArbitrary <em>Arbitrary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelElementCollectionGuidelineSpecificPropertiesImpl extends MinimalEObjectImpl.Container implements SubmodelElementCollectionGuidelineSpecificProperties
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
   * The cached value of the '{@link #getGuidelineForConformityDeclaration() <em>Guideline For Conformity Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuidelineForConformityDeclaration()
   * @generated
   * @ordered
   */
  protected PropertyGuidelineForConformityDeclaration guidelineForConformityDeclaration;

  /**
   * The cached value of the '{@link #getArbitrary() <em>Arbitrary</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArbitrary()
   * @generated
   * @ordered
   */
  protected EList<PropertyArbitrary> arbitrary;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubmodelElementCollectionGuidelineSpecificPropertiesImpl()
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
    return DslPackage.Literals.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
        msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID, null, msgs);
      if (newSemanticId != null)
        msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID, null, msgs);
      msgs = basicSetSemanticId(newSemanticId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID, newSemanticId, newSemanticId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyGuidelineForConformityDeclaration getGuidelineForConformityDeclaration()
  {
    return guidelineForConformityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuidelineForConformityDeclaration(PropertyGuidelineForConformityDeclaration newGuidelineForConformityDeclaration, NotificationChain msgs)
  {
    PropertyGuidelineForConformityDeclaration oldGuidelineForConformityDeclaration = guidelineForConformityDeclaration;
    guidelineForConformityDeclaration = newGuidelineForConformityDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION, oldGuidelineForConformityDeclaration, newGuidelineForConformityDeclaration);
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
  public void setGuidelineForConformityDeclaration(PropertyGuidelineForConformityDeclaration newGuidelineForConformityDeclaration)
  {
    if (newGuidelineForConformityDeclaration != guidelineForConformityDeclaration)
    {
      NotificationChain msgs = null;
      if (guidelineForConformityDeclaration != null)
        msgs = ((InternalEObject)guidelineForConformityDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION, null, msgs);
      if (newGuidelineForConformityDeclaration != null)
        msgs = ((InternalEObject)newGuidelineForConformityDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION, null, msgs);
      msgs = basicSetGuidelineForConformityDeclaration(newGuidelineForConformityDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION, newGuidelineForConformityDeclaration, newGuidelineForConformityDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyArbitrary> getArbitrary()
  {
    if (arbitrary == null)
    {
      arbitrary = new EObjectContainmentEList<PropertyArbitrary>(PropertyArbitrary.class, this, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY);
    }
    return arbitrary;
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID:
        return basicSetSemanticId(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION:
        return basicSetGuidelineForConformityDeclaration(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY:
        return ((InternalEList<?>)getArbitrary()).basicRemove(otherEnd, msgs);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__NAME:
        return getName();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID:
        return getSemanticId();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION:
        return getGuidelineForConformityDeclaration();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY:
        return getArbitrary();
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__NAME:
        setName((String)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID:
        setSemanticId((SID)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION:
        setGuidelineForConformityDeclaration((PropertyGuidelineForConformityDeclaration)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY:
        getArbitrary().clear();
        getArbitrary().addAll((Collection<? extends PropertyArbitrary>)newValue);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID:
        setSemanticId((SID)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION:
        setGuidelineForConformityDeclaration((PropertyGuidelineForConformityDeclaration)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY:
        getArbitrary().clear();
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__SEMANTIC_ID:
        return semanticId != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__GUIDELINE_FOR_CONFORMITY_DECLARATION:
        return guidelineForConformityDeclaration != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GUIDELINE_SPECIFIC_PROPERTIES__ARBITRARY:
        return arbitrary != null && !arbitrary.isEmpty();
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

} //SubmodelElementCollectionGuidelineSpecificPropertiesImpl
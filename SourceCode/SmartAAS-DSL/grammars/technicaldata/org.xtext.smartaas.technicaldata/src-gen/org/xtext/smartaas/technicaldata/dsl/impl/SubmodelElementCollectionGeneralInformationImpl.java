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
import org.xtext.smartaas.technicaldata.dsl.FileManufacturerLogo;
import org.xtext.smartaas.technicaldata.dsl.FileProductImage;
import org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyManufacturerProductDesignation;
import org.xtext.smartaas.technicaldata.dsl.PropertyManufacturerName;
import org.xtext.smartaas.technicaldata.dsl.PropertyManufacturerOrderCode;
import org.xtext.smartaas.technicaldata.dsl.PropertyManufacturerPartNumber;
import org.xtext.smartaas.technicaldata.dsl.SID;
import org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionGeneralInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element Collection General Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getManufacturerName <em>Manufacturer Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getManufacturerLogo <em>Manufacturer Logo</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getManufacturerProductDesignation <em>Manufacturer Product Designation</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getManufacturerPartNumber <em>Manufacturer Part Number</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getManufacturerOrderCode <em>Manufacturer Order Code</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.impl.SubmodelElementCollectionGeneralInformationImpl#getProductImage <em>Product Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelElementCollectionGeneralInformationImpl extends MinimalEObjectImpl.Container implements SubmodelElementCollectionGeneralInformation
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
   * The cached value of the '{@link #getManufacturerName() <em>Manufacturer Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturerName()
   * @generated
   * @ordered
   */
  protected PropertyManufacturerName manufacturerName;

  /**
   * The cached value of the '{@link #getManufacturerLogo() <em>Manufacturer Logo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturerLogo()
   * @generated
   * @ordered
   */
  protected FileManufacturerLogo manufacturerLogo;

  /**
   * The cached value of the '{@link #getManufacturerProductDesignation() <em>Manufacturer Product Designation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturerProductDesignation()
   * @generated
   * @ordered
   */
  protected MultiLanguagePropertyManufacturerProductDesignation manufacturerProductDesignation;

  /**
   * The cached value of the '{@link #getManufacturerPartNumber() <em>Manufacturer Part Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturerPartNumber()
   * @generated
   * @ordered
   */
  protected PropertyManufacturerPartNumber manufacturerPartNumber;

  /**
   * The cached value of the '{@link #getManufacturerOrderCode() <em>Manufacturer Order Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturerOrderCode()
   * @generated
   * @ordered
   */
  protected PropertyManufacturerOrderCode manufacturerOrderCode;

  /**
   * The cached value of the '{@link #getProductImage() <em>Product Image</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductImage()
   * @generated
   * @ordered
   */
  protected EList<FileProductImage> productImage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubmodelElementCollectionGeneralInformationImpl()
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
    return DslPackage.Literals.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
        msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID, null, msgs);
      if (newSemanticId != null)
        msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID, null, msgs);
      msgs = basicSetSemanticId(newSemanticId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID, newSemanticId, newSemanticId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyManufacturerName getManufacturerName()
  {
    return manufacturerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManufacturerName(PropertyManufacturerName newManufacturerName, NotificationChain msgs)
  {
    PropertyManufacturerName oldManufacturerName = manufacturerName;
    manufacturerName = newManufacturerName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME, oldManufacturerName, newManufacturerName);
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
  public void setManufacturerName(PropertyManufacturerName newManufacturerName)
  {
    if (newManufacturerName != manufacturerName)
    {
      NotificationChain msgs = null;
      if (manufacturerName != null)
        msgs = ((InternalEObject)manufacturerName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME, null, msgs);
      if (newManufacturerName != null)
        msgs = ((InternalEObject)newManufacturerName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME, null, msgs);
      msgs = basicSetManufacturerName(newManufacturerName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME, newManufacturerName, newManufacturerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileManufacturerLogo getManufacturerLogo()
  {
    return manufacturerLogo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManufacturerLogo(FileManufacturerLogo newManufacturerLogo, NotificationChain msgs)
  {
    FileManufacturerLogo oldManufacturerLogo = manufacturerLogo;
    manufacturerLogo = newManufacturerLogo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO, oldManufacturerLogo, newManufacturerLogo);
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
  public void setManufacturerLogo(FileManufacturerLogo newManufacturerLogo)
  {
    if (newManufacturerLogo != manufacturerLogo)
    {
      NotificationChain msgs = null;
      if (manufacturerLogo != null)
        msgs = ((InternalEObject)manufacturerLogo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO, null, msgs);
      if (newManufacturerLogo != null)
        msgs = ((InternalEObject)newManufacturerLogo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO, null, msgs);
      msgs = basicSetManufacturerLogo(newManufacturerLogo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO, newManufacturerLogo, newManufacturerLogo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiLanguagePropertyManufacturerProductDesignation getManufacturerProductDesignation()
  {
    return manufacturerProductDesignation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManufacturerProductDesignation(MultiLanguagePropertyManufacturerProductDesignation newManufacturerProductDesignation, NotificationChain msgs)
  {
    MultiLanguagePropertyManufacturerProductDesignation oldManufacturerProductDesignation = manufacturerProductDesignation;
    manufacturerProductDesignation = newManufacturerProductDesignation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION, oldManufacturerProductDesignation, newManufacturerProductDesignation);
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
  public void setManufacturerProductDesignation(MultiLanguagePropertyManufacturerProductDesignation newManufacturerProductDesignation)
  {
    if (newManufacturerProductDesignation != manufacturerProductDesignation)
    {
      NotificationChain msgs = null;
      if (manufacturerProductDesignation != null)
        msgs = ((InternalEObject)manufacturerProductDesignation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION, null, msgs);
      if (newManufacturerProductDesignation != null)
        msgs = ((InternalEObject)newManufacturerProductDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION, null, msgs);
      msgs = basicSetManufacturerProductDesignation(newManufacturerProductDesignation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION, newManufacturerProductDesignation, newManufacturerProductDesignation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyManufacturerPartNumber getManufacturerPartNumber()
  {
    return manufacturerPartNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManufacturerPartNumber(PropertyManufacturerPartNumber newManufacturerPartNumber, NotificationChain msgs)
  {
    PropertyManufacturerPartNumber oldManufacturerPartNumber = manufacturerPartNumber;
    manufacturerPartNumber = newManufacturerPartNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER, oldManufacturerPartNumber, newManufacturerPartNumber);
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
  public void setManufacturerPartNumber(PropertyManufacturerPartNumber newManufacturerPartNumber)
  {
    if (newManufacturerPartNumber != manufacturerPartNumber)
    {
      NotificationChain msgs = null;
      if (manufacturerPartNumber != null)
        msgs = ((InternalEObject)manufacturerPartNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER, null, msgs);
      if (newManufacturerPartNumber != null)
        msgs = ((InternalEObject)newManufacturerPartNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER, null, msgs);
      msgs = basicSetManufacturerPartNumber(newManufacturerPartNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER, newManufacturerPartNumber, newManufacturerPartNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyManufacturerOrderCode getManufacturerOrderCode()
  {
    return manufacturerOrderCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManufacturerOrderCode(PropertyManufacturerOrderCode newManufacturerOrderCode, NotificationChain msgs)
  {
    PropertyManufacturerOrderCode oldManufacturerOrderCode = manufacturerOrderCode;
    manufacturerOrderCode = newManufacturerOrderCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE, oldManufacturerOrderCode, newManufacturerOrderCode);
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
  public void setManufacturerOrderCode(PropertyManufacturerOrderCode newManufacturerOrderCode)
  {
    if (newManufacturerOrderCode != manufacturerOrderCode)
    {
      NotificationChain msgs = null;
      if (manufacturerOrderCode != null)
        msgs = ((InternalEObject)manufacturerOrderCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE, null, msgs);
      if (newManufacturerOrderCode != null)
        msgs = ((InternalEObject)newManufacturerOrderCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE, null, msgs);
      msgs = basicSetManufacturerOrderCode(newManufacturerOrderCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE, newManufacturerOrderCode, newManufacturerOrderCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FileProductImage> getProductImage()
  {
    if (productImage == null)
    {
      productImage = new EObjectContainmentEList<FileProductImage>(FileProductImage.class, this, DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE);
    }
    return productImage;
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID:
        return basicSetSemanticId(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME:
        return basicSetManufacturerName(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO:
        return basicSetManufacturerLogo(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION:
        return basicSetManufacturerProductDesignation(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER:
        return basicSetManufacturerPartNumber(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE:
        return basicSetManufacturerOrderCode(null, msgs);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE:
        return ((InternalEList<?>)getProductImage()).basicRemove(otherEnd, msgs);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__NAME:
        return getName();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID:
        return getSemanticId();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME:
        return getManufacturerName();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO:
        return getManufacturerLogo();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION:
        return getManufacturerProductDesignation();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER:
        return getManufacturerPartNumber();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE:
        return getManufacturerOrderCode();
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE:
        return getProductImage();
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__NAME:
        setName((String)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID:
        setSemanticId((SID)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME:
        setManufacturerName((PropertyManufacturerName)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO:
        setManufacturerLogo((FileManufacturerLogo)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION:
        setManufacturerProductDesignation((MultiLanguagePropertyManufacturerProductDesignation)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER:
        setManufacturerPartNumber((PropertyManufacturerPartNumber)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE:
        setManufacturerOrderCode((PropertyManufacturerOrderCode)newValue);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE:
        getProductImage().clear();
        getProductImage().addAll((Collection<? extends FileProductImage>)newValue);
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID:
        setSemanticId((SID)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME:
        setManufacturerName((PropertyManufacturerName)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO:
        setManufacturerLogo((FileManufacturerLogo)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION:
        setManufacturerProductDesignation((MultiLanguagePropertyManufacturerProductDesignation)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER:
        setManufacturerPartNumber((PropertyManufacturerPartNumber)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE:
        setManufacturerOrderCode((PropertyManufacturerOrderCode)null);
        return;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE:
        getProductImage().clear();
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
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__SEMANTIC_ID:
        return semanticId != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_NAME:
        return manufacturerName != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_LOGO:
        return manufacturerLogo != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PRODUCT_DESIGNATION:
        return manufacturerProductDesignation != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_PART_NUMBER:
        return manufacturerPartNumber != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__MANUFACTURER_ORDER_CODE:
        return manufacturerOrderCode != null;
      case DslPackage.SUBMODEL_ELEMENT_COLLECTION_GENERAL_INFORMATION__PRODUCT_IMAGE:
        return productImage != null && !productImage.isEmpty();
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

} //SubmodelElementCollectionGeneralInformationImpl

/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.smartaas.nameplate.dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.smartaas.nameplate.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslSwitch<Adapter> modelSwitch =
    new DslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseNameplateSubmodel(NameplateSubmodel object)
      {
        return createNameplateSubmodelAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyManufacturerName(MultiLanguagePropertyManufacturerName object)
      {
        return createMultiLanguagePropertyManufacturerNameAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyManufacturerProductDesignation(MultiLanguagePropertyManufacturerProductDesignation object)
      {
        return createMultiLanguagePropertyManufacturerProductDesignationAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyManufacturerProductFamily(MultiLanguagePropertyManufacturerProductFamily object)
      {
        return createMultiLanguagePropertyManufacturerProductFamilyAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertySerialNumber(MultiLanguagePropertySerialNumber object)
      {
        return createMultiLanguagePropertySerialNumberAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyYearOfConstruction(MultiLanguagePropertyYearOfConstruction object)
      {
        return createMultiLanguagePropertyYearOfConstructionAdapter();
      }
      @Override
      public Adapter caseAddressSubmodelElementCollection(AddressSubmodelElementCollection object)
      {
        return createAddressSubmodelElementCollectionAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyDepartment(MultiLanguagePropertyDepartment object)
      {
        return createMultiLanguagePropertyDepartmentAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyStreet(MultiLanguagePropertyStreet object)
      {
        return createMultiLanguagePropertyStreetAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyZipcode(MultiLanguagePropertyZipcode object)
      {
        return createMultiLanguagePropertyZipcodeAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyPOBox(MultiLanguagePropertyPOBox object)
      {
        return createMultiLanguagePropertyPOBoxAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyZipCodeOfPOBox(MultiLanguagePropertyZipCodeOfPOBox object)
      {
        return createMultiLanguagePropertyZipCodeOfPOBoxAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyCityTown(MultiLanguagePropertyCityTown object)
      {
        return createMultiLanguagePropertyCityTownAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyStateCounty(MultiLanguagePropertyStateCounty object)
      {
        return createMultiLanguagePropertyStateCountyAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyNationalCode(MultiLanguagePropertyNationalCode object)
      {
        return createMultiLanguagePropertyNationalCodeAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyVATNumber(MultiLanguagePropertyVATNumber object)
      {
        return createMultiLanguagePropertyVATNumberAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyAddressRemarks(MultiLanguagePropertyAddressRemarks object)
      {
        return createMultiLanguagePropertyAddressRemarksAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyAddressOfAdditionalLink(MultiLanguagePropertyAddressOfAdditionalLink object)
      {
        return createMultiLanguagePropertyAddressOfAdditionalLinkAdapter();
      }
      @Override
      public Adapter casePhoneSubmodelElementCollection(PhoneSubmodelElementCollection object)
      {
        return createPhoneSubmodelElementCollectionAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyTelephoneNumber(MultiLanguagePropertyTelephoneNumber object)
      {
        return createMultiLanguagePropertyTelephoneNumberAdapter();
      }
      @Override
      public Adapter casePropertyTypeOfTelephone(PropertyTypeOfTelephone object)
      {
        return createPropertyTypeOfTelephoneAdapter();
      }
      @Override
      public Adapter caseFaxSubmodelElementCollection(FaxSubmodelElementCollection object)
      {
        return createFaxSubmodelElementCollectionAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyFax(MultiLanguagePropertyFax object)
      {
        return createMultiLanguagePropertyFaxAdapter();
      }
      @Override
      public Adapter casePropertyTypeOfFaxNumber(PropertyTypeOfFaxNumber object)
      {
        return createPropertyTypeOfFaxNumberAdapter();
      }
      @Override
      public Adapter caseEmailSubmodelElementCollection(EmailSubmodelElementCollection object)
      {
        return createEmailSubmodelElementCollectionAdapter();
      }
      @Override
      public Adapter casePropertyEmailAddress(PropertyEmailAddress object)
      {
        return createPropertyEmailAddressAdapter();
      }
      @Override
      public Adapter casePropertyTypeOfEmailAddress(PropertyTypeOfEmailAddress object)
      {
        return createPropertyTypeOfEmailAddressAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyPublicKey(MultiLanguagePropertyPublicKey object)
      {
        return createMultiLanguagePropertyPublicKeyAdapter();
      }
      @Override
      public Adapter caseMultiLanguagePropertyTypeOfPublickKey(MultiLanguagePropertyTypeOfPublickKey object)
      {
        return createMultiLanguagePropertyTypeOfPublickKeyAdapter();
      }
      @Override
      public Adapter caseSubmodelElementCollectionMarkings(SubmodelElementCollectionMarkings object)
      {
        return createSubmodelElementCollectionMarkingsAdapter();
      }
      @Override
      public Adapter caseSubmodelElementCollectionMarking(SubmodelElementCollectionMarking object)
      {
        return createSubmodelElementCollectionMarkingAdapter();
      }
      @Override
      public Adapter casePropertyMarkingName(PropertyMarkingName object)
      {
        return createPropertyMarkingNameAdapter();
      }
      @Override
      public Adapter caseFileMarkingFile(FileMarkingFile object)
      {
        return createFileMarkingFileAdapter();
      }
      @Override
      public Adapter casePropertyMarkingAdditionalText(PropertyMarkingAdditionalText object)
      {
        return createPropertyMarkingAdditionalTextAdapter();
      }
      @Override
      public Adapter caseSubmodelElementCollectionAssetSpecificProperties(SubmodelElementCollectionAssetSpecificProperties object)
      {
        return createSubmodelElementCollectionAssetSpecificPropertiesAdapter();
      }
      @Override
      public Adapter caseSubmodelElementCollectionGuidelineSpecificProperties(SubmodelElementCollectionGuidelineSpecificProperties object)
      {
        return createSubmodelElementCollectionGuidelineSpecificPropertiesAdapter();
      }
      @Override
      public Adapter casePropertyGuidelineForConformityDeclaration(PropertyGuidelineForConformityDeclaration object)
      {
        return createPropertyGuidelineForConformityDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyArbitrary(PropertyArbitrary object)
      {
        return createPropertyArbitraryAdapter();
      }
      @Override
      public Adapter caseSID(SID object)
      {
        return createSIDAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.NameplateSubmodel <em>Nameplate Submodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.NameplateSubmodel
   * @generated
   */
  public Adapter createNameplateSubmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerName <em>Multi Language Property Manufacturer Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerName
   * @generated
   */
  public Adapter createMultiLanguagePropertyManufacturerNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerProductDesignation <em>Multi Language Property Manufacturer Product Designation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerProductDesignation
   * @generated
   */
  public Adapter createMultiLanguagePropertyManufacturerProductDesignationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerProductFamily <em>Multi Language Property Manufacturer Product Family</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyManufacturerProductFamily
   * @generated
   */
  public Adapter createMultiLanguagePropertyManufacturerProductFamilyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertySerialNumber <em>Multi Language Property Serial Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertySerialNumber
   * @generated
   */
  public Adapter createMultiLanguagePropertySerialNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyYearOfConstruction <em>Multi Language Property Year Of Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyYearOfConstruction
   * @generated
   */
  public Adapter createMultiLanguagePropertyYearOfConstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.AddressSubmodelElementCollection <em>Address Submodel Element Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.AddressSubmodelElementCollection
   * @generated
   */
  public Adapter createAddressSubmodelElementCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyDepartment <em>Multi Language Property Department</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyDepartment
   * @generated
   */
  public Adapter createMultiLanguagePropertyDepartmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyStreet <em>Multi Language Property Street</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyStreet
   * @generated
   */
  public Adapter createMultiLanguagePropertyStreetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyZipcode <em>Multi Language Property Zipcode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyZipcode
   * @generated
   */
  public Adapter createMultiLanguagePropertyZipcodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyPOBox <em>Multi Language Property PO Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyPOBox
   * @generated
   */
  public Adapter createMultiLanguagePropertyPOBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyZipCodeOfPOBox <em>Multi Language Property Zip Code Of PO Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyZipCodeOfPOBox
   * @generated
   */
  public Adapter createMultiLanguagePropertyZipCodeOfPOBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyCityTown <em>Multi Language Property City Town</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyCityTown
   * @generated
   */
  public Adapter createMultiLanguagePropertyCityTownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyStateCounty <em>Multi Language Property State County</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyStateCounty
   * @generated
   */
  public Adapter createMultiLanguagePropertyStateCountyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyNationalCode <em>Multi Language Property National Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyNationalCode
   * @generated
   */
  public Adapter createMultiLanguagePropertyNationalCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber <em>Multi Language Property VAT Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber
   * @generated
   */
  public Adapter createMultiLanguagePropertyVATNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyAddressRemarks <em>Multi Language Property Address Remarks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyAddressRemarks
   * @generated
   */
  public Adapter createMultiLanguagePropertyAddressRemarksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyAddressOfAdditionalLink <em>Multi Language Property Address Of Additional Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyAddressOfAdditionalLink
   * @generated
   */
  public Adapter createMultiLanguagePropertyAddressOfAdditionalLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PhoneSubmodelElementCollection <em>Phone Submodel Element Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PhoneSubmodelElementCollection
   * @generated
   */
  public Adapter createPhoneSubmodelElementCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyTelephoneNumber <em>Multi Language Property Telephone Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyTelephoneNumber
   * @generated
   */
  public Adapter createMultiLanguagePropertyTelephoneNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyTypeOfTelephone <em>Property Type Of Telephone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyTypeOfTelephone
   * @generated
   */
  public Adapter createPropertyTypeOfTelephoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection <em>Fax Submodel Element Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection
   * @generated
   */
  public Adapter createFaxSubmodelElementCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyFax <em>Multi Language Property Fax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyFax
   * @generated
   */
  public Adapter createMultiLanguagePropertyFaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyTypeOfFaxNumber <em>Property Type Of Fax Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyTypeOfFaxNumber
   * @generated
   */
  public Adapter createPropertyTypeOfFaxNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection <em>Email Submodel Element Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection
   * @generated
   */
  public Adapter createEmailSubmodelElementCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyEmailAddress <em>Property Email Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyEmailAddress
   * @generated
   */
  public Adapter createPropertyEmailAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyTypeOfEmailAddress <em>Property Type Of Email Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyTypeOfEmailAddress
   * @generated
   */
  public Adapter createPropertyTypeOfEmailAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyPublicKey <em>Multi Language Property Public Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyPublicKey
   * @generated
   */
  public Adapter createMultiLanguagePropertyPublicKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyTypeOfPublickKey <em>Multi Language Property Type Of Publick Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyTypeOfPublickKey
   * @generated
   */
  public Adapter createMultiLanguagePropertyTypeOfPublickKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionMarkings <em>Submodel Element Collection Markings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionMarkings
   * @generated
   */
  public Adapter createSubmodelElementCollectionMarkingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionMarking <em>Submodel Element Collection Marking</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionMarking
   * @generated
   */
  public Adapter createSubmodelElementCollectionMarkingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyMarkingName <em>Property Marking Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyMarkingName
   * @generated
   */
  public Adapter createPropertyMarkingNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.FileMarkingFile <em>File Marking File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.FileMarkingFile
   * @generated
   */
  public Adapter createFileMarkingFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyMarkingAdditionalText <em>Property Marking Additional Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyMarkingAdditionalText
   * @generated
   */
  public Adapter createPropertyMarkingAdditionalTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties <em>Submodel Element Collection Asset Specific Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties
   * @generated
   */
  public Adapter createSubmodelElementCollectionAssetSpecificPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionGuidelineSpecificProperties <em>Submodel Element Collection Guideline Specific Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionGuidelineSpecificProperties
   * @generated
   */
  public Adapter createSubmodelElementCollectionGuidelineSpecificPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyGuidelineForConformityDeclaration <em>Property Guideline For Conformity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyGuidelineForConformityDeclaration
   * @generated
   */
  public Adapter createPropertyGuidelineForConformityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.PropertyArbitrary <em>Property Arbitrary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.PropertyArbitrary
   * @generated
   */
  public Adapter createPropertyArbitraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.smartaas.nameplate.dsl.SID <em>SID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.smartaas.nameplate.dsl.SID
   * @generated
   */
  public Adapter createSIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslAdapterFactory

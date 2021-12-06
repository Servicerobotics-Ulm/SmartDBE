/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.sms.dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.smartaas.sms.dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DslFactory init()
  {
    try
    {
      DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
      if (theDslFactory != null)
      {
        return theDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DslPackage.MODEL: return createModel();
      case DslPackage.SMSIN_TYPE: return createSMSINType();
      case DslPackage.SMSIN_TYPE_COMMAND: return createSMSINTypeCommand();
      case DslPackage.SMSIN_TYPE_NAMEPLATE: return createSMSINTypeNameplate();
      case DslPackage.SMSIN_TYPE_TECHNICAL_DATA: return createSMSINTypeTechnicalData();
      case DslPackage.ANY: return createany();
      case DslPackage.A1: return createa1();
      case DslPackage.A2: return createa2();
      case DslPackage.A3: return createa3();
      case DslPackage.A4: return createa4();
      case DslPackage.A5: return createa5();
      case DslPackage.B1: return createb1();
      case DslPackage.B2: return createb2();
      case DslPackage.B3: return createb3();
      case DslPackage.B4: return createb4();
      case DslPackage.B5: return createb5();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMSINType createSMSINType()
  {
    SMSINTypeImpl smsinType = new SMSINTypeImpl();
    return smsinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMSINTypeCommand createSMSINTypeCommand()
  {
    SMSINTypeCommandImpl smsinTypeCommand = new SMSINTypeCommandImpl();
    return smsinTypeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMSINTypeNameplate createSMSINTypeNameplate()
  {
    SMSINTypeNameplateImpl smsinTypeNameplate = new SMSINTypeNameplateImpl();
    return smsinTypeNameplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMSINTypeTechnicalData createSMSINTypeTechnicalData()
  {
    SMSINTypeTechnicalDataImpl smsinTypeTechnicalData = new SMSINTypeTechnicalDataImpl();
    return smsinTypeTechnicalData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public any createany()
  {
    anyImpl any = new anyImpl();
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public a1 createa1()
  {
    a1Impl a1 = new a1Impl();
    return a1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public a2 createa2()
  {
    a2Impl a2 = new a2Impl();
    return a2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public a3 createa3()
  {
    a3Impl a3 = new a3Impl();
    return a3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public a4 createa4()
  {
    a4Impl a4 = new a4Impl();
    return a4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public a5 createa5()
  {
    a5Impl a5 = new a5Impl();
    return a5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public b1 createb1()
  {
    b1Impl b1 = new b1Impl();
    return b1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public b2 createb2()
  {
    b2Impl b2 = new b2Impl();
    return b2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public b3 createb3()
  {
    b3Impl b3 = new b3Impl();
    return b3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public b4 createb4()
  {
    b4Impl b4 = new b4Impl();
    return b4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public b5 createb5()
  {
    b5Impl b5 = new b5Impl();
    return b5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DslPackage getDslPackage()
  {
    return (DslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DslPackage getPackage()
  {
    return DslPackage.eINSTANCE;
  }

} //DslFactoryImpl
/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.sms.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.smartaas.sms.dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.smartaas.sms.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMSIN_TYPE:
      {
        SMSINType smsinType = (SMSINType)theEObject;
        T result = caseSMSINType(smsinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMSIN_TYPE_COMMAND:
      {
        SMSINTypeCommand smsinTypeCommand = (SMSINTypeCommand)theEObject;
        T result = caseSMSINTypeCommand(smsinTypeCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMSIN_TYPE_NAMEPLATE:
      {
        SMSINTypeNameplate smsinTypeNameplate = (SMSINTypeNameplate)theEObject;
        T result = caseSMSINTypeNameplate(smsinTypeNameplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMSIN_TYPE_TECHNICAL_DATA:
      {
        SMSINTypeTechnicalData smsinTypeTechnicalData = (SMSINTypeTechnicalData)theEObject;
        T result = caseSMSINTypeTechnicalData(smsinTypeTechnicalData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ANY:
      {
        any any = (any)theEObject;
        T result = caseany(any);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.A1:
      {
        a1 a1 = (a1)theEObject;
        T result = casea1(a1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.A2:
      {
        a2 a2 = (a2)theEObject;
        T result = casea2(a2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.A3:
      {
        a3 a3 = (a3)theEObject;
        T result = casea3(a3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.A4:
      {
        a4 a4 = (a4)theEObject;
        T result = casea4(a4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.A5:
      {
        a5 a5 = (a5)theEObject;
        T result = casea5(a5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.B1:
      {
        b1 b1 = (b1)theEObject;
        T result = caseb1(b1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.B2:
      {
        b2 b2 = (b2)theEObject;
        T result = caseb2(b2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.B3:
      {
        b3 b3 = (b3)theEObject;
        T result = caseb3(b3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.B4:
      {
        b4 b4 = (b4)theEObject;
        T result = caseb4(b4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.B5:
      {
        b5 b5 = (b5)theEObject;
        T result = caseb5(b5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMSIN Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMSIN Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMSINType(SMSINType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMSIN Type Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMSIN Type Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMSINTypeCommand(SMSINTypeCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMSIN Type Nameplate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMSIN Type Nameplate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMSINTypeNameplate(SMSINTypeNameplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMSIN Type Technical Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMSIN Type Technical Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMSINTypeTechnicalData(SMSINTypeTechnicalData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>any</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>any</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseany(any object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>a1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>a1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea1(a1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>a2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>a2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea2(a2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>a3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>a3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea3(a3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>a4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>a4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea4(a4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>a5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>a5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea5(a5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>b1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>b1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseb1(b1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>b2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>b2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseb2(b2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>b3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>b3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseb3(b3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>b4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>b4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseb4(b4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>b5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>b5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseb5(b5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch

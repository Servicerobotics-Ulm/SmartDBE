/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.command.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.smartaas.command.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = org.xtext.smartaas.command.dsl.impl.DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Command Submodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Submodel</em>'.
   * @generated
   */
  CommandSubmodel createCommandSubmodel();

  /**
   * Returns a new object of class '<em>Command Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Text</em>'.
   * @generated
   */
  CommandText createCommandText();

  /**
   * Returns a new object of class '<em>SID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SID</em>'.
   * @generated
   */
  SID createSID();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory
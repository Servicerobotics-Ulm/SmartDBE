/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Language Property VAT Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getMultiLanguagePropertyVATNumber()
 * @model
 * @generated
 */
public interface MultiLanguagePropertyVATNumber extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getMultiLanguagePropertyVATNumber_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Semantic Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semantic Id</em>' containment reference.
   * @see #setSemanticId(SID)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getMultiLanguagePropertyVATNumber_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.MultiLanguagePropertyVATNumber#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

} // MultiLanguagePropertyVATNumber

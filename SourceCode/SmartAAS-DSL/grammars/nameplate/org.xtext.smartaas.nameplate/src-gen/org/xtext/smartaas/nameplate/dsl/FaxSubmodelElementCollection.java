/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fax Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getFaxNumber <em>Fax Number</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getTypeOfFaxNumber <em>Type Of Fax Number</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getFaxSubmodelElementCollection()
 * @model
 * @generated
 */
public interface FaxSubmodelElementCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getFaxSubmodelElementCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getFaxSubmodelElementCollection_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

  /**
   * Returns the value of the '<em><b>Fax Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fax Number</em>' containment reference.
   * @see #setFaxNumber(MultiLanguagePropertyFax)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getFaxSubmodelElementCollection_FaxNumber()
   * @model containment="true"
   * @generated
   */
  MultiLanguagePropertyFax getFaxNumber();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getFaxNumber <em>Fax Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fax Number</em>' containment reference.
   * @see #getFaxNumber()
   * @generated
   */
  void setFaxNumber(MultiLanguagePropertyFax value);

  /**
   * Returns the value of the '<em><b>Type Of Fax Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Of Fax Number</em>' containment reference.
   * @see #setTypeOfFaxNumber(PropertyTypeOfFaxNumber)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getFaxSubmodelElementCollection_TypeOfFaxNumber()
   * @model containment="true"
   * @generated
   */
  PropertyTypeOfFaxNumber getTypeOfFaxNumber();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.FaxSubmodelElementCollection#getTypeOfFaxNumber <em>Type Of Fax Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Of Fax Number</em>' containment reference.
   * @see #getTypeOfFaxNumber()
   * @generated
   */
  void setTypeOfFaxNumber(PropertyTypeOfFaxNumber value);

} // FaxSubmodelElementCollection

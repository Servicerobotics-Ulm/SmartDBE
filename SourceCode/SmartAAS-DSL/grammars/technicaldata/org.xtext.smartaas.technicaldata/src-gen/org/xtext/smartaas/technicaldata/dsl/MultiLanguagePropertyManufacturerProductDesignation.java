/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Language Property Manufacturer Product Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyManufacturerProductDesignation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyManufacturerProductDesignation#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getMultiLanguagePropertyManufacturerProductDesignation()
 * @model
 * @generated
 */
public interface MultiLanguagePropertyManufacturerProductDesignation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getMultiLanguagePropertyManufacturerProductDesignation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyManufacturerProductDesignation#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getMultiLanguagePropertyManufacturerProductDesignation_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyManufacturerProductDesignation#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

} // MultiLanguagePropertyManufacturerProductDesignation

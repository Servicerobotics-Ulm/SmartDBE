/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Product Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.FileProductImage#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.FileProductImage#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getFileProductImage()
 * @model
 * @generated
 */
public interface FileProductImage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getFileProductImage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.FileProductImage#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getFileProductImage_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.FileProductImage#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

} // FileProductImage

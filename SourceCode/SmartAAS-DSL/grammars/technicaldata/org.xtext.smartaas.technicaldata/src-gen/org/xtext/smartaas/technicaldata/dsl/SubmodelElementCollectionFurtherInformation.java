/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element Collection Further Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getTextStatement <em>Text Statement</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionFurtherInformation()
 * @model
 * @generated
 */
public interface SubmodelElementCollectionFurtherInformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionFurtherInformation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionFurtherInformation_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

  /**
   * Returns the value of the '<em><b>Text Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smartaas.technicaldata.dsl.MultiLanguagePropertyTextStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Statement</em>' containment reference list.
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionFurtherInformation_TextStatement()
   * @model containment="true"
   * @generated
   */
  EList<MultiLanguagePropertyTextStatement> getTextStatement();

  /**
   * Returns the value of the '<em><b>Valid Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid Date</em>' containment reference.
   * @see #setValidDate(PropertyValidDate)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionFurtherInformation_ValidDate()
   * @model containment="true"
   * @generated
   */
  PropertyValidDate getValidDate();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionFurtherInformation#getValidDate <em>Valid Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Date</em>' containment reference.
   * @see #getValidDate()
   * @generated
   */
  void setValidDate(PropertyValidDate value);

} // SubmodelElementCollectionFurtherInformation
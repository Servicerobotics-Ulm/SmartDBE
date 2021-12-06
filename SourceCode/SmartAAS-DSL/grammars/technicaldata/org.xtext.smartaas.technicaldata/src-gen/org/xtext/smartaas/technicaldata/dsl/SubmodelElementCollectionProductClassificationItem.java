/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.technicaldata.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element Collection Product Classification Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getProductClassificationSystem <em>Product Classification System</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getClassificationSystemVersion <em>Classification System Version</em>}</li>
 *   <li>{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getProductClassId <em>Product Class Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem()
 * @model
 * @generated
 */
public interface SubmodelElementCollectionProductClassificationItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

  /**
   * Returns the value of the '<em><b>Product Classification System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Classification System</em>' containment reference.
   * @see #setProductClassificationSystem(PropertyProductClassificationSystem)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem_ProductClassificationSystem()
   * @model containment="true"
   * @generated
   */
  PropertyProductClassificationSystem getProductClassificationSystem();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getProductClassificationSystem <em>Product Classification System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Classification System</em>' containment reference.
   * @see #getProductClassificationSystem()
   * @generated
   */
  void setProductClassificationSystem(PropertyProductClassificationSystem value);

  /**
   * Returns the value of the '<em><b>Classification System Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classification System Version</em>' containment reference.
   * @see #setClassificationSystemVersion(PropertyClassificationSystemVersion)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem_ClassificationSystemVersion()
   * @model containment="true"
   * @generated
   */
  PropertyClassificationSystemVersion getClassificationSystemVersion();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getClassificationSystemVersion <em>Classification System Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classification System Version</em>' containment reference.
   * @see #getClassificationSystemVersion()
   * @generated
   */
  void setClassificationSystemVersion(PropertyClassificationSystemVersion value);

  /**
   * Returns the value of the '<em><b>Product Class Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Class Id</em>' containment reference.
   * @see #setProductClassId(PropertyProductClassId)
   * @see org.xtext.smartaas.technicaldata.dsl.DslPackage#getSubmodelElementCollectionProductClassificationItem_ProductClassId()
   * @model containment="true"
   * @generated
   */
  PropertyProductClassId getProductClassId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.technicaldata.dsl.SubmodelElementCollectionProductClassificationItem#getProductClassId <em>Product Class Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Class Id</em>' containment reference.
   * @see #getProductClassId()
   * @generated
   */
  void setProductClassId(PropertyProductClassId value);

} // SubmodelElementCollectionProductClassificationItem
/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element Collection Asset Specific Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties#getGuidelineSpecificProperties <em>Guideline Specific Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getSubmodelElementCollectionAssetSpecificProperties()
 * @model
 * @generated
 */
public interface SubmodelElementCollectionAssetSpecificProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getSubmodelElementCollectionAssetSpecificProperties_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getSubmodelElementCollectionAssetSpecificProperties_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionAssetSpecificProperties#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

  /**
   * Returns the value of the '<em><b>Guideline Specific Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smartaas.nameplate.dsl.SubmodelElementCollectionGuidelineSpecificProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guideline Specific Properties</em>' containment reference list.
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getSubmodelElementCollectionAssetSpecificProperties_GuidelineSpecificProperties()
   * @model containment="true"
   * @generated
   */
  EList<SubmodelElementCollectionGuidelineSpecificProperties> getGuidelineSpecificProperties();

} // SubmodelElementCollectionAssetSpecificProperties
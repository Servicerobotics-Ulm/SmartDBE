/**
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.nameplate.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getTypeOfEmailAddress <em>Type Of Email Address</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getTypeOfPublickKey <em>Type Of Publick Key</em>}</li>
 * </ul>
 *
 * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection()
 * @model
 * @generated
 */
public interface EmailSubmodelElementCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_SemanticId()
   * @model containment="true"
   * @generated
   */
  SID getSemanticId();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getSemanticId <em>Semantic Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic Id</em>' containment reference.
   * @see #getSemanticId()
   * @generated
   */
  void setSemanticId(SID value);

  /**
   * Returns the value of the '<em><b>Email Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email Address</em>' containment reference.
   * @see #setEmailAddress(PropertyEmailAddress)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_EmailAddress()
   * @model containment="true"
   * @generated
   */
  PropertyEmailAddress getEmailAddress();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getEmailAddress <em>Email Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email Address</em>' containment reference.
   * @see #getEmailAddress()
   * @generated
   */
  void setEmailAddress(PropertyEmailAddress value);

  /**
   * Returns the value of the '<em><b>Type Of Email Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Of Email Address</em>' containment reference.
   * @see #setTypeOfEmailAddress(PropertyTypeOfEmailAddress)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_TypeOfEmailAddress()
   * @model containment="true"
   * @generated
   */
  PropertyTypeOfEmailAddress getTypeOfEmailAddress();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getTypeOfEmailAddress <em>Type Of Email Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Of Email Address</em>' containment reference.
   * @see #getTypeOfEmailAddress()
   * @generated
   */
  void setTypeOfEmailAddress(PropertyTypeOfEmailAddress value);

  /**
   * Returns the value of the '<em><b>Public Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public Key</em>' containment reference.
   * @see #setPublicKey(MultiLanguagePropertyPublicKey)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_PublicKey()
   * @model containment="true"
   * @generated
   */
  MultiLanguagePropertyPublicKey getPublicKey();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getPublicKey <em>Public Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Public Key</em>' containment reference.
   * @see #getPublicKey()
   * @generated
   */
  void setPublicKey(MultiLanguagePropertyPublicKey value);

  /**
   * Returns the value of the '<em><b>Type Of Publick Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Of Publick Key</em>' containment reference.
   * @see #setTypeOfPublickKey(MultiLanguagePropertyTypeOfPublickKey)
   * @see org.xtext.smartaas.nameplate.dsl.DslPackage#getEmailSubmodelElementCollection_TypeOfPublickKey()
   * @model containment="true"
   * @generated
   */
  MultiLanguagePropertyTypeOfPublickKey getTypeOfPublickKey();

  /**
   * Sets the value of the '{@link org.xtext.smartaas.nameplate.dsl.EmailSubmodelElementCollection#getTypeOfPublickKey <em>Type Of Publick Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Of Publick Key</em>' containment reference.
   * @see #getTypeOfPublickKey()
   * @generated
   */
  void setTypeOfPublickKey(MultiLanguagePropertyTypeOfPublickKey value);

} // EmailSubmodelElementCollection

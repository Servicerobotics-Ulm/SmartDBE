package org.xtext.smartaas.nameplate.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smartaas.nameplate.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AAS'", "'::'", "'Nameplate'", "'[['", "']]'", "'{'", "';'", "'}'", "'ManufacturerName'", "':'", "'ManufacturerProductDesignation'", "'ManufacturerProductFamily'", "'SerialNumber'", "'YearOfConstruction'", "'Address'", "'Department'", "'Street'", "'Zipcode'", "'POBox'", "'ZipCodeOfPOBox'", "'CityTown'", "'StateCounty'", "'NationalCode'", "'VATNumber'", "'AddressRemarks'", "'AddressOfAdditionalLink'", "'Phone'", "'TelephoneNumber'", "'TypeOfTelephone'", "'Fax'", "'FaxNumber'", "'TypeOfFaxNumber'", "'Email'", "'EmailAddress'", "'TypeOfEmailAddress'", "'PublicKey'", "'TypeOfPublickKey'", "'Markings'", "'Marking'", "'MarkingName'", "'MarkingFile'", "'MarkingAdditionalText'", "'AssetSpecificProperties'", "'GuidelineSpecificProperties'", "'GuidelineForConformityDeclaration'", "'Arbitrary'", "'SemanticId'", "'|'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_nameplate_0_0= ruleNameplateSubmodel ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nameplate_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_nameplate_0_0= ruleNameplateSubmodel ) ) )
            // InternalDsl.g:78:2: ( (lv_nameplate_0_0= ruleNameplateSubmodel ) )
            {
            // InternalDsl.g:78:2: ( (lv_nameplate_0_0= ruleNameplateSubmodel ) )
            // InternalDsl.g:79:3: (lv_nameplate_0_0= ruleNameplateSubmodel )
            {
            // InternalDsl.g:79:3: (lv_nameplate_0_0= ruleNameplateSubmodel )
            // InternalDsl.g:80:4: lv_nameplate_0_0= ruleNameplateSubmodel
            {

            				newCompositeNode(grammarAccess.getModelAccess().getNameplateNameplateSubmodelParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nameplate_0_0=ruleNameplateSubmodel();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"nameplate",
            					lv_nameplate_0_0,
            					"org.xtext.smartaas.nameplate.Dsl.NameplateSubmodel");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNameplateSubmodel"
    // InternalDsl.g:100:1: entryRuleNameplateSubmodel returns [EObject current=null] : iv_ruleNameplateSubmodel= ruleNameplateSubmodel EOF ;
    public final EObject entryRuleNameplateSubmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameplateSubmodel = null;


        try {
            // InternalDsl.g:100:58: (iv_ruleNameplateSubmodel= ruleNameplateSubmodel EOF )
            // InternalDsl.g:101:2: iv_ruleNameplateSubmodel= ruleNameplateSubmodel EOF
            {
             newCompositeNode(grammarAccess.getNameplateSubmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameplateSubmodel=ruleNameplateSubmodel();

            state._fsp--;

             current =iv_ruleNameplateSubmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameplateSubmodel"


    // $ANTLR start "ruleNameplateSubmodel"
    // InternalDsl.g:107:1: ruleNameplateSubmodel returns [EObject current=null] : (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'Nameplate' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) ) otherlv_9= ';' ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_11= ';' ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) ) otherlv_13= ';' ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) ) otherlv_15= ';' ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )? ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) ) otherlv_19= ';' ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )? ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )? otherlv_24= '}' ) ;
    public final EObject ruleNameplateSubmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_SemanticId_5_0 = null;

        EObject lv_ManufacturerName_8_0 = null;

        EObject lv_ManufacturerProductDesignation_10_0 = null;

        EObject lv_Address_12_0 = null;

        EObject lv_ManufacturerProductFamily_14_0 = null;

        EObject lv_SerialNumber_16_0 = null;

        EObject lv_YearOfConstruction_18_0 = null;

        EObject lv_Markings_20_0 = null;

        EObject lv_AssetSpecificProperties_22_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'Nameplate' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) ) otherlv_9= ';' ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_11= ';' ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) ) otherlv_13= ';' ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) ) otherlv_15= ';' ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )? ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) ) otherlv_19= ';' ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )? ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )? otherlv_24= '}' ) )
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'Nameplate' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) ) otherlv_9= ';' ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_11= ';' ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) ) otherlv_13= ';' ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) ) otherlv_15= ';' ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )? ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) ) otherlv_19= ';' ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )? ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )? otherlv_24= '}' )
            {
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'Nameplate' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) ) otherlv_9= ';' ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_11= ';' ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) ) otherlv_13= ';' ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) ) otherlv_15= ';' ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )? ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) ) otherlv_19= ';' ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )? ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )? otherlv_24= '}' )
            // InternalDsl.g:115:3: otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'Nameplate' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) ) otherlv_9= ';' ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_11= ';' ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) ) otherlv_13= ';' ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) ) otherlv_15= ';' ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )? ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) ) otherlv_19= ';' ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )? ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNameplateSubmodelAccess().getAASKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNameplateSubmodelAccess().getColonColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNameplateSubmodelAccess().getNameplateKeyword_2());
            		
            // InternalDsl.g:127:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:129:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getNameplateSubmodelAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameplateSubmodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getNameplateSubmodelAccess().getLeftSquareBracketLeftSquareBracketKeyword_4());
            		
            // InternalDsl.g:149:3: ( (lv_SemanticId_5_0= ruleSID ) )
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            {
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            // InternalDsl.g:151:5: lv_SemanticId_5_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getSemanticIdSIDParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_5_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_5_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getNameplateSubmodelAccess().getRightSquareBracketRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getNameplateSubmodelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDsl.g:176:3: ( (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName ) )
            // InternalDsl.g:177:4: (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName )
            {
            // InternalDsl.g:177:4: (lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName )
            // InternalDsl.g:178:5: lv_ManufacturerName_8_0= ruleMultiLanguagePropertyManufacturerName
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getManufacturerNameMultiLanguagePropertyManufacturerNameParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerName_8_0=ruleMultiLanguagePropertyManufacturerName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"ManufacturerName",
            						lv_ManufacturerName_8_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyManufacturerName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_9());
            		
            // InternalDsl.g:199:3: ( (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) )
            // InternalDsl.g:200:4: (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation )
            {
            // InternalDsl.g:200:4: (lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation )
            // InternalDsl.g:201:5: lv_ManufacturerProductDesignation_10_0= ruleMultiLanguagePropertyManufacturerProductDesignation
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getManufacturerProductDesignationMultiLanguagePropertyManufacturerProductDesignationParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerProductDesignation_10_0=ruleMultiLanguagePropertyManufacturerProductDesignation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"ManufacturerProductDesignation",
            						lv_ManufacturerProductDesignation_10_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyManufacturerProductDesignation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_11());
            		
            // InternalDsl.g:222:3: ( (lv_Address_12_0= ruleAddressSubmodelElementCollection ) )
            // InternalDsl.g:223:4: (lv_Address_12_0= ruleAddressSubmodelElementCollection )
            {
            // InternalDsl.g:223:4: (lv_Address_12_0= ruleAddressSubmodelElementCollection )
            // InternalDsl.g:224:5: lv_Address_12_0= ruleAddressSubmodelElementCollection
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getAddressAddressSubmodelElementCollectionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_Address_12_0=ruleAddressSubmodelElementCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"Address",
            						lv_Address_12_0,
            						"org.xtext.smartaas.nameplate.Dsl.AddressSubmodelElementCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_13());
            		
            // InternalDsl.g:245:3: ( (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily ) )
            // InternalDsl.g:246:4: (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily )
            {
            // InternalDsl.g:246:4: (lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily )
            // InternalDsl.g:247:5: lv_ManufacturerProductFamily_14_0= ruleMultiLanguagePropertyManufacturerProductFamily
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getManufacturerProductFamilyMultiLanguagePropertyManufacturerProductFamilyParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerProductFamily_14_0=ruleMultiLanguagePropertyManufacturerProductFamily();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"ManufacturerProductFamily",
            						lv_ManufacturerProductFamily_14_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyManufacturerProductFamily");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_15());
            		
            // InternalDsl.g:268:3: ( ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:269:4: ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) ) otherlv_17= ';'
                    {
                    // InternalDsl.g:269:4: ( (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber ) )
                    // InternalDsl.g:270:5: (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber )
                    {
                    // InternalDsl.g:270:5: (lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber )
                    // InternalDsl.g:271:6: lv_SerialNumber_16_0= ruleMultiLanguagePropertySerialNumber
                    {

                    						newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getSerialNumberMultiLanguagePropertySerialNumberParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_SerialNumber_16_0=ruleMultiLanguagePropertySerialNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"SerialNumber",
                    							lv_SerialNumber_16_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertySerialNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_17, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_16_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:293:3: ( (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction ) )
            // InternalDsl.g:294:4: (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction )
            {
            // InternalDsl.g:294:4: (lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction )
            // InternalDsl.g:295:5: lv_YearOfConstruction_18_0= ruleMultiLanguagePropertyYearOfConstruction
            {

            					newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getYearOfConstructionMultiLanguagePropertyYearOfConstructionParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_11);
            lv_YearOfConstruction_18_0=ruleMultiLanguagePropertyYearOfConstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
            					}
            					set(
            						current,
            						"YearOfConstruction",
            						lv_YearOfConstruction_18_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyYearOfConstruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_19, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_18());
            		
            // InternalDsl.g:316:3: ( ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:317:4: ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) ) otherlv_21= ';'
                    {
                    // InternalDsl.g:317:4: ( (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings ) )
                    // InternalDsl.g:318:5: (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings )
                    {
                    // InternalDsl.g:318:5: (lv_Markings_20_0= ruleSubmodelElementCollectionMarkings )
                    // InternalDsl.g:319:6: lv_Markings_20_0= ruleSubmodelElementCollectionMarkings
                    {

                    						newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getMarkingsSubmodelElementCollectionMarkingsParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_Markings_20_0=ruleSubmodelElementCollectionMarkings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"Markings",
                    							lv_Markings_20_0,
                    							"org.xtext.smartaas.nameplate.Dsl.SubmodelElementCollectionMarkings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_19_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:341:3: ( ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==53) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:342:4: ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) ) otherlv_23= ';'
                    {
                    // InternalDsl.g:342:4: ( (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties ) )
                    // InternalDsl.g:343:5: (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties )
                    {
                    // InternalDsl.g:343:5: (lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties )
                    // InternalDsl.g:344:6: lv_AssetSpecificProperties_22_0= ruleSubmodelElementCollectionAssetSpecificProperties
                    {

                    						newCompositeNode(grammarAccess.getNameplateSubmodelAccess().getAssetSpecificPropertiesSubmodelElementCollectionAssetSpecificPropertiesParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_AssetSpecificProperties_22_0=ruleSubmodelElementCollectionAssetSpecificProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameplateSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"AssetSpecificProperties",
                    							lv_AssetSpecificProperties_22_0,
                    							"org.xtext.smartaas.nameplate.Dsl.SubmodelElementCollectionAssetSpecificProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_23, grammarAccess.getNameplateSubmodelAccess().getSemicolonKeyword_20_1());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getNameplateSubmodelAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameplateSubmodel"


    // $ANTLR start "entryRuleMultiLanguagePropertyManufacturerName"
    // InternalDsl.g:374:1: entryRuleMultiLanguagePropertyManufacturerName returns [EObject current=null] : iv_ruleMultiLanguagePropertyManufacturerName= ruleMultiLanguagePropertyManufacturerName EOF ;
    public final EObject entryRuleMultiLanguagePropertyManufacturerName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyManufacturerName = null;


        try {
            // InternalDsl.g:374:78: (iv_ruleMultiLanguagePropertyManufacturerName= ruleMultiLanguagePropertyManufacturerName EOF )
            // InternalDsl.g:375:2: iv_ruleMultiLanguagePropertyManufacturerName= ruleMultiLanguagePropertyManufacturerName EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyManufacturerName=ruleMultiLanguagePropertyManufacturerName();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyManufacturerName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyManufacturerName"


    // $ANTLR start "ruleMultiLanguagePropertyManufacturerName"
    // InternalDsl.g:381:1: ruleMultiLanguagePropertyManufacturerName returns [EObject current=null] : (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyManufacturerName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:387:2: ( (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:388:2: (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:388:2: (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:389:3: otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getManufacturerNameKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getColonKeyword_1());
            		
            // InternalDsl.g:397:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:398:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:398:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:399:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyManufacturerNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:419:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:420:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:420:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:421:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyManufacturerNameRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyManufacturerNameAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyManufacturerName"


    // $ANTLR start "entryRuleMultiLanguagePropertyManufacturerProductDesignation"
    // InternalDsl.g:446:1: entryRuleMultiLanguagePropertyManufacturerProductDesignation returns [EObject current=null] : iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF ;
    public final EObject entryRuleMultiLanguagePropertyManufacturerProductDesignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyManufacturerProductDesignation = null;


        try {
            // InternalDsl.g:446:92: (iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF )
            // InternalDsl.g:447:2: iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyManufacturerProductDesignation=ruleMultiLanguagePropertyManufacturerProductDesignation();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyManufacturerProductDesignation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyManufacturerProductDesignation"


    // $ANTLR start "ruleMultiLanguagePropertyManufacturerProductDesignation"
    // InternalDsl.g:453:1: ruleMultiLanguagePropertyManufacturerProductDesignation returns [EObject current=null] : (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyManufacturerProductDesignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:459:2: ( (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:460:2: (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:460:2: (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:461:3: otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getManufacturerProductDesignationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getColonKeyword_1());
            		
            // InternalDsl.g:469:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:470:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:470:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:471:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:491:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:492:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:492:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:493:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyManufacturerProductDesignation"


    // $ANTLR start "entryRuleMultiLanguagePropertyManufacturerProductFamily"
    // InternalDsl.g:518:1: entryRuleMultiLanguagePropertyManufacturerProductFamily returns [EObject current=null] : iv_ruleMultiLanguagePropertyManufacturerProductFamily= ruleMultiLanguagePropertyManufacturerProductFamily EOF ;
    public final EObject entryRuleMultiLanguagePropertyManufacturerProductFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyManufacturerProductFamily = null;


        try {
            // InternalDsl.g:518:87: (iv_ruleMultiLanguagePropertyManufacturerProductFamily= ruleMultiLanguagePropertyManufacturerProductFamily EOF )
            // InternalDsl.g:519:2: iv_ruleMultiLanguagePropertyManufacturerProductFamily= ruleMultiLanguagePropertyManufacturerProductFamily EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyManufacturerProductFamily=ruleMultiLanguagePropertyManufacturerProductFamily();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyManufacturerProductFamily; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyManufacturerProductFamily"


    // $ANTLR start "ruleMultiLanguagePropertyManufacturerProductFamily"
    // InternalDsl.g:525:1: ruleMultiLanguagePropertyManufacturerProductFamily returns [EObject current=null] : (otherlv_0= 'ManufacturerProductFamily' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyManufacturerProductFamily() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:531:2: ( (otherlv_0= 'ManufacturerProductFamily' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:532:2: (otherlv_0= 'ManufacturerProductFamily' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:532:2: (otherlv_0= 'ManufacturerProductFamily' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:533:3: otherlv_0= 'ManufacturerProductFamily' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getManufacturerProductFamilyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:541:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:542:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:542:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:543:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:563:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:564:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:564:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:565:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyManufacturerProductFamilyAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyManufacturerProductFamily"


    // $ANTLR start "entryRuleMultiLanguagePropertySerialNumber"
    // InternalDsl.g:590:1: entryRuleMultiLanguagePropertySerialNumber returns [EObject current=null] : iv_ruleMultiLanguagePropertySerialNumber= ruleMultiLanguagePropertySerialNumber EOF ;
    public final EObject entryRuleMultiLanguagePropertySerialNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertySerialNumber = null;


        try {
            // InternalDsl.g:590:74: (iv_ruleMultiLanguagePropertySerialNumber= ruleMultiLanguagePropertySerialNumber EOF )
            // InternalDsl.g:591:2: iv_ruleMultiLanguagePropertySerialNumber= ruleMultiLanguagePropertySerialNumber EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertySerialNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertySerialNumber=ruleMultiLanguagePropertySerialNumber();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertySerialNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertySerialNumber"


    // $ANTLR start "ruleMultiLanguagePropertySerialNumber"
    // InternalDsl.g:597:1: ruleMultiLanguagePropertySerialNumber returns [EObject current=null] : (otherlv_0= 'SerialNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertySerialNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:603:2: ( (otherlv_0= 'SerialNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:604:2: (otherlv_0= 'SerialNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:604:2: (otherlv_0= 'SerialNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:605:3: otherlv_0= 'SerialNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertySerialNumberAccess().getSerialNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertySerialNumberAccess().getColonKeyword_1());
            		
            // InternalDsl.g:613:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:614:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:614:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:615:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertySerialNumberAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertySerialNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertySerialNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:635:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:636:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:636:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:637:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertySerialNumberAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertySerialNumberRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertySerialNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertySerialNumber"


    // $ANTLR start "entryRuleMultiLanguagePropertyYearOfConstruction"
    // InternalDsl.g:662:1: entryRuleMultiLanguagePropertyYearOfConstruction returns [EObject current=null] : iv_ruleMultiLanguagePropertyYearOfConstruction= ruleMultiLanguagePropertyYearOfConstruction EOF ;
    public final EObject entryRuleMultiLanguagePropertyYearOfConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyYearOfConstruction = null;


        try {
            // InternalDsl.g:662:80: (iv_ruleMultiLanguagePropertyYearOfConstruction= ruleMultiLanguagePropertyYearOfConstruction EOF )
            // InternalDsl.g:663:2: iv_ruleMultiLanguagePropertyYearOfConstruction= ruleMultiLanguagePropertyYearOfConstruction EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyYearOfConstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyYearOfConstruction=ruleMultiLanguagePropertyYearOfConstruction();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyYearOfConstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyYearOfConstruction"


    // $ANTLR start "ruleMultiLanguagePropertyYearOfConstruction"
    // InternalDsl.g:669:1: ruleMultiLanguagePropertyYearOfConstruction returns [EObject current=null] : (otherlv_0= 'YearOfConstruction' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyYearOfConstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:675:2: ( (otherlv_0= 'YearOfConstruction' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:676:2: (otherlv_0= 'YearOfConstruction' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:676:2: (otherlv_0= 'YearOfConstruction' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:677:3: otherlv_0= 'YearOfConstruction' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getYearOfConstructionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:685:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:686:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:686:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:687:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyYearOfConstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:707:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:708:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:708:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:709:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyYearOfConstructionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyYearOfConstructionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyYearOfConstruction"


    // $ANTLR start "entryRuleAddressSubmodelElementCollection"
    // InternalDsl.g:734:1: entryRuleAddressSubmodelElementCollection returns [EObject current=null] : iv_ruleAddressSubmodelElementCollection= ruleAddressSubmodelElementCollection EOF ;
    public final EObject entryRuleAddressSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressSubmodelElementCollection = null;


        try {
            // InternalDsl.g:734:73: (iv_ruleAddressSubmodelElementCollection= ruleAddressSubmodelElementCollection EOF )
            // InternalDsl.g:735:2: iv_ruleAddressSubmodelElementCollection= ruleAddressSubmodelElementCollection EOF
            {
             newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddressSubmodelElementCollection=ruleAddressSubmodelElementCollection();

            state._fsp--;

             current =iv_ruleAddressSubmodelElementCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressSubmodelElementCollection"


    // $ANTLR start "ruleAddressSubmodelElementCollection"
    // InternalDsl.g:741:1: ruleAddressSubmodelElementCollection returns [EObject current=null] : (otherlv_0= 'Address' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )? ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) ) otherlv_10= ';' ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) ) otherlv_12= ';' ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )? ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )? ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) ) otherlv_18= ';' ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )? ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) ) otherlv_22= ';' ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )? ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )? ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )? ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )* ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )* ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )* otherlv_35= '}' ) ;
    public final EObject ruleAddressSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_Department_7_0 = null;

        EObject lv_Street_9_0 = null;

        EObject lv_Zipcode_11_0 = null;

        EObject lv_POBox_13_0 = null;

        EObject lv_ZipCodeOfPOBox_15_0 = null;

        EObject lv_CityTown_17_0 = null;

        EObject lv_StateCounty_19_0 = null;

        EObject lv_NationalCode_21_0 = null;

        EObject lv_VATNumber_23_0 = null;

        EObject lv_AddressRemarks_25_0 = null;

        EObject lv_AddressOfAdditionalLink_27_0 = null;

        EObject lv_Phone_29_0 = null;

        EObject lv_Fax_31_0 = null;

        EObject lv_Email_33_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:747:2: ( (otherlv_0= 'Address' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )? ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) ) otherlv_10= ';' ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) ) otherlv_12= ';' ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )? ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )? ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) ) otherlv_18= ';' ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )? ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) ) otherlv_22= ';' ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )? ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )? ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )? ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )* ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )* ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )* otherlv_35= '}' ) )
            // InternalDsl.g:748:2: (otherlv_0= 'Address' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )? ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) ) otherlv_10= ';' ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) ) otherlv_12= ';' ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )? ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )? ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) ) otherlv_18= ';' ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )? ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) ) otherlv_22= ';' ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )? ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )? ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )? ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )* ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )* ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )* otherlv_35= '}' )
            {
            // InternalDsl.g:748:2: (otherlv_0= 'Address' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )? ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) ) otherlv_10= ';' ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) ) otherlv_12= ';' ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )? ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )? ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) ) otherlv_18= ';' ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )? ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) ) otherlv_22= ';' ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )? ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )? ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )? ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )* ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )* ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )* otherlv_35= '}' )
            // InternalDsl.g:749:3: otherlv_0= 'Address' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )? ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) ) otherlv_10= ';' ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) ) otherlv_12= ';' ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )? ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )? ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) ) otherlv_18= ';' ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )? ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) ) otherlv_22= ';' ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )? ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )? ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )? ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )* ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )* ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )* otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressSubmodelElementCollectionAccess().getAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressSubmodelElementCollectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:757:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:758:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:758:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:759:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAddressSubmodelElementCollectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAddressSubmodelElementCollectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:779:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:780:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:780:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:781:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAddressSubmodelElementCollectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getAddressSubmodelElementCollectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:806:3: ( ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:807:4: ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) ) otherlv_8= ';'
                    {
                    // InternalDsl.g:807:4: ( (lv_Department_7_0= ruleMultiLanguagePropertyDepartment ) )
                    // InternalDsl.g:808:5: (lv_Department_7_0= ruleMultiLanguagePropertyDepartment )
                    {
                    // InternalDsl.g:808:5: (lv_Department_7_0= ruleMultiLanguagePropertyDepartment )
                    // InternalDsl.g:809:6: lv_Department_7_0= ruleMultiLanguagePropertyDepartment
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getDepartmentMultiLanguagePropertyDepartmentParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_Department_7_0=ruleMultiLanguagePropertyDepartment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"Department",
                    							lv_Department_7_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyDepartment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_7_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:831:3: ( (lv_Street_9_0= ruleMultiLanguagePropertyStreet ) )
            // InternalDsl.g:832:4: (lv_Street_9_0= ruleMultiLanguagePropertyStreet )
            {
            // InternalDsl.g:832:4: (lv_Street_9_0= ruleMultiLanguagePropertyStreet )
            // InternalDsl.g:833:5: lv_Street_9_0= ruleMultiLanguagePropertyStreet
            {

            					newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getStreetMultiLanguagePropertyStreetParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_Street_9_0=ruleMultiLanguagePropertyStreet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"Street",
            						lv_Street_9_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyStreet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_9());
            		
            // InternalDsl.g:854:3: ( (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode ) )
            // InternalDsl.g:855:4: (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode )
            {
            // InternalDsl.g:855:4: (lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode )
            // InternalDsl.g:856:5: lv_Zipcode_11_0= ruleMultiLanguagePropertyZipcode
            {

            					newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getZipcodeMultiLanguagePropertyZipcodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_Zipcode_11_0=ruleMultiLanguagePropertyZipcode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"Zipcode",
            						lv_Zipcode_11_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyZipcode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_11());
            		
            // InternalDsl.g:877:3: ( ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:878:4: ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) ) otherlv_14= ';'
                    {
                    // InternalDsl.g:878:4: ( (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox ) )
                    // InternalDsl.g:879:5: (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox )
                    {
                    // InternalDsl.g:879:5: (lv_POBox_13_0= ruleMultiLanguagePropertyPOBox )
                    // InternalDsl.g:880:6: lv_POBox_13_0= ruleMultiLanguagePropertyPOBox
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getPOBoxMultiLanguagePropertyPOBoxParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_POBox_13_0=ruleMultiLanguagePropertyPOBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"POBox",
                    							lv_POBox_13_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyPOBox");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_12_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:902:3: ( ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:903:4: ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) ) otherlv_16= ';'
                    {
                    // InternalDsl.g:903:4: ( (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox ) )
                    // InternalDsl.g:904:5: (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox )
                    {
                    // InternalDsl.g:904:5: (lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox )
                    // InternalDsl.g:905:6: lv_ZipCodeOfPOBox_15_0= ruleMultiLanguagePropertyZipCodeOfPOBox
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getZipCodeOfPOBoxMultiLanguagePropertyZipCodeOfPOBoxParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ZipCodeOfPOBox_15_0=ruleMultiLanguagePropertyZipCodeOfPOBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"ZipCodeOfPOBox",
                    							lv_ZipCodeOfPOBox_15_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyZipCodeOfPOBox");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_16, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_13_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:927:3: ( (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown ) )
            // InternalDsl.g:928:4: (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown )
            {
            // InternalDsl.g:928:4: (lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown )
            // InternalDsl.g:929:5: lv_CityTown_17_0= ruleMultiLanguagePropertyCityTown
            {

            					newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getCityTownMultiLanguagePropertyCityTownParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_CityTown_17_0=ruleMultiLanguagePropertyCityTown();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"CityTown",
            						lv_CityTown_17_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyCityTown");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_18, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_15());
            		
            // InternalDsl.g:950:3: ( ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:951:4: ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) ) otherlv_20= ';'
                    {
                    // InternalDsl.g:951:4: ( (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty ) )
                    // InternalDsl.g:952:5: (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty )
                    {
                    // InternalDsl.g:952:5: (lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty )
                    // InternalDsl.g:953:6: lv_StateCounty_19_0= ruleMultiLanguagePropertyStateCounty
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getStateCountyMultiLanguagePropertyStateCountyParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_StateCounty_19_0=ruleMultiLanguagePropertyStateCounty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"StateCounty",
                    							lv_StateCounty_19_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyStateCounty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_16_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:975:3: ( (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode ) )
            // InternalDsl.g:976:4: (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode )
            {
            // InternalDsl.g:976:4: (lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode )
            // InternalDsl.g:977:5: lv_NationalCode_21_0= ruleMultiLanguagePropertyNationalCode
            {

            					newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getNationalCodeMultiLanguagePropertyNationalCodeParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_11);
            lv_NationalCode_21_0=ruleMultiLanguagePropertyNationalCode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"NationalCode",
            						lv_NationalCode_21_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyNationalCode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_22, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_18());
            		
            // InternalDsl.g:998:3: ( ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:999:4: ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) ) otherlv_24= ';'
                    {
                    // InternalDsl.g:999:4: ( (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber ) )
                    // InternalDsl.g:1000:5: (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber )
                    {
                    // InternalDsl.g:1000:5: (lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber )
                    // InternalDsl.g:1001:6: lv_VATNumber_23_0= ruleMultiLanguagePropertyVATNumber
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getVATNumberMultiLanguagePropertyVATNumberParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_VATNumber_23_0=ruleMultiLanguagePropertyVATNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"VATNumber",
                    							lv_VATNumber_23_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyVATNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,17,FOLLOW_25); 

                    				newLeafNode(otherlv_24, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_19_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1023:3: ( ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1024:4: ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) ) otherlv_26= ';'
                    {
                    // InternalDsl.g:1024:4: ( (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks ) )
                    // InternalDsl.g:1025:5: (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks )
                    {
                    // InternalDsl.g:1025:5: (lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks )
                    // InternalDsl.g:1026:6: lv_AddressRemarks_25_0= ruleMultiLanguagePropertyAddressRemarks
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getAddressRemarksMultiLanguagePropertyAddressRemarksParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_AddressRemarks_25_0=ruleMultiLanguagePropertyAddressRemarks();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"AddressRemarks",
                    							lv_AddressRemarks_25_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyAddressRemarks");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_26, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_20_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1048:3: ( ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1049:4: ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) ) otherlv_28= ';'
                    {
                    // InternalDsl.g:1049:4: ( (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink ) )
                    // InternalDsl.g:1050:5: (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink )
                    {
                    // InternalDsl.g:1050:5: (lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink )
                    // InternalDsl.g:1051:6: lv_AddressOfAdditionalLink_27_0= ruleMultiLanguagePropertyAddressOfAdditionalLink
                    {

                    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getAddressOfAdditionalLinkMultiLanguagePropertyAddressOfAdditionalLinkParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_AddressOfAdditionalLink_27_0=ruleMultiLanguagePropertyAddressOfAdditionalLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"AddressOfAdditionalLink",
                    							lv_AddressOfAdditionalLink_27_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyAddressOfAdditionalLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,17,FOLLOW_27); 

                    				newLeafNode(otherlv_28, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_21_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1073:3: ( ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1074:4: ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) ) otherlv_30= ';'
            	    {
            	    // InternalDsl.g:1074:4: ( (lv_Phone_29_0= rulePhoneSubmodelElementCollection ) )
            	    // InternalDsl.g:1075:5: (lv_Phone_29_0= rulePhoneSubmodelElementCollection )
            	    {
            	    // InternalDsl.g:1075:5: (lv_Phone_29_0= rulePhoneSubmodelElementCollection )
            	    // InternalDsl.g:1076:6: lv_Phone_29_0= rulePhoneSubmodelElementCollection
            	    {

            	    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getPhonePhoneSubmodelElementCollectionParserRuleCall_22_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Phone_29_0=rulePhoneSubmodelElementCollection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Phone",
            	    							lv_Phone_29_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.PhoneSubmodelElementCollection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_30=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_30, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_22_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDsl.g:1098:3: ( ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1099:4: ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) ) otherlv_32= ';'
            	    {
            	    // InternalDsl.g:1099:4: ( (lv_Fax_31_0= ruleFaxSubmodelElementCollection ) )
            	    // InternalDsl.g:1100:5: (lv_Fax_31_0= ruleFaxSubmodelElementCollection )
            	    {
            	    // InternalDsl.g:1100:5: (lv_Fax_31_0= ruleFaxSubmodelElementCollection )
            	    // InternalDsl.g:1101:6: lv_Fax_31_0= ruleFaxSubmodelElementCollection
            	    {

            	    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getFaxFaxSubmodelElementCollectionParserRuleCall_23_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Fax_31_0=ruleFaxSubmodelElementCollection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Fax",
            	    							lv_Fax_31_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.FaxSubmodelElementCollection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_32=(Token)match(input,17,FOLLOW_28); 

            	    				newLeafNode(otherlv_32, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_23_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalDsl.g:1123:3: ( ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1124:4: ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) ) otherlv_34= ';'
            	    {
            	    // InternalDsl.g:1124:4: ( (lv_Email_33_0= ruleEmailSubmodelElementCollection ) )
            	    // InternalDsl.g:1125:5: (lv_Email_33_0= ruleEmailSubmodelElementCollection )
            	    {
            	    // InternalDsl.g:1125:5: (lv_Email_33_0= ruleEmailSubmodelElementCollection )
            	    // InternalDsl.g:1126:6: lv_Email_33_0= ruleEmailSubmodelElementCollection
            	    {

            	    						newCompositeNode(grammarAccess.getAddressSubmodelElementCollectionAccess().getEmailEmailSubmodelElementCollectionParserRuleCall_24_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Email_33_0=ruleEmailSubmodelElementCollection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddressSubmodelElementCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Email",
            	    							lv_Email_33_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.EmailSubmodelElementCollection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_34=(Token)match(input,17,FOLLOW_29); 

            	    				newLeafNode(otherlv_34, grammarAccess.getAddressSubmodelElementCollectionAccess().getSemicolonKeyword_24_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_35=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getAddressSubmodelElementCollectionAccess().getRightCurlyBracketKeyword_25());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressSubmodelElementCollection"


    // $ANTLR start "entryRuleMultiLanguagePropertyDepartment"
    // InternalDsl.g:1156:1: entryRuleMultiLanguagePropertyDepartment returns [EObject current=null] : iv_ruleMultiLanguagePropertyDepartment= ruleMultiLanguagePropertyDepartment EOF ;
    public final EObject entryRuleMultiLanguagePropertyDepartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyDepartment = null;


        try {
            // InternalDsl.g:1156:72: (iv_ruleMultiLanguagePropertyDepartment= ruleMultiLanguagePropertyDepartment EOF )
            // InternalDsl.g:1157:2: iv_ruleMultiLanguagePropertyDepartment= ruleMultiLanguagePropertyDepartment EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyDepartmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyDepartment=ruleMultiLanguagePropertyDepartment();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyDepartment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyDepartment"


    // $ANTLR start "ruleMultiLanguagePropertyDepartment"
    // InternalDsl.g:1163:1: ruleMultiLanguagePropertyDepartment returns [EObject current=null] : (otherlv_0= 'Department' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyDepartment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1169:2: ( (otherlv_0= 'Department' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1170:2: (otherlv_0= 'Department' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1170:2: (otherlv_0= 'Department' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1171:3: otherlv_0= 'Department' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyDepartmentAccess().getDepartmentKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyDepartmentAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1179:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1180:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1180:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1181:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyDepartmentAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyDepartmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyDepartmentAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1201:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1202:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1202:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1203:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyDepartmentAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyDepartmentRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyDepartmentAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyDepartment"


    // $ANTLR start "entryRuleMultiLanguagePropertyStreet"
    // InternalDsl.g:1228:1: entryRuleMultiLanguagePropertyStreet returns [EObject current=null] : iv_ruleMultiLanguagePropertyStreet= ruleMultiLanguagePropertyStreet EOF ;
    public final EObject entryRuleMultiLanguagePropertyStreet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyStreet = null;


        try {
            // InternalDsl.g:1228:68: (iv_ruleMultiLanguagePropertyStreet= ruleMultiLanguagePropertyStreet EOF )
            // InternalDsl.g:1229:2: iv_ruleMultiLanguagePropertyStreet= ruleMultiLanguagePropertyStreet EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyStreetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyStreet=ruleMultiLanguagePropertyStreet();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyStreet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyStreet"


    // $ANTLR start "ruleMultiLanguagePropertyStreet"
    // InternalDsl.g:1235:1: ruleMultiLanguagePropertyStreet returns [EObject current=null] : (otherlv_0= 'Street' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyStreet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1241:2: ( (otherlv_0= 'Street' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1242:2: (otherlv_0= 'Street' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1242:2: (otherlv_0= 'Street' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1243:3: otherlv_0= 'Street' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyStreetAccess().getStreetKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyStreetAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1251:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1252:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1252:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1253:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyStreetAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyStreetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyStreetAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1273:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1274:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1274:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1275:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyStreetAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyStreetRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyStreetAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyStreet"


    // $ANTLR start "entryRuleMultiLanguagePropertyZipcode"
    // InternalDsl.g:1300:1: entryRuleMultiLanguagePropertyZipcode returns [EObject current=null] : iv_ruleMultiLanguagePropertyZipcode= ruleMultiLanguagePropertyZipcode EOF ;
    public final EObject entryRuleMultiLanguagePropertyZipcode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyZipcode = null;


        try {
            // InternalDsl.g:1300:69: (iv_ruleMultiLanguagePropertyZipcode= ruleMultiLanguagePropertyZipcode EOF )
            // InternalDsl.g:1301:2: iv_ruleMultiLanguagePropertyZipcode= ruleMultiLanguagePropertyZipcode EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyZipcodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyZipcode=ruleMultiLanguagePropertyZipcode();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyZipcode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyZipcode"


    // $ANTLR start "ruleMultiLanguagePropertyZipcode"
    // InternalDsl.g:1307:1: ruleMultiLanguagePropertyZipcode returns [EObject current=null] : (otherlv_0= 'Zipcode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyZipcode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1313:2: ( (otherlv_0= 'Zipcode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1314:2: (otherlv_0= 'Zipcode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1314:2: (otherlv_0= 'Zipcode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1315:3: otherlv_0= 'Zipcode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyZipcodeAccess().getZipcodeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyZipcodeAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1323:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1324:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1324:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1325:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyZipcodeAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyZipcodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyZipcodeAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1345:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1346:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1346:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1347:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyZipcodeAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyZipcodeRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyZipcodeAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyZipcode"


    // $ANTLR start "entryRuleMultiLanguagePropertyPOBox"
    // InternalDsl.g:1372:1: entryRuleMultiLanguagePropertyPOBox returns [EObject current=null] : iv_ruleMultiLanguagePropertyPOBox= ruleMultiLanguagePropertyPOBox EOF ;
    public final EObject entryRuleMultiLanguagePropertyPOBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyPOBox = null;


        try {
            // InternalDsl.g:1372:67: (iv_ruleMultiLanguagePropertyPOBox= ruleMultiLanguagePropertyPOBox EOF )
            // InternalDsl.g:1373:2: iv_ruleMultiLanguagePropertyPOBox= ruleMultiLanguagePropertyPOBox EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyPOBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyPOBox=ruleMultiLanguagePropertyPOBox();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyPOBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyPOBox"


    // $ANTLR start "ruleMultiLanguagePropertyPOBox"
    // InternalDsl.g:1379:1: ruleMultiLanguagePropertyPOBox returns [EObject current=null] : (otherlv_0= 'POBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyPOBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1385:2: ( (otherlv_0= 'POBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1386:2: (otherlv_0= 'POBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1386:2: (otherlv_0= 'POBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1387:3: otherlv_0= 'POBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyPOBoxAccess().getPOBoxKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyPOBoxAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1395:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1396:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1396:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1397:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyPOBoxAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyPOBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyPOBoxAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1417:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1418:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1418:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1419:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyPOBoxAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyPOBoxRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyPOBoxAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyPOBox"


    // $ANTLR start "entryRuleMultiLanguagePropertyZipCodeOfPOBox"
    // InternalDsl.g:1444:1: entryRuleMultiLanguagePropertyZipCodeOfPOBox returns [EObject current=null] : iv_ruleMultiLanguagePropertyZipCodeOfPOBox= ruleMultiLanguagePropertyZipCodeOfPOBox EOF ;
    public final EObject entryRuleMultiLanguagePropertyZipCodeOfPOBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyZipCodeOfPOBox = null;


        try {
            // InternalDsl.g:1444:76: (iv_ruleMultiLanguagePropertyZipCodeOfPOBox= ruleMultiLanguagePropertyZipCodeOfPOBox EOF )
            // InternalDsl.g:1445:2: iv_ruleMultiLanguagePropertyZipCodeOfPOBox= ruleMultiLanguagePropertyZipCodeOfPOBox EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyZipCodeOfPOBox=ruleMultiLanguagePropertyZipCodeOfPOBox();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyZipCodeOfPOBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyZipCodeOfPOBox"


    // $ANTLR start "ruleMultiLanguagePropertyZipCodeOfPOBox"
    // InternalDsl.g:1451:1: ruleMultiLanguagePropertyZipCodeOfPOBox returns [EObject current=null] : (otherlv_0= 'ZipCodeOfPOBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyZipCodeOfPOBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1457:2: ( (otherlv_0= 'ZipCodeOfPOBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1458:2: (otherlv_0= 'ZipCodeOfPOBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1458:2: (otherlv_0= 'ZipCodeOfPOBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1459:3: otherlv_0= 'ZipCodeOfPOBox' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getZipCodeOfPOBoxKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1467:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1468:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1468:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1469:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1489:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1490:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1490:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1491:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyZipCodeOfPOBoxAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyZipCodeOfPOBox"


    // $ANTLR start "entryRuleMultiLanguagePropertyCityTown"
    // InternalDsl.g:1516:1: entryRuleMultiLanguagePropertyCityTown returns [EObject current=null] : iv_ruleMultiLanguagePropertyCityTown= ruleMultiLanguagePropertyCityTown EOF ;
    public final EObject entryRuleMultiLanguagePropertyCityTown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyCityTown = null;


        try {
            // InternalDsl.g:1516:70: (iv_ruleMultiLanguagePropertyCityTown= ruleMultiLanguagePropertyCityTown EOF )
            // InternalDsl.g:1517:2: iv_ruleMultiLanguagePropertyCityTown= ruleMultiLanguagePropertyCityTown EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyCityTownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyCityTown=ruleMultiLanguagePropertyCityTown();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyCityTown; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyCityTown"


    // $ANTLR start "ruleMultiLanguagePropertyCityTown"
    // InternalDsl.g:1523:1: ruleMultiLanguagePropertyCityTown returns [EObject current=null] : (otherlv_0= 'CityTown' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyCityTown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1529:2: ( (otherlv_0= 'CityTown' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1530:2: (otherlv_0= 'CityTown' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1530:2: (otherlv_0= 'CityTown' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1531:3: otherlv_0= 'CityTown' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyCityTownAccess().getCityTownKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyCityTownAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1539:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1540:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1540:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1541:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyCityTownAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyCityTownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyCityTownAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1561:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1562:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1562:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1563:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyCityTownAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyCityTownRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyCityTownAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyCityTown"


    // $ANTLR start "entryRuleMultiLanguagePropertyStateCounty"
    // InternalDsl.g:1588:1: entryRuleMultiLanguagePropertyStateCounty returns [EObject current=null] : iv_ruleMultiLanguagePropertyStateCounty= ruleMultiLanguagePropertyStateCounty EOF ;
    public final EObject entryRuleMultiLanguagePropertyStateCounty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyStateCounty = null;


        try {
            // InternalDsl.g:1588:73: (iv_ruleMultiLanguagePropertyStateCounty= ruleMultiLanguagePropertyStateCounty EOF )
            // InternalDsl.g:1589:2: iv_ruleMultiLanguagePropertyStateCounty= ruleMultiLanguagePropertyStateCounty EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyStateCountyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyStateCounty=ruleMultiLanguagePropertyStateCounty();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyStateCounty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyStateCounty"


    // $ANTLR start "ruleMultiLanguagePropertyStateCounty"
    // InternalDsl.g:1595:1: ruleMultiLanguagePropertyStateCounty returns [EObject current=null] : (otherlv_0= 'StateCounty' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyStateCounty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1601:2: ( (otherlv_0= 'StateCounty' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1602:2: (otherlv_0= 'StateCounty' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1602:2: (otherlv_0= 'StateCounty' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1603:3: otherlv_0= 'StateCounty' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyStateCountyAccess().getStateCountyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyStateCountyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1611:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1612:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1612:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1613:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyStateCountyAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyStateCountyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyStateCountyAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1633:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1634:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1634:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1635:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyStateCountyAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyStateCountyRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyStateCountyAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyStateCounty"


    // $ANTLR start "entryRuleMultiLanguagePropertyNationalCode"
    // InternalDsl.g:1660:1: entryRuleMultiLanguagePropertyNationalCode returns [EObject current=null] : iv_ruleMultiLanguagePropertyNationalCode= ruleMultiLanguagePropertyNationalCode EOF ;
    public final EObject entryRuleMultiLanguagePropertyNationalCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyNationalCode = null;


        try {
            // InternalDsl.g:1660:74: (iv_ruleMultiLanguagePropertyNationalCode= ruleMultiLanguagePropertyNationalCode EOF )
            // InternalDsl.g:1661:2: iv_ruleMultiLanguagePropertyNationalCode= ruleMultiLanguagePropertyNationalCode EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyNationalCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyNationalCode=ruleMultiLanguagePropertyNationalCode();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyNationalCode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyNationalCode"


    // $ANTLR start "ruleMultiLanguagePropertyNationalCode"
    // InternalDsl.g:1667:1: ruleMultiLanguagePropertyNationalCode returns [EObject current=null] : (otherlv_0= 'NationalCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyNationalCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1673:2: ( (otherlv_0= 'NationalCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1674:2: (otherlv_0= 'NationalCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1674:2: (otherlv_0= 'NationalCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1675:3: otherlv_0= 'NationalCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getNationalCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1683:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1684:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1684:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1685:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyNationalCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1705:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1706:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1706:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1707:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyNationalCodeRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyNationalCodeAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyNationalCode"


    // $ANTLR start "entryRuleMultiLanguagePropertyVATNumber"
    // InternalDsl.g:1732:1: entryRuleMultiLanguagePropertyVATNumber returns [EObject current=null] : iv_ruleMultiLanguagePropertyVATNumber= ruleMultiLanguagePropertyVATNumber EOF ;
    public final EObject entryRuleMultiLanguagePropertyVATNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyVATNumber = null;


        try {
            // InternalDsl.g:1732:71: (iv_ruleMultiLanguagePropertyVATNumber= ruleMultiLanguagePropertyVATNumber EOF )
            // InternalDsl.g:1733:2: iv_ruleMultiLanguagePropertyVATNumber= ruleMultiLanguagePropertyVATNumber EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyVATNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyVATNumber=ruleMultiLanguagePropertyVATNumber();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyVATNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyVATNumber"


    // $ANTLR start "ruleMultiLanguagePropertyVATNumber"
    // InternalDsl.g:1739:1: ruleMultiLanguagePropertyVATNumber returns [EObject current=null] : (otherlv_0= 'VATNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyVATNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1745:2: ( (otherlv_0= 'VATNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1746:2: (otherlv_0= 'VATNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1746:2: (otherlv_0= 'VATNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1747:3: otherlv_0= 'VATNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyVATNumberAccess().getVATNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyVATNumberAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1755:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1756:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1756:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1757:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyVATNumberAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyVATNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyVATNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1777:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1778:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1778:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1779:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyVATNumberAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyVATNumberRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyVATNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyVATNumber"


    // $ANTLR start "entryRuleMultiLanguagePropertyAddressRemarks"
    // InternalDsl.g:1804:1: entryRuleMultiLanguagePropertyAddressRemarks returns [EObject current=null] : iv_ruleMultiLanguagePropertyAddressRemarks= ruleMultiLanguagePropertyAddressRemarks EOF ;
    public final EObject entryRuleMultiLanguagePropertyAddressRemarks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyAddressRemarks = null;


        try {
            // InternalDsl.g:1804:76: (iv_ruleMultiLanguagePropertyAddressRemarks= ruleMultiLanguagePropertyAddressRemarks EOF )
            // InternalDsl.g:1805:2: iv_ruleMultiLanguagePropertyAddressRemarks= ruleMultiLanguagePropertyAddressRemarks EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyAddressRemarksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyAddressRemarks=ruleMultiLanguagePropertyAddressRemarks();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyAddressRemarks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyAddressRemarks"


    // $ANTLR start "ruleMultiLanguagePropertyAddressRemarks"
    // InternalDsl.g:1811:1: ruleMultiLanguagePropertyAddressRemarks returns [EObject current=null] : (otherlv_0= 'AddressRemarks' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyAddressRemarks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1817:2: ( (otherlv_0= 'AddressRemarks' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1818:2: (otherlv_0= 'AddressRemarks' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1818:2: (otherlv_0= 'AddressRemarks' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1819:3: otherlv_0= 'AddressRemarks' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getAddressRemarksKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1827:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1828:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1828:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1829:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyAddressRemarksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1849:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1850:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1850:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1851:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyAddressRemarksRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyAddressRemarksAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyAddressRemarks"


    // $ANTLR start "entryRuleMultiLanguagePropertyAddressOfAdditionalLink"
    // InternalDsl.g:1876:1: entryRuleMultiLanguagePropertyAddressOfAdditionalLink returns [EObject current=null] : iv_ruleMultiLanguagePropertyAddressOfAdditionalLink= ruleMultiLanguagePropertyAddressOfAdditionalLink EOF ;
    public final EObject entryRuleMultiLanguagePropertyAddressOfAdditionalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyAddressOfAdditionalLink = null;


        try {
            // InternalDsl.g:1876:85: (iv_ruleMultiLanguagePropertyAddressOfAdditionalLink= ruleMultiLanguagePropertyAddressOfAdditionalLink EOF )
            // InternalDsl.g:1877:2: iv_ruleMultiLanguagePropertyAddressOfAdditionalLink= ruleMultiLanguagePropertyAddressOfAdditionalLink EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyAddressOfAdditionalLink=ruleMultiLanguagePropertyAddressOfAdditionalLink();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyAddressOfAdditionalLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyAddressOfAdditionalLink"


    // $ANTLR start "ruleMultiLanguagePropertyAddressOfAdditionalLink"
    // InternalDsl.g:1883:1: ruleMultiLanguagePropertyAddressOfAdditionalLink returns [EObject current=null] : (otherlv_0= 'AddressOfAdditionalLink' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyAddressOfAdditionalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1889:2: ( (otherlv_0= 'AddressOfAdditionalLink' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1890:2: (otherlv_0= 'AddressOfAdditionalLink' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1890:2: (otherlv_0= 'AddressOfAdditionalLink' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1891:3: otherlv_0= 'AddressOfAdditionalLink' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getAddressOfAdditionalLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1899:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1900:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1900:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1901:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1921:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1922:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1922:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1923:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyAddressOfAdditionalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyAddressOfAdditionalLink"


    // $ANTLR start "entryRulePhoneSubmodelElementCollection"
    // InternalDsl.g:1948:1: entryRulePhoneSubmodelElementCollection returns [EObject current=null] : iv_rulePhoneSubmodelElementCollection= rulePhoneSubmodelElementCollection EOF ;
    public final EObject entryRulePhoneSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoneSubmodelElementCollection = null;


        try {
            // InternalDsl.g:1948:71: (iv_rulePhoneSubmodelElementCollection= rulePhoneSubmodelElementCollection EOF )
            // InternalDsl.g:1949:2: iv_rulePhoneSubmodelElementCollection= rulePhoneSubmodelElementCollection EOF
            {
             newCompositeNode(grammarAccess.getPhoneSubmodelElementCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoneSubmodelElementCollection=rulePhoneSubmodelElementCollection();

            state._fsp--;

             current =iv_rulePhoneSubmodelElementCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoneSubmodelElementCollection"


    // $ANTLR start "rulePhoneSubmodelElementCollection"
    // InternalDsl.g:1955:1: rulePhoneSubmodelElementCollection returns [EObject current=null] : (otherlv_0= 'Phone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) ) otherlv_8= ';' ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )? otherlv_11= '}' ) ;
    public final EObject rulePhoneSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_TelephoneNumber_7_0 = null;

        EObject lv_TypeOfTelephone_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1961:2: ( (otherlv_0= 'Phone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) ) otherlv_8= ';' ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )? otherlv_11= '}' ) )
            // InternalDsl.g:1962:2: (otherlv_0= 'Phone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) ) otherlv_8= ';' ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1962:2: (otherlv_0= 'Phone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) ) otherlv_8= ';' ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )? otherlv_11= '}' )
            // InternalDsl.g:1963:3: otherlv_0= 'Phone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) ) otherlv_8= ';' ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPhoneSubmodelElementCollectionAccess().getPhoneKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPhoneSubmodelElementCollectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1971:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1972:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1972:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1973:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPhoneSubmodelElementCollectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhoneSubmodelElementCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPhoneSubmodelElementCollectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1993:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1994:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1994:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1995:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPhoneSubmodelElementCollectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhoneSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getPhoneSubmodelElementCollectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getPhoneSubmodelElementCollectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:2020:3: ( (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber ) )
            // InternalDsl.g:2021:4: (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber )
            {
            // InternalDsl.g:2021:4: (lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber )
            // InternalDsl.g:2022:5: lv_TelephoneNumber_7_0= ruleMultiLanguagePropertyTelephoneNumber
            {

            					newCompositeNode(grammarAccess.getPhoneSubmodelElementCollectionAccess().getTelephoneNumberMultiLanguagePropertyTelephoneNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_TelephoneNumber_7_0=ruleMultiLanguagePropertyTelephoneNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhoneSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"TelephoneNumber",
            						lv_TelephoneNumber_7_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyTelephoneNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getPhoneSubmodelElementCollectionAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:2043:3: ( ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:2044:4: ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) ) otherlv_10= ';'
                    {
                    // InternalDsl.g:2044:4: ( (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone ) )
                    // InternalDsl.g:2045:5: (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone )
                    {
                    // InternalDsl.g:2045:5: (lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone )
                    // InternalDsl.g:2046:6: lv_TypeOfTelephone_9_0= rulePropertyTypeOfTelephone
                    {

                    						newCompositeNode(grammarAccess.getPhoneSubmodelElementCollectionAccess().getTypeOfTelephonePropertyTypeOfTelephoneParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_TypeOfTelephone_9_0=rulePropertyTypeOfTelephone();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhoneSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"TypeOfTelephone",
                    							lv_TypeOfTelephone_9_0,
                    							"org.xtext.smartaas.nameplate.Dsl.PropertyTypeOfTelephone");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getPhoneSubmodelElementCollectionAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPhoneSubmodelElementCollectionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoneSubmodelElementCollection"


    // $ANTLR start "entryRuleMultiLanguagePropertyTelephoneNumber"
    // InternalDsl.g:2076:1: entryRuleMultiLanguagePropertyTelephoneNumber returns [EObject current=null] : iv_ruleMultiLanguagePropertyTelephoneNumber= ruleMultiLanguagePropertyTelephoneNumber EOF ;
    public final EObject entryRuleMultiLanguagePropertyTelephoneNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyTelephoneNumber = null;


        try {
            // InternalDsl.g:2076:77: (iv_ruleMultiLanguagePropertyTelephoneNumber= ruleMultiLanguagePropertyTelephoneNumber EOF )
            // InternalDsl.g:2077:2: iv_ruleMultiLanguagePropertyTelephoneNumber= ruleMultiLanguagePropertyTelephoneNumber EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyTelephoneNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyTelephoneNumber=ruleMultiLanguagePropertyTelephoneNumber();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyTelephoneNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyTelephoneNumber"


    // $ANTLR start "ruleMultiLanguagePropertyTelephoneNumber"
    // InternalDsl.g:2083:1: ruleMultiLanguagePropertyTelephoneNumber returns [EObject current=null] : (otherlv_0= 'TelephoneNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyTelephoneNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2089:2: ( (otherlv_0= 'TelephoneNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2090:2: (otherlv_0= 'TelephoneNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2090:2: (otherlv_0= 'TelephoneNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2091:3: otherlv_0= 'TelephoneNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getTelephoneNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2099:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2100:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2100:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2101:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyTelephoneNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2121:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2122:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2122:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2123:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyTelephoneNumberRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyTelephoneNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyTelephoneNumber"


    // $ANTLR start "entryRulePropertyTypeOfTelephone"
    // InternalDsl.g:2148:1: entryRulePropertyTypeOfTelephone returns [EObject current=null] : iv_rulePropertyTypeOfTelephone= rulePropertyTypeOfTelephone EOF ;
    public final EObject entryRulePropertyTypeOfTelephone() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyTypeOfTelephone = null;


        try {
            // InternalDsl.g:2148:64: (iv_rulePropertyTypeOfTelephone= rulePropertyTypeOfTelephone EOF )
            // InternalDsl.g:2149:2: iv_rulePropertyTypeOfTelephone= rulePropertyTypeOfTelephone EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeOfTelephoneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyTypeOfTelephone=rulePropertyTypeOfTelephone();

            state._fsp--;

             current =iv_rulePropertyTypeOfTelephone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyTypeOfTelephone"


    // $ANTLR start "rulePropertyTypeOfTelephone"
    // InternalDsl.g:2155:1: rulePropertyTypeOfTelephone returns [EObject current=null] : (otherlv_0= 'TypeOfTelephone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyTypeOfTelephone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2161:2: ( (otherlv_0= 'TypeOfTelephone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2162:2: (otherlv_0= 'TypeOfTelephone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2162:2: (otherlv_0= 'TypeOfTelephone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2163:3: otherlv_0= 'TypeOfTelephone' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeOfTelephoneAccess().getTypeOfTelephoneKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyTypeOfTelephoneAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2171:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2172:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2172:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2173:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyTypeOfTelephoneAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyTypeOfTelephoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyTypeOfTelephoneAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2193:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2194:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2194:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2195:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyTypeOfTelephoneAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyTypeOfTelephoneRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyTypeOfTelephoneAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyTypeOfTelephone"


    // $ANTLR start "entryRuleFaxSubmodelElementCollection"
    // InternalDsl.g:2220:1: entryRuleFaxSubmodelElementCollection returns [EObject current=null] : iv_ruleFaxSubmodelElementCollection= ruleFaxSubmodelElementCollection EOF ;
    public final EObject entryRuleFaxSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaxSubmodelElementCollection = null;


        try {
            // InternalDsl.g:2220:69: (iv_ruleFaxSubmodelElementCollection= ruleFaxSubmodelElementCollection EOF )
            // InternalDsl.g:2221:2: iv_ruleFaxSubmodelElementCollection= ruleFaxSubmodelElementCollection EOF
            {
             newCompositeNode(grammarAccess.getFaxSubmodelElementCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaxSubmodelElementCollection=ruleFaxSubmodelElementCollection();

            state._fsp--;

             current =iv_ruleFaxSubmodelElementCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFaxSubmodelElementCollection"


    // $ANTLR start "ruleFaxSubmodelElementCollection"
    // InternalDsl.g:2227:1: ruleFaxSubmodelElementCollection returns [EObject current=null] : (otherlv_0= 'Fax' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) ) otherlv_8= ';' ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )? otherlv_11= '}' ) ;
    public final EObject ruleFaxSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_FaxNumber_7_0 = null;

        EObject lv_TypeOfFaxNumber_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2233:2: ( (otherlv_0= 'Fax' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) ) otherlv_8= ';' ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )? otherlv_11= '}' ) )
            // InternalDsl.g:2234:2: (otherlv_0= 'Fax' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) ) otherlv_8= ';' ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )? otherlv_11= '}' )
            {
            // InternalDsl.g:2234:2: (otherlv_0= 'Fax' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) ) otherlv_8= ';' ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )? otherlv_11= '}' )
            // InternalDsl.g:2235:3: otherlv_0= 'Fax' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) ) otherlv_8= ';' ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFaxSubmodelElementCollectionAccess().getFaxKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFaxSubmodelElementCollectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2243:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2244:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2244:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2245:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFaxSubmodelElementCollectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaxSubmodelElementCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFaxSubmodelElementCollectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2265:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2266:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2266:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2267:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getFaxSubmodelElementCollectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFaxSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFaxSubmodelElementCollectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getFaxSubmodelElementCollectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:2292:3: ( (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax ) )
            // InternalDsl.g:2293:4: (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax )
            {
            // InternalDsl.g:2293:4: (lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax )
            // InternalDsl.g:2294:5: lv_FaxNumber_7_0= ruleMultiLanguagePropertyFax
            {

            					newCompositeNode(grammarAccess.getFaxSubmodelElementCollectionAccess().getFaxNumberMultiLanguagePropertyFaxParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_FaxNumber_7_0=ruleMultiLanguagePropertyFax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFaxSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"FaxNumber",
            						lv_FaxNumber_7_0,
            						"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyFax");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getFaxSubmodelElementCollectionAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:2315:3: ( ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:2316:4: ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) ) otherlv_10= ';'
                    {
                    // InternalDsl.g:2316:4: ( (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber ) )
                    // InternalDsl.g:2317:5: (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber )
                    {
                    // InternalDsl.g:2317:5: (lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber )
                    // InternalDsl.g:2318:6: lv_TypeOfFaxNumber_9_0= rulePropertyTypeOfFaxNumber
                    {

                    						newCompositeNode(grammarAccess.getFaxSubmodelElementCollectionAccess().getTypeOfFaxNumberPropertyTypeOfFaxNumberParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_TypeOfFaxNumber_9_0=rulePropertyTypeOfFaxNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaxSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"TypeOfFaxNumber",
                    							lv_TypeOfFaxNumber_9_0,
                    							"org.xtext.smartaas.nameplate.Dsl.PropertyTypeOfFaxNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getFaxSubmodelElementCollectionAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFaxSubmodelElementCollectionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFaxSubmodelElementCollection"


    // $ANTLR start "entryRuleMultiLanguagePropertyFax"
    // InternalDsl.g:2348:1: entryRuleMultiLanguagePropertyFax returns [EObject current=null] : iv_ruleMultiLanguagePropertyFax= ruleMultiLanguagePropertyFax EOF ;
    public final EObject entryRuleMultiLanguagePropertyFax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyFax = null;


        try {
            // InternalDsl.g:2348:65: (iv_ruleMultiLanguagePropertyFax= ruleMultiLanguagePropertyFax EOF )
            // InternalDsl.g:2349:2: iv_ruleMultiLanguagePropertyFax= ruleMultiLanguagePropertyFax EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyFaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyFax=ruleMultiLanguagePropertyFax();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyFax; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyFax"


    // $ANTLR start "ruleMultiLanguagePropertyFax"
    // InternalDsl.g:2355:1: ruleMultiLanguagePropertyFax returns [EObject current=null] : (otherlv_0= 'FaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyFax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2361:2: ( (otherlv_0= 'FaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2362:2: (otherlv_0= 'FaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2362:2: (otherlv_0= 'FaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2363:3: otherlv_0= 'FaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyFaxAccess().getFaxNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyFaxAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2371:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2372:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2372:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2373:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyFaxAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyFaxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyFaxAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2393:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2394:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2394:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2395:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyFaxAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyFaxRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyFaxAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyFax"


    // $ANTLR start "entryRulePropertyTypeOfFaxNumber"
    // InternalDsl.g:2420:1: entryRulePropertyTypeOfFaxNumber returns [EObject current=null] : iv_rulePropertyTypeOfFaxNumber= rulePropertyTypeOfFaxNumber EOF ;
    public final EObject entryRulePropertyTypeOfFaxNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyTypeOfFaxNumber = null;


        try {
            // InternalDsl.g:2420:64: (iv_rulePropertyTypeOfFaxNumber= rulePropertyTypeOfFaxNumber EOF )
            // InternalDsl.g:2421:2: iv_rulePropertyTypeOfFaxNumber= rulePropertyTypeOfFaxNumber EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeOfFaxNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyTypeOfFaxNumber=rulePropertyTypeOfFaxNumber();

            state._fsp--;

             current =iv_rulePropertyTypeOfFaxNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyTypeOfFaxNumber"


    // $ANTLR start "rulePropertyTypeOfFaxNumber"
    // InternalDsl.g:2427:1: rulePropertyTypeOfFaxNumber returns [EObject current=null] : (otherlv_0= 'TypeOfFaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyTypeOfFaxNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2433:2: ( (otherlv_0= 'TypeOfFaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2434:2: (otherlv_0= 'TypeOfFaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2434:2: (otherlv_0= 'TypeOfFaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2435:3: otherlv_0= 'TypeOfFaxNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeOfFaxNumberAccess().getTypeOfFaxNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyTypeOfFaxNumberAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2443:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2444:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2444:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2445:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyTypeOfFaxNumberAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyTypeOfFaxNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyTypeOfFaxNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2465:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2466:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2466:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2467:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyTypeOfFaxNumberAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyTypeOfFaxNumberRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyTypeOfFaxNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyTypeOfFaxNumber"


    // $ANTLR start "entryRuleEmailSubmodelElementCollection"
    // InternalDsl.g:2492:1: entryRuleEmailSubmodelElementCollection returns [EObject current=null] : iv_ruleEmailSubmodelElementCollection= ruleEmailSubmodelElementCollection EOF ;
    public final EObject entryRuleEmailSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmailSubmodelElementCollection = null;


        try {
            // InternalDsl.g:2492:71: (iv_ruleEmailSubmodelElementCollection= ruleEmailSubmodelElementCollection EOF )
            // InternalDsl.g:2493:2: iv_ruleEmailSubmodelElementCollection= ruleEmailSubmodelElementCollection EOF
            {
             newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmailSubmodelElementCollection=ruleEmailSubmodelElementCollection();

            state._fsp--;

             current =iv_ruleEmailSubmodelElementCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmailSubmodelElementCollection"


    // $ANTLR start "ruleEmailSubmodelElementCollection"
    // InternalDsl.g:2499:1: ruleEmailSubmodelElementCollection returns [EObject current=null] : (otherlv_0= 'Email' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) ) otherlv_8= ';' ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )? ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )? otherlv_15= '}' ) ;
    public final EObject ruleEmailSubmodelElementCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_EmailAddress_7_0 = null;

        EObject lv_TypeOfEmailAddress_9_0 = null;

        EObject lv_PublicKey_11_0 = null;

        EObject lv_TypeOfPublickKey_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2505:2: ( (otherlv_0= 'Email' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) ) otherlv_8= ';' ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )? ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )? otherlv_15= '}' ) )
            // InternalDsl.g:2506:2: (otherlv_0= 'Email' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) ) otherlv_8= ';' ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )? ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )? otherlv_15= '}' )
            {
            // InternalDsl.g:2506:2: (otherlv_0= 'Email' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) ) otherlv_8= ';' ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )? ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )? otherlv_15= '}' )
            // InternalDsl.g:2507:3: otherlv_0= 'Email' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) ) otherlv_8= ';' ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )? ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getEmailSubmodelElementCollectionAccess().getEmailKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEmailSubmodelElementCollectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2515:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2516:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2516:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2517:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEmailSubmodelElementCollectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmailSubmodelElementCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEmailSubmodelElementCollectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2537:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2538:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2538:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2539:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmailSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEmailSubmodelElementCollectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getEmailSubmodelElementCollectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:2564:3: ( (lv_EmailAddress_7_0= rulePropertyEmailAddress ) )
            // InternalDsl.g:2565:4: (lv_EmailAddress_7_0= rulePropertyEmailAddress )
            {
            // InternalDsl.g:2565:4: (lv_EmailAddress_7_0= rulePropertyEmailAddress )
            // InternalDsl.g:2566:5: lv_EmailAddress_7_0= rulePropertyEmailAddress
            {

            					newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionAccess().getEmailAddressPropertyEmailAddressParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_EmailAddress_7_0=rulePropertyEmailAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmailSubmodelElementCollectionRule());
            					}
            					set(
            						current,
            						"EmailAddress",
            						lv_EmailAddress_7_0,
            						"org.xtext.smartaas.nameplate.Dsl.PropertyEmailAddress");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getEmailSubmodelElementCollectionAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:2587:3: ( ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:2588:4: ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) ) otherlv_10= ';'
                    {
                    // InternalDsl.g:2588:4: ( (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress ) )
                    // InternalDsl.g:2589:5: (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress )
                    {
                    // InternalDsl.g:2589:5: (lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress )
                    // InternalDsl.g:2590:6: lv_TypeOfEmailAddress_9_0= rulePropertyTypeOfEmailAddress
                    {

                    						newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionAccess().getTypeOfEmailAddressPropertyTypeOfEmailAddressParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_TypeOfEmailAddress_9_0=rulePropertyTypeOfEmailAddress();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmailSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"TypeOfEmailAddress",
                    							lv_TypeOfEmailAddress_9_0,
                    							"org.xtext.smartaas.nameplate.Dsl.PropertyTypeOfEmailAddress");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getEmailSubmodelElementCollectionAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2612:3: ( ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:2613:4: ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) ) otherlv_12= ';' ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )?
                    {
                    // InternalDsl.g:2613:4: ( (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey ) )
                    // InternalDsl.g:2614:5: (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey )
                    {
                    // InternalDsl.g:2614:5: (lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey )
                    // InternalDsl.g:2615:6: lv_PublicKey_11_0= ruleMultiLanguagePropertyPublicKey
                    {

                    						newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionAccess().getPublicKeyMultiLanguagePropertyPublicKeyParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_PublicKey_11_0=ruleMultiLanguagePropertyPublicKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmailSubmodelElementCollectionRule());
                    						}
                    						set(
                    							current,
                    							"PublicKey",
                    							lv_PublicKey_11_0,
                    							"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyPublicKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getEmailSubmodelElementCollectionAccess().getSemicolonKeyword_10_1());
                    			
                    // InternalDsl.g:2636:4: ( ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==47) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDsl.g:2637:5: ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) ) otherlv_14= ';'
                            {
                            // InternalDsl.g:2637:5: ( (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey ) )
                            // InternalDsl.g:2638:6: (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey )
                            {
                            // InternalDsl.g:2638:6: (lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey )
                            // InternalDsl.g:2639:7: lv_TypeOfPublickKey_13_0= ruleMultiLanguagePropertyTypeOfPublickKey
                            {

                            							newCompositeNode(grammarAccess.getEmailSubmodelElementCollectionAccess().getTypeOfPublickKeyMultiLanguagePropertyTypeOfPublickKeyParserRuleCall_10_2_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_TypeOfPublickKey_13_0=ruleMultiLanguagePropertyTypeOfPublickKey();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEmailSubmodelElementCollectionRule());
                            							}
                            							set(
                            								current,
                            								"TypeOfPublickKey",
                            								lv_TypeOfPublickKey_13_0,
                            								"org.xtext.smartaas.nameplate.Dsl.MultiLanguagePropertyTypeOfPublickKey");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_14=(Token)match(input,17,FOLLOW_18); 

                            					newLeafNode(otherlv_14, grammarAccess.getEmailSubmodelElementCollectionAccess().getSemicolonKeyword_10_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEmailSubmodelElementCollectionAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmailSubmodelElementCollection"


    // $ANTLR start "entryRulePropertyEmailAddress"
    // InternalDsl.g:2670:1: entryRulePropertyEmailAddress returns [EObject current=null] : iv_rulePropertyEmailAddress= rulePropertyEmailAddress EOF ;
    public final EObject entryRulePropertyEmailAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyEmailAddress = null;


        try {
            // InternalDsl.g:2670:61: (iv_rulePropertyEmailAddress= rulePropertyEmailAddress EOF )
            // InternalDsl.g:2671:2: iv_rulePropertyEmailAddress= rulePropertyEmailAddress EOF
            {
             newCompositeNode(grammarAccess.getPropertyEmailAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyEmailAddress=rulePropertyEmailAddress();

            state._fsp--;

             current =iv_rulePropertyEmailAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyEmailAddress"


    // $ANTLR start "rulePropertyEmailAddress"
    // InternalDsl.g:2677:1: rulePropertyEmailAddress returns [EObject current=null] : (otherlv_0= 'EmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyEmailAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2683:2: ( (otherlv_0= 'EmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2684:2: (otherlv_0= 'EmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2684:2: (otherlv_0= 'EmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2685:3: otherlv_0= 'EmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyEmailAddressAccess().getEmailAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyEmailAddressAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2693:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2694:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2694:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2695:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyEmailAddressAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyEmailAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyEmailAddressAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2715:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2716:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2716:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2717:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyEmailAddressAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyEmailAddressRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyEmailAddressAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyEmailAddress"


    // $ANTLR start "entryRulePropertyTypeOfEmailAddress"
    // InternalDsl.g:2742:1: entryRulePropertyTypeOfEmailAddress returns [EObject current=null] : iv_rulePropertyTypeOfEmailAddress= rulePropertyTypeOfEmailAddress EOF ;
    public final EObject entryRulePropertyTypeOfEmailAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyTypeOfEmailAddress = null;


        try {
            // InternalDsl.g:2742:67: (iv_rulePropertyTypeOfEmailAddress= rulePropertyTypeOfEmailAddress EOF )
            // InternalDsl.g:2743:2: iv_rulePropertyTypeOfEmailAddress= rulePropertyTypeOfEmailAddress EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeOfEmailAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyTypeOfEmailAddress=rulePropertyTypeOfEmailAddress();

            state._fsp--;

             current =iv_rulePropertyTypeOfEmailAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyTypeOfEmailAddress"


    // $ANTLR start "rulePropertyTypeOfEmailAddress"
    // InternalDsl.g:2749:1: rulePropertyTypeOfEmailAddress returns [EObject current=null] : (otherlv_0= 'TypeOfEmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyTypeOfEmailAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2755:2: ( (otherlv_0= 'TypeOfEmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2756:2: (otherlv_0= 'TypeOfEmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2756:2: (otherlv_0= 'TypeOfEmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2757:3: otherlv_0= 'TypeOfEmailAddress' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeOfEmailAddressAccess().getTypeOfEmailAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyTypeOfEmailAddressAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2765:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2766:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2766:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2767:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyTypeOfEmailAddressAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyTypeOfEmailAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyTypeOfEmailAddressAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2787:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2788:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2788:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2789:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyTypeOfEmailAddressAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyTypeOfEmailAddressRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyTypeOfEmailAddressAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyTypeOfEmailAddress"


    // $ANTLR start "entryRuleMultiLanguagePropertyPublicKey"
    // InternalDsl.g:2814:1: entryRuleMultiLanguagePropertyPublicKey returns [EObject current=null] : iv_ruleMultiLanguagePropertyPublicKey= ruleMultiLanguagePropertyPublicKey EOF ;
    public final EObject entryRuleMultiLanguagePropertyPublicKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyPublicKey = null;


        try {
            // InternalDsl.g:2814:71: (iv_ruleMultiLanguagePropertyPublicKey= ruleMultiLanguagePropertyPublicKey EOF )
            // InternalDsl.g:2815:2: iv_ruleMultiLanguagePropertyPublicKey= ruleMultiLanguagePropertyPublicKey EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyPublicKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyPublicKey=ruleMultiLanguagePropertyPublicKey();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyPublicKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyPublicKey"


    // $ANTLR start "ruleMultiLanguagePropertyPublicKey"
    // InternalDsl.g:2821:1: ruleMultiLanguagePropertyPublicKey returns [EObject current=null] : (otherlv_0= 'PublicKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyPublicKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2827:2: ( (otherlv_0= 'PublicKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2828:2: (otherlv_0= 'PublicKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2828:2: (otherlv_0= 'PublicKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2829:3: otherlv_0= 'PublicKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getPublicKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2837:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2838:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2838:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2839:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyPublicKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2859:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2860:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2860:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2861:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyPublicKeyRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyPublicKeyAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyPublicKey"


    // $ANTLR start "entryRuleMultiLanguagePropertyTypeOfPublickKey"
    // InternalDsl.g:2886:1: entryRuleMultiLanguagePropertyTypeOfPublickKey returns [EObject current=null] : iv_ruleMultiLanguagePropertyTypeOfPublickKey= ruleMultiLanguagePropertyTypeOfPublickKey EOF ;
    public final EObject entryRuleMultiLanguagePropertyTypeOfPublickKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyTypeOfPublickKey = null;


        try {
            // InternalDsl.g:2886:78: (iv_ruleMultiLanguagePropertyTypeOfPublickKey= ruleMultiLanguagePropertyTypeOfPublickKey EOF )
            // InternalDsl.g:2887:2: iv_ruleMultiLanguagePropertyTypeOfPublickKey= ruleMultiLanguagePropertyTypeOfPublickKey EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyTypeOfPublickKey=ruleMultiLanguagePropertyTypeOfPublickKey();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyTypeOfPublickKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyTypeOfPublickKey"


    // $ANTLR start "ruleMultiLanguagePropertyTypeOfPublickKey"
    // InternalDsl.g:2893:1: ruleMultiLanguagePropertyTypeOfPublickKey returns [EObject current=null] : (otherlv_0= 'TypeOfPublickKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyTypeOfPublickKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2899:2: ( (otherlv_0= 'TypeOfPublickKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2900:2: (otherlv_0= 'TypeOfPublickKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2900:2: (otherlv_0= 'TypeOfPublickKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2901:3: otherlv_0= 'TypeOfPublickKey' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getTypeOfPublickKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2909:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2910:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2910:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2911:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2931:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2932:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2932:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2933:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyTypeOfPublickKeyAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiLanguagePropertyTypeOfPublickKey"


    // $ANTLR start "entryRuleSubmodelElementCollectionMarkings"
    // InternalDsl.g:2958:1: entryRuleSubmodelElementCollectionMarkings returns [EObject current=null] : iv_ruleSubmodelElementCollectionMarkings= ruleSubmodelElementCollectionMarkings EOF ;
    public final EObject entryRuleSubmodelElementCollectionMarkings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionMarkings = null;


        try {
            // InternalDsl.g:2958:74: (iv_ruleSubmodelElementCollectionMarkings= ruleSubmodelElementCollectionMarkings EOF )
            // InternalDsl.g:2959:2: iv_ruleSubmodelElementCollectionMarkings= ruleSubmodelElementCollectionMarkings EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionMarkings=ruleSubmodelElementCollectionMarkings();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionMarkings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionMarkings"


    // $ANTLR start "ruleSubmodelElementCollectionMarkings"
    // InternalDsl.g:2965:1: ruleSubmodelElementCollectionMarkings returns [EObject current=null] : (otherlv_0= 'Markings' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+ otherlv_9= '}' ) ;
    public final EObject ruleSubmodelElementCollectionMarkings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_Marking_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2971:2: ( (otherlv_0= 'Markings' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+ otherlv_9= '}' ) )
            // InternalDsl.g:2972:2: (otherlv_0= 'Markings' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            {
            // InternalDsl.g:2972:2: (otherlv_0= 'Markings' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            // InternalDsl.g:2973:3: otherlv_0= 'Markings' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getMarkingsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2981:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2982:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2982:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2983:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionMarkingsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3003:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3004:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3004:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3005:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingsAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingsRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:3030:3: ( ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:3031:4: ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:3031:4: ( (lv_Marking_7_0= ruleSubmodelElementCollectionMarking ) )
            	    // InternalDsl.g:3032:5: (lv_Marking_7_0= ruleSubmodelElementCollectionMarking )
            	    {
            	    // InternalDsl.g:3032:5: (lv_Marking_7_0= ruleSubmodelElementCollectionMarking )
            	    // InternalDsl.g:3033:6: lv_Marking_7_0= ruleSubmodelElementCollectionMarking
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingsAccess().getMarkingSubmodelElementCollectionMarkingParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Marking_7_0=ruleSubmodelElementCollectionMarking();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Marking",
            	    							lv_Marking_7_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.SubmodelElementCollectionMarking");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_39); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubmodelElementCollectionMarkingsAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmodelElementCollectionMarkings"


    // $ANTLR start "entryRuleSubmodelElementCollectionMarking"
    // InternalDsl.g:3063:1: entryRuleSubmodelElementCollectionMarking returns [EObject current=null] : iv_ruleSubmodelElementCollectionMarking= ruleSubmodelElementCollectionMarking EOF ;
    public final EObject entryRuleSubmodelElementCollectionMarking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionMarking = null;


        try {
            // InternalDsl.g:3063:73: (iv_ruleSubmodelElementCollectionMarking= ruleSubmodelElementCollectionMarking EOF )
            // InternalDsl.g:3064:2: iv_ruleSubmodelElementCollectionMarking= ruleSubmodelElementCollectionMarking EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionMarking=ruleSubmodelElementCollectionMarking();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionMarking; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionMarking"


    // $ANTLR start "ruleSubmodelElementCollectionMarking"
    // InternalDsl.g:3070:1: ruleSubmodelElementCollectionMarking returns [EObject current=null] : (otherlv_0= 'Marking' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_MarkingName_7_0= rulePropertyMarkingName ) ) otherlv_8= ';' ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) ) otherlv_10= ';' ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )* otherlv_13= '}' ) ;
    public final EObject ruleSubmodelElementCollectionMarking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_MarkingName_7_0 = null;

        EObject lv_MarkingFile_9_0 = null;

        EObject lv_MarkingAdditionalText_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3076:2: ( (otherlv_0= 'Marking' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_MarkingName_7_0= rulePropertyMarkingName ) ) otherlv_8= ';' ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) ) otherlv_10= ';' ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )* otherlv_13= '}' ) )
            // InternalDsl.g:3077:2: (otherlv_0= 'Marking' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_MarkingName_7_0= rulePropertyMarkingName ) ) otherlv_8= ';' ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) ) otherlv_10= ';' ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )* otherlv_13= '}' )
            {
            // InternalDsl.g:3077:2: (otherlv_0= 'Marking' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_MarkingName_7_0= rulePropertyMarkingName ) ) otherlv_8= ';' ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) ) otherlv_10= ';' ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )* otherlv_13= '}' )
            // InternalDsl.g:3078:3: otherlv_0= 'Marking' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_MarkingName_7_0= rulePropertyMarkingName ) ) otherlv_8= ';' ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) ) otherlv_10= ';' ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionMarkingAccess().getMarkingKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionMarkingAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3086:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3087:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3087:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3088:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionMarkingAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionMarkingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionMarkingAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3108:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3109:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3109:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3110:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionMarkingAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionMarkingAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:3135:3: ( (lv_MarkingName_7_0= rulePropertyMarkingName ) )
            // InternalDsl.g:3136:4: (lv_MarkingName_7_0= rulePropertyMarkingName )
            {
            // InternalDsl.g:3136:4: (lv_MarkingName_7_0= rulePropertyMarkingName )
            // InternalDsl.g:3137:5: lv_MarkingName_7_0= rulePropertyMarkingName
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingAccess().getMarkingNamePropertyMarkingNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_MarkingName_7_0=rulePropertyMarkingName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingRule());
            					}
            					set(
            						current,
            						"MarkingName",
            						lv_MarkingName_7_0,
            						"org.xtext.smartaas.nameplate.Dsl.PropertyMarkingName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionMarkingAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:3158:3: ( (lv_MarkingFile_9_0= ruleFileMarkingFile ) )
            // InternalDsl.g:3159:4: (lv_MarkingFile_9_0= ruleFileMarkingFile )
            {
            // InternalDsl.g:3159:4: (lv_MarkingFile_9_0= ruleFileMarkingFile )
            // InternalDsl.g:3160:5: lv_MarkingFile_9_0= ruleFileMarkingFile
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingAccess().getMarkingFileFileMarkingFileParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_MarkingFile_9_0=ruleFileMarkingFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingRule());
            					}
            					set(
            						current,
            						"MarkingFile",
            						lv_MarkingFile_9_0,
            						"org.xtext.smartaas.nameplate.Dsl.FileMarkingFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionMarkingAccess().getSemicolonKeyword_10());
            		
            // InternalDsl.g:3181:3: ( ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:3182:4: ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) ) otherlv_12= ';'
            	    {
            	    // InternalDsl.g:3182:4: ( (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText ) )
            	    // InternalDsl.g:3183:5: (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText )
            	    {
            	    // InternalDsl.g:3183:5: (lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText )
            	    // InternalDsl.g:3184:6: lv_MarkingAdditionalText_11_0= rulePropertyMarkingAdditionalText
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionMarkingAccess().getMarkingAdditionalTextPropertyMarkingAdditionalTextParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_MarkingAdditionalText_11_0=rulePropertyMarkingAdditionalText();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionMarkingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"MarkingAdditionalText",
            	    							lv_MarkingAdditionalText_11_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.PropertyMarkingAdditionalText");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_42); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubmodelElementCollectionMarkingAccess().getSemicolonKeyword_11_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSubmodelElementCollectionMarkingAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmodelElementCollectionMarking"


    // $ANTLR start "entryRulePropertyMarkingName"
    // InternalDsl.g:3214:1: entryRulePropertyMarkingName returns [EObject current=null] : iv_rulePropertyMarkingName= rulePropertyMarkingName EOF ;
    public final EObject entryRulePropertyMarkingName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMarkingName = null;


        try {
            // InternalDsl.g:3214:60: (iv_rulePropertyMarkingName= rulePropertyMarkingName EOF )
            // InternalDsl.g:3215:2: iv_rulePropertyMarkingName= rulePropertyMarkingName EOF
            {
             newCompositeNode(grammarAccess.getPropertyMarkingNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyMarkingName=rulePropertyMarkingName();

            state._fsp--;

             current =iv_rulePropertyMarkingName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyMarkingName"


    // $ANTLR start "rulePropertyMarkingName"
    // InternalDsl.g:3221:1: rulePropertyMarkingName returns [EObject current=null] : (otherlv_0= 'MarkingName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyMarkingName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3227:2: ( (otherlv_0= 'MarkingName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:3228:2: (otherlv_0= 'MarkingName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:3228:2: (otherlv_0= 'MarkingName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:3229:3: otherlv_0= 'MarkingName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyMarkingNameAccess().getMarkingNameKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyMarkingNameAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3237:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3238:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3238:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3239:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyMarkingNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyMarkingNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyMarkingNameAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3259:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3260:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3260:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3261:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyMarkingNameAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyMarkingNameRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyMarkingNameAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyMarkingName"


    // $ANTLR start "entryRuleFileMarkingFile"
    // InternalDsl.g:3286:1: entryRuleFileMarkingFile returns [EObject current=null] : iv_ruleFileMarkingFile= ruleFileMarkingFile EOF ;
    public final EObject entryRuleFileMarkingFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileMarkingFile = null;


        try {
            // InternalDsl.g:3286:56: (iv_ruleFileMarkingFile= ruleFileMarkingFile EOF )
            // InternalDsl.g:3287:2: iv_ruleFileMarkingFile= ruleFileMarkingFile EOF
            {
             newCompositeNode(grammarAccess.getFileMarkingFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileMarkingFile=ruleFileMarkingFile();

            state._fsp--;

             current =iv_ruleFileMarkingFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileMarkingFile"


    // $ANTLR start "ruleFileMarkingFile"
    // InternalDsl.g:3293:1: ruleFileMarkingFile returns [EObject current=null] : (otherlv_0= 'MarkingFile' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleFileMarkingFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3299:2: ( (otherlv_0= 'MarkingFile' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:3300:2: (otherlv_0= 'MarkingFile' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:3300:2: (otherlv_0= 'MarkingFile' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:3301:3: otherlv_0= 'MarkingFile' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFileMarkingFileAccess().getMarkingFileKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFileMarkingFileAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3309:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3310:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3310:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3311:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFileMarkingFileAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileMarkingFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFileMarkingFileAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3331:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3332:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3332:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3333:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getFileMarkingFileAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileMarkingFileRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFileMarkingFileAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileMarkingFile"


    // $ANTLR start "entryRulePropertyMarkingAdditionalText"
    // InternalDsl.g:3358:1: entryRulePropertyMarkingAdditionalText returns [EObject current=null] : iv_rulePropertyMarkingAdditionalText= rulePropertyMarkingAdditionalText EOF ;
    public final EObject entryRulePropertyMarkingAdditionalText() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMarkingAdditionalText = null;


        try {
            // InternalDsl.g:3358:70: (iv_rulePropertyMarkingAdditionalText= rulePropertyMarkingAdditionalText EOF )
            // InternalDsl.g:3359:2: iv_rulePropertyMarkingAdditionalText= rulePropertyMarkingAdditionalText EOF
            {
             newCompositeNode(grammarAccess.getPropertyMarkingAdditionalTextRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyMarkingAdditionalText=rulePropertyMarkingAdditionalText();

            state._fsp--;

             current =iv_rulePropertyMarkingAdditionalText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyMarkingAdditionalText"


    // $ANTLR start "rulePropertyMarkingAdditionalText"
    // InternalDsl.g:3365:1: rulePropertyMarkingAdditionalText returns [EObject current=null] : (otherlv_0= 'MarkingAdditionalText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyMarkingAdditionalText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3371:2: ( (otherlv_0= 'MarkingAdditionalText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:3372:2: (otherlv_0= 'MarkingAdditionalText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:3372:2: (otherlv_0= 'MarkingAdditionalText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:3373:3: otherlv_0= 'MarkingAdditionalText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyMarkingAdditionalTextAccess().getMarkingAdditionalTextKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyMarkingAdditionalTextAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3381:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3382:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3382:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3383:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyMarkingAdditionalTextAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyMarkingAdditionalTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyMarkingAdditionalTextAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3403:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3404:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3404:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3405:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyMarkingAdditionalTextAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyMarkingAdditionalTextRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyMarkingAdditionalTextAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyMarkingAdditionalText"


    // $ANTLR start "entryRuleSubmodelElementCollectionAssetSpecificProperties"
    // InternalDsl.g:3430:1: entryRuleSubmodelElementCollectionAssetSpecificProperties returns [EObject current=null] : iv_ruleSubmodelElementCollectionAssetSpecificProperties= ruleSubmodelElementCollectionAssetSpecificProperties EOF ;
    public final EObject entryRuleSubmodelElementCollectionAssetSpecificProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionAssetSpecificProperties = null;


        try {
            // InternalDsl.g:3430:89: (iv_ruleSubmodelElementCollectionAssetSpecificProperties= ruleSubmodelElementCollectionAssetSpecificProperties EOF )
            // InternalDsl.g:3431:2: iv_ruleSubmodelElementCollectionAssetSpecificProperties= ruleSubmodelElementCollectionAssetSpecificProperties EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionAssetSpecificProperties=ruleSubmodelElementCollectionAssetSpecificProperties();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionAssetSpecificProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionAssetSpecificProperties"


    // $ANTLR start "ruleSubmodelElementCollectionAssetSpecificProperties"
    // InternalDsl.g:3437:1: ruleSubmodelElementCollectionAssetSpecificProperties returns [EObject current=null] : (otherlv_0= 'AssetSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+ otherlv_9= '}' ) ;
    public final EObject ruleSubmodelElementCollectionAssetSpecificProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_GuidelineSpecificProperties_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3443:2: ( (otherlv_0= 'AssetSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+ otherlv_9= '}' ) )
            // InternalDsl.g:3444:2: (otherlv_0= 'AssetSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            {
            // InternalDsl.g:3444:2: (otherlv_0= 'AssetSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+ otherlv_9= '}' )
            // InternalDsl.g:3445:3: otherlv_0= 'AssetSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getAssetSpecificPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3453:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3454:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3454:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3455:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3475:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3476:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3476:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3477:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:3502:3: ( ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==54) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:3503:4: ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:3503:4: ( (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties ) )
            	    // InternalDsl.g:3504:5: (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties )
            	    {
            	    // InternalDsl.g:3504:5: (lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties )
            	    // InternalDsl.g:3505:6: lv_GuidelineSpecificProperties_7_0= ruleSubmodelElementCollectionGuidelineSpecificProperties
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getGuidelineSpecificPropertiesSubmodelElementCollectionGuidelineSpecificPropertiesParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_GuidelineSpecificProperties_7_0=ruleSubmodelElementCollectionGuidelineSpecificProperties();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"GuidelineSpecificProperties",
            	    							lv_GuidelineSpecificProperties_7_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.SubmodelElementCollectionGuidelineSpecificProperties");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_44); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubmodelElementCollectionAssetSpecificPropertiesAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmodelElementCollectionAssetSpecificProperties"


    // $ANTLR start "entryRuleSubmodelElementCollectionGuidelineSpecificProperties"
    // InternalDsl.g:3535:1: entryRuleSubmodelElementCollectionGuidelineSpecificProperties returns [EObject current=null] : iv_ruleSubmodelElementCollectionGuidelineSpecificProperties= ruleSubmodelElementCollectionGuidelineSpecificProperties EOF ;
    public final EObject entryRuleSubmodelElementCollectionGuidelineSpecificProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionGuidelineSpecificProperties = null;


        try {
            // InternalDsl.g:3535:93: (iv_ruleSubmodelElementCollectionGuidelineSpecificProperties= ruleSubmodelElementCollectionGuidelineSpecificProperties EOF )
            // InternalDsl.g:3536:2: iv_ruleSubmodelElementCollectionGuidelineSpecificProperties= ruleSubmodelElementCollectionGuidelineSpecificProperties EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionGuidelineSpecificProperties=ruleSubmodelElementCollectionGuidelineSpecificProperties();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionGuidelineSpecificProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionGuidelineSpecificProperties"


    // $ANTLR start "ruleSubmodelElementCollectionGuidelineSpecificProperties"
    // InternalDsl.g:3542:1: ruleSubmodelElementCollectionGuidelineSpecificProperties returns [EObject current=null] : (otherlv_0= 'GuidelineSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) ) otherlv_8= ';' ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+ otherlv_11= '}' ) ;
    public final EObject ruleSubmodelElementCollectionGuidelineSpecificProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_GuidelineForConformityDeclaration_7_0 = null;

        EObject lv_Arbitrary_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3548:2: ( (otherlv_0= 'GuidelineSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) ) otherlv_8= ';' ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+ otherlv_11= '}' ) )
            // InternalDsl.g:3549:2: (otherlv_0= 'GuidelineSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) ) otherlv_8= ';' ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+ otherlv_11= '}' )
            {
            // InternalDsl.g:3549:2: (otherlv_0= 'GuidelineSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) ) otherlv_8= ';' ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+ otherlv_11= '}' )
            // InternalDsl.g:3550:3: otherlv_0= 'GuidelineSpecificProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) ) otherlv_8= ';' ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getGuidelineSpecificPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3558:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3559:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3559:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3560:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3580:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3581:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3581:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3582:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:3607:3: ( (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration ) )
            // InternalDsl.g:3608:4: (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration )
            {
            // InternalDsl.g:3608:4: (lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration )
            // InternalDsl.g:3609:5: lv_GuidelineForConformityDeclaration_7_0= rulePropertyGuidelineForConformityDeclaration
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getGuidelineForConformityDeclarationPropertyGuidelineForConformityDeclarationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_GuidelineForConformityDeclaration_7_0=rulePropertyGuidelineForConformityDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesRule());
            					}
            					set(
            						current,
            						"GuidelineForConformityDeclaration",
            						lv_GuidelineForConformityDeclaration_7_0,
            						"org.xtext.smartaas.nameplate.Dsl.PropertyGuidelineForConformityDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:3630:3: ( ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:3631:4: ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:3631:4: ( (lv_Arbitrary_9_0= rulePropertyArbitrary ) )
            	    // InternalDsl.g:3632:5: (lv_Arbitrary_9_0= rulePropertyArbitrary )
            	    {
            	    // InternalDsl.g:3632:5: (lv_Arbitrary_9_0= rulePropertyArbitrary )
            	    // InternalDsl.g:3633:6: lv_Arbitrary_9_0= rulePropertyArbitrary
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getArbitraryPropertyArbitraryParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Arbitrary_9_0=rulePropertyArbitrary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Arbitrary",
            	    							lv_Arbitrary_9_0,
            	    							"org.xtext.smartaas.nameplate.Dsl.PropertyArbitrary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,17,FOLLOW_47); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getSemicolonKeyword_9_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubmodelElementCollectionGuidelineSpecificPropertiesAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmodelElementCollectionGuidelineSpecificProperties"


    // $ANTLR start "entryRulePropertyGuidelineForConformityDeclaration"
    // InternalDsl.g:3663:1: entryRulePropertyGuidelineForConformityDeclaration returns [EObject current=null] : iv_rulePropertyGuidelineForConformityDeclaration= rulePropertyGuidelineForConformityDeclaration EOF ;
    public final EObject entryRulePropertyGuidelineForConformityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyGuidelineForConformityDeclaration = null;


        try {
            // InternalDsl.g:3663:82: (iv_rulePropertyGuidelineForConformityDeclaration= rulePropertyGuidelineForConformityDeclaration EOF )
            // InternalDsl.g:3664:2: iv_rulePropertyGuidelineForConformityDeclaration= rulePropertyGuidelineForConformityDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyGuidelineForConformityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyGuidelineForConformityDeclaration=rulePropertyGuidelineForConformityDeclaration();

            state._fsp--;

             current =iv_rulePropertyGuidelineForConformityDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyGuidelineForConformityDeclaration"


    // $ANTLR start "rulePropertyGuidelineForConformityDeclaration"
    // InternalDsl.g:3670:1: rulePropertyGuidelineForConformityDeclaration returns [EObject current=null] : (otherlv_0= 'GuidelineForConformityDeclaration' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyGuidelineForConformityDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3676:2: ( (otherlv_0= 'GuidelineForConformityDeclaration' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:3677:2: (otherlv_0= 'GuidelineForConformityDeclaration' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:3677:2: (otherlv_0= 'GuidelineForConformityDeclaration' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:3678:3: otherlv_0= 'GuidelineForConformityDeclaration' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getGuidelineForConformityDeclarationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3686:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3687:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3687:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3688:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyGuidelineForConformityDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3708:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3709:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3709:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3710:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyGuidelineForConformityDeclarationRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyGuidelineForConformityDeclarationAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyGuidelineForConformityDeclaration"


    // $ANTLR start "entryRulePropertyArbitrary"
    // InternalDsl.g:3735:1: entryRulePropertyArbitrary returns [EObject current=null] : iv_rulePropertyArbitrary= rulePropertyArbitrary EOF ;
    public final EObject entryRulePropertyArbitrary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyArbitrary = null;


        try {
            // InternalDsl.g:3735:58: (iv_rulePropertyArbitrary= rulePropertyArbitrary EOF )
            // InternalDsl.g:3736:2: iv_rulePropertyArbitrary= rulePropertyArbitrary EOF
            {
             newCompositeNode(grammarAccess.getPropertyArbitraryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyArbitrary=rulePropertyArbitrary();

            state._fsp--;

             current =iv_rulePropertyArbitrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyArbitrary"


    // $ANTLR start "rulePropertyArbitrary"
    // InternalDsl.g:3742:1: rulePropertyArbitrary returns [EObject current=null] : (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyArbitrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3748:2: ( (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:3749:2: (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:3749:2: (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:3750:3: otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyArbitraryAccess().getArbitraryKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyArbitraryAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3758:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3759:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3759:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3760:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyArbitraryAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyArbitraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyArbitraryAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:3780:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:3781:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:3781:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:3782:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyArbitraryAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyArbitraryRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.nameplate.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyArbitraryAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyArbitrary"


    // $ANTLR start "entryRuleSID"
    // InternalDsl.g:3807:1: entryRuleSID returns [EObject current=null] : iv_ruleSID= ruleSID EOF ;
    public final EObject entryRuleSID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSID = null;


        try {
            // InternalDsl.g:3807:44: (iv_ruleSID= ruleSID EOF )
            // InternalDsl.g:3808:2: iv_ruleSID= ruleSID EOF
            {
             newCompositeNode(grammarAccess.getSIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSID=ruleSID();

            state._fsp--;

             current =iv_ruleSID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSID"


    // $ANTLR start "ruleSID"
    // InternalDsl.g:3814:1: ruleSID returns [EObject current=null] : (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_II_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:3820:2: ( (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:3821:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:3821:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            // InternalDsl.g:3822:3: otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSIDAccess().getSemanticIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSIDAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3830:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:3831:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:3831:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:3832:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSIDAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSIDAccess().getVerticalLineKeyword_3());
            		
            // InternalDsl.g:3852:3: ( (lv_II_4_0= RULE_STRING ) )
            // InternalDsl.g:3853:4: (lv_II_4_0= RULE_STRING )
            {
            // InternalDsl.g:3853:4: (lv_II_4_0= RULE_STRING )
            // InternalDsl.g:3854:5: lv_II_4_0= RULE_STRING
            {
            lv_II_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_II_4_0, grammarAccess.getSIDAccess().getIISTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"II",
            						lv_II_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0021000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000093C00040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000093800040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000093000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000092000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000090000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000600000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});

}
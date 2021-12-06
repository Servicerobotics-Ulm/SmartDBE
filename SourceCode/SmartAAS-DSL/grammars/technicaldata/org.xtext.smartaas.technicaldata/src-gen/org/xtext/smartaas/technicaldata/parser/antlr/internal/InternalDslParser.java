package org.xtext.smartaas.technicaldata.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smartaas.technicaldata.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AAS'", "'::'", "'TechnicalData'", "'[['", "']]'", "'{'", "';'", "'}'", "'GeneralInformation'", "':'", "'ManufacturerName'", "'ManufacturerLogo'", "'ManufacturerProductDesignation'", "'ManufacturerPartNumber'", "'ManufacturerOrderCode'", "'ProductImage'", "'ProductClassifications'", "'ProductClassificationItem'", "'ProductClassificationSystem'", "'ClassificationSystemVersion'", "'ProductClassId'", "'TechnicalProperties'", "'Arbitrary'", "'Section'", "'SubSection'", "'FurtherInformation'", "'TextStatement'", "'ValidDate'", "'SemanticId'", "'|'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_technicaldata_0_0= ruleTechnicaldataSubmodel ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_technicaldata_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_technicaldata_0_0= ruleTechnicaldataSubmodel ) ) )
            // InternalDsl.g:78:2: ( (lv_technicaldata_0_0= ruleTechnicaldataSubmodel ) )
            {
            // InternalDsl.g:78:2: ( (lv_technicaldata_0_0= ruleTechnicaldataSubmodel ) )
            // InternalDsl.g:79:3: (lv_technicaldata_0_0= ruleTechnicaldataSubmodel )
            {
            // InternalDsl.g:79:3: (lv_technicaldata_0_0= ruleTechnicaldataSubmodel )
            // InternalDsl.g:80:4: lv_technicaldata_0_0= ruleTechnicaldataSubmodel
            {

            				newCompositeNode(grammarAccess.getModelAccess().getTechnicaldataTechnicaldataSubmodelParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_technicaldata_0_0=ruleTechnicaldataSubmodel();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"technicaldata",
            					lv_technicaldata_0_0,
            					"org.xtext.smartaas.technicaldata.Dsl.TechnicaldataSubmodel");
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


    // $ANTLR start "entryRuleTechnicaldataSubmodel"
    // InternalDsl.g:100:1: entryRuleTechnicaldataSubmodel returns [EObject current=null] : iv_ruleTechnicaldataSubmodel= ruleTechnicaldataSubmodel EOF ;
    public final EObject entryRuleTechnicaldataSubmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnicaldataSubmodel = null;


        try {
            // InternalDsl.g:100:62: (iv_ruleTechnicaldataSubmodel= ruleTechnicaldataSubmodel EOF )
            // InternalDsl.g:101:2: iv_ruleTechnicaldataSubmodel= ruleTechnicaldataSubmodel EOF
            {
             newCompositeNode(grammarAccess.getTechnicaldataSubmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnicaldataSubmodel=ruleTechnicaldataSubmodel();

            state._fsp--;

             current =iv_ruleTechnicaldataSubmodel; 
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
    // $ANTLR end "entryRuleTechnicaldataSubmodel"


    // $ANTLR start "ruleTechnicaldataSubmodel"
    // InternalDsl.g:107:1: ruleTechnicaldataSubmodel returns [EObject current=null] : (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'TechnicalData' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) ) otherlv_9= ';' ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )? ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) ) otherlv_13= ';' ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )? otherlv_16= '}' ) ;
    public final EObject ruleTechnicaldataSubmodel() throws RecognitionException {
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
        Token otherlv_16=null;
        EObject lv_SemanticId_5_0 = null;

        EObject lv_GeneralInformation_8_0 = null;

        EObject lv_ProductClassifications_10_0 = null;

        EObject lv_TechnicalProperties_12_0 = null;

        EObject lv_FurtherInformation_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'TechnicalData' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) ) otherlv_9= ';' ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )? ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) ) otherlv_13= ';' ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )? otherlv_16= '}' ) )
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'TechnicalData' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) ) otherlv_9= ';' ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )? ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) ) otherlv_13= ';' ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )? otherlv_16= '}' )
            {
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'TechnicalData' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) ) otherlv_9= ';' ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )? ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) ) otherlv_13= ';' ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )? otherlv_16= '}' )
            // InternalDsl.g:115:3: otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'TechnicalData' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) ) otherlv_9= ';' ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )? ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) ) otherlv_13= ';' ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnicaldataSubmodelAccess().getAASKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTechnicaldataSubmodelAccess().getColonColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalDataKeyword_2());
            		
            // InternalDsl.g:127:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:129:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTechnicaldataSubmodelAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTechnicaldataSubmodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTechnicaldataSubmodelAccess().getLeftSquareBracketLeftSquareBracketKeyword_4());
            		
            // InternalDsl.g:149:3: ( (lv_SemanticId_5_0= ruleSID ) )
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            {
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            // InternalDsl.g:151:5: lv_SemanticId_5_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getTechnicaldataSubmodelAccess().getSemanticIdSIDParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_5_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnicaldataSubmodelRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_5_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getTechnicaldataSubmodelAccess().getRightSquareBracketRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTechnicaldataSubmodelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDsl.g:176:3: ( (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation ) )
            // InternalDsl.g:177:4: (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation )
            {
            // InternalDsl.g:177:4: (lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation )
            // InternalDsl.g:178:5: lv_GeneralInformation_8_0= ruleSubmodelElementCollectionGeneralInformation
            {

            					newCompositeNode(grammarAccess.getTechnicaldataSubmodelAccess().getGeneralInformationSubmodelElementCollectionGeneralInformationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_GeneralInformation_8_0=ruleSubmodelElementCollectionGeneralInformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnicaldataSubmodelRule());
            					}
            					set(
            						current,
            						"GeneralInformation",
            						lv_GeneralInformation_8_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionGeneralInformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_9());
            		
            // InternalDsl.g:199:3: ( ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:200:4: ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) ) otherlv_11= ';'
                    {
                    // InternalDsl.g:200:4: ( (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications ) )
                    // InternalDsl.g:201:5: (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications )
                    {
                    // InternalDsl.g:201:5: (lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications )
                    // InternalDsl.g:202:6: lv_ProductClassifications_10_0= ruleSubmodelElementCollectionProductClassifications
                    {

                    						newCompositeNode(grammarAccess.getTechnicaldataSubmodelAccess().getProductClassificationsSubmodelElementCollectionProductClassificationsParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ProductClassifications_10_0=ruleSubmodelElementCollectionProductClassifications();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTechnicaldataSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"ProductClassifications",
                    							lv_ProductClassifications_10_0,
                    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionProductClassifications");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_10_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:224:3: ( (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties ) )
            // InternalDsl.g:225:4: (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties )
            {
            // InternalDsl.g:225:4: (lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties )
            // InternalDsl.g:226:5: lv_TechnicalProperties_12_0= ruleSubmodelElementCollectionTechnicalProperties
            {

            					newCompositeNode(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalPropertiesSubmodelElementCollectionTechnicalPropertiesParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_TechnicalProperties_12_0=ruleSubmodelElementCollectionTechnicalProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnicaldataSubmodelRule());
            					}
            					set(
            						current,
            						"TechnicalProperties",
            						lv_TechnicalProperties_12_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionTechnicalProperties");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_12());
            		
            // InternalDsl.g:247:3: ( ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:248:4: ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) ) otherlv_15= ';'
                    {
                    // InternalDsl.g:248:4: ( (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation ) )
                    // InternalDsl.g:249:5: (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation )
                    {
                    // InternalDsl.g:249:5: (lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation )
                    // InternalDsl.g:250:6: lv_FurtherInformation_14_0= ruleSubmodelElementCollectionFurtherInformation
                    {

                    						newCompositeNode(grammarAccess.getTechnicaldataSubmodelAccess().getFurtherInformationSubmodelElementCollectionFurtherInformationParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_FurtherInformation_14_0=ruleSubmodelElementCollectionFurtherInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTechnicaldataSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"FurtherInformation",
                    							lv_FurtherInformation_14_0,
                    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionFurtherInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_13_1());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTechnicaldataSubmodelAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleTechnicaldataSubmodel"


    // $ANTLR start "entryRuleSubmodelElementCollectionGeneralInformation"
    // InternalDsl.g:280:1: entryRuleSubmodelElementCollectionGeneralInformation returns [EObject current=null] : iv_ruleSubmodelElementCollectionGeneralInformation= ruleSubmodelElementCollectionGeneralInformation EOF ;
    public final EObject entryRuleSubmodelElementCollectionGeneralInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionGeneralInformation = null;


        try {
            // InternalDsl.g:280:84: (iv_ruleSubmodelElementCollectionGeneralInformation= ruleSubmodelElementCollectionGeneralInformation EOF )
            // InternalDsl.g:281:2: iv_ruleSubmodelElementCollectionGeneralInformation= ruleSubmodelElementCollectionGeneralInformation EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionGeneralInformation=ruleSubmodelElementCollectionGeneralInformation();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionGeneralInformation; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionGeneralInformation"


    // $ANTLR start "ruleSubmodelElementCollectionGeneralInformation"
    // InternalDsl.g:287:1: ruleSubmodelElementCollectionGeneralInformation returns [EObject current=null] : (otherlv_0= 'GeneralInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) ) otherlv_8= ';' ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )? ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_12= ';' ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) ) otherlv_14= ';' ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) ) otherlv_16= ';' ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )* otherlv_19= '}' ) ;
    public final EObject ruleSubmodelElementCollectionGeneralInformation() throws RecognitionException {
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
        Token otherlv_19=null;
        EObject lv_SemanticId_4_0 = null;

        EObject lv_ManufacturerName_7_0 = null;

        EObject lv_ManufacturerLogo_9_0 = null;

        EObject lv_ManufacturerProductDesignation_11_0 = null;

        EObject lv_ManufacturerPartNumber_13_0 = null;

        EObject lv_ManufacturerOrderCode_15_0 = null;

        EObject lv_ProductImage_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:293:2: ( (otherlv_0= 'GeneralInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) ) otherlv_8= ';' ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )? ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_12= ';' ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) ) otherlv_14= ';' ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) ) otherlv_16= ';' ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )* otherlv_19= '}' ) )
            // InternalDsl.g:294:2: (otherlv_0= 'GeneralInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) ) otherlv_8= ';' ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )? ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_12= ';' ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) ) otherlv_14= ';' ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) ) otherlv_16= ';' ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )* otherlv_19= '}' )
            {
            // InternalDsl.g:294:2: (otherlv_0= 'GeneralInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) ) otherlv_8= ';' ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )? ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_12= ';' ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) ) otherlv_14= ';' ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) ) otherlv_16= ';' ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )* otherlv_19= '}' )
            // InternalDsl.g:295:3: otherlv_0= 'GeneralInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) ) otherlv_8= ';' ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )? ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) ) otherlv_12= ';' ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) ) otherlv_14= ';' ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) ) otherlv_16= ';' ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )* otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGeneralInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getColonKeyword_1());
            		
            // InternalDsl.g:303:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:304:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:304:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:305:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:325:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:326:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:326:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:327:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:352:3: ( (lv_ManufacturerName_7_0= rulePropertyManufacturerName ) )
            // InternalDsl.g:353:4: (lv_ManufacturerName_7_0= rulePropertyManufacturerName )
            {
            // InternalDsl.g:353:4: (lv_ManufacturerName_7_0= rulePropertyManufacturerName )
            // InternalDsl.g:354:5: lv_ManufacturerName_7_0= rulePropertyManufacturerName
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerNamePropertyManufacturerNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerName_7_0=rulePropertyManufacturerName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					set(
            						current,
            						"ManufacturerName",
            						lv_ManufacturerName_7_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyManufacturerName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:375:3: ( ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:376:4: ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) ) otherlv_10= ';'
                    {
                    // InternalDsl.g:376:4: ( (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo ) )
                    // InternalDsl.g:377:5: (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo )
                    {
                    // InternalDsl.g:377:5: (lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo )
                    // InternalDsl.g:378:6: lv_ManufacturerLogo_9_0= ruleFileManufacturerLogo
                    {

                    						newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerLogoFileManufacturerLogoParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ManufacturerLogo_9_0=ruleFileManufacturerLogo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
                    						}
                    						set(
                    							current,
                    							"ManufacturerLogo",
                    							lv_ManufacturerLogo_9_0,
                    							"org.xtext.smartaas.technicaldata.Dsl.FileManufacturerLogo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:400:3: ( (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation ) )
            // InternalDsl.g:401:4: (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation )
            {
            // InternalDsl.g:401:4: (lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation )
            // InternalDsl.g:402:5: lv_ManufacturerProductDesignation_11_0= ruleMultiLanguagePropertyManufacturerProductDesignation
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerProductDesignationMultiLanguagePropertyManufacturerProductDesignationParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerProductDesignation_11_0=ruleMultiLanguagePropertyManufacturerProductDesignation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					set(
            						current,
            						"ManufacturerProductDesignation",
            						lv_ManufacturerProductDesignation_11_0,
            						"org.xtext.smartaas.technicaldata.Dsl.MultiLanguagePropertyManufacturerProductDesignation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_11());
            		
            // InternalDsl.g:423:3: ( (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber ) )
            // InternalDsl.g:424:4: (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber )
            {
            // InternalDsl.g:424:4: (lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber )
            // InternalDsl.g:425:5: lv_ManufacturerPartNumber_13_0= rulePropertyManufacturerPartNumber
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerPartNumberPropertyManufacturerPartNumberParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerPartNumber_13_0=rulePropertyManufacturerPartNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					set(
            						current,
            						"ManufacturerPartNumber",
            						lv_ManufacturerPartNumber_13_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyManufacturerPartNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_14, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_13());
            		
            // InternalDsl.g:446:3: ( (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode ) )
            // InternalDsl.g:447:4: (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode )
            {
            // InternalDsl.g:447:4: (lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode )
            // InternalDsl.g:448:5: lv_ManufacturerOrderCode_15_0= rulePropertyManufacturerOrderCode
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerOrderCodePropertyManufacturerOrderCodeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_ManufacturerOrderCode_15_0=rulePropertyManufacturerOrderCode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            					}
            					set(
            						current,
            						"ManufacturerOrderCode",
            						lv_ManufacturerOrderCode_15_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyManufacturerOrderCode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_15());
            		
            // InternalDsl.g:469:3: ( ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:470:4: ( (lv_ProductImage_17_0= ruleFileProductImage ) ) otherlv_18= ';'
            	    {
            	    // InternalDsl.g:470:4: ( (lv_ProductImage_17_0= ruleFileProductImage ) )
            	    // InternalDsl.g:471:5: (lv_ProductImage_17_0= ruleFileProductImage )
            	    {
            	    // InternalDsl.g:471:5: (lv_ProductImage_17_0= ruleFileProductImage )
            	    // InternalDsl.g:472:6: lv_ProductImage_17_0= ruleFileProductImage
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getProductImageFileProductImageParserRuleCall_16_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ProductImage_17_0=ruleFileProductImage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionGeneralInformationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ProductImage",
            	    							lv_ProductImage_17_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.FileProductImage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_18=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_16_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_19=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionGeneralInformation"


    // $ANTLR start "entryRulePropertyManufacturerName"
    // InternalDsl.g:502:1: entryRulePropertyManufacturerName returns [EObject current=null] : iv_rulePropertyManufacturerName= rulePropertyManufacturerName EOF ;
    public final EObject entryRulePropertyManufacturerName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyManufacturerName = null;


        try {
            // InternalDsl.g:502:65: (iv_rulePropertyManufacturerName= rulePropertyManufacturerName EOF )
            // InternalDsl.g:503:2: iv_rulePropertyManufacturerName= rulePropertyManufacturerName EOF
            {
             newCompositeNode(grammarAccess.getPropertyManufacturerNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyManufacturerName=rulePropertyManufacturerName();

            state._fsp--;

             current =iv_rulePropertyManufacturerName; 
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
    // $ANTLR end "entryRulePropertyManufacturerName"


    // $ANTLR start "rulePropertyManufacturerName"
    // InternalDsl.g:509:1: rulePropertyManufacturerName returns [EObject current=null] : (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyManufacturerName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:515:2: ( (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:516:2: (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:516:2: (otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:517:3: otherlv_0= 'ManufacturerName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyManufacturerNameAccess().getManufacturerNameKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyManufacturerNameAccess().getColonKeyword_1());
            		
            // InternalDsl.g:525:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:526:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:526:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:527:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyManufacturerNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyManufacturerNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyManufacturerNameAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:547:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:548:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:548:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:549:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyManufacturerNameAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyManufacturerNameRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyManufacturerNameAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyManufacturerName"


    // $ANTLR start "entryRuleFileManufacturerLogo"
    // InternalDsl.g:574:1: entryRuleFileManufacturerLogo returns [EObject current=null] : iv_ruleFileManufacturerLogo= ruleFileManufacturerLogo EOF ;
    public final EObject entryRuleFileManufacturerLogo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileManufacturerLogo = null;


        try {
            // InternalDsl.g:574:61: (iv_ruleFileManufacturerLogo= ruleFileManufacturerLogo EOF )
            // InternalDsl.g:575:2: iv_ruleFileManufacturerLogo= ruleFileManufacturerLogo EOF
            {
             newCompositeNode(grammarAccess.getFileManufacturerLogoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileManufacturerLogo=ruleFileManufacturerLogo();

            state._fsp--;

             current =iv_ruleFileManufacturerLogo; 
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
    // $ANTLR end "entryRuleFileManufacturerLogo"


    // $ANTLR start "ruleFileManufacturerLogo"
    // InternalDsl.g:581:1: ruleFileManufacturerLogo returns [EObject current=null] : (otherlv_0= 'ManufacturerLogo' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleFileManufacturerLogo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:587:2: ( (otherlv_0= 'ManufacturerLogo' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:588:2: (otherlv_0= 'ManufacturerLogo' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:588:2: (otherlv_0= 'ManufacturerLogo' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:589:3: otherlv_0= 'ManufacturerLogo' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFileManufacturerLogoAccess().getManufacturerLogoKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFileManufacturerLogoAccess().getColonKeyword_1());
            		
            // InternalDsl.g:597:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:598:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:598:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:599:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFileManufacturerLogoAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileManufacturerLogoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFileManufacturerLogoAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:619:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:620:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:620:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:621:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getFileManufacturerLogoAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileManufacturerLogoRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFileManufacturerLogoAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFileManufacturerLogo"


    // $ANTLR start "entryRuleMultiLanguagePropertyManufacturerProductDesignation"
    // InternalDsl.g:646:1: entryRuleMultiLanguagePropertyManufacturerProductDesignation returns [EObject current=null] : iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF ;
    public final EObject entryRuleMultiLanguagePropertyManufacturerProductDesignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyManufacturerProductDesignation = null;


        try {
            // InternalDsl.g:646:92: (iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF )
            // InternalDsl.g:647:2: iv_ruleMultiLanguagePropertyManufacturerProductDesignation= ruleMultiLanguagePropertyManufacturerProductDesignation EOF
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
    // InternalDsl.g:653:1: ruleMultiLanguagePropertyManufacturerProductDesignation returns [EObject current=null] : (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
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
            // InternalDsl.g:659:2: ( (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:660:2: (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:660:2: (otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:661:3: otherlv_0= 'ManufacturerProductDesignation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getManufacturerProductDesignationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getColonKeyword_1());
            		
            // InternalDsl.g:669:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:670:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:670:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:671:5: lv_name_2_0= RULE_STRING
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
            		
            // InternalDsl.g:691:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:692:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:692:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:693:5: lv_SemanticId_4_0= ruleSID
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
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
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


    // $ANTLR start "entryRulePropertyManufacturerPartNumber"
    // InternalDsl.g:718:1: entryRulePropertyManufacturerPartNumber returns [EObject current=null] : iv_rulePropertyManufacturerPartNumber= rulePropertyManufacturerPartNumber EOF ;
    public final EObject entryRulePropertyManufacturerPartNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyManufacturerPartNumber = null;


        try {
            // InternalDsl.g:718:71: (iv_rulePropertyManufacturerPartNumber= rulePropertyManufacturerPartNumber EOF )
            // InternalDsl.g:719:2: iv_rulePropertyManufacturerPartNumber= rulePropertyManufacturerPartNumber EOF
            {
             newCompositeNode(grammarAccess.getPropertyManufacturerPartNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyManufacturerPartNumber=rulePropertyManufacturerPartNumber();

            state._fsp--;

             current =iv_rulePropertyManufacturerPartNumber; 
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
    // $ANTLR end "entryRulePropertyManufacturerPartNumber"


    // $ANTLR start "rulePropertyManufacturerPartNumber"
    // InternalDsl.g:725:1: rulePropertyManufacturerPartNumber returns [EObject current=null] : (otherlv_0= 'ManufacturerPartNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyManufacturerPartNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:731:2: ( (otherlv_0= 'ManufacturerPartNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:732:2: (otherlv_0= 'ManufacturerPartNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:732:2: (otherlv_0= 'ManufacturerPartNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:733:3: otherlv_0= 'ManufacturerPartNumber' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyManufacturerPartNumberAccess().getManufacturerPartNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyManufacturerPartNumberAccess().getColonKeyword_1());
            		
            // InternalDsl.g:741:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:742:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:742:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:743:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyManufacturerPartNumberAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyManufacturerPartNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyManufacturerPartNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:763:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:764:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:764:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:765:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyManufacturerPartNumberAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyManufacturerPartNumberRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyManufacturerPartNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyManufacturerPartNumber"


    // $ANTLR start "entryRulePropertyManufacturerOrderCode"
    // InternalDsl.g:790:1: entryRulePropertyManufacturerOrderCode returns [EObject current=null] : iv_rulePropertyManufacturerOrderCode= rulePropertyManufacturerOrderCode EOF ;
    public final EObject entryRulePropertyManufacturerOrderCode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyManufacturerOrderCode = null;


        try {
            // InternalDsl.g:790:70: (iv_rulePropertyManufacturerOrderCode= rulePropertyManufacturerOrderCode EOF )
            // InternalDsl.g:791:2: iv_rulePropertyManufacturerOrderCode= rulePropertyManufacturerOrderCode EOF
            {
             newCompositeNode(grammarAccess.getPropertyManufacturerOrderCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyManufacturerOrderCode=rulePropertyManufacturerOrderCode();

            state._fsp--;

             current =iv_rulePropertyManufacturerOrderCode; 
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
    // $ANTLR end "entryRulePropertyManufacturerOrderCode"


    // $ANTLR start "rulePropertyManufacturerOrderCode"
    // InternalDsl.g:797:1: rulePropertyManufacturerOrderCode returns [EObject current=null] : (otherlv_0= 'ManufacturerOrderCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyManufacturerOrderCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:803:2: ( (otherlv_0= 'ManufacturerOrderCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:804:2: (otherlv_0= 'ManufacturerOrderCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:804:2: (otherlv_0= 'ManufacturerOrderCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:805:3: otherlv_0= 'ManufacturerOrderCode' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyManufacturerOrderCodeAccess().getManufacturerOrderCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyManufacturerOrderCodeAccess().getColonKeyword_1());
            		
            // InternalDsl.g:813:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:814:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:814:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:815:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyManufacturerOrderCodeAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyManufacturerOrderCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyManufacturerOrderCodeAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:835:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:836:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:836:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:837:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyManufacturerOrderCodeAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyManufacturerOrderCodeRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyManufacturerOrderCodeAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyManufacturerOrderCode"


    // $ANTLR start "entryRuleFileProductImage"
    // InternalDsl.g:862:1: entryRuleFileProductImage returns [EObject current=null] : iv_ruleFileProductImage= ruleFileProductImage EOF ;
    public final EObject entryRuleFileProductImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileProductImage = null;


        try {
            // InternalDsl.g:862:57: (iv_ruleFileProductImage= ruleFileProductImage EOF )
            // InternalDsl.g:863:2: iv_ruleFileProductImage= ruleFileProductImage EOF
            {
             newCompositeNode(grammarAccess.getFileProductImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileProductImage=ruleFileProductImage();

            state._fsp--;

             current =iv_ruleFileProductImage; 
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
    // $ANTLR end "entryRuleFileProductImage"


    // $ANTLR start "ruleFileProductImage"
    // InternalDsl.g:869:1: ruleFileProductImage returns [EObject current=null] : (otherlv_0= 'ProductImage' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleFileProductImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:875:2: ( (otherlv_0= 'ProductImage' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:876:2: (otherlv_0= 'ProductImage' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:876:2: (otherlv_0= 'ProductImage' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:877:3: otherlv_0= 'ProductImage' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFileProductImageAccess().getProductImageKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFileProductImageAccess().getColonKeyword_1());
            		
            // InternalDsl.g:885:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:886:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:886:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:887:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFileProductImageAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileProductImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFileProductImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:907:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:908:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:908:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:909:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getFileProductImageAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileProductImageRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFileProductImageAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFileProductImage"


    // $ANTLR start "entryRuleSubmodelElementCollectionProductClassifications"
    // InternalDsl.g:934:1: entryRuleSubmodelElementCollectionProductClassifications returns [EObject current=null] : iv_ruleSubmodelElementCollectionProductClassifications= ruleSubmodelElementCollectionProductClassifications EOF ;
    public final EObject entryRuleSubmodelElementCollectionProductClassifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionProductClassifications = null;


        try {
            // InternalDsl.g:934:88: (iv_ruleSubmodelElementCollectionProductClassifications= ruleSubmodelElementCollectionProductClassifications EOF )
            // InternalDsl.g:935:2: iv_ruleSubmodelElementCollectionProductClassifications= ruleSubmodelElementCollectionProductClassifications EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionProductClassifications=ruleSubmodelElementCollectionProductClassifications();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionProductClassifications; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionProductClassifications"


    // $ANTLR start "ruleSubmodelElementCollectionProductClassifications"
    // InternalDsl.g:941:1: ruleSubmodelElementCollectionProductClassifications returns [EObject current=null] : (otherlv_0= 'ProductClassifications' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )* otherlv_9= '}' ) ;
    public final EObject ruleSubmodelElementCollectionProductClassifications() throws RecognitionException {
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

        EObject lv_ProductClassificationItem_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:947:2: ( (otherlv_0= 'ProductClassifications' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )* otherlv_9= '}' ) )
            // InternalDsl.g:948:2: (otherlv_0= 'ProductClassifications' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )* otherlv_9= '}' )
            {
            // InternalDsl.g:948:2: (otherlv_0= 'ProductClassifications' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )* otherlv_9= '}' )
            // InternalDsl.g:949:3: otherlv_0= 'ProductClassifications' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getColonKeyword_1());
            		
            // InternalDsl.g:957:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:958:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:958:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:959:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionProductClassificationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:979:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:980:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:980:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:981:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationsRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1006:3: ( ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:1007:4: ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:1007:4: ( (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem ) )
            	    // InternalDsl.g:1008:5: (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem )
            	    {
            	    // InternalDsl.g:1008:5: (lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem )
            	    // InternalDsl.g:1009:6: lv_ProductClassificationItem_7_0= ruleSubmodelElementCollectionProductClassificationItem
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationItemSubmodelElementCollectionProductClassificationItemParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ProductClassificationItem_7_0=ruleSubmodelElementCollectionProductClassificationItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ProductClassificationItem",
            	    							lv_ProductClassificationItem_7_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionProductClassificationItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_21); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionProductClassifications"


    // $ANTLR start "entryRuleSubmodelElementCollectionProductClassificationItem"
    // InternalDsl.g:1039:1: entryRuleSubmodelElementCollectionProductClassificationItem returns [EObject current=null] : iv_ruleSubmodelElementCollectionProductClassificationItem= ruleSubmodelElementCollectionProductClassificationItem EOF ;
    public final EObject entryRuleSubmodelElementCollectionProductClassificationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionProductClassificationItem = null;


        try {
            // InternalDsl.g:1039:91: (iv_ruleSubmodelElementCollectionProductClassificationItem= ruleSubmodelElementCollectionProductClassificationItem EOF )
            // InternalDsl.g:1040:2: iv_ruleSubmodelElementCollectionProductClassificationItem= ruleSubmodelElementCollectionProductClassificationItem EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionProductClassificationItem=ruleSubmodelElementCollectionProductClassificationItem();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionProductClassificationItem; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionProductClassificationItem"


    // $ANTLR start "ruleSubmodelElementCollectionProductClassificationItem"
    // InternalDsl.g:1046:1: ruleSubmodelElementCollectionProductClassificationItem returns [EObject current=null] : (otherlv_0= 'ProductClassificationItem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) ) otherlv_8= ';' ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )? ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleSubmodelElementCollectionProductClassificationItem() throws RecognitionException {
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

        EObject lv_ProductClassificationSystem_7_0 = null;

        EObject lv_ClassificationSystemVersion_9_0 = null;

        EObject lv_ProductClassId_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1052:2: ( (otherlv_0= 'ProductClassificationItem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) ) otherlv_8= ';' ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )? ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalDsl.g:1053:2: (otherlv_0= 'ProductClassificationItem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) ) otherlv_8= ';' ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )? ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalDsl.g:1053:2: (otherlv_0= 'ProductClassificationItem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) ) otherlv_8= ';' ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )? ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalDsl.g:1054:3: otherlv_0= 'ProductClassificationItem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) ) otherlv_8= ';' ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )? ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationItemKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1062:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1063:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1063:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1064:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1084:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1085:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1085:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1086:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1111:3: ( (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem ) )
            // InternalDsl.g:1112:4: (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem )
            {
            // InternalDsl.g:1112:4: (lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem )
            // InternalDsl.g:1113:5: lv_ProductClassificationSystem_7_0= rulePropertyProductClassificationSystem
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationSystemPropertyProductClassificationSystemParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_ProductClassificationSystem_7_0=rulePropertyProductClassificationSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule());
            					}
            					set(
            						current,
            						"ProductClassificationSystem",
            						lv_ProductClassificationSystem_7_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyProductClassificationSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:1134:3: ( ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1135:4: ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) ) otherlv_10= ';'
                    {
                    // InternalDsl.g:1135:4: ( (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion ) )
                    // InternalDsl.g:1136:5: (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion )
                    {
                    // InternalDsl.g:1136:5: (lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion )
                    // InternalDsl.g:1137:6: lv_ClassificationSystemVersion_9_0= rulePropertyClassificationSystemVersion
                    {

                    						newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getClassificationSystemVersionPropertyClassificationSystemVersionParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ClassificationSystemVersion_9_0=rulePropertyClassificationSystemVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule());
                    						}
                    						set(
                    							current,
                    							"ClassificationSystemVersion",
                    							lv_ClassificationSystemVersion_9_0,
                    							"org.xtext.smartaas.technicaldata.Dsl.PropertyClassificationSystemVersion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1159:3: ( (lv_ProductClassId_11_0= rulePropertyProductClassId ) )
            // InternalDsl.g:1160:4: (lv_ProductClassId_11_0= rulePropertyProductClassId )
            {
            // InternalDsl.g:1160:4: (lv_ProductClassId_11_0= rulePropertyProductClassId )
            // InternalDsl.g:1161:5: lv_ProductClassId_11_0= rulePropertyProductClassId
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassIdPropertyProductClassIdParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_ProductClassId_11_0=rulePropertyProductClassId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule());
            					}
            					set(
            						current,
            						"ProductClassId",
            						lv_ProductClassId_11_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyProductClassId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_11());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionProductClassificationItem"


    // $ANTLR start "entryRulePropertyProductClassificationSystem"
    // InternalDsl.g:1190:1: entryRulePropertyProductClassificationSystem returns [EObject current=null] : iv_rulePropertyProductClassificationSystem= rulePropertyProductClassificationSystem EOF ;
    public final EObject entryRulePropertyProductClassificationSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyProductClassificationSystem = null;


        try {
            // InternalDsl.g:1190:76: (iv_rulePropertyProductClassificationSystem= rulePropertyProductClassificationSystem EOF )
            // InternalDsl.g:1191:2: iv_rulePropertyProductClassificationSystem= rulePropertyProductClassificationSystem EOF
            {
             newCompositeNode(grammarAccess.getPropertyProductClassificationSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyProductClassificationSystem=rulePropertyProductClassificationSystem();

            state._fsp--;

             current =iv_rulePropertyProductClassificationSystem; 
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
    // $ANTLR end "entryRulePropertyProductClassificationSystem"


    // $ANTLR start "rulePropertyProductClassificationSystem"
    // InternalDsl.g:1197:1: rulePropertyProductClassificationSystem returns [EObject current=null] : (otherlv_0= 'ProductClassificationSystem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyProductClassificationSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1203:2: ( (otherlv_0= 'ProductClassificationSystem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1204:2: (otherlv_0= 'ProductClassificationSystem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1204:2: (otherlv_0= 'ProductClassificationSystem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1205:3: otherlv_0= 'ProductClassificationSystem' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyProductClassificationSystemAccess().getProductClassificationSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyProductClassificationSystemAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1213:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1214:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1214:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1215:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyProductClassificationSystemAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyProductClassificationSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyProductClassificationSystemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1235:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1236:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1236:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1237:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyProductClassificationSystemAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyProductClassificationSystemRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyProductClassificationSystemAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyProductClassificationSystem"


    // $ANTLR start "entryRulePropertyClassificationSystemVersion"
    // InternalDsl.g:1262:1: entryRulePropertyClassificationSystemVersion returns [EObject current=null] : iv_rulePropertyClassificationSystemVersion= rulePropertyClassificationSystemVersion EOF ;
    public final EObject entryRulePropertyClassificationSystemVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassificationSystemVersion = null;


        try {
            // InternalDsl.g:1262:76: (iv_rulePropertyClassificationSystemVersion= rulePropertyClassificationSystemVersion EOF )
            // InternalDsl.g:1263:2: iv_rulePropertyClassificationSystemVersion= rulePropertyClassificationSystemVersion EOF
            {
             newCompositeNode(grammarAccess.getPropertyClassificationSystemVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyClassificationSystemVersion=rulePropertyClassificationSystemVersion();

            state._fsp--;

             current =iv_rulePropertyClassificationSystemVersion; 
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
    // $ANTLR end "entryRulePropertyClassificationSystemVersion"


    // $ANTLR start "rulePropertyClassificationSystemVersion"
    // InternalDsl.g:1269:1: rulePropertyClassificationSystemVersion returns [EObject current=null] : (otherlv_0= 'ClassificationSystemVersion' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyClassificationSystemVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1275:2: ( (otherlv_0= 'ClassificationSystemVersion' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1276:2: (otherlv_0= 'ClassificationSystemVersion' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1276:2: (otherlv_0= 'ClassificationSystemVersion' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1277:3: otherlv_0= 'ClassificationSystemVersion' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassificationSystemVersionAccess().getClassificationSystemVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyClassificationSystemVersionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1285:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1286:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1286:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1287:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyClassificationSystemVersionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyClassificationSystemVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyClassificationSystemVersionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1307:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1308:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1308:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1309:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyClassificationSystemVersionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyClassificationSystemVersionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyClassificationSystemVersionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyClassificationSystemVersion"


    // $ANTLR start "entryRulePropertyProductClassId"
    // InternalDsl.g:1334:1: entryRulePropertyProductClassId returns [EObject current=null] : iv_rulePropertyProductClassId= rulePropertyProductClassId EOF ;
    public final EObject entryRulePropertyProductClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyProductClassId = null;


        try {
            // InternalDsl.g:1334:63: (iv_rulePropertyProductClassId= rulePropertyProductClassId EOF )
            // InternalDsl.g:1335:2: iv_rulePropertyProductClassId= rulePropertyProductClassId EOF
            {
             newCompositeNode(grammarAccess.getPropertyProductClassIdRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyProductClassId=rulePropertyProductClassId();

            state._fsp--;

             current =iv_rulePropertyProductClassId; 
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
    // $ANTLR end "entryRulePropertyProductClassId"


    // $ANTLR start "rulePropertyProductClassId"
    // InternalDsl.g:1341:1: rulePropertyProductClassId returns [EObject current=null] : (otherlv_0= 'ProductClassId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyProductClassId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1347:2: ( (otherlv_0= 'ProductClassId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1348:2: (otherlv_0= 'ProductClassId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1348:2: (otherlv_0= 'ProductClassId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1349:3: otherlv_0= 'ProductClassId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyProductClassIdAccess().getProductClassIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyProductClassIdAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1357:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1358:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1358:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1359:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyProductClassIdAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyProductClassIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyProductClassIdAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1379:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1380:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1380:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1381:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyProductClassIdAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyProductClassIdRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyProductClassIdAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyProductClassId"


    // $ANTLR start "entryRuleSubmodelElementCollectionTechnicalProperties"
    // InternalDsl.g:1406:1: entryRuleSubmodelElementCollectionTechnicalProperties returns [EObject current=null] : iv_ruleSubmodelElementCollectionTechnicalProperties= ruleSubmodelElementCollectionTechnicalProperties EOF ;
    public final EObject entryRuleSubmodelElementCollectionTechnicalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionTechnicalProperties = null;


        try {
            // InternalDsl.g:1406:85: (iv_ruleSubmodelElementCollectionTechnicalProperties= ruleSubmodelElementCollectionTechnicalProperties EOF )
            // InternalDsl.g:1407:2: iv_ruleSubmodelElementCollectionTechnicalProperties= ruleSubmodelElementCollectionTechnicalProperties EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionTechnicalProperties=ruleSubmodelElementCollectionTechnicalProperties();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionTechnicalProperties; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionTechnicalProperties"


    // $ANTLR start "ruleSubmodelElementCollectionTechnicalProperties"
    // InternalDsl.g:1413:1: ruleSubmodelElementCollectionTechnicalProperties returns [EObject current=null] : (otherlv_0= 'TechnicalProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )* ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )* otherlv_13= '}' ) ;
    public final EObject ruleSubmodelElementCollectionTechnicalProperties() throws RecognitionException {
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

        EObject lv_Arbitrary_7_0 = null;

        EObject lv_Section_9_0 = null;

        EObject lv_SubSection_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1419:2: ( (otherlv_0= 'TechnicalProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )* ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )* otherlv_13= '}' ) )
            // InternalDsl.g:1420:2: (otherlv_0= 'TechnicalProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )* ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )* otherlv_13= '}' )
            {
            // InternalDsl.g:1420:2: (otherlv_0= 'TechnicalProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )* ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )* otherlv_13= '}' )
            // InternalDsl.g:1421:3: otherlv_0= 'TechnicalProperties' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )* ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getTechnicalPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1429:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1430:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1430:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1431:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1451:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1452:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1452:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1453:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1478:3: ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:1479:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:1479:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) )
            	    // InternalDsl.g:1480:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    {
            	    // InternalDsl.g:1480:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    // InternalDsl.g:1481:6: lv_Arbitrary_7_0= ruleSubmodelElementArbitrary
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Arbitrary_7_0=ruleSubmodelElementArbitrary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Arbitrary",
            	    							lv_Arbitrary_7_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementArbitrary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_24); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:1503:3: ( ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1504:4: ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:1504:4: ( (lv_Section_9_0= ruleSubmodelElementCollectionSection ) )
            	    // InternalDsl.g:1505:5: (lv_Section_9_0= ruleSubmodelElementCollectionSection )
            	    {
            	    // InternalDsl.g:1505:5: (lv_Section_9_0= ruleSubmodelElementCollectionSection )
            	    // InternalDsl.g:1506:6: lv_Section_9_0= ruleSubmodelElementCollectionSection
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSectionSubmodelElementCollectionSectionParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Section_9_0=ruleSubmodelElementCollectionSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Section",
            	    							lv_Section_9_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,17,FOLLOW_25); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDsl.g:1528:3: ( ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1529:4: ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_12= ';'
            	    {
            	    // InternalDsl.g:1529:4: ( (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection ) )
            	    // InternalDsl.g:1530:5: (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection )
            	    {
            	    // InternalDsl.g:1530:5: (lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection )
            	    // InternalDsl.g:1531:6: lv_SubSection_11_0= ruleSubmodelElementCollectionSubSection
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_SubSection_11_0=ruleSubmodelElementCollectionSubSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SubSection",
            	    							lv_SubSection_11_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionSubSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_9_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionTechnicalProperties"


    // $ANTLR start "entryRuleSubmodelElementArbitrary"
    // InternalDsl.g:1561:1: entryRuleSubmodelElementArbitrary returns [EObject current=null] : iv_ruleSubmodelElementArbitrary= ruleSubmodelElementArbitrary EOF ;
    public final EObject entryRuleSubmodelElementArbitrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementArbitrary = null;


        try {
            // InternalDsl.g:1561:65: (iv_ruleSubmodelElementArbitrary= ruleSubmodelElementArbitrary EOF )
            // InternalDsl.g:1562:2: iv_ruleSubmodelElementArbitrary= ruleSubmodelElementArbitrary EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementArbitraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementArbitrary=ruleSubmodelElementArbitrary();

            state._fsp--;

             current =iv_ruleSubmodelElementArbitrary; 
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
    // $ANTLR end "entryRuleSubmodelElementArbitrary"


    // $ANTLR start "ruleSubmodelElementArbitrary"
    // InternalDsl.g:1568:1: ruleSubmodelElementArbitrary returns [EObject current=null] : (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleSubmodelElementArbitrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1574:2: ( (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:1575:2: (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:1575:2: (otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:1576:3: otherlv_0= 'Arbitrary' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementArbitraryAccess().getArbitraryKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementArbitraryAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1584:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1585:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1585:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1586:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementArbitraryAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementArbitraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementArbitraryAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1606:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1607:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1607:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1608:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementArbitraryAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementArbitraryRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementArbitraryAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSubmodelElementArbitrary"


    // $ANTLR start "entryRuleSubmodelElementCollectionSection"
    // InternalDsl.g:1633:1: entryRuleSubmodelElementCollectionSection returns [EObject current=null] : iv_ruleSubmodelElementCollectionSection= ruleSubmodelElementCollectionSection EOF ;
    public final EObject entryRuleSubmodelElementCollectionSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionSection = null;


        try {
            // InternalDsl.g:1633:73: (iv_ruleSubmodelElementCollectionSection= ruleSubmodelElementCollectionSection EOF )
            // InternalDsl.g:1634:2: iv_ruleSubmodelElementCollectionSection= ruleSubmodelElementCollectionSection EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionSection=ruleSubmodelElementCollectionSection();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionSection; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionSection"


    // $ANTLR start "ruleSubmodelElementCollectionSection"
    // InternalDsl.g:1640:1: ruleSubmodelElementCollectionSection returns [EObject current=null] : (otherlv_0= 'Section' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' ) ;
    public final EObject ruleSubmodelElementCollectionSection() throws RecognitionException {
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

        EObject lv_Arbitrary_7_0 = null;

        EObject lv_SubSection_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1646:2: ( (otherlv_0= 'Section' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' ) )
            // InternalDsl.g:1647:2: (otherlv_0= 'Section' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' )
            {
            // InternalDsl.g:1647:2: (otherlv_0= 'Section' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' )
            // InternalDsl.g:1648:3: otherlv_0= 'Section' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionSectionAccess().getSectionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionSectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1656:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1657:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1657:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1658:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1678:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1679:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1679:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1680:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1705:3: ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1706:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:1706:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) )
            	    // InternalDsl.g:1707:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    {
            	    // InternalDsl.g:1707:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    // InternalDsl.g:1708:6: lv_Arbitrary_7_0= ruleSubmodelElementArbitrary
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Arbitrary_7_0=ruleSubmodelElementArbitrary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Arbitrary",
            	    							lv_Arbitrary_7_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementArbitrary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDsl.g:1730:3: ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1731:4: ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:1731:4: ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) )
            	    // InternalDsl.g:1732:5: (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection )
            	    {
            	    // InternalDsl.g:1732:5: (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection )
            	    // InternalDsl.g:1733:6: lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_SubSection_9_0=ruleSubmodelElementCollectionSubSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SubSection",
            	    							lv_SubSection_9_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionSubSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubmodelElementCollectionSectionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionSection"


    // $ANTLR start "entryRuleSubmodelElementCollectionSubSection"
    // InternalDsl.g:1763:1: entryRuleSubmodelElementCollectionSubSection returns [EObject current=null] : iv_ruleSubmodelElementCollectionSubSection= ruleSubmodelElementCollectionSubSection EOF ;
    public final EObject entryRuleSubmodelElementCollectionSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionSubSection = null;


        try {
            // InternalDsl.g:1763:76: (iv_ruleSubmodelElementCollectionSubSection= ruleSubmodelElementCollectionSubSection EOF )
            // InternalDsl.g:1764:2: iv_ruleSubmodelElementCollectionSubSection= ruleSubmodelElementCollectionSubSection EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionSubSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionSubSection=ruleSubmodelElementCollectionSubSection();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionSubSection; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionSubSection"


    // $ANTLR start "ruleSubmodelElementCollectionSubSection"
    // InternalDsl.g:1770:1: ruleSubmodelElementCollectionSubSection returns [EObject current=null] : (otherlv_0= 'SubSection' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' ) ;
    public final EObject ruleSubmodelElementCollectionSubSection() throws RecognitionException {
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

        EObject lv_Arbitrary_7_0 = null;

        EObject lv_SubSection_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1776:2: ( (otherlv_0= 'SubSection' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' ) )
            // InternalDsl.g:1777:2: (otherlv_0= 'SubSection' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' )
            {
            // InternalDsl.g:1777:2: (otherlv_0= 'SubSection' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}' )
            // InternalDsl.g:1778:3: otherlv_0= 'SubSection' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )* ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1786:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1787:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1787:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1788:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionSubSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1808:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1809:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1809:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1810:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSubSectionRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1835:3: ( ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1836:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:1836:4: ( (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary ) )
            	    // InternalDsl.g:1837:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    {
            	    // InternalDsl.g:1837:5: (lv_Arbitrary_7_0= ruleSubmodelElementArbitrary )
            	    // InternalDsl.g:1838:6: lv_Arbitrary_7_0= ruleSubmodelElementArbitrary
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_Arbitrary_7_0=ruleSubmodelElementArbitrary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSubSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Arbitrary",
            	    							lv_Arbitrary_7_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementArbitrary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalDsl.g:1860:3: ( ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1861:4: ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:1861:4: ( (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection ) )
            	    // InternalDsl.g:1862:5: (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection )
            	    {
            	    // InternalDsl.g:1862:5: (lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection )
            	    // InternalDsl.g:1863:6: lv_SubSection_9_0= ruleSubmodelElementCollectionSubSection
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_SubSection_9_0=ruleSubmodelElementCollectionSubSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionSubSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SubSection",
            	    							lv_SubSection_9_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.SubmodelElementCollectionSubSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionSubSection"


    // $ANTLR start "entryRuleSubmodelElementCollectionFurtherInformation"
    // InternalDsl.g:1893:1: entryRuleSubmodelElementCollectionFurtherInformation returns [EObject current=null] : iv_ruleSubmodelElementCollectionFurtherInformation= ruleSubmodelElementCollectionFurtherInformation EOF ;
    public final EObject entryRuleSubmodelElementCollectionFurtherInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodelElementCollectionFurtherInformation = null;


        try {
            // InternalDsl.g:1893:84: (iv_ruleSubmodelElementCollectionFurtherInformation= ruleSubmodelElementCollectionFurtherInformation EOF )
            // InternalDsl.g:1894:2: iv_ruleSubmodelElementCollectionFurtherInformation= ruleSubmodelElementCollectionFurtherInformation EOF
            {
             newCompositeNode(grammarAccess.getSubmodelElementCollectionFurtherInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodelElementCollectionFurtherInformation=ruleSubmodelElementCollectionFurtherInformation();

            state._fsp--;

             current =iv_ruleSubmodelElementCollectionFurtherInformation; 
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
    // $ANTLR end "entryRuleSubmodelElementCollectionFurtherInformation"


    // $ANTLR start "ruleSubmodelElementCollectionFurtherInformation"
    // InternalDsl.g:1900:1: ruleSubmodelElementCollectionFurtherInformation returns [EObject current=null] : (otherlv_0= 'FurtherInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )* ( (lv_ValidDate_9_0= rulePropertyValidDate ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleSubmodelElementCollectionFurtherInformation() throws RecognitionException {
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

        EObject lv_TextStatement_7_0 = null;

        EObject lv_ValidDate_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1906:2: ( (otherlv_0= 'FurtherInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )* ( (lv_ValidDate_9_0= rulePropertyValidDate ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // InternalDsl.g:1907:2: (otherlv_0= 'FurtherInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )* ( (lv_ValidDate_9_0= rulePropertyValidDate ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // InternalDsl.g:1907:2: (otherlv_0= 'FurtherInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )* ( (lv_ValidDate_9_0= rulePropertyValidDate ) ) otherlv_10= ';' otherlv_11= '}' )
            // InternalDsl.g:1908:3: otherlv_0= 'FurtherInformation' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' otherlv_6= '{' ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )* ( (lv_ValidDate_9_0= rulePropertyValidDate ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getFurtherInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1916:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:1917:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:1917:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:1918:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmodelElementCollectionFurtherInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:1938:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:1939:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:1939:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:1940:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionFurtherInformationRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:1965:3: ( ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1966:4: ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:1966:4: ( (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement ) )
            	    // InternalDsl.g:1967:5: (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement )
            	    {
            	    // InternalDsl.g:1967:5: (lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement )
            	    // InternalDsl.g:1968:6: lv_TextStatement_7_0= ruleMultiLanguagePropertyTextStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getTextStatementMultiLanguagePropertyTextStatementParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_TextStatement_7_0=ruleMultiLanguagePropertyTextStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionFurtherInformationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TextStatement",
            	    							lv_TextStatement_7_0,
            	    							"org.xtext.smartaas.technicaldata.Dsl.MultiLanguagePropertyTextStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_28); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDsl.g:1990:3: ( (lv_ValidDate_9_0= rulePropertyValidDate ) )
            // InternalDsl.g:1991:4: (lv_ValidDate_9_0= rulePropertyValidDate )
            {
            // InternalDsl.g:1991:4: (lv_ValidDate_9_0= rulePropertyValidDate )
            // InternalDsl.g:1992:5: lv_ValidDate_9_0= rulePropertyValidDate
            {

            					newCompositeNode(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getValidDatePropertyValidDateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_ValidDate_9_0=rulePropertyValidDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubmodelElementCollectionFurtherInformationRule());
            					}
            					set(
            						current,
            						"ValidDate",
            						lv_ValidDate_9_0,
            						"org.xtext.smartaas.technicaldata.Dsl.PropertyValidDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_9());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSubmodelElementCollectionFurtherInformation"


    // $ANTLR start "entryRuleMultiLanguagePropertyTextStatement"
    // InternalDsl.g:2021:1: entryRuleMultiLanguagePropertyTextStatement returns [EObject current=null] : iv_ruleMultiLanguagePropertyTextStatement= ruleMultiLanguagePropertyTextStatement EOF ;
    public final EObject entryRuleMultiLanguagePropertyTextStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLanguagePropertyTextStatement = null;


        try {
            // InternalDsl.g:2021:75: (iv_ruleMultiLanguagePropertyTextStatement= ruleMultiLanguagePropertyTextStatement EOF )
            // InternalDsl.g:2022:2: iv_ruleMultiLanguagePropertyTextStatement= ruleMultiLanguagePropertyTextStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiLanguagePropertyTextStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLanguagePropertyTextStatement=ruleMultiLanguagePropertyTextStatement();

            state._fsp--;

             current =iv_ruleMultiLanguagePropertyTextStatement; 
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
    // $ANTLR end "entryRuleMultiLanguagePropertyTextStatement"


    // $ANTLR start "ruleMultiLanguagePropertyTextStatement"
    // InternalDsl.g:2028:1: ruleMultiLanguagePropertyTextStatement returns [EObject current=null] : (otherlv_0= 'TextStatement' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleMultiLanguagePropertyTextStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2034:2: ( (otherlv_0= 'TextStatement' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2035:2: (otherlv_0= 'TextStatement' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2035:2: (otherlv_0= 'TextStatement' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2036:3: otherlv_0= 'TextStatement' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiLanguagePropertyTextStatementAccess().getTextStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLanguagePropertyTextStatementAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2044:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2045:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2045:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2046:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiLanguagePropertyTextStatementAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLanguagePropertyTextStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLanguagePropertyTextStatementAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2066:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2067:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2067:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2068:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLanguagePropertyTextStatementRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiLanguagePropertyTextStatementAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMultiLanguagePropertyTextStatement"


    // $ANTLR start "entryRulePropertyValidDate"
    // InternalDsl.g:2093:1: entryRulePropertyValidDate returns [EObject current=null] : iv_rulePropertyValidDate= rulePropertyValidDate EOF ;
    public final EObject entryRulePropertyValidDate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValidDate = null;


        try {
            // InternalDsl.g:2093:58: (iv_rulePropertyValidDate= rulePropertyValidDate EOF )
            // InternalDsl.g:2094:2: iv_rulePropertyValidDate= rulePropertyValidDate EOF
            {
             newCompositeNode(grammarAccess.getPropertyValidDateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValidDate=rulePropertyValidDate();

            state._fsp--;

             current =iv_rulePropertyValidDate; 
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
    // $ANTLR end "entryRulePropertyValidDate"


    // $ANTLR start "rulePropertyValidDate"
    // InternalDsl.g:2100:1: rulePropertyValidDate returns [EObject current=null] : (otherlv_0= 'ValidDate' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject rulePropertyValidDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2106:2: ( (otherlv_0= 'ValidDate' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:2107:2: (otherlv_0= 'ValidDate' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:2107:2: (otherlv_0= 'ValidDate' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:2108:3: otherlv_0= 'ValidDate' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyValidDateAccess().getValidDateKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyValidDateAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2116:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2117:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2117:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2118:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyValidDateAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyValidDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyValidDateAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2138:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:2139:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:2139:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:2140:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getPropertyValidDateAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyValidDateRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.technicaldata.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyValidDateAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyValidDate"


    // $ANTLR start "entryRuleSID"
    // InternalDsl.g:2165:1: entryRuleSID returns [EObject current=null] : iv_ruleSID= ruleSID EOF ;
    public final EObject entryRuleSID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSID = null;


        try {
            // InternalDsl.g:2165:44: (iv_ruleSID= ruleSID EOF )
            // InternalDsl.g:2166:2: iv_ruleSID= ruleSID EOF
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
    // InternalDsl.g:2172:1: ruleSID returns [EObject current=null] : (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_II_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2178:2: ( (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:2179:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:2179:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            // InternalDsl.g:2180:3: otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSIDAccess().getSemanticIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSIDAccess().getColonKeyword_1());
            		
            // InternalDsl.g:2188:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:2189:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:2189:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:2190:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSIDAccess().getVerticalLineKeyword_3());
            		
            // InternalDsl.g:2210:3: ( (lv_II_4_0= RULE_STRING ) )
            // InternalDsl.g:2211:4: (lv_II_4_0= RULE_STRING )
            {
            // InternalDsl.g:2211:4: (lv_II_4_0= RULE_STRING )
            // InternalDsl.g:2212:5: lv_II_4_0= RULE_STRING
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E00040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000A00040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});

}
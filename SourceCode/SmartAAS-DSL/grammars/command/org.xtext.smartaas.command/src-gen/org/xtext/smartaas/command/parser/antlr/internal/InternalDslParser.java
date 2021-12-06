package org.xtext.smartaas.command.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smartaas.command.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AAS'", "'::'", "'CommandINPUTSocket'", "'[['", "']]'", "'{'", "';'", "'}'", "'CommandText'", "':'", "'SemanticId'", "'|'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commandsinputsocket_0_0= ruleCommandSubmodel ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commandsinputsocket_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_commandsinputsocket_0_0= ruleCommandSubmodel ) )+ )
            // InternalDsl.g:78:2: ( (lv_commandsinputsocket_0_0= ruleCommandSubmodel ) )+
            {
            // InternalDsl.g:78:2: ( (lv_commandsinputsocket_0_0= ruleCommandSubmodel ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_commandsinputsocket_0_0= ruleCommandSubmodel )
            	    {
            	    // InternalDsl.g:79:3: (lv_commandsinputsocket_0_0= ruleCommandSubmodel )
            	    // InternalDsl.g:80:4: lv_commandsinputsocket_0_0= ruleCommandSubmodel
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsinputsocketCommandSubmodelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commandsinputsocket_0_0=ruleCommandSubmodel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commandsinputsocket",
            	    					lv_commandsinputsocket_0_0,
            	    					"org.xtext.smartaas.command.Dsl.CommandSubmodel");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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


    // $ANTLR start "entryRuleCommandSubmodel"
    // InternalDsl.g:100:1: entryRuleCommandSubmodel returns [EObject current=null] : iv_ruleCommandSubmodel= ruleCommandSubmodel EOF ;
    public final EObject entryRuleCommandSubmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandSubmodel = null;


        try {
            // InternalDsl.g:100:56: (iv_ruleCommandSubmodel= ruleCommandSubmodel EOF )
            // InternalDsl.g:101:2: iv_ruleCommandSubmodel= ruleCommandSubmodel EOF
            {
             newCompositeNode(grammarAccess.getCommandSubmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandSubmodel=ruleCommandSubmodel();

            state._fsp--;

             current =iv_ruleCommandSubmodel; 
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
    // $ANTLR end "entryRuleCommandSubmodel"


    // $ANTLR start "ruleCommandSubmodel"
    // InternalDsl.g:107:1: ruleCommandSubmodel returns [EObject current=null] : (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'CommandINPUTSocket' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )? otherlv_10= '}' ) ;
    public final EObject ruleCommandSubmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_SemanticId_5_0 = null;

        EObject lv_commandtext_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'CommandINPUTSocket' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )? otherlv_10= '}' ) )
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'CommandINPUTSocket' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )? otherlv_10= '}' )
            {
            // InternalDsl.g:114:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'CommandINPUTSocket' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )? otherlv_10= '}' )
            // InternalDsl.g:115:3: otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'CommandINPUTSocket' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[' ( (lv_SemanticId_5_0= ruleSID ) ) otherlv_6= ']]' otherlv_7= '{' ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandSubmodelAccess().getAASKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandSubmodelAccess().getColonColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandSubmodelAccess().getCommandINPUTSocketKeyword_2());
            		
            // InternalDsl.g:127:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:129:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCommandSubmodelAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandSubmodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandSubmodelAccess().getLeftSquareBracketLeftSquareBracketKeyword_4());
            		
            // InternalDsl.g:149:3: ( (lv_SemanticId_5_0= ruleSID ) )
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            {
            // InternalDsl.g:150:4: (lv_SemanticId_5_0= ruleSID )
            // InternalDsl.g:151:5: lv_SemanticId_5_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getCommandSubmodelAccess().getSemanticIdSIDParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_SemanticId_5_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandSubmodelRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_5_0,
            						"org.xtext.smartaas.command.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandSubmodelAccess().getRightSquareBracketRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCommandSubmodelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDsl.g:176:3: ( ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:177:4: ( (lv_commandtext_8_0= ruleCommandText ) ) otherlv_9= ';'
                    {
                    // InternalDsl.g:177:4: ( (lv_commandtext_8_0= ruleCommandText ) )
                    // InternalDsl.g:178:5: (lv_commandtext_8_0= ruleCommandText )
                    {
                    // InternalDsl.g:178:5: (lv_commandtext_8_0= ruleCommandText )
                    // InternalDsl.g:179:6: lv_commandtext_8_0= ruleCommandText
                    {

                    						newCompositeNode(grammarAccess.getCommandSubmodelAccess().getCommandtextCommandTextParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_commandtext_8_0=ruleCommandText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandSubmodelRule());
                    						}
                    						set(
                    							current,
                    							"commandtext",
                    							lv_commandtext_8_0,
                    							"org.xtext.smartaas.command.Dsl.CommandText");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommandSubmodelAccess().getSemicolonKeyword_8_1());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCommandSubmodelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCommandSubmodel"


    // $ANTLR start "entryRuleCommandText"
    // InternalDsl.g:209:1: entryRuleCommandText returns [EObject current=null] : iv_ruleCommandText= ruleCommandText EOF ;
    public final EObject entryRuleCommandText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandText = null;


        try {
            // InternalDsl.g:209:52: (iv_ruleCommandText= ruleCommandText EOF )
            // InternalDsl.g:210:2: iv_ruleCommandText= ruleCommandText EOF
            {
             newCompositeNode(grammarAccess.getCommandTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandText=ruleCommandText();

            state._fsp--;

             current =iv_ruleCommandText; 
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
    // $ANTLR end "entryRuleCommandText"


    // $ANTLR start "ruleCommandText"
    // InternalDsl.g:216:1: ruleCommandText returns [EObject current=null] : (otherlv_0= 'CommandText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) ;
    public final EObject ruleCommandText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_SemanticId_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:222:2: ( (otherlv_0= 'CommandText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' ) )
            // InternalDsl.g:223:2: (otherlv_0= 'CommandText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            {
            // InternalDsl.g:223:2: (otherlv_0= 'CommandText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]' )
            // InternalDsl.g:224:3: otherlv_0= 'CommandText' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[[' ( (lv_SemanticId_4_0= ruleSID ) ) otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandTextAccess().getCommandTextKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandTextAccess().getColonKeyword_1());
            		
            // InternalDsl.g:232:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:233:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:233:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:234:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommandTextAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandTextAccess().getLeftSquareBracketLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:254:3: ( (lv_SemanticId_4_0= ruleSID ) )
            // InternalDsl.g:255:4: (lv_SemanticId_4_0= ruleSID )
            {
            // InternalDsl.g:255:4: (lv_SemanticId_4_0= ruleSID )
            // InternalDsl.g:256:5: lv_SemanticId_4_0= ruleSID
            {

            					newCompositeNode(grammarAccess.getCommandTextAccess().getSemanticIdSIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_SemanticId_4_0=ruleSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandTextRule());
            					}
            					set(
            						current,
            						"SemanticId",
            						lv_SemanticId_4_0,
            						"org.xtext.smartaas.command.Dsl.SID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCommandTextAccess().getRightSquareBracketRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCommandText"


    // $ANTLR start "entryRuleSID"
    // InternalDsl.g:281:1: entryRuleSID returns [EObject current=null] : iv_ruleSID= ruleSID EOF ;
    public final EObject entryRuleSID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSID = null;


        try {
            // InternalDsl.g:281:44: (iv_ruleSID= ruleSID EOF )
            // InternalDsl.g:282:2: iv_ruleSID= ruleSID EOF
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
    // InternalDsl.g:288:1: ruleSID returns [EObject current=null] : (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_II_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:294:2: ( (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:295:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:295:2: (otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) ) )
            // InternalDsl.g:296:3: otherlv_0= 'SemanticId' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_II_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSIDAccess().getSemanticIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSIDAccess().getColonKeyword_1());
            		
            // InternalDsl.g:304:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:305:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:305:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:306:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSIDAccess().getVerticalLineKeyword_3());
            		
            // InternalDsl.g:326:3: ( (lv_II_4_0= RULE_STRING ) )
            // InternalDsl.g:327:4: (lv_II_4_0= RULE_STRING )
            {
            // InternalDsl.g:327:4: (lv_II_4_0= RULE_STRING )
            // InternalDsl.g:328:5: lv_II_4_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}
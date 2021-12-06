package org.xtext.smartaas.sms.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smartaas.sms.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AAS'", "'::'", "'SMS'", "'[[AASEntriesLOG_START[['", "';'", "']]AASEntriesLOG_FINISH]]'", "'[[AASEntriesLOG_Command_START[['", "']]AASEntriesLOG_Command_FINISH]]'", "'\\u2020'", "'\\u00BA'", "'\\u00A4'", "'\\u00A7'", "'\\u0370'", "'|!|'", "'|.|'", "'|*|'", "'|_|'", "'|+ENTRY|'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_SMSIN_0_0= ruleSMSINType ) ) ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_SMSIN_0_0 = null;

        EObject lv_SMSINCommand_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( ( (lv_SMSIN_0_0= ruleSMSINType ) ) ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )? ) )
            // InternalDsl.g:78:2: ( ( (lv_SMSIN_0_0= ruleSMSINType ) ) ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )? )
            {
            // InternalDsl.g:78:2: ( ( (lv_SMSIN_0_0= ruleSMSINType ) ) ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )? )
            // InternalDsl.g:79:3: ( (lv_SMSIN_0_0= ruleSMSINType ) ) ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )?
            {
            // InternalDsl.g:79:3: ( (lv_SMSIN_0_0= ruleSMSINType ) )
            // InternalDsl.g:80:4: (lv_SMSIN_0_0= ruleSMSINType )
            {
            // InternalDsl.g:80:4: (lv_SMSIN_0_0= ruleSMSINType )
            // InternalDsl.g:81:5: lv_SMSIN_0_0= ruleSMSINType
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSMSINSMSINTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_SMSIN_0_0=ruleSMSINType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"SMSIN",
            						lv_SMSIN_0_0,
            						"org.xtext.smartaas.sms.Dsl.SMSINType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:98:3: ( (lv_SMSINCommand_1_0= ruleSMSINTypeCommand ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:99:4: (lv_SMSINCommand_1_0= ruleSMSINTypeCommand )
                    {
                    // InternalDsl.g:99:4: (lv_SMSINCommand_1_0= ruleSMSINTypeCommand )
                    // InternalDsl.g:100:5: lv_SMSINCommand_1_0= ruleSMSINTypeCommand
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getSMSINCommandSMSINTypeCommandParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_SMSINCommand_1_0=ruleSMSINTypeCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"SMSINCommand",
                    						lv_SMSINCommand_1_0,
                    						"org.xtext.smartaas.sms.Dsl.SMSINTypeCommand");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleSMSINType"
    // InternalDsl.g:121:1: entryRuleSMSINType returns [EObject current=null] : iv_ruleSMSINType= ruleSMSINType EOF ;
    public final EObject entryRuleSMSINType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMSINType = null;


        try {
            // InternalDsl.g:121:50: (iv_ruleSMSINType= ruleSMSINType EOF )
            // InternalDsl.g:122:2: iv_ruleSMSINType= ruleSMSINType EOF
            {
             newCompositeNode(grammarAccess.getSMSINTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMSINType=ruleSMSINType();

            state._fsp--;

             current =iv_ruleSMSINType; 
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
    // $ANTLR end "entryRuleSMSINType"


    // $ANTLR start "ruleSMSINType"
    // InternalDsl.g:128:1: ruleSMSINType returns [EObject current=null] : (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_FINISH]]' ) ;
    public final EObject ruleSMSINType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_any_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:134:2: ( (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_FINISH]]' ) )
            // InternalDsl.g:135:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_FINISH]]' )
            {
            // InternalDsl.g:135:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_FINISH]]' )
            // InternalDsl.g:136:3: otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_FINISH]]'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSMSINTypeAccess().getAASKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSMSINTypeAccess().getColonColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSMSINTypeAccess().getSMSKeyword_2());
            		
            // InternalDsl.g:148:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:149:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:149:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:150:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSMSINTypeAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMSINTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSMSINTypeAccess().getAASEntriesLOG_STARTKeyword_4());
            		
            // InternalDsl.g:170:3: ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=19 && LA3_0<=28)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:171:4: ( (lv_any_5_0= ruleany ) )* otherlv_6= ';'
            	    {
            	    // InternalDsl.g:171:4: ( (lv_any_5_0= ruleany ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=19 && LA2_0<=28)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalDsl.g:172:5: (lv_any_5_0= ruleany )
            	    	    {
            	    	    // InternalDsl.g:172:5: (lv_any_5_0= ruleany )
            	    	    // InternalDsl.g:173:6: lv_any_5_0= ruleany
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSMSINTypeAccess().getAnyAnyParserRuleCall_5_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_any_5_0=ruleany();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSMSINTypeRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"any",
            	    	    							lv_any_5_0,
            	    	    							"org.xtext.smartaas.sms.Dsl.any");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSMSINTypeAccess().getSemicolonKeyword_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSMSINTypeAccess().getAASEntriesLOG_FINISHKeyword_6());
            		

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
    // $ANTLR end "ruleSMSINType"


    // $ANTLR start "entryRuleSMSINTypeCommand"
    // InternalDsl.g:203:1: entryRuleSMSINTypeCommand returns [EObject current=null] : iv_ruleSMSINTypeCommand= ruleSMSINTypeCommand EOF ;
    public final EObject entryRuleSMSINTypeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMSINTypeCommand = null;


        try {
            // InternalDsl.g:203:57: (iv_ruleSMSINTypeCommand= ruleSMSINTypeCommand EOF )
            // InternalDsl.g:204:2: iv_ruleSMSINTypeCommand= ruleSMSINTypeCommand EOF
            {
             newCompositeNode(grammarAccess.getSMSINTypeCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMSINTypeCommand=ruleSMSINTypeCommand();

            state._fsp--;

             current =iv_ruleSMSINTypeCommand; 
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
    // $ANTLR end "entryRuleSMSINTypeCommand"


    // $ANTLR start "ruleSMSINTypeCommand"
    // InternalDsl.g:210:1: ruleSMSINTypeCommand returns [EObject current=null] : (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_Command_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_Command_FINISH]]' ) ;
    public final EObject ruleSMSINTypeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_any_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:216:2: ( (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_Command_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_Command_FINISH]]' ) )
            // InternalDsl.g:217:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_Command_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_Command_FINISH]]' )
            {
            // InternalDsl.g:217:2: (otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_Command_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_Command_FINISH]]' )
            // InternalDsl.g:218:3: otherlv_0= 'AAS' otherlv_1= '::' otherlv_2= 'SMS' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '[[AASEntriesLOG_Command_START[[' ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )* otherlv_7= ']]AASEntriesLOG_Command_FINISH]]'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSMSINTypeCommandAccess().getAASKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSMSINTypeCommandAccess().getColonColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSMSINTypeCommandAccess().getSMSKeyword_2());
            		
            // InternalDsl.g:230:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:231:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:231:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:232:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSMSINTypeCommandAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMSINTypeCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSMSINTypeCommandAccess().getAASEntriesLOG_Command_STARTKeyword_4());
            		
            // InternalDsl.g:252:3: ( ( (lv_any_5_0= ruleany ) )* otherlv_6= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||(LA5_0>=19 && LA5_0<=28)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:253:4: ( (lv_any_5_0= ruleany ) )* otherlv_6= ';'
            	    {
            	    // InternalDsl.g:253:4: ( (lv_any_5_0= ruleany ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>=19 && LA4_0<=28)) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalDsl.g:254:5: (lv_any_5_0= ruleany )
            	    	    {
            	    	    // InternalDsl.g:254:5: (lv_any_5_0= ruleany )
            	    	    // InternalDsl.g:255:6: lv_any_5_0= ruleany
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSMSINTypeCommandAccess().getAnyAnyParserRuleCall_5_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_any_5_0=ruleany();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSMSINTypeCommandRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"any",
            	    	    							lv_any_5_0,
            	    	    							"org.xtext.smartaas.sms.Dsl.any");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSMSINTypeCommandAccess().getSemicolonKeyword_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSMSINTypeCommandAccess().getAASEntriesLOG_Command_FINISHKeyword_6());
            		

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
    // $ANTLR end "ruleSMSINTypeCommand"


    // $ANTLR start "entryRuleany"
    // InternalDsl.g:285:1: entryRuleany returns [EObject current=null] : iv_ruleany= ruleany EOF ;
    public final EObject entryRuleany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany = null;


        try {
            // InternalDsl.g:285:44: (iv_ruleany= ruleany EOF )
            // InternalDsl.g:286:2: iv_ruleany= ruleany EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany=ruleany();

            state._fsp--;

             current =iv_ruleany; 
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
    // $ANTLR end "entryRuleany"


    // $ANTLR start "ruleany"
    // InternalDsl.g:292:1: ruleany returns [EObject current=null] : ( ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) ) ) ;
    public final EObject ruleany() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_1 = null;

        EObject lv_name_0_2 = null;

        EObject lv_name_0_3 = null;

        EObject lv_name_0_4 = null;

        EObject lv_name_0_5 = null;

        EObject lv_name_0_6 = null;

        EObject lv_name_0_7 = null;

        EObject lv_name_0_8 = null;

        EObject lv_name_0_9 = null;

        EObject lv_name_0_10 = null;



        	enterRule();

        try {
            // InternalDsl.g:298:2: ( ( ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) ) ) )
            // InternalDsl.g:299:2: ( ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) ) )
            {
            // InternalDsl.g:299:2: ( ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) ) )
            // InternalDsl.g:300:3: ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) )
            {
            // InternalDsl.g:300:3: ( (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 ) )
            // InternalDsl.g:301:4: (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 )
            {
            // InternalDsl.g:301:4: (lv_name_0_1= rulea1 | lv_name_0_2= rulea2 | lv_name_0_3= rulea3 | lv_name_0_4= rulea4 | lv_name_0_5= rulea5 | lv_name_0_6= ruleb1 | lv_name_0_7= ruleb2 | lv_name_0_8= ruleb3 | lv_name_0_9= ruleb4 | lv_name_0_10= ruleb5 )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 26:
                {
                alt6=8;
                }
                break;
            case 27:
                {
                alt6=9;
                }
                break;
            case 28:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:302:5: lv_name_0_1= rulea1
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameA1ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_1=rulea1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.xtext.smartaas.sms.Dsl.a1");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalDsl.g:318:5: lv_name_0_2= rulea2
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameA2ParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_2=rulea2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"org.xtext.smartaas.sms.Dsl.a2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalDsl.g:334:5: lv_name_0_3= rulea3
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameA3ParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_3=rulea3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_3,
                    						"org.xtext.smartaas.sms.Dsl.a3");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalDsl.g:350:5: lv_name_0_4= rulea4
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameA4ParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_4=rulea4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_4,
                    						"org.xtext.smartaas.sms.Dsl.a4");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalDsl.g:366:5: lv_name_0_5= rulea5
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameA5ParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_5=rulea5();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_5,
                    						"org.xtext.smartaas.sms.Dsl.a5");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalDsl.g:382:5: lv_name_0_6= ruleb1
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameB1ParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_6=ruleb1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_6,
                    						"org.xtext.smartaas.sms.Dsl.b1");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 7 :
                    // InternalDsl.g:398:5: lv_name_0_7= ruleb2
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameB2ParserRuleCall_0_6());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_7=ruleb2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_7,
                    						"org.xtext.smartaas.sms.Dsl.b2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 8 :
                    // InternalDsl.g:414:5: lv_name_0_8= ruleb3
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameB3ParserRuleCall_0_7());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_8=ruleb3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_8,
                    						"org.xtext.smartaas.sms.Dsl.b3");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 9 :
                    // InternalDsl.g:430:5: lv_name_0_9= ruleb4
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameB4ParserRuleCall_0_8());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_9=ruleb4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_9,
                    						"org.xtext.smartaas.sms.Dsl.b4");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 10 :
                    // InternalDsl.g:446:5: lv_name_0_10= ruleb5
                    {

                    					newCompositeNode(grammarAccess.getAnyAccess().getNameB5ParserRuleCall_0_9());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_10=ruleb5();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_10,
                    						"org.xtext.smartaas.sms.Dsl.b5");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleany"


    // $ANTLR start "entryRulea1"
    // InternalDsl.g:467:1: entryRulea1 returns [EObject current=null] : iv_rulea1= rulea1 EOF ;
    public final EObject entryRulea1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea1 = null;


        try {
            // InternalDsl.g:467:43: (iv_rulea1= rulea1 EOF )
            // InternalDsl.g:468:2: iv_rulea1= rulea1 EOF
            {
             newCompositeNode(grammarAccess.getA1Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulea1=rulea1();

            state._fsp--;

             current =iv_rulea1; 
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
    // $ANTLR end "entryRulea1"


    // $ANTLR start "rulea1"
    // InternalDsl.g:474:1: rulea1 returns [EObject current=null] : (otherlv_0= '\\u2020' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulea1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:480:2: ( (otherlv_0= '\\u2020' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:481:2: (otherlv_0= '\\u2020' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:481:2: (otherlv_0= '\\u2020' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:482:3: otherlv_0= '\\u2020' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getA1Access().getDaggerKeyword_0());
            		
            // InternalDsl.g:486:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:487:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:487:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:488:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getA1Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getA1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulea1"


    // $ANTLR start "entryRulea2"
    // InternalDsl.g:508:1: entryRulea2 returns [EObject current=null] : iv_rulea2= rulea2 EOF ;
    public final EObject entryRulea2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea2 = null;


        try {
            // InternalDsl.g:508:43: (iv_rulea2= rulea2 EOF )
            // InternalDsl.g:509:2: iv_rulea2= rulea2 EOF
            {
             newCompositeNode(grammarAccess.getA2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulea2=rulea2();

            state._fsp--;

             current =iv_rulea2; 
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
    // $ANTLR end "entryRulea2"


    // $ANTLR start "rulea2"
    // InternalDsl.g:515:1: rulea2 returns [EObject current=null] : (otherlv_0= '\\u00BA' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulea2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:521:2: ( (otherlv_0= '\\u00BA' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:522:2: (otherlv_0= '\\u00BA' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:522:2: (otherlv_0= '\\u00BA' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:523:3: otherlv_0= '\\u00BA' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getA2Access().getMasculineOrdinalIndicatorKeyword_0());
            		
            // InternalDsl.g:527:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:528:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:528:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:529:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getA2Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getA2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulea2"


    // $ANTLR start "entryRulea3"
    // InternalDsl.g:549:1: entryRulea3 returns [EObject current=null] : iv_rulea3= rulea3 EOF ;
    public final EObject entryRulea3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea3 = null;


        try {
            // InternalDsl.g:549:43: (iv_rulea3= rulea3 EOF )
            // InternalDsl.g:550:2: iv_rulea3= rulea3 EOF
            {
             newCompositeNode(grammarAccess.getA3Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulea3=rulea3();

            state._fsp--;

             current =iv_rulea3; 
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
    // $ANTLR end "entryRulea3"


    // $ANTLR start "rulea3"
    // InternalDsl.g:556:1: rulea3 returns [EObject current=null] : (otherlv_0= '\\u00A4' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulea3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:562:2: ( (otherlv_0= '\\u00A4' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:563:2: (otherlv_0= '\\u00A4' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:563:2: (otherlv_0= '\\u00A4' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:564:3: otherlv_0= '\\u00A4' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getA3Access().getCurrencySignKeyword_0());
            		
            // InternalDsl.g:568:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:569:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:569:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:570:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getA3Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getA3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulea3"


    // $ANTLR start "entryRulea4"
    // InternalDsl.g:590:1: entryRulea4 returns [EObject current=null] : iv_rulea4= rulea4 EOF ;
    public final EObject entryRulea4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea4 = null;


        try {
            // InternalDsl.g:590:43: (iv_rulea4= rulea4 EOF )
            // InternalDsl.g:591:2: iv_rulea4= rulea4 EOF
            {
             newCompositeNode(grammarAccess.getA4Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulea4=rulea4();

            state._fsp--;

             current =iv_rulea4; 
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
    // $ANTLR end "entryRulea4"


    // $ANTLR start "rulea4"
    // InternalDsl.g:597:1: rulea4 returns [EObject current=null] : (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulea4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:603:2: ( (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:604:2: (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:604:2: (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:605:3: otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getA4Access().getSectionSignKeyword_0());
            		
            // InternalDsl.g:609:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:610:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:610:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:611:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getA4Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getA4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulea4"


    // $ANTLR start "entryRulea5"
    // InternalDsl.g:631:1: entryRulea5 returns [EObject current=null] : iv_rulea5= rulea5 EOF ;
    public final EObject entryRulea5() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea5 = null;


        try {
            // InternalDsl.g:631:43: (iv_rulea5= rulea5 EOF )
            // InternalDsl.g:632:2: iv_rulea5= rulea5 EOF
            {
             newCompositeNode(grammarAccess.getA5Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulea5=rulea5();

            state._fsp--;

             current =iv_rulea5; 
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
    // $ANTLR end "entryRulea5"


    // $ANTLR start "rulea5"
    // InternalDsl.g:638:1: rulea5 returns [EObject current=null] : (otherlv_0= '\\u0370' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulea5() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:644:2: ( (otherlv_0= '\\u0370' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:645:2: (otherlv_0= '\\u0370' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:645:2: (otherlv_0= '\\u0370' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:646:3: otherlv_0= '\\u0370' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getA5Access().getGreekCapitalLetterHetaKeyword_0());
            		
            // InternalDsl.g:650:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:651:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:651:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:652:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getA5Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getA5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulea5"


    // $ANTLR start "entryRuleb1"
    // InternalDsl.g:672:1: entryRuleb1 returns [EObject current=null] : iv_ruleb1= ruleb1 EOF ;
    public final EObject entryRuleb1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleb1 = null;


        try {
            // InternalDsl.g:672:43: (iv_ruleb1= ruleb1 EOF )
            // InternalDsl.g:673:2: iv_ruleb1= ruleb1 EOF
            {
             newCompositeNode(grammarAccess.getB1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb1=ruleb1();

            state._fsp--;

             current =iv_ruleb1; 
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
    // $ANTLR end "entryRuleb1"


    // $ANTLR start "ruleb1"
    // InternalDsl.g:679:1: ruleb1 returns [EObject current=null] : (otherlv_0= '|!|' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleb1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:685:2: ( (otherlv_0= '|!|' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:686:2: (otherlv_0= '|!|' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:686:2: (otherlv_0= '|!|' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:687:3: otherlv_0= '|!|' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getB1Access().getVerticalLineExclamationMarkVerticalLineKeyword_0());
            		
            // InternalDsl.g:691:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:692:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:692:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:693:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getB1Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getB1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleb1"


    // $ANTLR start "entryRuleb2"
    // InternalDsl.g:713:1: entryRuleb2 returns [EObject current=null] : iv_ruleb2= ruleb2 EOF ;
    public final EObject entryRuleb2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleb2 = null;


        try {
            // InternalDsl.g:713:43: (iv_ruleb2= ruleb2 EOF )
            // InternalDsl.g:714:2: iv_ruleb2= ruleb2 EOF
            {
             newCompositeNode(grammarAccess.getB2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb2=ruleb2();

            state._fsp--;

             current =iv_ruleb2; 
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
    // $ANTLR end "entryRuleb2"


    // $ANTLR start "ruleb2"
    // InternalDsl.g:720:1: ruleb2 returns [EObject current=null] : (otherlv_0= '|.|' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleb2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:726:2: ( (otherlv_0= '|.|' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:727:2: (otherlv_0= '|.|' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:727:2: (otherlv_0= '|.|' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:728:3: otherlv_0= '|.|' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getB2Access().getVerticalLineFullStopVerticalLineKeyword_0());
            		
            // InternalDsl.g:732:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:733:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:733:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:734:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getB2Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getB2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleb2"


    // $ANTLR start "entryRuleb3"
    // InternalDsl.g:754:1: entryRuleb3 returns [EObject current=null] : iv_ruleb3= ruleb3 EOF ;
    public final EObject entryRuleb3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleb3 = null;


        try {
            // InternalDsl.g:754:43: (iv_ruleb3= ruleb3 EOF )
            // InternalDsl.g:755:2: iv_ruleb3= ruleb3 EOF
            {
             newCompositeNode(grammarAccess.getB3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb3=ruleb3();

            state._fsp--;

             current =iv_ruleb3; 
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
    // $ANTLR end "entryRuleb3"


    // $ANTLR start "ruleb3"
    // InternalDsl.g:761:1: ruleb3 returns [EObject current=null] : (otherlv_0= '|*|' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleb3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:767:2: ( (otherlv_0= '|*|' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:768:2: (otherlv_0= '|*|' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:768:2: (otherlv_0= '|*|' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:769:3: otherlv_0= '|*|' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getB3Access().getVerticalLineAsteriskVerticalLineKeyword_0());
            		
            // InternalDsl.g:773:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:774:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:774:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:775:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getB3Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getB3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleb3"


    // $ANTLR start "entryRuleb4"
    // InternalDsl.g:795:1: entryRuleb4 returns [EObject current=null] : iv_ruleb4= ruleb4 EOF ;
    public final EObject entryRuleb4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleb4 = null;


        try {
            // InternalDsl.g:795:43: (iv_ruleb4= ruleb4 EOF )
            // InternalDsl.g:796:2: iv_ruleb4= ruleb4 EOF
            {
             newCompositeNode(grammarAccess.getB4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb4=ruleb4();

            state._fsp--;

             current =iv_ruleb4; 
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
    // $ANTLR end "entryRuleb4"


    // $ANTLR start "ruleb4"
    // InternalDsl.g:802:1: ruleb4 returns [EObject current=null] : (otherlv_0= '|_|' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleb4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:808:2: ( (otherlv_0= '|_|' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:809:2: (otherlv_0= '|_|' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:809:2: (otherlv_0= '|_|' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:810:3: otherlv_0= '|_|' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getB4Access().get_Keyword_0());
            		
            // InternalDsl.g:814:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:815:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:815:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:816:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getB4Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getB4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleb4"


    // $ANTLR start "entryRuleb5"
    // InternalDsl.g:836:1: entryRuleb5 returns [EObject current=null] : iv_ruleb5= ruleb5 EOF ;
    public final EObject entryRuleb5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleb5 = null;


        try {
            // InternalDsl.g:836:43: (iv_ruleb5= ruleb5 EOF )
            // InternalDsl.g:837:2: iv_ruleb5= ruleb5 EOF
            {
             newCompositeNode(grammarAccess.getB5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb5=ruleb5();

            state._fsp--;

             current =iv_ruleb5; 
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
    // $ANTLR end "entryRuleb5"


    // $ANTLR start "ruleb5"
    // InternalDsl.g:843:1: ruleb5 returns [EObject current=null] : (otherlv_0= '|+ENTRY|' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleb5() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:849:2: ( (otherlv_0= '|+ENTRY|' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:850:2: (otherlv_0= '|+ENTRY|' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:850:2: (otherlv_0= '|+ENTRY|' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDsl.g:851:3: otherlv_0= '|+ENTRY|' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getB5Access().getENTRYKeyword_0());
            		
            // InternalDsl.g:855:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:856:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:856:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:857:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getB5Access().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getB5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleb5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001FF98000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001FF88000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001FFC8000L});

}
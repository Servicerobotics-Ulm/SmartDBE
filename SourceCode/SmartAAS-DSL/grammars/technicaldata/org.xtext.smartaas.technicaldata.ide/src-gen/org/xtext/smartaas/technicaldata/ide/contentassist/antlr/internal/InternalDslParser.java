package org.xtext.smartaas.technicaldata.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.smartaas.technicaldata.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__TechnicaldataAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__TechnicaldataAssignment ) ) )
            // InternalDsl.g:67:2: ( ( rule__Model__TechnicaldataAssignment ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__TechnicaldataAssignment ) )
            // InternalDsl.g:68:3: ( rule__Model__TechnicaldataAssignment )
            {
             before(grammarAccess.getModelAccess().getTechnicaldataAssignment()); 
            // InternalDsl.g:69:3: ( rule__Model__TechnicaldataAssignment )
            // InternalDsl.g:69:4: rule__Model__TechnicaldataAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__TechnicaldataAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTechnicaldataAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTechnicaldataSubmodel"
    // InternalDsl.g:78:1: entryRuleTechnicaldataSubmodel : ruleTechnicaldataSubmodel EOF ;
    public final void entryRuleTechnicaldataSubmodel() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleTechnicaldataSubmodel EOF )
            // InternalDsl.g:80:1: ruleTechnicaldataSubmodel EOF
            {
             before(grammarAccess.getTechnicaldataSubmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnicaldataSubmodel();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTechnicaldataSubmodel"


    // $ANTLR start "ruleTechnicaldataSubmodel"
    // InternalDsl.g:87:1: ruleTechnicaldataSubmodel : ( ( rule__TechnicaldataSubmodel__Group__0 ) ) ;
    public final void ruleTechnicaldataSubmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__TechnicaldataSubmodel__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__TechnicaldataSubmodel__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__TechnicaldataSubmodel__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__TechnicaldataSubmodel__Group__0 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__TechnicaldataSubmodel__Group__0 )
            // InternalDsl.g:94:4: rule__TechnicaldataSubmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTechnicaldataSubmodel"


    // $ANTLR start "entryRuleSubmodelElementCollectionGeneralInformation"
    // InternalDsl.g:103:1: entryRuleSubmodelElementCollectionGeneralInformation : ruleSubmodelElementCollectionGeneralInformation EOF ;
    public final void entryRuleSubmodelElementCollectionGeneralInformation() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSubmodelElementCollectionGeneralInformation EOF )
            // InternalDsl.g:105:1: ruleSubmodelElementCollectionGeneralInformation EOF
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionGeneralInformation();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionGeneralInformation"


    // $ANTLR start "ruleSubmodelElementCollectionGeneralInformation"
    // InternalDsl.g:112:1: ruleSubmodelElementCollectionGeneralInformation : ( ( rule__SubmodelElementCollectionGeneralInformation__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionGeneralInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__SubmodelElementCollectionGeneralInformation__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__SubmodelElementCollectionGeneralInformation__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__SubmodelElementCollectionGeneralInformation__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__SubmodelElementCollectionGeneralInformation__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__SubmodelElementCollectionGeneralInformation__Group__0 )
            // InternalDsl.g:119:4: rule__SubmodelElementCollectionGeneralInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionGeneralInformation"


    // $ANTLR start "entryRulePropertyManufacturerName"
    // InternalDsl.g:128:1: entryRulePropertyManufacturerName : rulePropertyManufacturerName EOF ;
    public final void entryRulePropertyManufacturerName() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( rulePropertyManufacturerName EOF )
            // InternalDsl.g:130:1: rulePropertyManufacturerName EOF
            {
             before(grammarAccess.getPropertyManufacturerNameRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyManufacturerName();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyManufacturerName"


    // $ANTLR start "rulePropertyManufacturerName"
    // InternalDsl.g:137:1: rulePropertyManufacturerName : ( ( rule__PropertyManufacturerName__Group__0 ) ) ;
    public final void rulePropertyManufacturerName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__PropertyManufacturerName__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__PropertyManufacturerName__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__PropertyManufacturerName__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__PropertyManufacturerName__Group__0 )
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__PropertyManufacturerName__Group__0 )
            // InternalDsl.g:144:4: rule__PropertyManufacturerName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyManufacturerName"


    // $ANTLR start "entryRuleFileManufacturerLogo"
    // InternalDsl.g:153:1: entryRuleFileManufacturerLogo : ruleFileManufacturerLogo EOF ;
    public final void entryRuleFileManufacturerLogo() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleFileManufacturerLogo EOF )
            // InternalDsl.g:155:1: ruleFileManufacturerLogo EOF
            {
             before(grammarAccess.getFileManufacturerLogoRule()); 
            pushFollow(FOLLOW_1);
            ruleFileManufacturerLogo();

            state._fsp--;

             after(grammarAccess.getFileManufacturerLogoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileManufacturerLogo"


    // $ANTLR start "ruleFileManufacturerLogo"
    // InternalDsl.g:162:1: ruleFileManufacturerLogo : ( ( rule__FileManufacturerLogo__Group__0 ) ) ;
    public final void ruleFileManufacturerLogo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__FileManufacturerLogo__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__FileManufacturerLogo__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__FileManufacturerLogo__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__FileManufacturerLogo__Group__0 )
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__FileManufacturerLogo__Group__0 )
            // InternalDsl.g:169:4: rule__FileManufacturerLogo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileManufacturerLogoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileManufacturerLogo"


    // $ANTLR start "entryRuleMultiLanguagePropertyManufacturerProductDesignation"
    // InternalDsl.g:178:1: entryRuleMultiLanguagePropertyManufacturerProductDesignation : ruleMultiLanguagePropertyManufacturerProductDesignation EOF ;
    public final void entryRuleMultiLanguagePropertyManufacturerProductDesignation() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleMultiLanguagePropertyManufacturerProductDesignation EOF )
            // InternalDsl.g:180:1: ruleMultiLanguagePropertyManufacturerProductDesignation EOF
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiLanguagePropertyManufacturerProductDesignation();

            state._fsp--;

             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyManufacturerProductDesignation"


    // $ANTLR start "ruleMultiLanguagePropertyManufacturerProductDesignation"
    // InternalDsl.g:187:1: ruleMultiLanguagePropertyManufacturerProductDesignation : ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 ) ) ;
    public final void ruleMultiLanguagePropertyManufacturerProductDesignation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 )
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 )
            // InternalDsl.g:194:4: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiLanguagePropertyManufacturerProductDesignation"


    // $ANTLR start "entryRulePropertyManufacturerPartNumber"
    // InternalDsl.g:203:1: entryRulePropertyManufacturerPartNumber : rulePropertyManufacturerPartNumber EOF ;
    public final void entryRulePropertyManufacturerPartNumber() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( rulePropertyManufacturerPartNumber EOF )
            // InternalDsl.g:205:1: rulePropertyManufacturerPartNumber EOF
            {
             before(grammarAccess.getPropertyManufacturerPartNumberRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyManufacturerPartNumber();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerPartNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyManufacturerPartNumber"


    // $ANTLR start "rulePropertyManufacturerPartNumber"
    // InternalDsl.g:212:1: rulePropertyManufacturerPartNumber : ( ( rule__PropertyManufacturerPartNumber__Group__0 ) ) ;
    public final void rulePropertyManufacturerPartNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__PropertyManufacturerPartNumber__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__PropertyManufacturerPartNumber__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__PropertyManufacturerPartNumber__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__PropertyManufacturerPartNumber__Group__0 )
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__PropertyManufacturerPartNumber__Group__0 )
            // InternalDsl.g:219:4: rule__PropertyManufacturerPartNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyManufacturerPartNumber"


    // $ANTLR start "entryRulePropertyManufacturerOrderCode"
    // InternalDsl.g:228:1: entryRulePropertyManufacturerOrderCode : rulePropertyManufacturerOrderCode EOF ;
    public final void entryRulePropertyManufacturerOrderCode() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( rulePropertyManufacturerOrderCode EOF )
            // InternalDsl.g:230:1: rulePropertyManufacturerOrderCode EOF
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyManufacturerOrderCode();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerOrderCodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyManufacturerOrderCode"


    // $ANTLR start "rulePropertyManufacturerOrderCode"
    // InternalDsl.g:237:1: rulePropertyManufacturerOrderCode : ( ( rule__PropertyManufacturerOrderCode__Group__0 ) ) ;
    public final void rulePropertyManufacturerOrderCode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__PropertyManufacturerOrderCode__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__PropertyManufacturerOrderCode__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__PropertyManufacturerOrderCode__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__PropertyManufacturerOrderCode__Group__0 )
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__PropertyManufacturerOrderCode__Group__0 )
            // InternalDsl.g:244:4: rule__PropertyManufacturerOrderCode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyManufacturerOrderCode"


    // $ANTLR start "entryRuleFileProductImage"
    // InternalDsl.g:253:1: entryRuleFileProductImage : ruleFileProductImage EOF ;
    public final void entryRuleFileProductImage() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleFileProductImage EOF )
            // InternalDsl.g:255:1: ruleFileProductImage EOF
            {
             before(grammarAccess.getFileProductImageRule()); 
            pushFollow(FOLLOW_1);
            ruleFileProductImage();

            state._fsp--;

             after(grammarAccess.getFileProductImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileProductImage"


    // $ANTLR start "ruleFileProductImage"
    // InternalDsl.g:262:1: ruleFileProductImage : ( ( rule__FileProductImage__Group__0 ) ) ;
    public final void ruleFileProductImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__FileProductImage__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__FileProductImage__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__FileProductImage__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__FileProductImage__Group__0 )
            {
             before(grammarAccess.getFileProductImageAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__FileProductImage__Group__0 )
            // InternalDsl.g:269:4: rule__FileProductImage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileProductImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileProductImage"


    // $ANTLR start "entryRuleSubmodelElementCollectionProductClassifications"
    // InternalDsl.g:278:1: entryRuleSubmodelElementCollectionProductClassifications : ruleSubmodelElementCollectionProductClassifications EOF ;
    public final void entryRuleSubmodelElementCollectionProductClassifications() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleSubmodelElementCollectionProductClassifications EOF )
            // InternalDsl.g:280:1: ruleSubmodelElementCollectionProductClassifications EOF
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionProductClassifications();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionProductClassifications"


    // $ANTLR start "ruleSubmodelElementCollectionProductClassifications"
    // InternalDsl.g:287:1: ruleSubmodelElementCollectionProductClassifications : ( ( rule__SubmodelElementCollectionProductClassifications__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionProductClassifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__SubmodelElementCollectionProductClassifications__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__SubmodelElementCollectionProductClassifications__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__SubmodelElementCollectionProductClassifications__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__SubmodelElementCollectionProductClassifications__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__SubmodelElementCollectionProductClassifications__Group__0 )
            // InternalDsl.g:294:4: rule__SubmodelElementCollectionProductClassifications__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionProductClassifications"


    // $ANTLR start "entryRuleSubmodelElementCollectionProductClassificationItem"
    // InternalDsl.g:303:1: entryRuleSubmodelElementCollectionProductClassificationItem : ruleSubmodelElementCollectionProductClassificationItem EOF ;
    public final void entryRuleSubmodelElementCollectionProductClassificationItem() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleSubmodelElementCollectionProductClassificationItem EOF )
            // InternalDsl.g:305:1: ruleSubmodelElementCollectionProductClassificationItem EOF
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionProductClassificationItem();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionProductClassificationItem"


    // $ANTLR start "ruleSubmodelElementCollectionProductClassificationItem"
    // InternalDsl.g:312:1: ruleSubmodelElementCollectionProductClassificationItem : ( ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionProductClassificationItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__SubmodelElementCollectionProductClassificationItem__Group__0 )
            // InternalDsl.g:319:4: rule__SubmodelElementCollectionProductClassificationItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionProductClassificationItem"


    // $ANTLR start "entryRulePropertyProductClassificationSystem"
    // InternalDsl.g:328:1: entryRulePropertyProductClassificationSystem : rulePropertyProductClassificationSystem EOF ;
    public final void entryRulePropertyProductClassificationSystem() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( rulePropertyProductClassificationSystem EOF )
            // InternalDsl.g:330:1: rulePropertyProductClassificationSystem EOF
            {
             before(grammarAccess.getPropertyProductClassificationSystemRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyProductClassificationSystem();

            state._fsp--;

             after(grammarAccess.getPropertyProductClassificationSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyProductClassificationSystem"


    // $ANTLR start "rulePropertyProductClassificationSystem"
    // InternalDsl.g:337:1: rulePropertyProductClassificationSystem : ( ( rule__PropertyProductClassificationSystem__Group__0 ) ) ;
    public final void rulePropertyProductClassificationSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__PropertyProductClassificationSystem__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__PropertyProductClassificationSystem__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__PropertyProductClassificationSystem__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__PropertyProductClassificationSystem__Group__0 )
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__PropertyProductClassificationSystem__Group__0 )
            // InternalDsl.g:344:4: rule__PropertyProductClassificationSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassificationSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyProductClassificationSystem"


    // $ANTLR start "entryRulePropertyClassificationSystemVersion"
    // InternalDsl.g:353:1: entryRulePropertyClassificationSystemVersion : rulePropertyClassificationSystemVersion EOF ;
    public final void entryRulePropertyClassificationSystemVersion() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( rulePropertyClassificationSystemVersion EOF )
            // InternalDsl.g:355:1: rulePropertyClassificationSystemVersion EOF
            {
             before(grammarAccess.getPropertyClassificationSystemVersionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyClassificationSystemVersion();

            state._fsp--;

             after(grammarAccess.getPropertyClassificationSystemVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyClassificationSystemVersion"


    // $ANTLR start "rulePropertyClassificationSystemVersion"
    // InternalDsl.g:362:1: rulePropertyClassificationSystemVersion : ( ( rule__PropertyClassificationSystemVersion__Group__0 ) ) ;
    public final void rulePropertyClassificationSystemVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__PropertyClassificationSystemVersion__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__PropertyClassificationSystemVersion__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__PropertyClassificationSystemVersion__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__PropertyClassificationSystemVersion__Group__0 )
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__PropertyClassificationSystemVersion__Group__0 )
            // InternalDsl.g:369:4: rule__PropertyClassificationSystemVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyClassificationSystemVersion"


    // $ANTLR start "entryRulePropertyProductClassId"
    // InternalDsl.g:378:1: entryRulePropertyProductClassId : rulePropertyProductClassId EOF ;
    public final void entryRulePropertyProductClassId() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( rulePropertyProductClassId EOF )
            // InternalDsl.g:380:1: rulePropertyProductClassId EOF
            {
             before(grammarAccess.getPropertyProductClassIdRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyProductClassId();

            state._fsp--;

             after(grammarAccess.getPropertyProductClassIdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyProductClassId"


    // $ANTLR start "rulePropertyProductClassId"
    // InternalDsl.g:387:1: rulePropertyProductClassId : ( ( rule__PropertyProductClassId__Group__0 ) ) ;
    public final void rulePropertyProductClassId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__PropertyProductClassId__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__PropertyProductClassId__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__PropertyProductClassId__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__PropertyProductClassId__Group__0 )
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__PropertyProductClassId__Group__0 )
            // InternalDsl.g:394:4: rule__PropertyProductClassId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyProductClassId"


    // $ANTLR start "entryRuleSubmodelElementCollectionTechnicalProperties"
    // InternalDsl.g:403:1: entryRuleSubmodelElementCollectionTechnicalProperties : ruleSubmodelElementCollectionTechnicalProperties EOF ;
    public final void entryRuleSubmodelElementCollectionTechnicalProperties() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleSubmodelElementCollectionTechnicalProperties EOF )
            // InternalDsl.g:405:1: ruleSubmodelElementCollectionTechnicalProperties EOF
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionTechnicalProperties();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionTechnicalProperties"


    // $ANTLR start "ruleSubmodelElementCollectionTechnicalProperties"
    // InternalDsl.g:412:1: ruleSubmodelElementCollectionTechnicalProperties : ( ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionTechnicalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__SubmodelElementCollectionTechnicalProperties__Group__0 )
            // InternalDsl.g:419:4: rule__SubmodelElementCollectionTechnicalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionTechnicalProperties"


    // $ANTLR start "entryRuleSubmodelElementArbitrary"
    // InternalDsl.g:428:1: entryRuleSubmodelElementArbitrary : ruleSubmodelElementArbitrary EOF ;
    public final void entryRuleSubmodelElementArbitrary() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleSubmodelElementArbitrary EOF )
            // InternalDsl.g:430:1: ruleSubmodelElementArbitrary EOF
            {
             before(grammarAccess.getSubmodelElementArbitraryRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementArbitrary();

            state._fsp--;

             after(grammarAccess.getSubmodelElementArbitraryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementArbitrary"


    // $ANTLR start "ruleSubmodelElementArbitrary"
    // InternalDsl.g:437:1: ruleSubmodelElementArbitrary : ( ( rule__SubmodelElementArbitrary__Group__0 ) ) ;
    public final void ruleSubmodelElementArbitrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__SubmodelElementArbitrary__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__SubmodelElementArbitrary__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__SubmodelElementArbitrary__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__SubmodelElementArbitrary__Group__0 )
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__SubmodelElementArbitrary__Group__0 )
            // InternalDsl.g:444:4: rule__SubmodelElementArbitrary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementArbitraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementArbitrary"


    // $ANTLR start "entryRuleSubmodelElementCollectionSection"
    // InternalDsl.g:453:1: entryRuleSubmodelElementCollectionSection : ruleSubmodelElementCollectionSection EOF ;
    public final void entryRuleSubmodelElementCollectionSection() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleSubmodelElementCollectionSection EOF )
            // InternalDsl.g:455:1: ruleSubmodelElementCollectionSection EOF
            {
             before(grammarAccess.getSubmodelElementCollectionSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionSection"


    // $ANTLR start "ruleSubmodelElementCollectionSection"
    // InternalDsl.g:462:1: ruleSubmodelElementCollectionSection : ( ( rule__SubmodelElementCollectionSection__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__SubmodelElementCollectionSection__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__SubmodelElementCollectionSection__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__SubmodelElementCollectionSection__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__SubmodelElementCollectionSection__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__SubmodelElementCollectionSection__Group__0 )
            // InternalDsl.g:469:4: rule__SubmodelElementCollectionSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionSection"


    // $ANTLR start "entryRuleSubmodelElementCollectionSubSection"
    // InternalDsl.g:478:1: entryRuleSubmodelElementCollectionSubSection : ruleSubmodelElementCollectionSubSection EOF ;
    public final void entryRuleSubmodelElementCollectionSubSection() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleSubmodelElementCollectionSubSection EOF )
            // InternalDsl.g:480:1: ruleSubmodelElementCollectionSubSection EOF
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionSubSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSubSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionSubSection"


    // $ANTLR start "ruleSubmodelElementCollectionSubSection"
    // InternalDsl.g:487:1: ruleSubmodelElementCollectionSubSection : ( ( rule__SubmodelElementCollectionSubSection__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__SubmodelElementCollectionSubSection__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__SubmodelElementCollectionSubSection__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__SubmodelElementCollectionSubSection__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__SubmodelElementCollectionSubSection__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__SubmodelElementCollectionSubSection__Group__0 )
            // InternalDsl.g:494:4: rule__SubmodelElementCollectionSubSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionSubSection"


    // $ANTLR start "entryRuleSubmodelElementCollectionFurtherInformation"
    // InternalDsl.g:503:1: entryRuleSubmodelElementCollectionFurtherInformation : ruleSubmodelElementCollectionFurtherInformation EOF ;
    public final void entryRuleSubmodelElementCollectionFurtherInformation() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleSubmodelElementCollectionFurtherInformation EOF )
            // InternalDsl.g:505:1: ruleSubmodelElementCollectionFurtherInformation EOF
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodelElementCollectionFurtherInformation();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodelElementCollectionFurtherInformation"


    // $ANTLR start "ruleSubmodelElementCollectionFurtherInformation"
    // InternalDsl.g:512:1: ruleSubmodelElementCollectionFurtherInformation : ( ( rule__SubmodelElementCollectionFurtherInformation__Group__0 ) ) ;
    public final void ruleSubmodelElementCollectionFurtherInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__SubmodelElementCollectionFurtherInformation__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__SubmodelElementCollectionFurtherInformation__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__SubmodelElementCollectionFurtherInformation__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__SubmodelElementCollectionFurtherInformation__Group__0 )
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__SubmodelElementCollectionFurtherInformation__Group__0 )
            // InternalDsl.g:519:4: rule__SubmodelElementCollectionFurtherInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodelElementCollectionFurtherInformation"


    // $ANTLR start "entryRuleMultiLanguagePropertyTextStatement"
    // InternalDsl.g:528:1: entryRuleMultiLanguagePropertyTextStatement : ruleMultiLanguagePropertyTextStatement EOF ;
    public final void entryRuleMultiLanguagePropertyTextStatement() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleMultiLanguagePropertyTextStatement EOF )
            // InternalDsl.g:530:1: ruleMultiLanguagePropertyTextStatement EOF
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiLanguagePropertyTextStatement();

            state._fsp--;

             after(grammarAccess.getMultiLanguagePropertyTextStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiLanguagePropertyTextStatement"


    // $ANTLR start "ruleMultiLanguagePropertyTextStatement"
    // InternalDsl.g:537:1: ruleMultiLanguagePropertyTextStatement : ( ( rule__MultiLanguagePropertyTextStatement__Group__0 ) ) ;
    public final void ruleMultiLanguagePropertyTextStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__MultiLanguagePropertyTextStatement__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__MultiLanguagePropertyTextStatement__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__MultiLanguagePropertyTextStatement__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__MultiLanguagePropertyTextStatement__Group__0 )
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__MultiLanguagePropertyTextStatement__Group__0 )
            // InternalDsl.g:544:4: rule__MultiLanguagePropertyTextStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiLanguagePropertyTextStatement"


    // $ANTLR start "entryRulePropertyValidDate"
    // InternalDsl.g:553:1: entryRulePropertyValidDate : rulePropertyValidDate EOF ;
    public final void entryRulePropertyValidDate() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( rulePropertyValidDate EOF )
            // InternalDsl.g:555:1: rulePropertyValidDate EOF
            {
             before(grammarAccess.getPropertyValidDateRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValidDate();

            state._fsp--;

             after(grammarAccess.getPropertyValidDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValidDate"


    // $ANTLR start "rulePropertyValidDate"
    // InternalDsl.g:562:1: rulePropertyValidDate : ( ( rule__PropertyValidDate__Group__0 ) ) ;
    public final void rulePropertyValidDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__PropertyValidDate__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__PropertyValidDate__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__PropertyValidDate__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__PropertyValidDate__Group__0 )
            {
             before(grammarAccess.getPropertyValidDateAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__PropertyValidDate__Group__0 )
            // InternalDsl.g:569:4: rule__PropertyValidDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValidDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValidDate"


    // $ANTLR start "entryRuleSID"
    // InternalDsl.g:578:1: entryRuleSID : ruleSID EOF ;
    public final void entryRuleSID() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleSID EOF )
            // InternalDsl.g:580:1: ruleSID EOF
            {
             before(grammarAccess.getSIDRule()); 
            pushFollow(FOLLOW_1);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSID"


    // $ANTLR start "ruleSID"
    // InternalDsl.g:587:1: ruleSID : ( ( rule__SID__Group__0 ) ) ;
    public final void ruleSID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__SID__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__SID__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__SID__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__SID__Group__0 )
            {
             before(grammarAccess.getSIDAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__SID__Group__0 )
            // InternalDsl.g:594:4: rule__SID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSID"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__0"
    // InternalDsl.g:602:1: rule__TechnicaldataSubmodel__Group__0 : rule__TechnicaldataSubmodel__Group__0__Impl rule__TechnicaldataSubmodel__Group__1 ;
    public final void rule__TechnicaldataSubmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:1: ( rule__TechnicaldataSubmodel__Group__0__Impl rule__TechnicaldataSubmodel__Group__1 )
            // InternalDsl.g:607:2: rule__TechnicaldataSubmodel__Group__0__Impl rule__TechnicaldataSubmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TechnicaldataSubmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__0"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__0__Impl"
    // InternalDsl.g:614:1: rule__TechnicaldataSubmodel__Group__0__Impl : ( 'AAS' ) ;
    public final void rule__TechnicaldataSubmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:618:1: ( ( 'AAS' ) )
            // InternalDsl.g:619:1: ( 'AAS' )
            {
            // InternalDsl.g:619:1: ( 'AAS' )
            // InternalDsl.g:620:2: 'AAS'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getAASKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getAASKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__0__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__1"
    // InternalDsl.g:629:1: rule__TechnicaldataSubmodel__Group__1 : rule__TechnicaldataSubmodel__Group__1__Impl rule__TechnicaldataSubmodel__Group__2 ;
    public final void rule__TechnicaldataSubmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:633:1: ( rule__TechnicaldataSubmodel__Group__1__Impl rule__TechnicaldataSubmodel__Group__2 )
            // InternalDsl.g:634:2: rule__TechnicaldataSubmodel__Group__1__Impl rule__TechnicaldataSubmodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TechnicaldataSubmodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__1"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__1__Impl"
    // InternalDsl.g:641:1: rule__TechnicaldataSubmodel__Group__1__Impl : ( '::' ) ;
    public final void rule__TechnicaldataSubmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:645:1: ( ( '::' ) )
            // InternalDsl.g:646:1: ( '::' )
            {
            // InternalDsl.g:646:1: ( '::' )
            // InternalDsl.g:647:2: '::'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getColonColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__1__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__2"
    // InternalDsl.g:656:1: rule__TechnicaldataSubmodel__Group__2 : rule__TechnicaldataSubmodel__Group__2__Impl rule__TechnicaldataSubmodel__Group__3 ;
    public final void rule__TechnicaldataSubmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:660:1: ( rule__TechnicaldataSubmodel__Group__2__Impl rule__TechnicaldataSubmodel__Group__3 )
            // InternalDsl.g:661:2: rule__TechnicaldataSubmodel__Group__2__Impl rule__TechnicaldataSubmodel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TechnicaldataSubmodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__2"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__2__Impl"
    // InternalDsl.g:668:1: rule__TechnicaldataSubmodel__Group__2__Impl : ( 'TechnicalData' ) ;
    public final void rule__TechnicaldataSubmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( ( 'TechnicalData' ) )
            // InternalDsl.g:673:1: ( 'TechnicalData' )
            {
            // InternalDsl.g:673:1: ( 'TechnicalData' )
            // InternalDsl.g:674:2: 'TechnicalData'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalDataKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalDataKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__2__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__3"
    // InternalDsl.g:683:1: rule__TechnicaldataSubmodel__Group__3 : rule__TechnicaldataSubmodel__Group__3__Impl rule__TechnicaldataSubmodel__Group__4 ;
    public final void rule__TechnicaldataSubmodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( rule__TechnicaldataSubmodel__Group__3__Impl rule__TechnicaldataSubmodel__Group__4 )
            // InternalDsl.g:688:2: rule__TechnicaldataSubmodel__Group__3__Impl rule__TechnicaldataSubmodel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TechnicaldataSubmodel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__3"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__3__Impl"
    // InternalDsl.g:695:1: rule__TechnicaldataSubmodel__Group__3__Impl : ( ( rule__TechnicaldataSubmodel__NameAssignment_3 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:699:1: ( ( ( rule__TechnicaldataSubmodel__NameAssignment_3 ) ) )
            // InternalDsl.g:700:1: ( ( rule__TechnicaldataSubmodel__NameAssignment_3 ) )
            {
            // InternalDsl.g:700:1: ( ( rule__TechnicaldataSubmodel__NameAssignment_3 ) )
            // InternalDsl.g:701:2: ( rule__TechnicaldataSubmodel__NameAssignment_3 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getNameAssignment_3()); 
            // InternalDsl.g:702:2: ( rule__TechnicaldataSubmodel__NameAssignment_3 )
            // InternalDsl.g:702:3: rule__TechnicaldataSubmodel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__3__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__4"
    // InternalDsl.g:710:1: rule__TechnicaldataSubmodel__Group__4 : rule__TechnicaldataSubmodel__Group__4__Impl rule__TechnicaldataSubmodel__Group__5 ;
    public final void rule__TechnicaldataSubmodel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:714:1: ( rule__TechnicaldataSubmodel__Group__4__Impl rule__TechnicaldataSubmodel__Group__5 )
            // InternalDsl.g:715:2: rule__TechnicaldataSubmodel__Group__4__Impl rule__TechnicaldataSubmodel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TechnicaldataSubmodel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__4"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__4__Impl"
    // InternalDsl.g:722:1: rule__TechnicaldataSubmodel__Group__4__Impl : ( '[[' ) ;
    public final void rule__TechnicaldataSubmodel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( ( '[[' ) )
            // InternalDsl.g:727:1: ( '[[' )
            {
            // InternalDsl.g:727:1: ( '[[' )
            // InternalDsl.g:728:2: '[['
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getLeftSquareBracketLeftSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getLeftSquareBracketLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__4__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__5"
    // InternalDsl.g:737:1: rule__TechnicaldataSubmodel__Group__5 : rule__TechnicaldataSubmodel__Group__5__Impl rule__TechnicaldataSubmodel__Group__6 ;
    public final void rule__TechnicaldataSubmodel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:1: ( rule__TechnicaldataSubmodel__Group__5__Impl rule__TechnicaldataSubmodel__Group__6 )
            // InternalDsl.g:742:2: rule__TechnicaldataSubmodel__Group__5__Impl rule__TechnicaldataSubmodel__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TechnicaldataSubmodel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__5"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__5__Impl"
    // InternalDsl.g:749:1: rule__TechnicaldataSubmodel__Group__5__Impl : ( ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:753:1: ( ( ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 ) ) )
            // InternalDsl.g:754:1: ( ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 ) )
            {
            // InternalDsl.g:754:1: ( ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 ) )
            // InternalDsl.g:755:2: ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemanticIdAssignment_5()); 
            // InternalDsl.g:756:2: ( rule__TechnicaldataSubmodel__SemanticIdAssignment_5 )
            // InternalDsl.g:756:3: rule__TechnicaldataSubmodel__SemanticIdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__SemanticIdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemanticIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__5__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__6"
    // InternalDsl.g:764:1: rule__TechnicaldataSubmodel__Group__6 : rule__TechnicaldataSubmodel__Group__6__Impl rule__TechnicaldataSubmodel__Group__7 ;
    public final void rule__TechnicaldataSubmodel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:768:1: ( rule__TechnicaldataSubmodel__Group__6__Impl rule__TechnicaldataSubmodel__Group__7 )
            // InternalDsl.g:769:2: rule__TechnicaldataSubmodel__Group__6__Impl rule__TechnicaldataSubmodel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__TechnicaldataSubmodel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__6"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__6__Impl"
    // InternalDsl.g:776:1: rule__TechnicaldataSubmodel__Group__6__Impl : ( ']]' ) ;
    public final void rule__TechnicaldataSubmodel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:780:1: ( ( ']]' ) )
            // InternalDsl.g:781:1: ( ']]' )
            {
            // InternalDsl.g:781:1: ( ']]' )
            // InternalDsl.g:782:2: ']]'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getRightSquareBracketRightSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getRightSquareBracketRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__6__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__7"
    // InternalDsl.g:791:1: rule__TechnicaldataSubmodel__Group__7 : rule__TechnicaldataSubmodel__Group__7__Impl rule__TechnicaldataSubmodel__Group__8 ;
    public final void rule__TechnicaldataSubmodel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:795:1: ( rule__TechnicaldataSubmodel__Group__7__Impl rule__TechnicaldataSubmodel__Group__8 )
            // InternalDsl.g:796:2: rule__TechnicaldataSubmodel__Group__7__Impl rule__TechnicaldataSubmodel__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__TechnicaldataSubmodel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__7"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__7__Impl"
    // InternalDsl.g:803:1: rule__TechnicaldataSubmodel__Group__7__Impl : ( '{' ) ;
    public final void rule__TechnicaldataSubmodel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:807:1: ( ( '{' ) )
            // InternalDsl.g:808:1: ( '{' )
            {
            // InternalDsl.g:808:1: ( '{' )
            // InternalDsl.g:809:2: '{'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__7__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__8"
    // InternalDsl.g:818:1: rule__TechnicaldataSubmodel__Group__8 : rule__TechnicaldataSubmodel__Group__8__Impl rule__TechnicaldataSubmodel__Group__9 ;
    public final void rule__TechnicaldataSubmodel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:822:1: ( rule__TechnicaldataSubmodel__Group__8__Impl rule__TechnicaldataSubmodel__Group__9 )
            // InternalDsl.g:823:2: rule__TechnicaldataSubmodel__Group__8__Impl rule__TechnicaldataSubmodel__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__TechnicaldataSubmodel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__8"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__8__Impl"
    // InternalDsl.g:830:1: rule__TechnicaldataSubmodel__Group__8__Impl : ( ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:834:1: ( ( ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 ) ) )
            // InternalDsl.g:835:1: ( ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 ) )
            {
            // InternalDsl.g:835:1: ( ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 ) )
            // InternalDsl.g:836:2: ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getGeneralInformationAssignment_8()); 
            // InternalDsl.g:837:2: ( rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 )
            // InternalDsl.g:837:3: rule__TechnicaldataSubmodel__GeneralInformationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__GeneralInformationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getGeneralInformationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__8__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__9"
    // InternalDsl.g:845:1: rule__TechnicaldataSubmodel__Group__9 : rule__TechnicaldataSubmodel__Group__9__Impl rule__TechnicaldataSubmodel__Group__10 ;
    public final void rule__TechnicaldataSubmodel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:849:1: ( rule__TechnicaldataSubmodel__Group__9__Impl rule__TechnicaldataSubmodel__Group__10 )
            // InternalDsl.g:850:2: rule__TechnicaldataSubmodel__Group__9__Impl rule__TechnicaldataSubmodel__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__TechnicaldataSubmodel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__9"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__9__Impl"
    // InternalDsl.g:857:1: rule__TechnicaldataSubmodel__Group__9__Impl : ( ';' ) ;
    public final void rule__TechnicaldataSubmodel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:861:1: ( ( ';' ) )
            // InternalDsl.g:862:1: ( ';' )
            {
            // InternalDsl.g:862:1: ( ';' )
            // InternalDsl.g:863:2: ';'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__9__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__10"
    // InternalDsl.g:872:1: rule__TechnicaldataSubmodel__Group__10 : rule__TechnicaldataSubmodel__Group__10__Impl rule__TechnicaldataSubmodel__Group__11 ;
    public final void rule__TechnicaldataSubmodel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:876:1: ( rule__TechnicaldataSubmodel__Group__10__Impl rule__TechnicaldataSubmodel__Group__11 )
            // InternalDsl.g:877:2: rule__TechnicaldataSubmodel__Group__10__Impl rule__TechnicaldataSubmodel__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__TechnicaldataSubmodel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__10"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__10__Impl"
    // InternalDsl.g:884:1: rule__TechnicaldataSubmodel__Group__10__Impl : ( ( rule__TechnicaldataSubmodel__Group_10__0 )? ) ;
    public final void rule__TechnicaldataSubmodel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:888:1: ( ( ( rule__TechnicaldataSubmodel__Group_10__0 )? ) )
            // InternalDsl.g:889:1: ( ( rule__TechnicaldataSubmodel__Group_10__0 )? )
            {
            // InternalDsl.g:889:1: ( ( rule__TechnicaldataSubmodel__Group_10__0 )? )
            // InternalDsl.g:890:2: ( rule__TechnicaldataSubmodel__Group_10__0 )?
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getGroup_10()); 
            // InternalDsl.g:891:2: ( rule__TechnicaldataSubmodel__Group_10__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:891:3: rule__TechnicaldataSubmodel__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnicaldataSubmodel__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__10__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__11"
    // InternalDsl.g:899:1: rule__TechnicaldataSubmodel__Group__11 : rule__TechnicaldataSubmodel__Group__11__Impl rule__TechnicaldataSubmodel__Group__12 ;
    public final void rule__TechnicaldataSubmodel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:903:1: ( rule__TechnicaldataSubmodel__Group__11__Impl rule__TechnicaldataSubmodel__Group__12 )
            // InternalDsl.g:904:2: rule__TechnicaldataSubmodel__Group__11__Impl rule__TechnicaldataSubmodel__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__TechnicaldataSubmodel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__11"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__11__Impl"
    // InternalDsl.g:911:1: rule__TechnicaldataSubmodel__Group__11__Impl : ( ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:915:1: ( ( ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 ) ) )
            // InternalDsl.g:916:1: ( ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 ) )
            {
            // InternalDsl.g:916:1: ( ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 ) )
            // InternalDsl.g:917:2: ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalPropertiesAssignment_11()); 
            // InternalDsl.g:918:2: ( rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 )
            // InternalDsl.g:918:3: rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalPropertiesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__11__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__12"
    // InternalDsl.g:926:1: rule__TechnicaldataSubmodel__Group__12 : rule__TechnicaldataSubmodel__Group__12__Impl rule__TechnicaldataSubmodel__Group__13 ;
    public final void rule__TechnicaldataSubmodel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:930:1: ( rule__TechnicaldataSubmodel__Group__12__Impl rule__TechnicaldataSubmodel__Group__13 )
            // InternalDsl.g:931:2: rule__TechnicaldataSubmodel__Group__12__Impl rule__TechnicaldataSubmodel__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__TechnicaldataSubmodel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__12"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__12__Impl"
    // InternalDsl.g:938:1: rule__TechnicaldataSubmodel__Group__12__Impl : ( ';' ) ;
    public final void rule__TechnicaldataSubmodel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:942:1: ( ( ';' ) )
            // InternalDsl.g:943:1: ( ';' )
            {
            // InternalDsl.g:943:1: ( ';' )
            // InternalDsl.g:944:2: ';'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__12__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__13"
    // InternalDsl.g:953:1: rule__TechnicaldataSubmodel__Group__13 : rule__TechnicaldataSubmodel__Group__13__Impl rule__TechnicaldataSubmodel__Group__14 ;
    public final void rule__TechnicaldataSubmodel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:957:1: ( rule__TechnicaldataSubmodel__Group__13__Impl rule__TechnicaldataSubmodel__Group__14 )
            // InternalDsl.g:958:2: rule__TechnicaldataSubmodel__Group__13__Impl rule__TechnicaldataSubmodel__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__TechnicaldataSubmodel__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__13"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__13__Impl"
    // InternalDsl.g:965:1: rule__TechnicaldataSubmodel__Group__13__Impl : ( ( rule__TechnicaldataSubmodel__Group_13__0 )? ) ;
    public final void rule__TechnicaldataSubmodel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:969:1: ( ( ( rule__TechnicaldataSubmodel__Group_13__0 )? ) )
            // InternalDsl.g:970:1: ( ( rule__TechnicaldataSubmodel__Group_13__0 )? )
            {
            // InternalDsl.g:970:1: ( ( rule__TechnicaldataSubmodel__Group_13__0 )? )
            // InternalDsl.g:971:2: ( rule__TechnicaldataSubmodel__Group_13__0 )?
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getGroup_13()); 
            // InternalDsl.g:972:2: ( rule__TechnicaldataSubmodel__Group_13__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:972:3: rule__TechnicaldataSubmodel__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnicaldataSubmodel__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__13__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__14"
    // InternalDsl.g:980:1: rule__TechnicaldataSubmodel__Group__14 : rule__TechnicaldataSubmodel__Group__14__Impl ;
    public final void rule__TechnicaldataSubmodel__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:984:1: ( rule__TechnicaldataSubmodel__Group__14__Impl )
            // InternalDsl.g:985:2: rule__TechnicaldataSubmodel__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__14"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group__14__Impl"
    // InternalDsl.g:991:1: rule__TechnicaldataSubmodel__Group__14__Impl : ( '}' ) ;
    public final void rule__TechnicaldataSubmodel__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:995:1: ( ( '}' ) )
            // InternalDsl.g:996:1: ( '}' )
            {
            // InternalDsl.g:996:1: ( '}' )
            // InternalDsl.g:997:2: '}'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group__14__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_10__0"
    // InternalDsl.g:1007:1: rule__TechnicaldataSubmodel__Group_10__0 : rule__TechnicaldataSubmodel__Group_10__0__Impl rule__TechnicaldataSubmodel__Group_10__1 ;
    public final void rule__TechnicaldataSubmodel__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( rule__TechnicaldataSubmodel__Group_10__0__Impl rule__TechnicaldataSubmodel__Group_10__1 )
            // InternalDsl.g:1012:2: rule__TechnicaldataSubmodel__Group_10__0__Impl rule__TechnicaldataSubmodel__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__TechnicaldataSubmodel__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_10__0"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_10__0__Impl"
    // InternalDsl.g:1019:1: rule__TechnicaldataSubmodel__Group_10__0__Impl : ( ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( ( ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 ) ) )
            // InternalDsl.g:1024:1: ( ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 ) )
            {
            // InternalDsl.g:1024:1: ( ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 ) )
            // InternalDsl.g:1025:2: ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getProductClassificationsAssignment_10_0()); 
            // InternalDsl.g:1026:2: ( rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 )
            // InternalDsl.g:1026:3: rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getProductClassificationsAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_10__0__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_10__1"
    // InternalDsl.g:1034:1: rule__TechnicaldataSubmodel__Group_10__1 : rule__TechnicaldataSubmodel__Group_10__1__Impl ;
    public final void rule__TechnicaldataSubmodel__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1038:1: ( rule__TechnicaldataSubmodel__Group_10__1__Impl )
            // InternalDsl.g:1039:2: rule__TechnicaldataSubmodel__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_10__1"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_10__1__Impl"
    // InternalDsl.g:1045:1: rule__TechnicaldataSubmodel__Group_10__1__Impl : ( ';' ) ;
    public final void rule__TechnicaldataSubmodel__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1049:1: ( ( ';' ) )
            // InternalDsl.g:1050:1: ( ';' )
            {
            // InternalDsl.g:1050:1: ( ';' )
            // InternalDsl.g:1051:2: ';'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_10__1__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_13__0"
    // InternalDsl.g:1061:1: rule__TechnicaldataSubmodel__Group_13__0 : rule__TechnicaldataSubmodel__Group_13__0__Impl rule__TechnicaldataSubmodel__Group_13__1 ;
    public final void rule__TechnicaldataSubmodel__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1065:1: ( rule__TechnicaldataSubmodel__Group_13__0__Impl rule__TechnicaldataSubmodel__Group_13__1 )
            // InternalDsl.g:1066:2: rule__TechnicaldataSubmodel__Group_13__0__Impl rule__TechnicaldataSubmodel__Group_13__1
            {
            pushFollow(FOLLOW_11);
            rule__TechnicaldataSubmodel__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_13__0"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_13__0__Impl"
    // InternalDsl.g:1073:1: rule__TechnicaldataSubmodel__Group_13__0__Impl : ( ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 ) ) ;
    public final void rule__TechnicaldataSubmodel__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1077:1: ( ( ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 ) ) )
            // InternalDsl.g:1078:1: ( ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 ) )
            {
            // InternalDsl.g:1078:1: ( ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 ) )
            // InternalDsl.g:1079:2: ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 )
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getFurtherInformationAssignment_13_0()); 
            // InternalDsl.g:1080:2: ( rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 )
            // InternalDsl.g:1080:3: rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getTechnicaldataSubmodelAccess().getFurtherInformationAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_13__0__Impl"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_13__1"
    // InternalDsl.g:1088:1: rule__TechnicaldataSubmodel__Group_13__1 : rule__TechnicaldataSubmodel__Group_13__1__Impl ;
    public final void rule__TechnicaldataSubmodel__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1092:1: ( rule__TechnicaldataSubmodel__Group_13__1__Impl )
            // InternalDsl.g:1093:2: rule__TechnicaldataSubmodel__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TechnicaldataSubmodel__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_13__1"


    // $ANTLR start "rule__TechnicaldataSubmodel__Group_13__1__Impl"
    // InternalDsl.g:1099:1: rule__TechnicaldataSubmodel__Group_13__1__Impl : ( ';' ) ;
    public final void rule__TechnicaldataSubmodel__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1103:1: ( ( ';' ) )
            // InternalDsl.g:1104:1: ( ';' )
            {
            // InternalDsl.g:1104:1: ( ';' )
            // InternalDsl.g:1105:2: ';'
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_13_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemicolonKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__Group_13__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__0"
    // InternalDsl.g:1115:1: rule__SubmodelElementCollectionGeneralInformation__Group__0 : rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group__1 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1119:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group__1 )
            // InternalDsl.g:1120:2: rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl"
    // InternalDsl.g:1127:1: rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl : ( 'GeneralInformation' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1131:1: ( ( 'GeneralInformation' ) )
            // InternalDsl.g:1132:1: ( 'GeneralInformation' )
            {
            // InternalDsl.g:1132:1: ( 'GeneralInformation' )
            // InternalDsl.g:1133:2: 'GeneralInformation'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGeneralInformationKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGeneralInformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__1"
    // InternalDsl.g:1142:1: rule__SubmodelElementCollectionGeneralInformation__Group__1 : rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl rule__SubmodelElementCollectionGeneralInformation__Group__2 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1146:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl rule__SubmodelElementCollectionGeneralInformation__Group__2 )
            // InternalDsl.g:1147:2: rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl rule__SubmodelElementCollectionGeneralInformation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl"
    // InternalDsl.g:1154:1: rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1158:1: ( ( ':' ) )
            // InternalDsl.g:1159:1: ( ':' )
            {
            // InternalDsl.g:1159:1: ( ':' )
            // InternalDsl.g:1160:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__2"
    // InternalDsl.g:1169:1: rule__SubmodelElementCollectionGeneralInformation__Group__2 : rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl rule__SubmodelElementCollectionGeneralInformation__Group__3 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1173:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl rule__SubmodelElementCollectionGeneralInformation__Group__3 )
            // InternalDsl.g:1174:2: rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl rule__SubmodelElementCollectionGeneralInformation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl"
    // InternalDsl.g:1181:1: rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 ) ) )
            // InternalDsl.g:1186:1: ( ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 ) )
            {
            // InternalDsl.g:1186:1: ( ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 ) )
            // InternalDsl.g:1187:2: ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getNameAssignment_2()); 
            // InternalDsl.g:1188:2: ( rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 )
            // InternalDsl.g:1188:3: rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__3"
    // InternalDsl.g:1196:1: rule__SubmodelElementCollectionGeneralInformation__Group__3 : rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl rule__SubmodelElementCollectionGeneralInformation__Group__4 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1200:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl rule__SubmodelElementCollectionGeneralInformation__Group__4 )
            // InternalDsl.g:1201:2: rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl rule__SubmodelElementCollectionGeneralInformation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl"
    // InternalDsl.g:1208:1: rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( ( '[[' ) )
            // InternalDsl.g:1213:1: ( '[[' )
            {
            // InternalDsl.g:1213:1: ( '[[' )
            // InternalDsl.g:1214:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__4"
    // InternalDsl.g:1223:1: rule__SubmodelElementCollectionGeneralInformation__Group__4 : rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl rule__SubmodelElementCollectionGeneralInformation__Group__5 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1227:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl rule__SubmodelElementCollectionGeneralInformation__Group__5 )
            // InternalDsl.g:1228:2: rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl rule__SubmodelElementCollectionGeneralInformation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl"
    // InternalDsl.g:1235:1: rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1239:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:1240:1: ( ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:1240:1: ( ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 ) )
            // InternalDsl.g:1241:2: ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:1242:2: ( rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 )
            // InternalDsl.g:1242:3: rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__5"
    // InternalDsl.g:1250:1: rule__SubmodelElementCollectionGeneralInformation__Group__5 : rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl rule__SubmodelElementCollectionGeneralInformation__Group__6 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1254:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl rule__SubmodelElementCollectionGeneralInformation__Group__6 )
            // InternalDsl.g:1255:2: rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl rule__SubmodelElementCollectionGeneralInformation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl"
    // InternalDsl.g:1262:1: rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( ( ']]' ) )
            // InternalDsl.g:1267:1: ( ']]' )
            {
            // InternalDsl.g:1267:1: ( ']]' )
            // InternalDsl.g:1268:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__6"
    // InternalDsl.g:1277:1: rule__SubmodelElementCollectionGeneralInformation__Group__6 : rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl rule__SubmodelElementCollectionGeneralInformation__Group__7 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1281:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl rule__SubmodelElementCollectionGeneralInformation__Group__7 )
            // InternalDsl.g:1282:2: rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl rule__SubmodelElementCollectionGeneralInformation__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl"
    // InternalDsl.g:1289:1: rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1293:1: ( ( '{' ) )
            // InternalDsl.g:1294:1: ( '{' )
            {
            // InternalDsl.g:1294:1: ( '{' )
            // InternalDsl.g:1295:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__7"
    // InternalDsl.g:1304:1: rule__SubmodelElementCollectionGeneralInformation__Group__7 : rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl rule__SubmodelElementCollectionGeneralInformation__Group__8 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1308:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl rule__SubmodelElementCollectionGeneralInformation__Group__8 )
            // InternalDsl.g:1309:2: rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl rule__SubmodelElementCollectionGeneralInformation__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl"
    // InternalDsl.g:1316:1: rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 ) ) )
            // InternalDsl.g:1321:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 ) )
            {
            // InternalDsl.g:1321:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 ) )
            // InternalDsl.g:1322:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerNameAssignment_7()); 
            // InternalDsl.g:1323:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 )
            // InternalDsl.g:1323:3: rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__8"
    // InternalDsl.g:1331:1: rule__SubmodelElementCollectionGeneralInformation__Group__8 : rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl rule__SubmodelElementCollectionGeneralInformation__Group__9 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1335:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl rule__SubmodelElementCollectionGeneralInformation__Group__9 )
            // InternalDsl.g:1336:2: rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl rule__SubmodelElementCollectionGeneralInformation__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl"
    // InternalDsl.g:1343:1: rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( ( ';' ) )
            // InternalDsl.g:1348:1: ( ';' )
            {
            // InternalDsl.g:1348:1: ( ';' )
            // InternalDsl.g:1349:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__9"
    // InternalDsl.g:1358:1: rule__SubmodelElementCollectionGeneralInformation__Group__9 : rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl rule__SubmodelElementCollectionGeneralInformation__Group__10 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1362:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl rule__SubmodelElementCollectionGeneralInformation__Group__10 )
            // InternalDsl.g:1363:2: rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl rule__SubmodelElementCollectionGeneralInformation__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl"
    // InternalDsl.g:1370:1: rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )? ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1374:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )? ) )
            // InternalDsl.g:1375:1: ( ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )? )
            {
            // InternalDsl.g:1375:1: ( ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )? )
            // InternalDsl.g:1376:2: ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )?
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup_9()); 
            // InternalDsl.g:1377:2: ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1377:3: rule__SubmodelElementCollectionGeneralInformation__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmodelElementCollectionGeneralInformation__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__10"
    // InternalDsl.g:1385:1: rule__SubmodelElementCollectionGeneralInformation__Group__10 : rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl rule__SubmodelElementCollectionGeneralInformation__Group__11 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1389:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl rule__SubmodelElementCollectionGeneralInformation__Group__11 )
            // InternalDsl.g:1390:2: rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl rule__SubmodelElementCollectionGeneralInformation__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__10"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl"
    // InternalDsl.g:1397:1: rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1401:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 ) ) )
            // InternalDsl.g:1402:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 ) )
            {
            // InternalDsl.g:1402:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 ) )
            // InternalDsl.g:1403:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerProductDesignationAssignment_10()); 
            // InternalDsl.g:1404:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 )
            // InternalDsl.g:1404:3: rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerProductDesignationAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__10__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__11"
    // InternalDsl.g:1412:1: rule__SubmodelElementCollectionGeneralInformation__Group__11 : rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl rule__SubmodelElementCollectionGeneralInformation__Group__12 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1416:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl rule__SubmodelElementCollectionGeneralInformation__Group__12 )
            // InternalDsl.g:1417:2: rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl rule__SubmodelElementCollectionGeneralInformation__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__11"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl"
    // InternalDsl.g:1424:1: rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( ( ';' ) )
            // InternalDsl.g:1429:1: ( ';' )
            {
            // InternalDsl.g:1429:1: ( ';' )
            // InternalDsl.g:1430:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__11__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__12"
    // InternalDsl.g:1439:1: rule__SubmodelElementCollectionGeneralInformation__Group__12 : rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl rule__SubmodelElementCollectionGeneralInformation__Group__13 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1443:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl rule__SubmodelElementCollectionGeneralInformation__Group__13 )
            // InternalDsl.g:1444:2: rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl rule__SubmodelElementCollectionGeneralInformation__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__12"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl"
    // InternalDsl.g:1451:1: rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1455:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 ) ) )
            // InternalDsl.g:1456:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 ) )
            {
            // InternalDsl.g:1456:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 ) )
            // InternalDsl.g:1457:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerPartNumberAssignment_12()); 
            // InternalDsl.g:1458:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 )
            // InternalDsl.g:1458:3: rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerPartNumberAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__12__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__13"
    // InternalDsl.g:1466:1: rule__SubmodelElementCollectionGeneralInformation__Group__13 : rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl rule__SubmodelElementCollectionGeneralInformation__Group__14 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1470:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl rule__SubmodelElementCollectionGeneralInformation__Group__14 )
            // InternalDsl.g:1471:2: rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl rule__SubmodelElementCollectionGeneralInformation__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__13"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl"
    // InternalDsl.g:1478:1: rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1482:1: ( ( ';' ) )
            // InternalDsl.g:1483:1: ( ';' )
            {
            // InternalDsl.g:1483:1: ( ';' )
            // InternalDsl.g:1484:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__13__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__14"
    // InternalDsl.g:1493:1: rule__SubmodelElementCollectionGeneralInformation__Group__14 : rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl rule__SubmodelElementCollectionGeneralInformation__Group__15 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1497:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl rule__SubmodelElementCollectionGeneralInformation__Group__15 )
            // InternalDsl.g:1498:2: rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl rule__SubmodelElementCollectionGeneralInformation__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__14"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl"
    // InternalDsl.g:1505:1: rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1509:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 ) ) )
            // InternalDsl.g:1510:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 ) )
            {
            // InternalDsl.g:1510:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 ) )
            // InternalDsl.g:1511:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerOrderCodeAssignment_14()); 
            // InternalDsl.g:1512:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 )
            // InternalDsl.g:1512:3: rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerOrderCodeAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__14__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__15"
    // InternalDsl.g:1520:1: rule__SubmodelElementCollectionGeneralInformation__Group__15 : rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl rule__SubmodelElementCollectionGeneralInformation__Group__16 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1524:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl rule__SubmodelElementCollectionGeneralInformation__Group__16 )
            // InternalDsl.g:1525:2: rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl rule__SubmodelElementCollectionGeneralInformation__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__15"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl"
    // InternalDsl.g:1532:1: rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1536:1: ( ( ';' ) )
            // InternalDsl.g:1537:1: ( ';' )
            {
            // InternalDsl.g:1537:1: ( ';' )
            // InternalDsl.g:1538:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__15__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__16"
    // InternalDsl.g:1547:1: rule__SubmodelElementCollectionGeneralInformation__Group__16 : rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl rule__SubmodelElementCollectionGeneralInformation__Group__17 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1551:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl rule__SubmodelElementCollectionGeneralInformation__Group__17 )
            // InternalDsl.g:1552:2: rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl rule__SubmodelElementCollectionGeneralInformation__Group__17
            {
            pushFollow(FOLLOW_19);
            rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__16"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl"
    // InternalDsl.g:1559:1: rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )* ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1563:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )* ) )
            // InternalDsl.g:1564:1: ( ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )* )
            {
            // InternalDsl.g:1564:1: ( ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )* )
            // InternalDsl.g:1565:2: ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup_16()); 
            // InternalDsl.g:1566:2: ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:1566:3: rule__SubmodelElementCollectionGeneralInformation__Group_16__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SubmodelElementCollectionGeneralInformation__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__16__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__17"
    // InternalDsl.g:1574:1: rule__SubmodelElementCollectionGeneralInformation__Group__17 : rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1578:1: ( rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl )
            // InternalDsl.g:1579:2: rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__17"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl"
    // InternalDsl.g:1585:1: rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1589:1: ( ( '}' ) )
            // InternalDsl.g:1590:1: ( '}' )
            {
            // InternalDsl.g:1590:1: ( '}' )
            // InternalDsl.g:1591:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightCurlyBracketKeyword_17()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group__17__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_9__0"
    // InternalDsl.g:1601:1: rule__SubmodelElementCollectionGeneralInformation__Group_9__0 : rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_9__1 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1605:1: ( rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_9__1 )
            // InternalDsl.g:1606:2: rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_9__0"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl"
    // InternalDsl.g:1613:1: rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1617:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 ) ) )
            // InternalDsl.g:1618:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 ) )
            {
            // InternalDsl.g:1618:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 ) )
            // InternalDsl.g:1619:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerLogoAssignment_9_0()); 
            // InternalDsl.g:1620:2: ( rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 )
            // InternalDsl.g:1620:3: rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerLogoAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_9__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_9__1"
    // InternalDsl.g:1628:1: rule__SubmodelElementCollectionGeneralInformation__Group_9__1 : rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1632:1: ( rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl )
            // InternalDsl.g:1633:2: rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_9__1"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl"
    // InternalDsl.g:1639:1: rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1643:1: ( ( ';' ) )
            // InternalDsl.g:1644:1: ( ';' )
            {
            // InternalDsl.g:1644:1: ( ';' )
            // InternalDsl.g:1645:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_9__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_16__0"
    // InternalDsl.g:1655:1: rule__SubmodelElementCollectionGeneralInformation__Group_16__0 : rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_16__1 ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1659:1: ( rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_16__1 )
            // InternalDsl.g:1660:2: rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl rule__SubmodelElementCollectionGeneralInformation__Group_16__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_16__0"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl"
    // InternalDsl.g:1667:1: rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl : ( ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 ) ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1671:1: ( ( ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 ) ) )
            // InternalDsl.g:1672:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 ) )
            {
            // InternalDsl.g:1672:1: ( ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 ) )
            // InternalDsl.g:1673:2: ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getProductImageAssignment_16_0()); 
            // InternalDsl.g:1674:2: ( rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 )
            // InternalDsl.g:1674:3: rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getProductImageAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_16__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_16__1"
    // InternalDsl.g:1682:1: rule__SubmodelElementCollectionGeneralInformation__Group_16__1 : rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1686:1: ( rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl )
            // InternalDsl.g:1687:2: rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_16__1"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl"
    // InternalDsl.g:1693:1: rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1697:1: ( ( ';' ) )
            // InternalDsl.g:1698:1: ( ';' )
            {
            // InternalDsl.g:1698:1: ( ';' )
            // InternalDsl.g:1699:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_16_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemicolonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__Group_16__1__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__0"
    // InternalDsl.g:1709:1: rule__PropertyManufacturerName__Group__0 : rule__PropertyManufacturerName__Group__0__Impl rule__PropertyManufacturerName__Group__1 ;
    public final void rule__PropertyManufacturerName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1713:1: ( rule__PropertyManufacturerName__Group__0__Impl rule__PropertyManufacturerName__Group__1 )
            // InternalDsl.g:1714:2: rule__PropertyManufacturerName__Group__0__Impl rule__PropertyManufacturerName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyManufacturerName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__0"


    // $ANTLR start "rule__PropertyManufacturerName__Group__0__Impl"
    // InternalDsl.g:1721:1: rule__PropertyManufacturerName__Group__0__Impl : ( 'ManufacturerName' ) ;
    public final void rule__PropertyManufacturerName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1725:1: ( ( 'ManufacturerName' ) )
            // InternalDsl.g:1726:1: ( 'ManufacturerName' )
            {
            // InternalDsl.g:1726:1: ( 'ManufacturerName' )
            // InternalDsl.g:1727:2: 'ManufacturerName'
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getManufacturerNameKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerNameAccess().getManufacturerNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__0__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__1"
    // InternalDsl.g:1736:1: rule__PropertyManufacturerName__Group__1 : rule__PropertyManufacturerName__Group__1__Impl rule__PropertyManufacturerName__Group__2 ;
    public final void rule__PropertyManufacturerName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1740:1: ( rule__PropertyManufacturerName__Group__1__Impl rule__PropertyManufacturerName__Group__2 )
            // InternalDsl.g:1741:2: rule__PropertyManufacturerName__Group__1__Impl rule__PropertyManufacturerName__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyManufacturerName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__1"


    // $ANTLR start "rule__PropertyManufacturerName__Group__1__Impl"
    // InternalDsl.g:1748:1: rule__PropertyManufacturerName__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyManufacturerName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1752:1: ( ( ':' ) )
            // InternalDsl.g:1753:1: ( ':' )
            {
            // InternalDsl.g:1753:1: ( ':' )
            // InternalDsl.g:1754:2: ':'
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerNameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__1__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__2"
    // InternalDsl.g:1763:1: rule__PropertyManufacturerName__Group__2 : rule__PropertyManufacturerName__Group__2__Impl rule__PropertyManufacturerName__Group__3 ;
    public final void rule__PropertyManufacturerName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1767:1: ( rule__PropertyManufacturerName__Group__2__Impl rule__PropertyManufacturerName__Group__3 )
            // InternalDsl.g:1768:2: rule__PropertyManufacturerName__Group__2__Impl rule__PropertyManufacturerName__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyManufacturerName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__2"


    // $ANTLR start "rule__PropertyManufacturerName__Group__2__Impl"
    // InternalDsl.g:1775:1: rule__PropertyManufacturerName__Group__2__Impl : ( ( rule__PropertyManufacturerName__NameAssignment_2 ) ) ;
    public final void rule__PropertyManufacturerName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1779:1: ( ( ( rule__PropertyManufacturerName__NameAssignment_2 ) ) )
            // InternalDsl.g:1780:1: ( ( rule__PropertyManufacturerName__NameAssignment_2 ) )
            {
            // InternalDsl.g:1780:1: ( ( rule__PropertyManufacturerName__NameAssignment_2 ) )
            // InternalDsl.g:1781:2: ( rule__PropertyManufacturerName__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getNameAssignment_2()); 
            // InternalDsl.g:1782:2: ( rule__PropertyManufacturerName__NameAssignment_2 )
            // InternalDsl.g:1782:3: rule__PropertyManufacturerName__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__2__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__3"
    // InternalDsl.g:1790:1: rule__PropertyManufacturerName__Group__3 : rule__PropertyManufacturerName__Group__3__Impl rule__PropertyManufacturerName__Group__4 ;
    public final void rule__PropertyManufacturerName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1794:1: ( rule__PropertyManufacturerName__Group__3__Impl rule__PropertyManufacturerName__Group__4 )
            // InternalDsl.g:1795:2: rule__PropertyManufacturerName__Group__3__Impl rule__PropertyManufacturerName__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyManufacturerName__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__3"


    // $ANTLR start "rule__PropertyManufacturerName__Group__3__Impl"
    // InternalDsl.g:1802:1: rule__PropertyManufacturerName__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyManufacturerName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1806:1: ( ( '[[' ) )
            // InternalDsl.g:1807:1: ( '[[' )
            {
            // InternalDsl.g:1807:1: ( '[[' )
            // InternalDsl.g:1808:2: '[['
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerNameAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__3__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__4"
    // InternalDsl.g:1817:1: rule__PropertyManufacturerName__Group__4 : rule__PropertyManufacturerName__Group__4__Impl rule__PropertyManufacturerName__Group__5 ;
    public final void rule__PropertyManufacturerName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1821:1: ( rule__PropertyManufacturerName__Group__4__Impl rule__PropertyManufacturerName__Group__5 )
            // InternalDsl.g:1822:2: rule__PropertyManufacturerName__Group__4__Impl rule__PropertyManufacturerName__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyManufacturerName__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__4"


    // $ANTLR start "rule__PropertyManufacturerName__Group__4__Impl"
    // InternalDsl.g:1829:1: rule__PropertyManufacturerName__Group__4__Impl : ( ( rule__PropertyManufacturerName__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyManufacturerName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( ( ( rule__PropertyManufacturerName__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:1834:1: ( ( rule__PropertyManufacturerName__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:1834:1: ( ( rule__PropertyManufacturerName__SemanticIdAssignment_4 ) )
            // InternalDsl.g:1835:2: ( rule__PropertyManufacturerName__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:1836:2: ( rule__PropertyManufacturerName__SemanticIdAssignment_4 )
            // InternalDsl.g:1836:3: rule__PropertyManufacturerName__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerNameAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__4__Impl"


    // $ANTLR start "rule__PropertyManufacturerName__Group__5"
    // InternalDsl.g:1844:1: rule__PropertyManufacturerName__Group__5 : rule__PropertyManufacturerName__Group__5__Impl ;
    public final void rule__PropertyManufacturerName__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1848:1: ( rule__PropertyManufacturerName__Group__5__Impl )
            // InternalDsl.g:1849:2: rule__PropertyManufacturerName__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerName__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__5"


    // $ANTLR start "rule__PropertyManufacturerName__Group__5__Impl"
    // InternalDsl.g:1855:1: rule__PropertyManufacturerName__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyManufacturerName__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1859:1: ( ( ']]' ) )
            // InternalDsl.g:1860:1: ( ']]' )
            {
            // InternalDsl.g:1860:1: ( ']]' )
            // InternalDsl.g:1861:2: ']]'
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerNameAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__Group__5__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__0"
    // InternalDsl.g:1871:1: rule__FileManufacturerLogo__Group__0 : rule__FileManufacturerLogo__Group__0__Impl rule__FileManufacturerLogo__Group__1 ;
    public final void rule__FileManufacturerLogo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( rule__FileManufacturerLogo__Group__0__Impl rule__FileManufacturerLogo__Group__1 )
            // InternalDsl.g:1876:2: rule__FileManufacturerLogo__Group__0__Impl rule__FileManufacturerLogo__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FileManufacturerLogo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__0"


    // $ANTLR start "rule__FileManufacturerLogo__Group__0__Impl"
    // InternalDsl.g:1883:1: rule__FileManufacturerLogo__Group__0__Impl : ( 'ManufacturerLogo' ) ;
    public final void rule__FileManufacturerLogo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( ( 'ManufacturerLogo' ) )
            // InternalDsl.g:1888:1: ( 'ManufacturerLogo' )
            {
            // InternalDsl.g:1888:1: ( 'ManufacturerLogo' )
            // InternalDsl.g:1889:2: 'ManufacturerLogo'
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getManufacturerLogoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFileManufacturerLogoAccess().getManufacturerLogoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__0__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__1"
    // InternalDsl.g:1898:1: rule__FileManufacturerLogo__Group__1 : rule__FileManufacturerLogo__Group__1__Impl rule__FileManufacturerLogo__Group__2 ;
    public final void rule__FileManufacturerLogo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1902:1: ( rule__FileManufacturerLogo__Group__1__Impl rule__FileManufacturerLogo__Group__2 )
            // InternalDsl.g:1903:2: rule__FileManufacturerLogo__Group__1__Impl rule__FileManufacturerLogo__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FileManufacturerLogo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__1"


    // $ANTLR start "rule__FileManufacturerLogo__Group__1__Impl"
    // InternalDsl.g:1910:1: rule__FileManufacturerLogo__Group__1__Impl : ( ':' ) ;
    public final void rule__FileManufacturerLogo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1914:1: ( ( ':' ) )
            // InternalDsl.g:1915:1: ( ':' )
            {
            // InternalDsl.g:1915:1: ( ':' )
            // InternalDsl.g:1916:2: ':'
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFileManufacturerLogoAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__1__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__2"
    // InternalDsl.g:1925:1: rule__FileManufacturerLogo__Group__2 : rule__FileManufacturerLogo__Group__2__Impl rule__FileManufacturerLogo__Group__3 ;
    public final void rule__FileManufacturerLogo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1929:1: ( rule__FileManufacturerLogo__Group__2__Impl rule__FileManufacturerLogo__Group__3 )
            // InternalDsl.g:1930:2: rule__FileManufacturerLogo__Group__2__Impl rule__FileManufacturerLogo__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__FileManufacturerLogo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__2"


    // $ANTLR start "rule__FileManufacturerLogo__Group__2__Impl"
    // InternalDsl.g:1937:1: rule__FileManufacturerLogo__Group__2__Impl : ( ( rule__FileManufacturerLogo__NameAssignment_2 ) ) ;
    public final void rule__FileManufacturerLogo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1941:1: ( ( ( rule__FileManufacturerLogo__NameAssignment_2 ) ) )
            // InternalDsl.g:1942:1: ( ( rule__FileManufacturerLogo__NameAssignment_2 ) )
            {
            // InternalDsl.g:1942:1: ( ( rule__FileManufacturerLogo__NameAssignment_2 ) )
            // InternalDsl.g:1943:2: ( rule__FileManufacturerLogo__NameAssignment_2 )
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getNameAssignment_2()); 
            // InternalDsl.g:1944:2: ( rule__FileManufacturerLogo__NameAssignment_2 )
            // InternalDsl.g:1944:3: rule__FileManufacturerLogo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileManufacturerLogoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__2__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__3"
    // InternalDsl.g:1952:1: rule__FileManufacturerLogo__Group__3 : rule__FileManufacturerLogo__Group__3__Impl rule__FileManufacturerLogo__Group__4 ;
    public final void rule__FileManufacturerLogo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1956:1: ( rule__FileManufacturerLogo__Group__3__Impl rule__FileManufacturerLogo__Group__4 )
            // InternalDsl.g:1957:2: rule__FileManufacturerLogo__Group__3__Impl rule__FileManufacturerLogo__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FileManufacturerLogo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__3"


    // $ANTLR start "rule__FileManufacturerLogo__Group__3__Impl"
    // InternalDsl.g:1964:1: rule__FileManufacturerLogo__Group__3__Impl : ( '[[' ) ;
    public final void rule__FileManufacturerLogo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1968:1: ( ( '[[' ) )
            // InternalDsl.g:1969:1: ( '[[' )
            {
            // InternalDsl.g:1969:1: ( '[[' )
            // InternalDsl.g:1970:2: '[['
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileManufacturerLogoAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__3__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__4"
    // InternalDsl.g:1979:1: rule__FileManufacturerLogo__Group__4 : rule__FileManufacturerLogo__Group__4__Impl rule__FileManufacturerLogo__Group__5 ;
    public final void rule__FileManufacturerLogo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1983:1: ( rule__FileManufacturerLogo__Group__4__Impl rule__FileManufacturerLogo__Group__5 )
            // InternalDsl.g:1984:2: rule__FileManufacturerLogo__Group__4__Impl rule__FileManufacturerLogo__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FileManufacturerLogo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__4"


    // $ANTLR start "rule__FileManufacturerLogo__Group__4__Impl"
    // InternalDsl.g:1991:1: rule__FileManufacturerLogo__Group__4__Impl : ( ( rule__FileManufacturerLogo__SemanticIdAssignment_4 ) ) ;
    public final void rule__FileManufacturerLogo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1995:1: ( ( ( rule__FileManufacturerLogo__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:1996:1: ( ( rule__FileManufacturerLogo__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:1996:1: ( ( rule__FileManufacturerLogo__SemanticIdAssignment_4 ) )
            // InternalDsl.g:1997:2: ( rule__FileManufacturerLogo__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:1998:2: ( rule__FileManufacturerLogo__SemanticIdAssignment_4 )
            // InternalDsl.g:1998:3: rule__FileManufacturerLogo__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFileManufacturerLogoAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__4__Impl"


    // $ANTLR start "rule__FileManufacturerLogo__Group__5"
    // InternalDsl.g:2006:1: rule__FileManufacturerLogo__Group__5 : rule__FileManufacturerLogo__Group__5__Impl ;
    public final void rule__FileManufacturerLogo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2010:1: ( rule__FileManufacturerLogo__Group__5__Impl )
            // InternalDsl.g:2011:2: rule__FileManufacturerLogo__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileManufacturerLogo__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__5"


    // $ANTLR start "rule__FileManufacturerLogo__Group__5__Impl"
    // InternalDsl.g:2017:1: rule__FileManufacturerLogo__Group__5__Impl : ( ']]' ) ;
    public final void rule__FileManufacturerLogo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2021:1: ( ( ']]' ) )
            // InternalDsl.g:2022:1: ( ']]' )
            {
            // InternalDsl.g:2022:1: ( ']]' )
            // InternalDsl.g:2023:2: ']]'
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileManufacturerLogoAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__Group__5__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0"
    // InternalDsl.g:2033:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1 ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2037:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1 )
            // InternalDsl.g:2038:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl"
    // InternalDsl.g:2045:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl : ( 'ManufacturerProductDesignation' ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2049:1: ( ( 'ManufacturerProductDesignation' ) )
            // InternalDsl.g:2050:1: ( 'ManufacturerProductDesignation' )
            {
            // InternalDsl.g:2050:1: ( 'ManufacturerProductDesignation' )
            // InternalDsl.g:2051:2: 'ManufacturerProductDesignation'
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getManufacturerProductDesignationKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getManufacturerProductDesignationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__0__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1"
    // InternalDsl.g:2060:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2 ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2064:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2 )
            // InternalDsl.g:2065:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl"
    // InternalDsl.g:2072:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl : ( ':' ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2076:1: ( ( ':' ) )
            // InternalDsl.g:2077:1: ( ':' )
            {
            // InternalDsl.g:2077:1: ( ':' )
            // InternalDsl.g:2078:2: ':'
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__1__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2"
    // InternalDsl.g:2087:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3 ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2091:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3 )
            // InternalDsl.g:2092:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl"
    // InternalDsl.g:2099:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl : ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 ) ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2103:1: ( ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 ) ) )
            // InternalDsl.g:2104:1: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 ) )
            {
            // InternalDsl.g:2104:1: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 ) )
            // InternalDsl.g:2105:2: ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 )
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getNameAssignment_2()); 
            // InternalDsl.g:2106:2: ( rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 )
            // InternalDsl.g:2106:3: rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__2__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3"
    // InternalDsl.g:2114:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4 ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2118:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4 )
            // InternalDsl.g:2119:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl"
    // InternalDsl.g:2126:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl : ( '[[' ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2130:1: ( ( '[[' ) )
            // InternalDsl.g:2131:1: ( '[[' )
            {
            // InternalDsl.g:2131:1: ( '[[' )
            // InternalDsl.g:2132:2: '[['
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__3__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4"
    // InternalDsl.g:2141:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5 ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2145:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5 )
            // InternalDsl.g:2146:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl"
    // InternalDsl.g:2153:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl : ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 ) ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2157:1: ( ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:2158:1: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:2158:1: ( ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 ) )
            // InternalDsl.g:2159:2: ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:2160:2: ( rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 )
            // InternalDsl.g:2160:3: rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__4__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5"
    // InternalDsl.g:2168:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5 : rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2172:1: ( rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl )
            // InternalDsl.g:2173:2: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl"
    // InternalDsl.g:2179:1: rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl : ( ']]' ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2183:1: ( ( ']]' ) )
            // InternalDsl.g:2184:1: ( ']]' )
            {
            // InternalDsl.g:2184:1: ( ']]' )
            // InternalDsl.g:2185:2: ']]'
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__Group__5__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__0"
    // InternalDsl.g:2195:1: rule__PropertyManufacturerPartNumber__Group__0 : rule__PropertyManufacturerPartNumber__Group__0__Impl rule__PropertyManufacturerPartNumber__Group__1 ;
    public final void rule__PropertyManufacturerPartNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2199:1: ( rule__PropertyManufacturerPartNumber__Group__0__Impl rule__PropertyManufacturerPartNumber__Group__1 )
            // InternalDsl.g:2200:2: rule__PropertyManufacturerPartNumber__Group__0__Impl rule__PropertyManufacturerPartNumber__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyManufacturerPartNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__0"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__0__Impl"
    // InternalDsl.g:2207:1: rule__PropertyManufacturerPartNumber__Group__0__Impl : ( 'ManufacturerPartNumber' ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2211:1: ( ( 'ManufacturerPartNumber' ) )
            // InternalDsl.g:2212:1: ( 'ManufacturerPartNumber' )
            {
            // InternalDsl.g:2212:1: ( 'ManufacturerPartNumber' )
            // InternalDsl.g:2213:2: 'ManufacturerPartNumber'
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getManufacturerPartNumberKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getManufacturerPartNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__0__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__1"
    // InternalDsl.g:2222:1: rule__PropertyManufacturerPartNumber__Group__1 : rule__PropertyManufacturerPartNumber__Group__1__Impl rule__PropertyManufacturerPartNumber__Group__2 ;
    public final void rule__PropertyManufacturerPartNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2226:1: ( rule__PropertyManufacturerPartNumber__Group__1__Impl rule__PropertyManufacturerPartNumber__Group__2 )
            // InternalDsl.g:2227:2: rule__PropertyManufacturerPartNumber__Group__1__Impl rule__PropertyManufacturerPartNumber__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyManufacturerPartNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__1"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__1__Impl"
    // InternalDsl.g:2234:1: rule__PropertyManufacturerPartNumber__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2238:1: ( ( ':' ) )
            // InternalDsl.g:2239:1: ( ':' )
            {
            // InternalDsl.g:2239:1: ( ':' )
            // InternalDsl.g:2240:2: ':'
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__1__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__2"
    // InternalDsl.g:2249:1: rule__PropertyManufacturerPartNumber__Group__2 : rule__PropertyManufacturerPartNumber__Group__2__Impl rule__PropertyManufacturerPartNumber__Group__3 ;
    public final void rule__PropertyManufacturerPartNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2253:1: ( rule__PropertyManufacturerPartNumber__Group__2__Impl rule__PropertyManufacturerPartNumber__Group__3 )
            // InternalDsl.g:2254:2: rule__PropertyManufacturerPartNumber__Group__2__Impl rule__PropertyManufacturerPartNumber__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyManufacturerPartNumber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__2"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__2__Impl"
    // InternalDsl.g:2261:1: rule__PropertyManufacturerPartNumber__Group__2__Impl : ( ( rule__PropertyManufacturerPartNumber__NameAssignment_2 ) ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2265:1: ( ( ( rule__PropertyManufacturerPartNumber__NameAssignment_2 ) ) )
            // InternalDsl.g:2266:1: ( ( rule__PropertyManufacturerPartNumber__NameAssignment_2 ) )
            {
            // InternalDsl.g:2266:1: ( ( rule__PropertyManufacturerPartNumber__NameAssignment_2 ) )
            // InternalDsl.g:2267:2: ( rule__PropertyManufacturerPartNumber__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getNameAssignment_2()); 
            // InternalDsl.g:2268:2: ( rule__PropertyManufacturerPartNumber__NameAssignment_2 )
            // InternalDsl.g:2268:3: rule__PropertyManufacturerPartNumber__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__2__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__3"
    // InternalDsl.g:2276:1: rule__PropertyManufacturerPartNumber__Group__3 : rule__PropertyManufacturerPartNumber__Group__3__Impl rule__PropertyManufacturerPartNumber__Group__4 ;
    public final void rule__PropertyManufacturerPartNumber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2280:1: ( rule__PropertyManufacturerPartNumber__Group__3__Impl rule__PropertyManufacturerPartNumber__Group__4 )
            // InternalDsl.g:2281:2: rule__PropertyManufacturerPartNumber__Group__3__Impl rule__PropertyManufacturerPartNumber__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyManufacturerPartNumber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__3"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__3__Impl"
    // InternalDsl.g:2288:1: rule__PropertyManufacturerPartNumber__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2292:1: ( ( '[[' ) )
            // InternalDsl.g:2293:1: ( '[[' )
            {
            // InternalDsl.g:2293:1: ( '[[' )
            // InternalDsl.g:2294:2: '[['
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__3__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__4"
    // InternalDsl.g:2303:1: rule__PropertyManufacturerPartNumber__Group__4 : rule__PropertyManufacturerPartNumber__Group__4__Impl rule__PropertyManufacturerPartNumber__Group__5 ;
    public final void rule__PropertyManufacturerPartNumber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2307:1: ( rule__PropertyManufacturerPartNumber__Group__4__Impl rule__PropertyManufacturerPartNumber__Group__5 )
            // InternalDsl.g:2308:2: rule__PropertyManufacturerPartNumber__Group__4__Impl rule__PropertyManufacturerPartNumber__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyManufacturerPartNumber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__4"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__4__Impl"
    // InternalDsl.g:2315:1: rule__PropertyManufacturerPartNumber__Group__4__Impl : ( ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2319:1: ( ( ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:2320:1: ( ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:2320:1: ( ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 ) )
            // InternalDsl.g:2321:2: ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:2322:2: ( rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 )
            // InternalDsl.g:2322:3: rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__4__Impl"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__5"
    // InternalDsl.g:2330:1: rule__PropertyManufacturerPartNumber__Group__5 : rule__PropertyManufacturerPartNumber__Group__5__Impl ;
    public final void rule__PropertyManufacturerPartNumber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2334:1: ( rule__PropertyManufacturerPartNumber__Group__5__Impl )
            // InternalDsl.g:2335:2: rule__PropertyManufacturerPartNumber__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerPartNumber__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__5"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__Group__5__Impl"
    // InternalDsl.g:2341:1: rule__PropertyManufacturerPartNumber__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyManufacturerPartNumber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2345:1: ( ( ']]' ) )
            // InternalDsl.g:2346:1: ( ']]' )
            {
            // InternalDsl.g:2346:1: ( ']]' )
            // InternalDsl.g:2347:2: ']]'
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__Group__5__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__0"
    // InternalDsl.g:2357:1: rule__PropertyManufacturerOrderCode__Group__0 : rule__PropertyManufacturerOrderCode__Group__0__Impl rule__PropertyManufacturerOrderCode__Group__1 ;
    public final void rule__PropertyManufacturerOrderCode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2361:1: ( rule__PropertyManufacturerOrderCode__Group__0__Impl rule__PropertyManufacturerOrderCode__Group__1 )
            // InternalDsl.g:2362:2: rule__PropertyManufacturerOrderCode__Group__0__Impl rule__PropertyManufacturerOrderCode__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyManufacturerOrderCode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__0"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__0__Impl"
    // InternalDsl.g:2369:1: rule__PropertyManufacturerOrderCode__Group__0__Impl : ( 'ManufacturerOrderCode' ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2373:1: ( ( 'ManufacturerOrderCode' ) )
            // InternalDsl.g:2374:1: ( 'ManufacturerOrderCode' )
            {
            // InternalDsl.g:2374:1: ( 'ManufacturerOrderCode' )
            // InternalDsl.g:2375:2: 'ManufacturerOrderCode'
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getManufacturerOrderCodeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getManufacturerOrderCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__0__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__1"
    // InternalDsl.g:2384:1: rule__PropertyManufacturerOrderCode__Group__1 : rule__PropertyManufacturerOrderCode__Group__1__Impl rule__PropertyManufacturerOrderCode__Group__2 ;
    public final void rule__PropertyManufacturerOrderCode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2388:1: ( rule__PropertyManufacturerOrderCode__Group__1__Impl rule__PropertyManufacturerOrderCode__Group__2 )
            // InternalDsl.g:2389:2: rule__PropertyManufacturerOrderCode__Group__1__Impl rule__PropertyManufacturerOrderCode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyManufacturerOrderCode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__1"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__1__Impl"
    // InternalDsl.g:2396:1: rule__PropertyManufacturerOrderCode__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2400:1: ( ( ':' ) )
            // InternalDsl.g:2401:1: ( ':' )
            {
            // InternalDsl.g:2401:1: ( ':' )
            // InternalDsl.g:2402:2: ':'
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__1__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__2"
    // InternalDsl.g:2411:1: rule__PropertyManufacturerOrderCode__Group__2 : rule__PropertyManufacturerOrderCode__Group__2__Impl rule__PropertyManufacturerOrderCode__Group__3 ;
    public final void rule__PropertyManufacturerOrderCode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2415:1: ( rule__PropertyManufacturerOrderCode__Group__2__Impl rule__PropertyManufacturerOrderCode__Group__3 )
            // InternalDsl.g:2416:2: rule__PropertyManufacturerOrderCode__Group__2__Impl rule__PropertyManufacturerOrderCode__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyManufacturerOrderCode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__2"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__2__Impl"
    // InternalDsl.g:2423:1: rule__PropertyManufacturerOrderCode__Group__2__Impl : ( ( rule__PropertyManufacturerOrderCode__NameAssignment_2 ) ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2427:1: ( ( ( rule__PropertyManufacturerOrderCode__NameAssignment_2 ) ) )
            // InternalDsl.g:2428:1: ( ( rule__PropertyManufacturerOrderCode__NameAssignment_2 ) )
            {
            // InternalDsl.g:2428:1: ( ( rule__PropertyManufacturerOrderCode__NameAssignment_2 ) )
            // InternalDsl.g:2429:2: ( rule__PropertyManufacturerOrderCode__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getNameAssignment_2()); 
            // InternalDsl.g:2430:2: ( rule__PropertyManufacturerOrderCode__NameAssignment_2 )
            // InternalDsl.g:2430:3: rule__PropertyManufacturerOrderCode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__2__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__3"
    // InternalDsl.g:2438:1: rule__PropertyManufacturerOrderCode__Group__3 : rule__PropertyManufacturerOrderCode__Group__3__Impl rule__PropertyManufacturerOrderCode__Group__4 ;
    public final void rule__PropertyManufacturerOrderCode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2442:1: ( rule__PropertyManufacturerOrderCode__Group__3__Impl rule__PropertyManufacturerOrderCode__Group__4 )
            // InternalDsl.g:2443:2: rule__PropertyManufacturerOrderCode__Group__3__Impl rule__PropertyManufacturerOrderCode__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyManufacturerOrderCode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__3"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__3__Impl"
    // InternalDsl.g:2450:1: rule__PropertyManufacturerOrderCode__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2454:1: ( ( '[[' ) )
            // InternalDsl.g:2455:1: ( '[[' )
            {
            // InternalDsl.g:2455:1: ( '[[' )
            // InternalDsl.g:2456:2: '[['
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__3__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__4"
    // InternalDsl.g:2465:1: rule__PropertyManufacturerOrderCode__Group__4 : rule__PropertyManufacturerOrderCode__Group__4__Impl rule__PropertyManufacturerOrderCode__Group__5 ;
    public final void rule__PropertyManufacturerOrderCode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2469:1: ( rule__PropertyManufacturerOrderCode__Group__4__Impl rule__PropertyManufacturerOrderCode__Group__5 )
            // InternalDsl.g:2470:2: rule__PropertyManufacturerOrderCode__Group__4__Impl rule__PropertyManufacturerOrderCode__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyManufacturerOrderCode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__4"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__4__Impl"
    // InternalDsl.g:2477:1: rule__PropertyManufacturerOrderCode__Group__4__Impl : ( ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2481:1: ( ( ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:2482:1: ( ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:2482:1: ( ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 ) )
            // InternalDsl.g:2483:2: ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:2484:2: ( rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 )
            // InternalDsl.g:2484:3: rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__4__Impl"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__5"
    // InternalDsl.g:2492:1: rule__PropertyManufacturerOrderCode__Group__5 : rule__PropertyManufacturerOrderCode__Group__5__Impl ;
    public final void rule__PropertyManufacturerOrderCode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2496:1: ( rule__PropertyManufacturerOrderCode__Group__5__Impl )
            // InternalDsl.g:2497:2: rule__PropertyManufacturerOrderCode__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyManufacturerOrderCode__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__5"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__Group__5__Impl"
    // InternalDsl.g:2503:1: rule__PropertyManufacturerOrderCode__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyManufacturerOrderCode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2507:1: ( ( ']]' ) )
            // InternalDsl.g:2508:1: ( ']]' )
            {
            // InternalDsl.g:2508:1: ( ']]' )
            // InternalDsl.g:2509:2: ']]'
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__Group__5__Impl"


    // $ANTLR start "rule__FileProductImage__Group__0"
    // InternalDsl.g:2519:1: rule__FileProductImage__Group__0 : rule__FileProductImage__Group__0__Impl rule__FileProductImage__Group__1 ;
    public final void rule__FileProductImage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2523:1: ( rule__FileProductImage__Group__0__Impl rule__FileProductImage__Group__1 )
            // InternalDsl.g:2524:2: rule__FileProductImage__Group__0__Impl rule__FileProductImage__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FileProductImage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__0"


    // $ANTLR start "rule__FileProductImage__Group__0__Impl"
    // InternalDsl.g:2531:1: rule__FileProductImage__Group__0__Impl : ( 'ProductImage' ) ;
    public final void rule__FileProductImage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2535:1: ( ( 'ProductImage' ) )
            // InternalDsl.g:2536:1: ( 'ProductImage' )
            {
            // InternalDsl.g:2536:1: ( 'ProductImage' )
            // InternalDsl.g:2537:2: 'ProductImage'
            {
             before(grammarAccess.getFileProductImageAccess().getProductImageKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFileProductImageAccess().getProductImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__0__Impl"


    // $ANTLR start "rule__FileProductImage__Group__1"
    // InternalDsl.g:2546:1: rule__FileProductImage__Group__1 : rule__FileProductImage__Group__1__Impl rule__FileProductImage__Group__2 ;
    public final void rule__FileProductImage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2550:1: ( rule__FileProductImage__Group__1__Impl rule__FileProductImage__Group__2 )
            // InternalDsl.g:2551:2: rule__FileProductImage__Group__1__Impl rule__FileProductImage__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FileProductImage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__1"


    // $ANTLR start "rule__FileProductImage__Group__1__Impl"
    // InternalDsl.g:2558:1: rule__FileProductImage__Group__1__Impl : ( ':' ) ;
    public final void rule__FileProductImage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2562:1: ( ( ':' ) )
            // InternalDsl.g:2563:1: ( ':' )
            {
            // InternalDsl.g:2563:1: ( ':' )
            // InternalDsl.g:2564:2: ':'
            {
             before(grammarAccess.getFileProductImageAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFileProductImageAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__1__Impl"


    // $ANTLR start "rule__FileProductImage__Group__2"
    // InternalDsl.g:2573:1: rule__FileProductImage__Group__2 : rule__FileProductImage__Group__2__Impl rule__FileProductImage__Group__3 ;
    public final void rule__FileProductImage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2577:1: ( rule__FileProductImage__Group__2__Impl rule__FileProductImage__Group__3 )
            // InternalDsl.g:2578:2: rule__FileProductImage__Group__2__Impl rule__FileProductImage__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__FileProductImage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__2"


    // $ANTLR start "rule__FileProductImage__Group__2__Impl"
    // InternalDsl.g:2585:1: rule__FileProductImage__Group__2__Impl : ( ( rule__FileProductImage__NameAssignment_2 ) ) ;
    public final void rule__FileProductImage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2589:1: ( ( ( rule__FileProductImage__NameAssignment_2 ) ) )
            // InternalDsl.g:2590:1: ( ( rule__FileProductImage__NameAssignment_2 ) )
            {
            // InternalDsl.g:2590:1: ( ( rule__FileProductImage__NameAssignment_2 ) )
            // InternalDsl.g:2591:2: ( rule__FileProductImage__NameAssignment_2 )
            {
             before(grammarAccess.getFileProductImageAccess().getNameAssignment_2()); 
            // InternalDsl.g:2592:2: ( rule__FileProductImage__NameAssignment_2 )
            // InternalDsl.g:2592:3: rule__FileProductImage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileProductImage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileProductImageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__2__Impl"


    // $ANTLR start "rule__FileProductImage__Group__3"
    // InternalDsl.g:2600:1: rule__FileProductImage__Group__3 : rule__FileProductImage__Group__3__Impl rule__FileProductImage__Group__4 ;
    public final void rule__FileProductImage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2604:1: ( rule__FileProductImage__Group__3__Impl rule__FileProductImage__Group__4 )
            // InternalDsl.g:2605:2: rule__FileProductImage__Group__3__Impl rule__FileProductImage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FileProductImage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__3"


    // $ANTLR start "rule__FileProductImage__Group__3__Impl"
    // InternalDsl.g:2612:1: rule__FileProductImage__Group__3__Impl : ( '[[' ) ;
    public final void rule__FileProductImage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2616:1: ( ( '[[' ) )
            // InternalDsl.g:2617:1: ( '[[' )
            {
            // InternalDsl.g:2617:1: ( '[[' )
            // InternalDsl.g:2618:2: '[['
            {
             before(grammarAccess.getFileProductImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileProductImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__3__Impl"


    // $ANTLR start "rule__FileProductImage__Group__4"
    // InternalDsl.g:2627:1: rule__FileProductImage__Group__4 : rule__FileProductImage__Group__4__Impl rule__FileProductImage__Group__5 ;
    public final void rule__FileProductImage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2631:1: ( rule__FileProductImage__Group__4__Impl rule__FileProductImage__Group__5 )
            // InternalDsl.g:2632:2: rule__FileProductImage__Group__4__Impl rule__FileProductImage__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FileProductImage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__4"


    // $ANTLR start "rule__FileProductImage__Group__4__Impl"
    // InternalDsl.g:2639:1: rule__FileProductImage__Group__4__Impl : ( ( rule__FileProductImage__SemanticIdAssignment_4 ) ) ;
    public final void rule__FileProductImage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2643:1: ( ( ( rule__FileProductImage__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:2644:1: ( ( rule__FileProductImage__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:2644:1: ( ( rule__FileProductImage__SemanticIdAssignment_4 ) )
            // InternalDsl.g:2645:2: ( rule__FileProductImage__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getFileProductImageAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:2646:2: ( rule__FileProductImage__SemanticIdAssignment_4 )
            // InternalDsl.g:2646:3: rule__FileProductImage__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FileProductImage__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFileProductImageAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__4__Impl"


    // $ANTLR start "rule__FileProductImage__Group__5"
    // InternalDsl.g:2654:1: rule__FileProductImage__Group__5 : rule__FileProductImage__Group__5__Impl ;
    public final void rule__FileProductImage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2658:1: ( rule__FileProductImage__Group__5__Impl )
            // InternalDsl.g:2659:2: rule__FileProductImage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileProductImage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__5"


    // $ANTLR start "rule__FileProductImage__Group__5__Impl"
    // InternalDsl.g:2665:1: rule__FileProductImage__Group__5__Impl : ( ']]' ) ;
    public final void rule__FileProductImage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2669:1: ( ( ']]' ) )
            // InternalDsl.g:2670:1: ( ']]' )
            {
            // InternalDsl.g:2670:1: ( ']]' )
            // InternalDsl.g:2671:2: ']]'
            {
             before(grammarAccess.getFileProductImageAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileProductImageAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__0"
    // InternalDsl.g:2681:1: rule__SubmodelElementCollectionProductClassifications__Group__0 : rule__SubmodelElementCollectionProductClassifications__Group__0__Impl rule__SubmodelElementCollectionProductClassifications__Group__1 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2685:1: ( rule__SubmodelElementCollectionProductClassifications__Group__0__Impl rule__SubmodelElementCollectionProductClassifications__Group__1 )
            // InternalDsl.g:2686:2: rule__SubmodelElementCollectionProductClassifications__Group__0__Impl rule__SubmodelElementCollectionProductClassifications__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionProductClassifications__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__0__Impl"
    // InternalDsl.g:2693:1: rule__SubmodelElementCollectionProductClassifications__Group__0__Impl : ( 'ProductClassifications' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2697:1: ( ( 'ProductClassifications' ) )
            // InternalDsl.g:2698:1: ( 'ProductClassifications' )
            {
            // InternalDsl.g:2698:1: ( 'ProductClassifications' )
            // InternalDsl.g:2699:2: 'ProductClassifications'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationsKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__1"
    // InternalDsl.g:2708:1: rule__SubmodelElementCollectionProductClassifications__Group__1 : rule__SubmodelElementCollectionProductClassifications__Group__1__Impl rule__SubmodelElementCollectionProductClassifications__Group__2 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2712:1: ( rule__SubmodelElementCollectionProductClassifications__Group__1__Impl rule__SubmodelElementCollectionProductClassifications__Group__2 )
            // InternalDsl.g:2713:2: rule__SubmodelElementCollectionProductClassifications__Group__1__Impl rule__SubmodelElementCollectionProductClassifications__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionProductClassifications__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__1__Impl"
    // InternalDsl.g:2720:1: rule__SubmodelElementCollectionProductClassifications__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2724:1: ( ( ':' ) )
            // InternalDsl.g:2725:1: ( ':' )
            {
            // InternalDsl.g:2725:1: ( ':' )
            // InternalDsl.g:2726:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__2"
    // InternalDsl.g:2735:1: rule__SubmodelElementCollectionProductClassifications__Group__2 : rule__SubmodelElementCollectionProductClassifications__Group__2__Impl rule__SubmodelElementCollectionProductClassifications__Group__3 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2739:1: ( rule__SubmodelElementCollectionProductClassifications__Group__2__Impl rule__SubmodelElementCollectionProductClassifications__Group__3 )
            // InternalDsl.g:2740:2: rule__SubmodelElementCollectionProductClassifications__Group__2__Impl rule__SubmodelElementCollectionProductClassifications__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionProductClassifications__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__2__Impl"
    // InternalDsl.g:2747:1: rule__SubmodelElementCollectionProductClassifications__Group__2__Impl : ( ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2751:1: ( ( ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 ) ) )
            // InternalDsl.g:2752:1: ( ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 ) )
            {
            // InternalDsl.g:2752:1: ( ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 ) )
            // InternalDsl.g:2753:2: ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getNameAssignment_2()); 
            // InternalDsl.g:2754:2: ( rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 )
            // InternalDsl.g:2754:3: rule__SubmodelElementCollectionProductClassifications__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__3"
    // InternalDsl.g:2762:1: rule__SubmodelElementCollectionProductClassifications__Group__3 : rule__SubmodelElementCollectionProductClassifications__Group__3__Impl rule__SubmodelElementCollectionProductClassifications__Group__4 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2766:1: ( rule__SubmodelElementCollectionProductClassifications__Group__3__Impl rule__SubmodelElementCollectionProductClassifications__Group__4 )
            // InternalDsl.g:2767:2: rule__SubmodelElementCollectionProductClassifications__Group__3__Impl rule__SubmodelElementCollectionProductClassifications__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionProductClassifications__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__3__Impl"
    // InternalDsl.g:2774:1: rule__SubmodelElementCollectionProductClassifications__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2778:1: ( ( '[[' ) )
            // InternalDsl.g:2779:1: ( '[[' )
            {
            // InternalDsl.g:2779:1: ( '[[' )
            // InternalDsl.g:2780:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__4"
    // InternalDsl.g:2789:1: rule__SubmodelElementCollectionProductClassifications__Group__4 : rule__SubmodelElementCollectionProductClassifications__Group__4__Impl rule__SubmodelElementCollectionProductClassifications__Group__5 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2793:1: ( rule__SubmodelElementCollectionProductClassifications__Group__4__Impl rule__SubmodelElementCollectionProductClassifications__Group__5 )
            // InternalDsl.g:2794:2: rule__SubmodelElementCollectionProductClassifications__Group__4__Impl rule__SubmodelElementCollectionProductClassifications__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionProductClassifications__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__4__Impl"
    // InternalDsl.g:2801:1: rule__SubmodelElementCollectionProductClassifications__Group__4__Impl : ( ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2805:1: ( ( ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:2806:1: ( ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:2806:1: ( ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 ) )
            // InternalDsl.g:2807:2: ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:2808:2: ( rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 )
            // InternalDsl.g:2808:3: rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__5"
    // InternalDsl.g:2816:1: rule__SubmodelElementCollectionProductClassifications__Group__5 : rule__SubmodelElementCollectionProductClassifications__Group__5__Impl rule__SubmodelElementCollectionProductClassifications__Group__6 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2820:1: ( rule__SubmodelElementCollectionProductClassifications__Group__5__Impl rule__SubmodelElementCollectionProductClassifications__Group__6 )
            // InternalDsl.g:2821:2: rule__SubmodelElementCollectionProductClassifications__Group__5__Impl rule__SubmodelElementCollectionProductClassifications__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionProductClassifications__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__5__Impl"
    // InternalDsl.g:2828:1: rule__SubmodelElementCollectionProductClassifications__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2832:1: ( ( ']]' ) )
            // InternalDsl.g:2833:1: ( ']]' )
            {
            // InternalDsl.g:2833:1: ( ']]' )
            // InternalDsl.g:2834:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__6"
    // InternalDsl.g:2843:1: rule__SubmodelElementCollectionProductClassifications__Group__6 : rule__SubmodelElementCollectionProductClassifications__Group__6__Impl rule__SubmodelElementCollectionProductClassifications__Group__7 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2847:1: ( rule__SubmodelElementCollectionProductClassifications__Group__6__Impl rule__SubmodelElementCollectionProductClassifications__Group__7 )
            // InternalDsl.g:2848:2: rule__SubmodelElementCollectionProductClassifications__Group__6__Impl rule__SubmodelElementCollectionProductClassifications__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__SubmodelElementCollectionProductClassifications__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__6__Impl"
    // InternalDsl.g:2855:1: rule__SubmodelElementCollectionProductClassifications__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2859:1: ( ( '{' ) )
            // InternalDsl.g:2860:1: ( '{' )
            {
            // InternalDsl.g:2860:1: ( '{' )
            // InternalDsl.g:2861:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__7"
    // InternalDsl.g:2870:1: rule__SubmodelElementCollectionProductClassifications__Group__7 : rule__SubmodelElementCollectionProductClassifications__Group__7__Impl rule__SubmodelElementCollectionProductClassifications__Group__8 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2874:1: ( rule__SubmodelElementCollectionProductClassifications__Group__7__Impl rule__SubmodelElementCollectionProductClassifications__Group__8 )
            // InternalDsl.g:2875:2: rule__SubmodelElementCollectionProductClassifications__Group__7__Impl rule__SubmodelElementCollectionProductClassifications__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__SubmodelElementCollectionProductClassifications__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__7__Impl"
    // InternalDsl.g:2882:1: rule__SubmodelElementCollectionProductClassifications__Group__7__Impl : ( ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )* ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2886:1: ( ( ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )* ) )
            // InternalDsl.g:2887:1: ( ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )* )
            {
            // InternalDsl.g:2887:1: ( ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )* )
            // InternalDsl.g:2888:2: ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getGroup_7()); 
            // InternalDsl.g:2889:2: ( rule__SubmodelElementCollectionProductClassifications__Group_7__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:2889:3: rule__SubmodelElementCollectionProductClassifications__Group_7__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SubmodelElementCollectionProductClassifications__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__8"
    // InternalDsl.g:2897:1: rule__SubmodelElementCollectionProductClassifications__Group__8 : rule__SubmodelElementCollectionProductClassifications__Group__8__Impl ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2901:1: ( rule__SubmodelElementCollectionProductClassifications__Group__8__Impl )
            // InternalDsl.g:2902:2: rule__SubmodelElementCollectionProductClassifications__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group__8__Impl"
    // InternalDsl.g:2908:1: rule__SubmodelElementCollectionProductClassifications__Group__8__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2912:1: ( ( '}' ) )
            // InternalDsl.g:2913:1: ( '}' )
            {
            // InternalDsl.g:2913:1: ( '}' )
            // InternalDsl.g:2914:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group_7__0"
    // InternalDsl.g:2924:1: rule__SubmodelElementCollectionProductClassifications__Group_7__0 : rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl rule__SubmodelElementCollectionProductClassifications__Group_7__1 ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2928:1: ( rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl rule__SubmodelElementCollectionProductClassifications__Group_7__1 )
            // InternalDsl.g:2929:2: rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl rule__SubmodelElementCollectionProductClassifications__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group_7__0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl"
    // InternalDsl.g:2936:1: rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl : ( ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2940:1: ( ( ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 ) ) )
            // InternalDsl.g:2941:1: ( ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 ) )
            {
            // InternalDsl.g:2941:1: ( ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 ) )
            // InternalDsl.g:2942:2: ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationItemAssignment_7_0()); 
            // InternalDsl.g:2943:2: ( rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 )
            // InternalDsl.g:2943:3: rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationItemAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group_7__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group_7__1"
    // InternalDsl.g:2951:1: rule__SubmodelElementCollectionProductClassifications__Group_7__1 : rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2955:1: ( rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl )
            // InternalDsl.g:2956:2: rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group_7__1"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl"
    // InternalDsl.g:2962:1: rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2966:1: ( ( ';' ) )
            // InternalDsl.g:2967:1: ( ';' )
            {
            // InternalDsl.g:2967:1: ( ';' )
            // InternalDsl.g:2968:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemicolonKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__Group_7__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__0"
    // InternalDsl.g:2978:1: rule__SubmodelElementCollectionProductClassificationItem__Group__0 : rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__1 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2982:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__1 )
            // InternalDsl.g:2983:2: rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl"
    // InternalDsl.g:2990:1: rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl : ( 'ProductClassificationItem' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2994:1: ( ( 'ProductClassificationItem' ) )
            // InternalDsl.g:2995:1: ( 'ProductClassificationItem' )
            {
            // InternalDsl.g:2995:1: ( 'ProductClassificationItem' )
            // InternalDsl.g:2996:2: 'ProductClassificationItem'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationItemKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__1"
    // InternalDsl.g:3005:1: rule__SubmodelElementCollectionProductClassificationItem__Group__1 : rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__2 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3009:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__2 )
            // InternalDsl.g:3010:2: rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl"
    // InternalDsl.g:3017:1: rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3021:1: ( ( ':' ) )
            // InternalDsl.g:3022:1: ( ':' )
            {
            // InternalDsl.g:3022:1: ( ':' )
            // InternalDsl.g:3023:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__2"
    // InternalDsl.g:3032:1: rule__SubmodelElementCollectionProductClassificationItem__Group__2 : rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__3 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3036:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__3 )
            // InternalDsl.g:3037:2: rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl"
    // InternalDsl.g:3044:1: rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3048:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 ) ) )
            // InternalDsl.g:3049:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 ) )
            {
            // InternalDsl.g:3049:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 ) )
            // InternalDsl.g:3050:2: ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getNameAssignment_2()); 
            // InternalDsl.g:3051:2: ( rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 )
            // InternalDsl.g:3051:3: rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__3"
    // InternalDsl.g:3059:1: rule__SubmodelElementCollectionProductClassificationItem__Group__3 : rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__4 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3063:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__4 )
            // InternalDsl.g:3064:2: rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl"
    // InternalDsl.g:3071:1: rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3075:1: ( ( '[[' ) )
            // InternalDsl.g:3076:1: ( '[[' )
            {
            // InternalDsl.g:3076:1: ( '[[' )
            // InternalDsl.g:3077:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__4"
    // InternalDsl.g:3086:1: rule__SubmodelElementCollectionProductClassificationItem__Group__4 : rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__5 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3090:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__5 )
            // InternalDsl.g:3091:2: rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl"
    // InternalDsl.g:3098:1: rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3102:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:3103:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:3103:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 ) )
            // InternalDsl.g:3104:2: ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:3105:2: ( rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 )
            // InternalDsl.g:3105:3: rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__5"
    // InternalDsl.g:3113:1: rule__SubmodelElementCollectionProductClassificationItem__Group__5 : rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__6 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3117:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__6 )
            // InternalDsl.g:3118:2: rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl"
    // InternalDsl.g:3125:1: rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3129:1: ( ( ']]' ) )
            // InternalDsl.g:3130:1: ( ']]' )
            {
            // InternalDsl.g:3130:1: ( ']]' )
            // InternalDsl.g:3131:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__6"
    // InternalDsl.g:3140:1: rule__SubmodelElementCollectionProductClassificationItem__Group__6 : rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__7 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3144:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__7 )
            // InternalDsl.g:3145:2: rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl"
    // InternalDsl.g:3152:1: rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3156:1: ( ( '{' ) )
            // InternalDsl.g:3157:1: ( '{' )
            {
            // InternalDsl.g:3157:1: ( '{' )
            // InternalDsl.g:3158:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__7"
    // InternalDsl.g:3167:1: rule__SubmodelElementCollectionProductClassificationItem__Group__7 : rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__8 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3171:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__8 )
            // InternalDsl.g:3172:2: rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl"
    // InternalDsl.g:3179:1: rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3183:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 ) ) )
            // InternalDsl.g:3184:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 ) )
            {
            // InternalDsl.g:3184:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 ) )
            // InternalDsl.g:3185:2: ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationSystemAssignment_7()); 
            // InternalDsl.g:3186:2: ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 )
            // InternalDsl.g:3186:3: rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationSystemAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__8"
    // InternalDsl.g:3194:1: rule__SubmodelElementCollectionProductClassificationItem__Group__8 : rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__9 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3198:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__9 )
            // InternalDsl.g:3199:2: rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl"
    // InternalDsl.g:3206:1: rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3210:1: ( ( ';' ) )
            // InternalDsl.g:3211:1: ( ';' )
            {
            // InternalDsl.g:3211:1: ( ';' )
            // InternalDsl.g:3212:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__9"
    // InternalDsl.g:3221:1: rule__SubmodelElementCollectionProductClassificationItem__Group__9 : rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__10 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3225:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__10 )
            // InternalDsl.g:3226:2: rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl"
    // InternalDsl.g:3233:1: rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )? ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3237:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )? ) )
            // InternalDsl.g:3238:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )? )
            {
            // InternalDsl.g:3238:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )? )
            // InternalDsl.g:3239:2: ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )?
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getGroup_9()); 
            // InternalDsl.g:3240:2: ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:3240:3: rule__SubmodelElementCollectionProductClassificationItem__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubmodelElementCollectionProductClassificationItem__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__10"
    // InternalDsl.g:3248:1: rule__SubmodelElementCollectionProductClassificationItem__Group__10 : rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__11 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3252:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__11 )
            // InternalDsl.g:3253:2: rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__10"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl"
    // InternalDsl.g:3260:1: rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3264:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 ) ) )
            // InternalDsl.g:3265:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 ) )
            {
            // InternalDsl.g:3265:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 ) )
            // InternalDsl.g:3266:2: ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassIdAssignment_10()); 
            // InternalDsl.g:3267:2: ( rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 )
            // InternalDsl.g:3267:3: rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassIdAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__10__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__11"
    // InternalDsl.g:3275:1: rule__SubmodelElementCollectionProductClassificationItem__Group__11 : rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__12 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3279:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__12 )
            // InternalDsl.g:3280:2: rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl rule__SubmodelElementCollectionProductClassificationItem__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__11"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl"
    // InternalDsl.g:3287:1: rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3291:1: ( ( ';' ) )
            // InternalDsl.g:3292:1: ( ';' )
            {
            // InternalDsl.g:3292:1: ( ';' )
            // InternalDsl.g:3293:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__11__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__12"
    // InternalDsl.g:3302:1: rule__SubmodelElementCollectionProductClassificationItem__Group__12 : rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3306:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl )
            // InternalDsl.g:3307:2: rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__12"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl"
    // InternalDsl.g:3313:1: rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3317:1: ( ( '}' ) )
            // InternalDsl.g:3318:1: ( '}' )
            {
            // InternalDsl.g:3318:1: ( '}' )
            // InternalDsl.g:3319:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group__12__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group_9__0"
    // InternalDsl.g:3329:1: rule__SubmodelElementCollectionProductClassificationItem__Group_9__0 : rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group_9__1 ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3333:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group_9__1 )
            // InternalDsl.g:3334:2: rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl rule__SubmodelElementCollectionProductClassificationItem__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group_9__0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl"
    // InternalDsl.g:3341:1: rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl : ( ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 ) ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3345:1: ( ( ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 ) ) )
            // InternalDsl.g:3346:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 ) )
            {
            // InternalDsl.g:3346:1: ( ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 ) )
            // InternalDsl.g:3347:2: ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getClassificationSystemVersionAssignment_9_0()); 
            // InternalDsl.g:3348:2: ( rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 )
            // InternalDsl.g:3348:3: rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getClassificationSystemVersionAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group_9__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group_9__1"
    // InternalDsl.g:3356:1: rule__SubmodelElementCollectionProductClassificationItem__Group_9__1 : rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3360:1: ( rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl )
            // InternalDsl.g:3361:2: rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group_9__1"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl"
    // InternalDsl.g:3367:1: rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3371:1: ( ( ';' ) )
            // InternalDsl.g:3372:1: ( ';' )
            {
            // InternalDsl.g:3372:1: ( ';' )
            // InternalDsl.g:3373:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemicolonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__Group_9__1__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__0"
    // InternalDsl.g:3383:1: rule__PropertyProductClassificationSystem__Group__0 : rule__PropertyProductClassificationSystem__Group__0__Impl rule__PropertyProductClassificationSystem__Group__1 ;
    public final void rule__PropertyProductClassificationSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3387:1: ( rule__PropertyProductClassificationSystem__Group__0__Impl rule__PropertyProductClassificationSystem__Group__1 )
            // InternalDsl.g:3388:2: rule__PropertyProductClassificationSystem__Group__0__Impl rule__PropertyProductClassificationSystem__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyProductClassificationSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__0"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__0__Impl"
    // InternalDsl.g:3395:1: rule__PropertyProductClassificationSystem__Group__0__Impl : ( 'ProductClassificationSystem' ) ;
    public final void rule__PropertyProductClassificationSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3399:1: ( ( 'ProductClassificationSystem' ) )
            // InternalDsl.g:3400:1: ( 'ProductClassificationSystem' )
            {
            // InternalDsl.g:3400:1: ( 'ProductClassificationSystem' )
            // InternalDsl.g:3401:2: 'ProductClassificationSystem'
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getProductClassificationSystemKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassificationSystemAccess().getProductClassificationSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__0__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__1"
    // InternalDsl.g:3410:1: rule__PropertyProductClassificationSystem__Group__1 : rule__PropertyProductClassificationSystem__Group__1__Impl rule__PropertyProductClassificationSystem__Group__2 ;
    public final void rule__PropertyProductClassificationSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3414:1: ( rule__PropertyProductClassificationSystem__Group__1__Impl rule__PropertyProductClassificationSystem__Group__2 )
            // InternalDsl.g:3415:2: rule__PropertyProductClassificationSystem__Group__1__Impl rule__PropertyProductClassificationSystem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyProductClassificationSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__1"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__1__Impl"
    // InternalDsl.g:3422:1: rule__PropertyProductClassificationSystem__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyProductClassificationSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3426:1: ( ( ':' ) )
            // InternalDsl.g:3427:1: ( ':' )
            {
            // InternalDsl.g:3427:1: ( ':' )
            // InternalDsl.g:3428:2: ':'
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassificationSystemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__1__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__2"
    // InternalDsl.g:3437:1: rule__PropertyProductClassificationSystem__Group__2 : rule__PropertyProductClassificationSystem__Group__2__Impl rule__PropertyProductClassificationSystem__Group__3 ;
    public final void rule__PropertyProductClassificationSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3441:1: ( rule__PropertyProductClassificationSystem__Group__2__Impl rule__PropertyProductClassificationSystem__Group__3 )
            // InternalDsl.g:3442:2: rule__PropertyProductClassificationSystem__Group__2__Impl rule__PropertyProductClassificationSystem__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyProductClassificationSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__2"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__2__Impl"
    // InternalDsl.g:3449:1: rule__PropertyProductClassificationSystem__Group__2__Impl : ( ( rule__PropertyProductClassificationSystem__NameAssignment_2 ) ) ;
    public final void rule__PropertyProductClassificationSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3453:1: ( ( ( rule__PropertyProductClassificationSystem__NameAssignment_2 ) ) )
            // InternalDsl.g:3454:1: ( ( rule__PropertyProductClassificationSystem__NameAssignment_2 ) )
            {
            // InternalDsl.g:3454:1: ( ( rule__PropertyProductClassificationSystem__NameAssignment_2 ) )
            // InternalDsl.g:3455:2: ( rule__PropertyProductClassificationSystem__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getNameAssignment_2()); 
            // InternalDsl.g:3456:2: ( rule__PropertyProductClassificationSystem__NameAssignment_2 )
            // InternalDsl.g:3456:3: rule__PropertyProductClassificationSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassificationSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__2__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__3"
    // InternalDsl.g:3464:1: rule__PropertyProductClassificationSystem__Group__3 : rule__PropertyProductClassificationSystem__Group__3__Impl rule__PropertyProductClassificationSystem__Group__4 ;
    public final void rule__PropertyProductClassificationSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3468:1: ( rule__PropertyProductClassificationSystem__Group__3__Impl rule__PropertyProductClassificationSystem__Group__4 )
            // InternalDsl.g:3469:2: rule__PropertyProductClassificationSystem__Group__3__Impl rule__PropertyProductClassificationSystem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyProductClassificationSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__3"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__3__Impl"
    // InternalDsl.g:3476:1: rule__PropertyProductClassificationSystem__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyProductClassificationSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3480:1: ( ( '[[' ) )
            // InternalDsl.g:3481:1: ( '[[' )
            {
            // InternalDsl.g:3481:1: ( '[[' )
            // InternalDsl.g:3482:2: '[['
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassificationSystemAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__3__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__4"
    // InternalDsl.g:3491:1: rule__PropertyProductClassificationSystem__Group__4 : rule__PropertyProductClassificationSystem__Group__4__Impl rule__PropertyProductClassificationSystem__Group__5 ;
    public final void rule__PropertyProductClassificationSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3495:1: ( rule__PropertyProductClassificationSystem__Group__4__Impl rule__PropertyProductClassificationSystem__Group__5 )
            // InternalDsl.g:3496:2: rule__PropertyProductClassificationSystem__Group__4__Impl rule__PropertyProductClassificationSystem__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyProductClassificationSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__4"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__4__Impl"
    // InternalDsl.g:3503:1: rule__PropertyProductClassificationSystem__Group__4__Impl : ( ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyProductClassificationSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3507:1: ( ( ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:3508:1: ( ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:3508:1: ( ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 ) )
            // InternalDsl.g:3509:2: ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:3510:2: ( rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 )
            // InternalDsl.g:3510:3: rule__PropertyProductClassificationSystem__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassificationSystemAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__4__Impl"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__5"
    // InternalDsl.g:3518:1: rule__PropertyProductClassificationSystem__Group__5 : rule__PropertyProductClassificationSystem__Group__5__Impl ;
    public final void rule__PropertyProductClassificationSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3522:1: ( rule__PropertyProductClassificationSystem__Group__5__Impl )
            // InternalDsl.g:3523:2: rule__PropertyProductClassificationSystem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassificationSystem__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__5"


    // $ANTLR start "rule__PropertyProductClassificationSystem__Group__5__Impl"
    // InternalDsl.g:3529:1: rule__PropertyProductClassificationSystem__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyProductClassificationSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3533:1: ( ( ']]' ) )
            // InternalDsl.g:3534:1: ( ']]' )
            {
            // InternalDsl.g:3534:1: ( ']]' )
            // InternalDsl.g:3535:2: ']]'
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassificationSystemAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__Group__5__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__0"
    // InternalDsl.g:3545:1: rule__PropertyClassificationSystemVersion__Group__0 : rule__PropertyClassificationSystemVersion__Group__0__Impl rule__PropertyClassificationSystemVersion__Group__1 ;
    public final void rule__PropertyClassificationSystemVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3549:1: ( rule__PropertyClassificationSystemVersion__Group__0__Impl rule__PropertyClassificationSystemVersion__Group__1 )
            // InternalDsl.g:3550:2: rule__PropertyClassificationSystemVersion__Group__0__Impl rule__PropertyClassificationSystemVersion__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyClassificationSystemVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__0"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__0__Impl"
    // InternalDsl.g:3557:1: rule__PropertyClassificationSystemVersion__Group__0__Impl : ( 'ClassificationSystemVersion' ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3561:1: ( ( 'ClassificationSystemVersion' ) )
            // InternalDsl.g:3562:1: ( 'ClassificationSystemVersion' )
            {
            // InternalDsl.g:3562:1: ( 'ClassificationSystemVersion' )
            // InternalDsl.g:3563:2: 'ClassificationSystemVersion'
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getClassificationSystemVersionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getClassificationSystemVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__0__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__1"
    // InternalDsl.g:3572:1: rule__PropertyClassificationSystemVersion__Group__1 : rule__PropertyClassificationSystemVersion__Group__1__Impl rule__PropertyClassificationSystemVersion__Group__2 ;
    public final void rule__PropertyClassificationSystemVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3576:1: ( rule__PropertyClassificationSystemVersion__Group__1__Impl rule__PropertyClassificationSystemVersion__Group__2 )
            // InternalDsl.g:3577:2: rule__PropertyClassificationSystemVersion__Group__1__Impl rule__PropertyClassificationSystemVersion__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyClassificationSystemVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__1"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__1__Impl"
    // InternalDsl.g:3584:1: rule__PropertyClassificationSystemVersion__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3588:1: ( ( ':' ) )
            // InternalDsl.g:3589:1: ( ':' )
            {
            // InternalDsl.g:3589:1: ( ':' )
            // InternalDsl.g:3590:2: ':'
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__1__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__2"
    // InternalDsl.g:3599:1: rule__PropertyClassificationSystemVersion__Group__2 : rule__PropertyClassificationSystemVersion__Group__2__Impl rule__PropertyClassificationSystemVersion__Group__3 ;
    public final void rule__PropertyClassificationSystemVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3603:1: ( rule__PropertyClassificationSystemVersion__Group__2__Impl rule__PropertyClassificationSystemVersion__Group__3 )
            // InternalDsl.g:3604:2: rule__PropertyClassificationSystemVersion__Group__2__Impl rule__PropertyClassificationSystemVersion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyClassificationSystemVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__2"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__2__Impl"
    // InternalDsl.g:3611:1: rule__PropertyClassificationSystemVersion__Group__2__Impl : ( ( rule__PropertyClassificationSystemVersion__NameAssignment_2 ) ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3615:1: ( ( ( rule__PropertyClassificationSystemVersion__NameAssignment_2 ) ) )
            // InternalDsl.g:3616:1: ( ( rule__PropertyClassificationSystemVersion__NameAssignment_2 ) )
            {
            // InternalDsl.g:3616:1: ( ( rule__PropertyClassificationSystemVersion__NameAssignment_2 ) )
            // InternalDsl.g:3617:2: ( rule__PropertyClassificationSystemVersion__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getNameAssignment_2()); 
            // InternalDsl.g:3618:2: ( rule__PropertyClassificationSystemVersion__NameAssignment_2 )
            // InternalDsl.g:3618:3: rule__PropertyClassificationSystemVersion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__2__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__3"
    // InternalDsl.g:3626:1: rule__PropertyClassificationSystemVersion__Group__3 : rule__PropertyClassificationSystemVersion__Group__3__Impl rule__PropertyClassificationSystemVersion__Group__4 ;
    public final void rule__PropertyClassificationSystemVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3630:1: ( rule__PropertyClassificationSystemVersion__Group__3__Impl rule__PropertyClassificationSystemVersion__Group__4 )
            // InternalDsl.g:3631:2: rule__PropertyClassificationSystemVersion__Group__3__Impl rule__PropertyClassificationSystemVersion__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyClassificationSystemVersion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__3"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__3__Impl"
    // InternalDsl.g:3638:1: rule__PropertyClassificationSystemVersion__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3642:1: ( ( '[[' ) )
            // InternalDsl.g:3643:1: ( '[[' )
            {
            // InternalDsl.g:3643:1: ( '[[' )
            // InternalDsl.g:3644:2: '[['
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__3__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__4"
    // InternalDsl.g:3653:1: rule__PropertyClassificationSystemVersion__Group__4 : rule__PropertyClassificationSystemVersion__Group__4__Impl rule__PropertyClassificationSystemVersion__Group__5 ;
    public final void rule__PropertyClassificationSystemVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3657:1: ( rule__PropertyClassificationSystemVersion__Group__4__Impl rule__PropertyClassificationSystemVersion__Group__5 )
            // InternalDsl.g:3658:2: rule__PropertyClassificationSystemVersion__Group__4__Impl rule__PropertyClassificationSystemVersion__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyClassificationSystemVersion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__4"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__4__Impl"
    // InternalDsl.g:3665:1: rule__PropertyClassificationSystemVersion__Group__4__Impl : ( ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3669:1: ( ( ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:3670:1: ( ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:3670:1: ( ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 ) )
            // InternalDsl.g:3671:2: ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:3672:2: ( rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 )
            // InternalDsl.g:3672:3: rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__4__Impl"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__5"
    // InternalDsl.g:3680:1: rule__PropertyClassificationSystemVersion__Group__5 : rule__PropertyClassificationSystemVersion__Group__5__Impl ;
    public final void rule__PropertyClassificationSystemVersion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3684:1: ( rule__PropertyClassificationSystemVersion__Group__5__Impl )
            // InternalDsl.g:3685:2: rule__PropertyClassificationSystemVersion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassificationSystemVersion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__5"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__Group__5__Impl"
    // InternalDsl.g:3691:1: rule__PropertyClassificationSystemVersion__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyClassificationSystemVersion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3695:1: ( ( ']]' ) )
            // InternalDsl.g:3696:1: ( ']]' )
            {
            // InternalDsl.g:3696:1: ( ']]' )
            // InternalDsl.g:3697:2: ']]'
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__Group__5__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__0"
    // InternalDsl.g:3707:1: rule__PropertyProductClassId__Group__0 : rule__PropertyProductClassId__Group__0__Impl rule__PropertyProductClassId__Group__1 ;
    public final void rule__PropertyProductClassId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3711:1: ( rule__PropertyProductClassId__Group__0__Impl rule__PropertyProductClassId__Group__1 )
            // InternalDsl.g:3712:2: rule__PropertyProductClassId__Group__0__Impl rule__PropertyProductClassId__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyProductClassId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__0"


    // $ANTLR start "rule__PropertyProductClassId__Group__0__Impl"
    // InternalDsl.g:3719:1: rule__PropertyProductClassId__Group__0__Impl : ( 'ProductClassId' ) ;
    public final void rule__PropertyProductClassId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3723:1: ( ( 'ProductClassId' ) )
            // InternalDsl.g:3724:1: ( 'ProductClassId' )
            {
            // InternalDsl.g:3724:1: ( 'ProductClassId' )
            // InternalDsl.g:3725:2: 'ProductClassId'
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getProductClassIdKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassIdAccess().getProductClassIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__0__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__1"
    // InternalDsl.g:3734:1: rule__PropertyProductClassId__Group__1 : rule__PropertyProductClassId__Group__1__Impl rule__PropertyProductClassId__Group__2 ;
    public final void rule__PropertyProductClassId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3738:1: ( rule__PropertyProductClassId__Group__1__Impl rule__PropertyProductClassId__Group__2 )
            // InternalDsl.g:3739:2: rule__PropertyProductClassId__Group__1__Impl rule__PropertyProductClassId__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyProductClassId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__1"


    // $ANTLR start "rule__PropertyProductClassId__Group__1__Impl"
    // InternalDsl.g:3746:1: rule__PropertyProductClassId__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyProductClassId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3750:1: ( ( ':' ) )
            // InternalDsl.g:3751:1: ( ':' )
            {
            // InternalDsl.g:3751:1: ( ':' )
            // InternalDsl.g:3752:2: ':'
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassIdAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__1__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__2"
    // InternalDsl.g:3761:1: rule__PropertyProductClassId__Group__2 : rule__PropertyProductClassId__Group__2__Impl rule__PropertyProductClassId__Group__3 ;
    public final void rule__PropertyProductClassId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3765:1: ( rule__PropertyProductClassId__Group__2__Impl rule__PropertyProductClassId__Group__3 )
            // InternalDsl.g:3766:2: rule__PropertyProductClassId__Group__2__Impl rule__PropertyProductClassId__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyProductClassId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__2"


    // $ANTLR start "rule__PropertyProductClassId__Group__2__Impl"
    // InternalDsl.g:3773:1: rule__PropertyProductClassId__Group__2__Impl : ( ( rule__PropertyProductClassId__NameAssignment_2 ) ) ;
    public final void rule__PropertyProductClassId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3777:1: ( ( ( rule__PropertyProductClassId__NameAssignment_2 ) ) )
            // InternalDsl.g:3778:1: ( ( rule__PropertyProductClassId__NameAssignment_2 ) )
            {
            // InternalDsl.g:3778:1: ( ( rule__PropertyProductClassId__NameAssignment_2 ) )
            // InternalDsl.g:3779:2: ( rule__PropertyProductClassId__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getNameAssignment_2()); 
            // InternalDsl.g:3780:2: ( rule__PropertyProductClassId__NameAssignment_2 )
            // InternalDsl.g:3780:3: rule__PropertyProductClassId__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassIdAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__2__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__3"
    // InternalDsl.g:3788:1: rule__PropertyProductClassId__Group__3 : rule__PropertyProductClassId__Group__3__Impl rule__PropertyProductClassId__Group__4 ;
    public final void rule__PropertyProductClassId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3792:1: ( rule__PropertyProductClassId__Group__3__Impl rule__PropertyProductClassId__Group__4 )
            // InternalDsl.g:3793:2: rule__PropertyProductClassId__Group__3__Impl rule__PropertyProductClassId__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyProductClassId__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__3"


    // $ANTLR start "rule__PropertyProductClassId__Group__3__Impl"
    // InternalDsl.g:3800:1: rule__PropertyProductClassId__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyProductClassId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3804:1: ( ( '[[' ) )
            // InternalDsl.g:3805:1: ( '[[' )
            {
            // InternalDsl.g:3805:1: ( '[[' )
            // InternalDsl.g:3806:2: '[['
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassIdAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__3__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__4"
    // InternalDsl.g:3815:1: rule__PropertyProductClassId__Group__4 : rule__PropertyProductClassId__Group__4__Impl rule__PropertyProductClassId__Group__5 ;
    public final void rule__PropertyProductClassId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3819:1: ( rule__PropertyProductClassId__Group__4__Impl rule__PropertyProductClassId__Group__5 )
            // InternalDsl.g:3820:2: rule__PropertyProductClassId__Group__4__Impl rule__PropertyProductClassId__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyProductClassId__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__4"


    // $ANTLR start "rule__PropertyProductClassId__Group__4__Impl"
    // InternalDsl.g:3827:1: rule__PropertyProductClassId__Group__4__Impl : ( ( rule__PropertyProductClassId__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyProductClassId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3831:1: ( ( ( rule__PropertyProductClassId__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:3832:1: ( ( rule__PropertyProductClassId__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:3832:1: ( ( rule__PropertyProductClassId__SemanticIdAssignment_4 ) )
            // InternalDsl.g:3833:2: ( rule__PropertyProductClassId__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:3834:2: ( rule__PropertyProductClassId__SemanticIdAssignment_4 )
            // InternalDsl.g:3834:3: rule__PropertyProductClassId__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyProductClassIdAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__4__Impl"


    // $ANTLR start "rule__PropertyProductClassId__Group__5"
    // InternalDsl.g:3842:1: rule__PropertyProductClassId__Group__5 : rule__PropertyProductClassId__Group__5__Impl ;
    public final void rule__PropertyProductClassId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3846:1: ( rule__PropertyProductClassId__Group__5__Impl )
            // InternalDsl.g:3847:2: rule__PropertyProductClassId__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyProductClassId__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__5"


    // $ANTLR start "rule__PropertyProductClassId__Group__5__Impl"
    // InternalDsl.g:3853:1: rule__PropertyProductClassId__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyProductClassId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3857:1: ( ( ']]' ) )
            // InternalDsl.g:3858:1: ( ']]' )
            {
            // InternalDsl.g:3858:1: ( ']]' )
            // InternalDsl.g:3859:2: ']]'
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassIdAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__0"
    // InternalDsl.g:3869:1: rule__SubmodelElementCollectionTechnicalProperties__Group__0 : rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__1 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3873:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__1 )
            // InternalDsl.g:3874:2: rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl"
    // InternalDsl.g:3881:1: rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl : ( 'TechnicalProperties' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3885:1: ( ( 'TechnicalProperties' ) )
            // InternalDsl.g:3886:1: ( 'TechnicalProperties' )
            {
            // InternalDsl.g:3886:1: ( 'TechnicalProperties' )
            // InternalDsl.g:3887:2: 'TechnicalProperties'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getTechnicalPropertiesKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getTechnicalPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__1"
    // InternalDsl.g:3896:1: rule__SubmodelElementCollectionTechnicalProperties__Group__1 : rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__2 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3900:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__2 )
            // InternalDsl.g:3901:2: rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl"
    // InternalDsl.g:3908:1: rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3912:1: ( ( ':' ) )
            // InternalDsl.g:3913:1: ( ':' )
            {
            // InternalDsl.g:3913:1: ( ':' )
            // InternalDsl.g:3914:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__2"
    // InternalDsl.g:3923:1: rule__SubmodelElementCollectionTechnicalProperties__Group__2 : rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__3 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3927:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__3 )
            // InternalDsl.g:3928:2: rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl"
    // InternalDsl.g:3935:1: rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3939:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 ) ) )
            // InternalDsl.g:3940:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 ) )
            {
            // InternalDsl.g:3940:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 ) )
            // InternalDsl.g:3941:2: ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getNameAssignment_2()); 
            // InternalDsl.g:3942:2: ( rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 )
            // InternalDsl.g:3942:3: rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__3"
    // InternalDsl.g:3950:1: rule__SubmodelElementCollectionTechnicalProperties__Group__3 : rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__4 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3954:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__4 )
            // InternalDsl.g:3955:2: rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl"
    // InternalDsl.g:3962:1: rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3966:1: ( ( '[[' ) )
            // InternalDsl.g:3967:1: ( '[[' )
            {
            // InternalDsl.g:3967:1: ( '[[' )
            // InternalDsl.g:3968:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__4"
    // InternalDsl.g:3977:1: rule__SubmodelElementCollectionTechnicalProperties__Group__4 : rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__5 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3981:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__5 )
            // InternalDsl.g:3982:2: rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl"
    // InternalDsl.g:3989:1: rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3993:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:3994:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:3994:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 ) )
            // InternalDsl.g:3995:2: ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:3996:2: ( rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 )
            // InternalDsl.g:3996:3: rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__5"
    // InternalDsl.g:4004:1: rule__SubmodelElementCollectionTechnicalProperties__Group__5 : rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__6 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4008:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__6 )
            // InternalDsl.g:4009:2: rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl"
    // InternalDsl.g:4016:1: rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4020:1: ( ( ']]' ) )
            // InternalDsl.g:4021:1: ( ']]' )
            {
            // InternalDsl.g:4021:1: ( ']]' )
            // InternalDsl.g:4022:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__6"
    // InternalDsl.g:4031:1: rule__SubmodelElementCollectionTechnicalProperties__Group__6 : rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__7 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4035:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__7 )
            // InternalDsl.g:4036:2: rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl"
    // InternalDsl.g:4043:1: rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4047:1: ( ( '{' ) )
            // InternalDsl.g:4048:1: ( '{' )
            {
            // InternalDsl.g:4048:1: ( '{' )
            // InternalDsl.g:4049:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__7"
    // InternalDsl.g:4058:1: rule__SubmodelElementCollectionTechnicalProperties__Group__7 : rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__8 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4062:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__8 )
            // InternalDsl.g:4063:2: rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl"
    // InternalDsl.g:4070:1: rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )* ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4074:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )* ) )
            // InternalDsl.g:4075:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )* )
            {
            // InternalDsl.g:4075:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )* )
            // InternalDsl.g:4076:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_7()); 
            // InternalDsl.g:4077:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:4077:3: rule__SubmodelElementCollectionTechnicalProperties__Group_7__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__SubmodelElementCollectionTechnicalProperties__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__8"
    // InternalDsl.g:4085:1: rule__SubmodelElementCollectionTechnicalProperties__Group__8 : rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__9 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4089:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__9 )
            // InternalDsl.g:4090:2: rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl"
    // InternalDsl.g:4097:1: rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )* ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4101:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )* ) )
            // InternalDsl.g:4102:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )* )
            {
            // InternalDsl.g:4102:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )* )
            // InternalDsl.g:4103:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_8()); 
            // InternalDsl.g:4104:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:4104:3: rule__SubmodelElementCollectionTechnicalProperties__Group_8__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SubmodelElementCollectionTechnicalProperties__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__9"
    // InternalDsl.g:4112:1: rule__SubmodelElementCollectionTechnicalProperties__Group__9 : rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__10 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4116:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__10 )
            // InternalDsl.g:4117:2: rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl rule__SubmodelElementCollectionTechnicalProperties__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl"
    // InternalDsl.g:4124:1: rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )* ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4128:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )* ) )
            // InternalDsl.g:4129:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )* )
            {
            // InternalDsl.g:4129:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )* )
            // InternalDsl.g:4130:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_9()); 
            // InternalDsl.g:4131:2: ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:4131:3: rule__SubmodelElementCollectionTechnicalProperties__Group_9__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__SubmodelElementCollectionTechnicalProperties__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__10"
    // InternalDsl.g:4139:1: rule__SubmodelElementCollectionTechnicalProperties__Group__10 : rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4143:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl )
            // InternalDsl.g:4144:2: rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__10"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl"
    // InternalDsl.g:4150:1: rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4154:1: ( ( '}' ) )
            // InternalDsl.g:4155:1: ( '}' )
            {
            // InternalDsl.g:4155:1: ( '}' )
            // InternalDsl.g:4156:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group__10__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_7__0"
    // InternalDsl.g:4166:1: rule__SubmodelElementCollectionTechnicalProperties__Group_7__0 : rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_7__1 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4170:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_7__1 )
            // InternalDsl.g:4171:2: rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_7__0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl"
    // InternalDsl.g:4178:1: rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 ) ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4182:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 ) ) )
            // InternalDsl.g:4183:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 ) )
            {
            // InternalDsl.g:4183:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 ) )
            // InternalDsl.g:4184:2: ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getArbitraryAssignment_7_0()); 
            // InternalDsl.g:4185:2: ( rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 )
            // InternalDsl.g:4185:3: rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getArbitraryAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_7__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_7__1"
    // InternalDsl.g:4193:1: rule__SubmodelElementCollectionTechnicalProperties__Group_7__1 : rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4197:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl )
            // InternalDsl.g:4198:2: rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_7__1"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl"
    // InternalDsl.g:4204:1: rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4208:1: ( ( ';' ) )
            // InternalDsl.g:4209:1: ( ';' )
            {
            // InternalDsl.g:4209:1: ( ';' )
            // InternalDsl.g:4210:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_7__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_8__0"
    // InternalDsl.g:4220:1: rule__SubmodelElementCollectionTechnicalProperties__Group_8__0 : rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_8__1 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4224:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_8__1 )
            // InternalDsl.g:4225:2: rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_8__0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl"
    // InternalDsl.g:4232:1: rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 ) ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4236:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 ) ) )
            // InternalDsl.g:4237:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 ) )
            {
            // InternalDsl.g:4237:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 ) )
            // InternalDsl.g:4238:2: ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSectionAssignment_8_0()); 
            // InternalDsl.g:4239:2: ( rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 )
            // InternalDsl.g:4239:3: rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSectionAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_8__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_8__1"
    // InternalDsl.g:4247:1: rule__SubmodelElementCollectionTechnicalProperties__Group_8__1 : rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4251:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl )
            // InternalDsl.g:4252:2: rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_8__1"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl"
    // InternalDsl.g:4258:1: rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4262:1: ( ( ';' ) )
            // InternalDsl.g:4263:1: ( ';' )
            {
            // InternalDsl.g:4263:1: ( ';' )
            // InternalDsl.g:4264:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_8__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_9__0"
    // InternalDsl.g:4274:1: rule__SubmodelElementCollectionTechnicalProperties__Group_9__0 : rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_9__1 ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4278:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_9__1 )
            // InternalDsl.g:4279:2: rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl rule__SubmodelElementCollectionTechnicalProperties__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_9__0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl"
    // InternalDsl.g:4286:1: rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl : ( ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 ) ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4290:1: ( ( ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 ) ) )
            // InternalDsl.g:4291:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 ) )
            {
            // InternalDsl.g:4291:1: ( ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 ) )
            // InternalDsl.g:4292:2: ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSubSectionAssignment_9_0()); 
            // InternalDsl.g:4293:2: ( rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 )
            // InternalDsl.g:4293:3: rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSubSectionAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_9__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_9__1"
    // InternalDsl.g:4301:1: rule__SubmodelElementCollectionTechnicalProperties__Group_9__1 : rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4305:1: ( rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl )
            // InternalDsl.g:4306:2: rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_9__1"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl"
    // InternalDsl.g:4312:1: rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4316:1: ( ( ';' ) )
            // InternalDsl.g:4317:1: ( ';' )
            {
            // InternalDsl.g:4317:1: ( ';' )
            // InternalDsl.g:4318:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemicolonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__Group_9__1__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__0"
    // InternalDsl.g:4328:1: rule__SubmodelElementArbitrary__Group__0 : rule__SubmodelElementArbitrary__Group__0__Impl rule__SubmodelElementArbitrary__Group__1 ;
    public final void rule__SubmodelElementArbitrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4332:1: ( rule__SubmodelElementArbitrary__Group__0__Impl rule__SubmodelElementArbitrary__Group__1 )
            // InternalDsl.g:4333:2: rule__SubmodelElementArbitrary__Group__0__Impl rule__SubmodelElementArbitrary__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementArbitrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__0"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__0__Impl"
    // InternalDsl.g:4340:1: rule__SubmodelElementArbitrary__Group__0__Impl : ( 'Arbitrary' ) ;
    public final void rule__SubmodelElementArbitrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4344:1: ( ( 'Arbitrary' ) )
            // InternalDsl.g:4345:1: ( 'Arbitrary' )
            {
            // InternalDsl.g:4345:1: ( 'Arbitrary' )
            // InternalDsl.g:4346:2: 'Arbitrary'
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getArbitraryKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementArbitraryAccess().getArbitraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__1"
    // InternalDsl.g:4355:1: rule__SubmodelElementArbitrary__Group__1 : rule__SubmodelElementArbitrary__Group__1__Impl rule__SubmodelElementArbitrary__Group__2 ;
    public final void rule__SubmodelElementArbitrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4359:1: ( rule__SubmodelElementArbitrary__Group__1__Impl rule__SubmodelElementArbitrary__Group__2 )
            // InternalDsl.g:4360:2: rule__SubmodelElementArbitrary__Group__1__Impl rule__SubmodelElementArbitrary__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementArbitrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__1"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__1__Impl"
    // InternalDsl.g:4367:1: rule__SubmodelElementArbitrary__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementArbitrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4371:1: ( ( ':' ) )
            // InternalDsl.g:4372:1: ( ':' )
            {
            // InternalDsl.g:4372:1: ( ':' )
            // InternalDsl.g:4373:2: ':'
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementArbitraryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__2"
    // InternalDsl.g:4382:1: rule__SubmodelElementArbitrary__Group__2 : rule__SubmodelElementArbitrary__Group__2__Impl rule__SubmodelElementArbitrary__Group__3 ;
    public final void rule__SubmodelElementArbitrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4386:1: ( rule__SubmodelElementArbitrary__Group__2__Impl rule__SubmodelElementArbitrary__Group__3 )
            // InternalDsl.g:4387:2: rule__SubmodelElementArbitrary__Group__2__Impl rule__SubmodelElementArbitrary__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementArbitrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__2"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__2__Impl"
    // InternalDsl.g:4394:1: rule__SubmodelElementArbitrary__Group__2__Impl : ( ( rule__SubmodelElementArbitrary__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementArbitrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4398:1: ( ( ( rule__SubmodelElementArbitrary__NameAssignment_2 ) ) )
            // InternalDsl.g:4399:1: ( ( rule__SubmodelElementArbitrary__NameAssignment_2 ) )
            {
            // InternalDsl.g:4399:1: ( ( rule__SubmodelElementArbitrary__NameAssignment_2 ) )
            // InternalDsl.g:4400:2: ( rule__SubmodelElementArbitrary__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getNameAssignment_2()); 
            // InternalDsl.g:4401:2: ( rule__SubmodelElementArbitrary__NameAssignment_2 )
            // InternalDsl.g:4401:3: rule__SubmodelElementArbitrary__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementArbitraryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__3"
    // InternalDsl.g:4409:1: rule__SubmodelElementArbitrary__Group__3 : rule__SubmodelElementArbitrary__Group__3__Impl rule__SubmodelElementArbitrary__Group__4 ;
    public final void rule__SubmodelElementArbitrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4413:1: ( rule__SubmodelElementArbitrary__Group__3__Impl rule__SubmodelElementArbitrary__Group__4 )
            // InternalDsl.g:4414:2: rule__SubmodelElementArbitrary__Group__3__Impl rule__SubmodelElementArbitrary__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementArbitrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__3"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__3__Impl"
    // InternalDsl.g:4421:1: rule__SubmodelElementArbitrary__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementArbitrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4425:1: ( ( '[[' ) )
            // InternalDsl.g:4426:1: ( '[[' )
            {
            // InternalDsl.g:4426:1: ( '[[' )
            // InternalDsl.g:4427:2: '[['
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementArbitraryAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__4"
    // InternalDsl.g:4436:1: rule__SubmodelElementArbitrary__Group__4 : rule__SubmodelElementArbitrary__Group__4__Impl rule__SubmodelElementArbitrary__Group__5 ;
    public final void rule__SubmodelElementArbitrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4440:1: ( rule__SubmodelElementArbitrary__Group__4__Impl rule__SubmodelElementArbitrary__Group__5 )
            // InternalDsl.g:4441:2: rule__SubmodelElementArbitrary__Group__4__Impl rule__SubmodelElementArbitrary__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementArbitrary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__4"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__4__Impl"
    // InternalDsl.g:4448:1: rule__SubmodelElementArbitrary__Group__4__Impl : ( ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementArbitrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4452:1: ( ( ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:4453:1: ( ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:4453:1: ( ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 ) )
            // InternalDsl.g:4454:2: ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:4455:2: ( rule__SubmodelElementArbitrary__SemanticIdAssignment_4 )
            // InternalDsl.g:4455:3: rule__SubmodelElementArbitrary__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementArbitraryAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__5"
    // InternalDsl.g:4463:1: rule__SubmodelElementArbitrary__Group__5 : rule__SubmodelElementArbitrary__Group__5__Impl ;
    public final void rule__SubmodelElementArbitrary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4467:1: ( rule__SubmodelElementArbitrary__Group__5__Impl )
            // InternalDsl.g:4468:2: rule__SubmodelElementArbitrary__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementArbitrary__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__5"


    // $ANTLR start "rule__SubmodelElementArbitrary__Group__5__Impl"
    // InternalDsl.g:4474:1: rule__SubmodelElementArbitrary__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementArbitrary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4478:1: ( ( ']]' ) )
            // InternalDsl.g:4479:1: ( ']]' )
            {
            // InternalDsl.g:4479:1: ( ']]' )
            // InternalDsl.g:4480:2: ']]'
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementArbitraryAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__0"
    // InternalDsl.g:4490:1: rule__SubmodelElementCollectionSection__Group__0 : rule__SubmodelElementCollectionSection__Group__0__Impl rule__SubmodelElementCollectionSection__Group__1 ;
    public final void rule__SubmodelElementCollectionSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4494:1: ( rule__SubmodelElementCollectionSection__Group__0__Impl rule__SubmodelElementCollectionSection__Group__1 )
            // InternalDsl.g:4495:2: rule__SubmodelElementCollectionSection__Group__0__Impl rule__SubmodelElementCollectionSection__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__0__Impl"
    // InternalDsl.g:4502:1: rule__SubmodelElementCollectionSection__Group__0__Impl : ( 'Section' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4506:1: ( ( 'Section' ) )
            // InternalDsl.g:4507:1: ( 'Section' )
            {
            // InternalDsl.g:4507:1: ( 'Section' )
            // InternalDsl.g:4508:2: 'Section'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSectionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__1"
    // InternalDsl.g:4517:1: rule__SubmodelElementCollectionSection__Group__1 : rule__SubmodelElementCollectionSection__Group__1__Impl rule__SubmodelElementCollectionSection__Group__2 ;
    public final void rule__SubmodelElementCollectionSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4521:1: ( rule__SubmodelElementCollectionSection__Group__1__Impl rule__SubmodelElementCollectionSection__Group__2 )
            // InternalDsl.g:4522:2: rule__SubmodelElementCollectionSection__Group__1__Impl rule__SubmodelElementCollectionSection__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__1__Impl"
    // InternalDsl.g:4529:1: rule__SubmodelElementCollectionSection__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4533:1: ( ( ':' ) )
            // InternalDsl.g:4534:1: ( ':' )
            {
            // InternalDsl.g:4534:1: ( ':' )
            // InternalDsl.g:4535:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__2"
    // InternalDsl.g:4544:1: rule__SubmodelElementCollectionSection__Group__2 : rule__SubmodelElementCollectionSection__Group__2__Impl rule__SubmodelElementCollectionSection__Group__3 ;
    public final void rule__SubmodelElementCollectionSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4548:1: ( rule__SubmodelElementCollectionSection__Group__2__Impl rule__SubmodelElementCollectionSection__Group__3 )
            // InternalDsl.g:4549:2: rule__SubmodelElementCollectionSection__Group__2__Impl rule__SubmodelElementCollectionSection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__2__Impl"
    // InternalDsl.g:4556:1: rule__SubmodelElementCollectionSection__Group__2__Impl : ( ( rule__SubmodelElementCollectionSection__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4560:1: ( ( ( rule__SubmodelElementCollectionSection__NameAssignment_2 ) ) )
            // InternalDsl.g:4561:1: ( ( rule__SubmodelElementCollectionSection__NameAssignment_2 ) )
            {
            // InternalDsl.g:4561:1: ( ( rule__SubmodelElementCollectionSection__NameAssignment_2 ) )
            // InternalDsl.g:4562:2: ( rule__SubmodelElementCollectionSection__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getNameAssignment_2()); 
            // InternalDsl.g:4563:2: ( rule__SubmodelElementCollectionSection__NameAssignment_2 )
            // InternalDsl.g:4563:3: rule__SubmodelElementCollectionSection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__3"
    // InternalDsl.g:4571:1: rule__SubmodelElementCollectionSection__Group__3 : rule__SubmodelElementCollectionSection__Group__3__Impl rule__SubmodelElementCollectionSection__Group__4 ;
    public final void rule__SubmodelElementCollectionSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4575:1: ( rule__SubmodelElementCollectionSection__Group__3__Impl rule__SubmodelElementCollectionSection__Group__4 )
            // InternalDsl.g:4576:2: rule__SubmodelElementCollectionSection__Group__3__Impl rule__SubmodelElementCollectionSection__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__3__Impl"
    // InternalDsl.g:4583:1: rule__SubmodelElementCollectionSection__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4587:1: ( ( '[[' ) )
            // InternalDsl.g:4588:1: ( '[[' )
            {
            // InternalDsl.g:4588:1: ( '[[' )
            // InternalDsl.g:4589:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__4"
    // InternalDsl.g:4598:1: rule__SubmodelElementCollectionSection__Group__4 : rule__SubmodelElementCollectionSection__Group__4__Impl rule__SubmodelElementCollectionSection__Group__5 ;
    public final void rule__SubmodelElementCollectionSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4602:1: ( rule__SubmodelElementCollectionSection__Group__4__Impl rule__SubmodelElementCollectionSection__Group__5 )
            // InternalDsl.g:4603:2: rule__SubmodelElementCollectionSection__Group__4__Impl rule__SubmodelElementCollectionSection__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionSection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__4__Impl"
    // InternalDsl.g:4610:1: rule__SubmodelElementCollectionSection__Group__4__Impl : ( ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4614:1: ( ( ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:4615:1: ( ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:4615:1: ( ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 ) )
            // InternalDsl.g:4616:2: ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:4617:2: ( rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 )
            // InternalDsl.g:4617:3: rule__SubmodelElementCollectionSection__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__5"
    // InternalDsl.g:4625:1: rule__SubmodelElementCollectionSection__Group__5 : rule__SubmodelElementCollectionSection__Group__5__Impl rule__SubmodelElementCollectionSection__Group__6 ;
    public final void rule__SubmodelElementCollectionSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4629:1: ( rule__SubmodelElementCollectionSection__Group__5__Impl rule__SubmodelElementCollectionSection__Group__6 )
            // InternalDsl.g:4630:2: rule__SubmodelElementCollectionSection__Group__5__Impl rule__SubmodelElementCollectionSection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionSection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__5__Impl"
    // InternalDsl.g:4637:1: rule__SubmodelElementCollectionSection__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4641:1: ( ( ']]' ) )
            // InternalDsl.g:4642:1: ( ']]' )
            {
            // InternalDsl.g:4642:1: ( ']]' )
            // InternalDsl.g:4643:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__6"
    // InternalDsl.g:4652:1: rule__SubmodelElementCollectionSection__Group__6 : rule__SubmodelElementCollectionSection__Group__6__Impl rule__SubmodelElementCollectionSection__Group__7 ;
    public final void rule__SubmodelElementCollectionSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4656:1: ( rule__SubmodelElementCollectionSection__Group__6__Impl rule__SubmodelElementCollectionSection__Group__7 )
            // InternalDsl.g:4657:2: rule__SubmodelElementCollectionSection__Group__6__Impl rule__SubmodelElementCollectionSection__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__6__Impl"
    // InternalDsl.g:4664:1: rule__SubmodelElementCollectionSection__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4668:1: ( ( '{' ) )
            // InternalDsl.g:4669:1: ( '{' )
            {
            // InternalDsl.g:4669:1: ( '{' )
            // InternalDsl.g:4670:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__7"
    // InternalDsl.g:4679:1: rule__SubmodelElementCollectionSection__Group__7 : rule__SubmodelElementCollectionSection__Group__7__Impl rule__SubmodelElementCollectionSection__Group__8 ;
    public final void rule__SubmodelElementCollectionSection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4683:1: ( rule__SubmodelElementCollectionSection__Group__7__Impl rule__SubmodelElementCollectionSection__Group__8 )
            // InternalDsl.g:4684:2: rule__SubmodelElementCollectionSection__Group__7__Impl rule__SubmodelElementCollectionSection__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__7__Impl"
    // InternalDsl.g:4691:1: rule__SubmodelElementCollectionSection__Group__7__Impl : ( ( rule__SubmodelElementCollectionSection__Group_7__0 )* ) ;
    public final void rule__SubmodelElementCollectionSection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4695:1: ( ( ( rule__SubmodelElementCollectionSection__Group_7__0 )* ) )
            // InternalDsl.g:4696:1: ( ( rule__SubmodelElementCollectionSection__Group_7__0 )* )
            {
            // InternalDsl.g:4696:1: ( ( rule__SubmodelElementCollectionSection__Group_7__0 )* )
            // InternalDsl.g:4697:2: ( rule__SubmodelElementCollectionSection__Group_7__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup_7()); 
            // InternalDsl.g:4698:2: ( rule__SubmodelElementCollectionSection__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:4698:3: rule__SubmodelElementCollectionSection__Group_7__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__SubmodelElementCollectionSection__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__8"
    // InternalDsl.g:4706:1: rule__SubmodelElementCollectionSection__Group__8 : rule__SubmodelElementCollectionSection__Group__8__Impl rule__SubmodelElementCollectionSection__Group__9 ;
    public final void rule__SubmodelElementCollectionSection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4710:1: ( rule__SubmodelElementCollectionSection__Group__8__Impl rule__SubmodelElementCollectionSection__Group__9 )
            // InternalDsl.g:4711:2: rule__SubmodelElementCollectionSection__Group__8__Impl rule__SubmodelElementCollectionSection__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__8__Impl"
    // InternalDsl.g:4718:1: rule__SubmodelElementCollectionSection__Group__8__Impl : ( ( rule__SubmodelElementCollectionSection__Group_8__0 )* ) ;
    public final void rule__SubmodelElementCollectionSection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4722:1: ( ( ( rule__SubmodelElementCollectionSection__Group_8__0 )* ) )
            // InternalDsl.g:4723:1: ( ( rule__SubmodelElementCollectionSection__Group_8__0 )* )
            {
            // InternalDsl.g:4723:1: ( ( rule__SubmodelElementCollectionSection__Group_8__0 )* )
            // InternalDsl.g:4724:2: ( rule__SubmodelElementCollectionSection__Group_8__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup_8()); 
            // InternalDsl.g:4725:2: ( rule__SubmodelElementCollectionSection__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:4725:3: rule__SubmodelElementCollectionSection__Group_8__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__SubmodelElementCollectionSection__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__9"
    // InternalDsl.g:4733:1: rule__SubmodelElementCollectionSection__Group__9 : rule__SubmodelElementCollectionSection__Group__9__Impl ;
    public final void rule__SubmodelElementCollectionSection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4737:1: ( rule__SubmodelElementCollectionSection__Group__9__Impl )
            // InternalDsl.g:4738:2: rule__SubmodelElementCollectionSection__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group__9__Impl"
    // InternalDsl.g:4744:1: rule__SubmodelElementCollectionSection__Group__9__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionSection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4748:1: ( ( '}' ) )
            // InternalDsl.g:4749:1: ( '}' )
            {
            // InternalDsl.g:4749:1: ( '}' )
            // InternalDsl.g:4750:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_7__0"
    // InternalDsl.g:4760:1: rule__SubmodelElementCollectionSection__Group_7__0 : rule__SubmodelElementCollectionSection__Group_7__0__Impl rule__SubmodelElementCollectionSection__Group_7__1 ;
    public final void rule__SubmodelElementCollectionSection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4764:1: ( rule__SubmodelElementCollectionSection__Group_7__0__Impl rule__SubmodelElementCollectionSection__Group_7__1 )
            // InternalDsl.g:4765:2: rule__SubmodelElementCollectionSection__Group_7__0__Impl rule__SubmodelElementCollectionSection__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionSection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_7__0"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_7__0__Impl"
    // InternalDsl.g:4772:1: rule__SubmodelElementCollectionSection__Group_7__0__Impl : ( ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 ) ) ;
    public final void rule__SubmodelElementCollectionSection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4776:1: ( ( ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 ) ) )
            // InternalDsl.g:4777:1: ( ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 ) )
            {
            // InternalDsl.g:4777:1: ( ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 ) )
            // InternalDsl.g:4778:2: ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getArbitraryAssignment_7_0()); 
            // InternalDsl.g:4779:2: ( rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 )
            // InternalDsl.g:4779:3: rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getArbitraryAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_7__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_7__1"
    // InternalDsl.g:4787:1: rule__SubmodelElementCollectionSection__Group_7__1 : rule__SubmodelElementCollectionSection__Group_7__1__Impl ;
    public final void rule__SubmodelElementCollectionSection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4791:1: ( rule__SubmodelElementCollectionSection__Group_7__1__Impl )
            // InternalDsl.g:4792:2: rule__SubmodelElementCollectionSection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_7__1"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_7__1__Impl"
    // InternalDsl.g:4798:1: rule__SubmodelElementCollectionSection__Group_7__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionSection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4802:1: ( ( ';' ) )
            // InternalDsl.g:4803:1: ( ';' )
            {
            // InternalDsl.g:4803:1: ( ';' )
            // InternalDsl.g:4804:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_7__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_8__0"
    // InternalDsl.g:4814:1: rule__SubmodelElementCollectionSection__Group_8__0 : rule__SubmodelElementCollectionSection__Group_8__0__Impl rule__SubmodelElementCollectionSection__Group_8__1 ;
    public final void rule__SubmodelElementCollectionSection__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4818:1: ( rule__SubmodelElementCollectionSection__Group_8__0__Impl rule__SubmodelElementCollectionSection__Group_8__1 )
            // InternalDsl.g:4819:2: rule__SubmodelElementCollectionSection__Group_8__0__Impl rule__SubmodelElementCollectionSection__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionSection__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_8__0"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_8__0__Impl"
    // InternalDsl.g:4826:1: rule__SubmodelElementCollectionSection__Group_8__0__Impl : ( ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 ) ) ;
    public final void rule__SubmodelElementCollectionSection__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4830:1: ( ( ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 ) ) )
            // InternalDsl.g:4831:1: ( ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 ) )
            {
            // InternalDsl.g:4831:1: ( ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 ) )
            // InternalDsl.g:4832:2: ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSubSectionAssignment_8_0()); 
            // InternalDsl.g:4833:2: ( rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 )
            // InternalDsl.g:4833:3: rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSubSectionAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_8__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_8__1"
    // InternalDsl.g:4841:1: rule__SubmodelElementCollectionSection__Group_8__1 : rule__SubmodelElementCollectionSection__Group_8__1__Impl ;
    public final void rule__SubmodelElementCollectionSection__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4845:1: ( rule__SubmodelElementCollectionSection__Group_8__1__Impl )
            // InternalDsl.g:4846:2: rule__SubmodelElementCollectionSection__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSection__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_8__1"


    // $ANTLR start "rule__SubmodelElementCollectionSection__Group_8__1__Impl"
    // InternalDsl.g:4852:1: rule__SubmodelElementCollectionSection__Group_8__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionSection__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4856:1: ( ( ';' ) )
            // InternalDsl.g:4857:1: ( ';' )
            {
            // InternalDsl.g:4857:1: ( ';' )
            // InternalDsl.g:4858:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__Group_8__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__0"
    // InternalDsl.g:4868:1: rule__SubmodelElementCollectionSubSection__Group__0 : rule__SubmodelElementCollectionSubSection__Group__0__Impl rule__SubmodelElementCollectionSubSection__Group__1 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4872:1: ( rule__SubmodelElementCollectionSubSection__Group__0__Impl rule__SubmodelElementCollectionSubSection__Group__1 )
            // InternalDsl.g:4873:2: rule__SubmodelElementCollectionSubSection__Group__0__Impl rule__SubmodelElementCollectionSubSection__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionSubSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__0__Impl"
    // InternalDsl.g:4880:1: rule__SubmodelElementCollectionSubSection__Group__0__Impl : ( 'SubSection' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4884:1: ( ( 'SubSection' ) )
            // InternalDsl.g:4885:1: ( 'SubSection' )
            {
            // InternalDsl.g:4885:1: ( 'SubSection' )
            // InternalDsl.g:4886:2: 'SubSection'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__1"
    // InternalDsl.g:4895:1: rule__SubmodelElementCollectionSubSection__Group__1 : rule__SubmodelElementCollectionSubSection__Group__1__Impl rule__SubmodelElementCollectionSubSection__Group__2 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4899:1: ( rule__SubmodelElementCollectionSubSection__Group__1__Impl rule__SubmodelElementCollectionSubSection__Group__2 )
            // InternalDsl.g:4900:2: rule__SubmodelElementCollectionSubSection__Group__1__Impl rule__SubmodelElementCollectionSubSection__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionSubSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__1__Impl"
    // InternalDsl.g:4907:1: rule__SubmodelElementCollectionSubSection__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4911:1: ( ( ':' ) )
            // InternalDsl.g:4912:1: ( ':' )
            {
            // InternalDsl.g:4912:1: ( ':' )
            // InternalDsl.g:4913:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__2"
    // InternalDsl.g:4922:1: rule__SubmodelElementCollectionSubSection__Group__2 : rule__SubmodelElementCollectionSubSection__Group__2__Impl rule__SubmodelElementCollectionSubSection__Group__3 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4926:1: ( rule__SubmodelElementCollectionSubSection__Group__2__Impl rule__SubmodelElementCollectionSubSection__Group__3 )
            // InternalDsl.g:4927:2: rule__SubmodelElementCollectionSubSection__Group__2__Impl rule__SubmodelElementCollectionSubSection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionSubSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__2__Impl"
    // InternalDsl.g:4934:1: rule__SubmodelElementCollectionSubSection__Group__2__Impl : ( ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4938:1: ( ( ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 ) ) )
            // InternalDsl.g:4939:1: ( ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 ) )
            {
            // InternalDsl.g:4939:1: ( ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 ) )
            // InternalDsl.g:4940:2: ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getNameAssignment_2()); 
            // InternalDsl.g:4941:2: ( rule__SubmodelElementCollectionSubSection__NameAssignment_2 )
            // InternalDsl.g:4941:3: rule__SubmodelElementCollectionSubSection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__3"
    // InternalDsl.g:4949:1: rule__SubmodelElementCollectionSubSection__Group__3 : rule__SubmodelElementCollectionSubSection__Group__3__Impl rule__SubmodelElementCollectionSubSection__Group__4 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4953:1: ( rule__SubmodelElementCollectionSubSection__Group__3__Impl rule__SubmodelElementCollectionSubSection__Group__4 )
            // InternalDsl.g:4954:2: rule__SubmodelElementCollectionSubSection__Group__3__Impl rule__SubmodelElementCollectionSubSection__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionSubSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__3__Impl"
    // InternalDsl.g:4961:1: rule__SubmodelElementCollectionSubSection__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4965:1: ( ( '[[' ) )
            // InternalDsl.g:4966:1: ( '[[' )
            {
            // InternalDsl.g:4966:1: ( '[[' )
            // InternalDsl.g:4967:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__4"
    // InternalDsl.g:4976:1: rule__SubmodelElementCollectionSubSection__Group__4 : rule__SubmodelElementCollectionSubSection__Group__4__Impl rule__SubmodelElementCollectionSubSection__Group__5 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4980:1: ( rule__SubmodelElementCollectionSubSection__Group__4__Impl rule__SubmodelElementCollectionSubSection__Group__5 )
            // InternalDsl.g:4981:2: rule__SubmodelElementCollectionSubSection__Group__4__Impl rule__SubmodelElementCollectionSubSection__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionSubSection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__4__Impl"
    // InternalDsl.g:4988:1: rule__SubmodelElementCollectionSubSection__Group__4__Impl : ( ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4992:1: ( ( ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:4993:1: ( ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:4993:1: ( ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 ) )
            // InternalDsl.g:4994:2: ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:4995:2: ( rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 )
            // InternalDsl.g:4995:3: rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__5"
    // InternalDsl.g:5003:1: rule__SubmodelElementCollectionSubSection__Group__5 : rule__SubmodelElementCollectionSubSection__Group__5__Impl rule__SubmodelElementCollectionSubSection__Group__6 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5007:1: ( rule__SubmodelElementCollectionSubSection__Group__5__Impl rule__SubmodelElementCollectionSubSection__Group__6 )
            // InternalDsl.g:5008:2: rule__SubmodelElementCollectionSubSection__Group__5__Impl rule__SubmodelElementCollectionSubSection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionSubSection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__5__Impl"
    // InternalDsl.g:5015:1: rule__SubmodelElementCollectionSubSection__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5019:1: ( ( ']]' ) )
            // InternalDsl.g:5020:1: ( ']]' )
            {
            // InternalDsl.g:5020:1: ( ']]' )
            // InternalDsl.g:5021:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__6"
    // InternalDsl.g:5030:1: rule__SubmodelElementCollectionSubSection__Group__6 : rule__SubmodelElementCollectionSubSection__Group__6__Impl rule__SubmodelElementCollectionSubSection__Group__7 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5034:1: ( rule__SubmodelElementCollectionSubSection__Group__6__Impl rule__SubmodelElementCollectionSubSection__Group__7 )
            // InternalDsl.g:5035:2: rule__SubmodelElementCollectionSubSection__Group__6__Impl rule__SubmodelElementCollectionSubSection__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSubSection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__6__Impl"
    // InternalDsl.g:5042:1: rule__SubmodelElementCollectionSubSection__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5046:1: ( ( '{' ) )
            // InternalDsl.g:5047:1: ( '{' )
            {
            // InternalDsl.g:5047:1: ( '{' )
            // InternalDsl.g:5048:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__7"
    // InternalDsl.g:5057:1: rule__SubmodelElementCollectionSubSection__Group__7 : rule__SubmodelElementCollectionSubSection__Group__7__Impl rule__SubmodelElementCollectionSubSection__Group__8 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5061:1: ( rule__SubmodelElementCollectionSubSection__Group__7__Impl rule__SubmodelElementCollectionSubSection__Group__8 )
            // InternalDsl.g:5062:2: rule__SubmodelElementCollectionSubSection__Group__7__Impl rule__SubmodelElementCollectionSubSection__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSubSection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__7__Impl"
    // InternalDsl.g:5069:1: rule__SubmodelElementCollectionSubSection__Group__7__Impl : ( ( rule__SubmodelElementCollectionSubSection__Group_7__0 )* ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5073:1: ( ( ( rule__SubmodelElementCollectionSubSection__Group_7__0 )* ) )
            // InternalDsl.g:5074:1: ( ( rule__SubmodelElementCollectionSubSection__Group_7__0 )* )
            {
            // InternalDsl.g:5074:1: ( ( rule__SubmodelElementCollectionSubSection__Group_7__0 )* )
            // InternalDsl.g:5075:2: ( rule__SubmodelElementCollectionSubSection__Group_7__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup_7()); 
            // InternalDsl.g:5076:2: ( rule__SubmodelElementCollectionSubSection__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:5076:3: rule__SubmodelElementCollectionSubSection__Group_7__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__SubmodelElementCollectionSubSection__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__8"
    // InternalDsl.g:5084:1: rule__SubmodelElementCollectionSubSection__Group__8 : rule__SubmodelElementCollectionSubSection__Group__8__Impl rule__SubmodelElementCollectionSubSection__Group__9 ;
    public final void rule__SubmodelElementCollectionSubSection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5088:1: ( rule__SubmodelElementCollectionSubSection__Group__8__Impl rule__SubmodelElementCollectionSubSection__Group__9 )
            // InternalDsl.g:5089:2: rule__SubmodelElementCollectionSubSection__Group__8__Impl rule__SubmodelElementCollectionSubSection__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__SubmodelElementCollectionSubSection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__8__Impl"
    // InternalDsl.g:5096:1: rule__SubmodelElementCollectionSubSection__Group__8__Impl : ( ( rule__SubmodelElementCollectionSubSection__Group_8__0 )* ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5100:1: ( ( ( rule__SubmodelElementCollectionSubSection__Group_8__0 )* ) )
            // InternalDsl.g:5101:1: ( ( rule__SubmodelElementCollectionSubSection__Group_8__0 )* )
            {
            // InternalDsl.g:5101:1: ( ( rule__SubmodelElementCollectionSubSection__Group_8__0 )* )
            // InternalDsl.g:5102:2: ( rule__SubmodelElementCollectionSubSection__Group_8__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup_8()); 
            // InternalDsl.g:5103:2: ( rule__SubmodelElementCollectionSubSection__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:5103:3: rule__SubmodelElementCollectionSubSection__Group_8__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__SubmodelElementCollectionSubSection__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__9"
    // InternalDsl.g:5111:1: rule__SubmodelElementCollectionSubSection__Group__9 : rule__SubmodelElementCollectionSubSection__Group__9__Impl ;
    public final void rule__SubmodelElementCollectionSubSection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5115:1: ( rule__SubmodelElementCollectionSubSection__Group__9__Impl )
            // InternalDsl.g:5116:2: rule__SubmodelElementCollectionSubSection__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group__9__Impl"
    // InternalDsl.g:5122:1: rule__SubmodelElementCollectionSubSection__Group__9__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5126:1: ( ( '}' ) )
            // InternalDsl.g:5127:1: ( '}' )
            {
            // InternalDsl.g:5127:1: ( '}' )
            // InternalDsl.g:5128:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_7__0"
    // InternalDsl.g:5138:1: rule__SubmodelElementCollectionSubSection__Group_7__0 : rule__SubmodelElementCollectionSubSection__Group_7__0__Impl rule__SubmodelElementCollectionSubSection__Group_7__1 ;
    public final void rule__SubmodelElementCollectionSubSection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5142:1: ( rule__SubmodelElementCollectionSubSection__Group_7__0__Impl rule__SubmodelElementCollectionSubSection__Group_7__1 )
            // InternalDsl.g:5143:2: rule__SubmodelElementCollectionSubSection__Group_7__0__Impl rule__SubmodelElementCollectionSubSection__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionSubSection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_7__0"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_7__0__Impl"
    // InternalDsl.g:5150:1: rule__SubmodelElementCollectionSubSection__Group_7__0__Impl : ( ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 ) ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5154:1: ( ( ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 ) ) )
            // InternalDsl.g:5155:1: ( ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 ) )
            {
            // InternalDsl.g:5155:1: ( ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 ) )
            // InternalDsl.g:5156:2: ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getArbitraryAssignment_7_0()); 
            // InternalDsl.g:5157:2: ( rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 )
            // InternalDsl.g:5157:3: rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getArbitraryAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_7__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_7__1"
    // InternalDsl.g:5165:1: rule__SubmodelElementCollectionSubSection__Group_7__1 : rule__SubmodelElementCollectionSubSection__Group_7__1__Impl ;
    public final void rule__SubmodelElementCollectionSubSection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5169:1: ( rule__SubmodelElementCollectionSubSection__Group_7__1__Impl )
            // InternalDsl.g:5170:2: rule__SubmodelElementCollectionSubSection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_7__1"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_7__1__Impl"
    // InternalDsl.g:5176:1: rule__SubmodelElementCollectionSubSection__Group_7__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5180:1: ( ( ';' ) )
            // InternalDsl.g:5181:1: ( ';' )
            {
            // InternalDsl.g:5181:1: ( ';' )
            // InternalDsl.g:5182:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_7__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_8__0"
    // InternalDsl.g:5192:1: rule__SubmodelElementCollectionSubSection__Group_8__0 : rule__SubmodelElementCollectionSubSection__Group_8__0__Impl rule__SubmodelElementCollectionSubSection__Group_8__1 ;
    public final void rule__SubmodelElementCollectionSubSection__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5196:1: ( rule__SubmodelElementCollectionSubSection__Group_8__0__Impl rule__SubmodelElementCollectionSubSection__Group_8__1 )
            // InternalDsl.g:5197:2: rule__SubmodelElementCollectionSubSection__Group_8__0__Impl rule__SubmodelElementCollectionSubSection__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionSubSection__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_8__0"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_8__0__Impl"
    // InternalDsl.g:5204:1: rule__SubmodelElementCollectionSubSection__Group_8__0__Impl : ( ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 ) ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5208:1: ( ( ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 ) ) )
            // InternalDsl.g:5209:1: ( ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 ) )
            {
            // InternalDsl.g:5209:1: ( ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 ) )
            // InternalDsl.g:5210:2: ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionAssignment_8_0()); 
            // InternalDsl.g:5211:2: ( rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 )
            // InternalDsl.g:5211:3: rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_8__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_8__1"
    // InternalDsl.g:5219:1: rule__SubmodelElementCollectionSubSection__Group_8__1 : rule__SubmodelElementCollectionSubSection__Group_8__1__Impl ;
    public final void rule__SubmodelElementCollectionSubSection__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5223:1: ( rule__SubmodelElementCollectionSubSection__Group_8__1__Impl )
            // InternalDsl.g:5224:2: rule__SubmodelElementCollectionSubSection__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionSubSection__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_8__1"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__Group_8__1__Impl"
    // InternalDsl.g:5230:1: rule__SubmodelElementCollectionSubSection__Group_8__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionSubSection__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5234:1: ( ( ';' ) )
            // InternalDsl.g:5235:1: ( ';' )
            {
            // InternalDsl.g:5235:1: ( ';' )
            // InternalDsl.g:5236:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__Group_8__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__0"
    // InternalDsl.g:5246:1: rule__SubmodelElementCollectionFurtherInformation__Group__0 : rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group__1 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5250:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group__1 )
            // InternalDsl.g:5251:2: rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__0"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl"
    // InternalDsl.g:5258:1: rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl : ( 'FurtherInformation' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5262:1: ( ( 'FurtherInformation' ) )
            // InternalDsl.g:5263:1: ( 'FurtherInformation' )
            {
            // InternalDsl.g:5263:1: ( 'FurtherInformation' )
            // InternalDsl.g:5264:2: 'FurtherInformation'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getFurtherInformationKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getFurtherInformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__1"
    // InternalDsl.g:5273:1: rule__SubmodelElementCollectionFurtherInformation__Group__1 : rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl rule__SubmodelElementCollectionFurtherInformation__Group__2 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5277:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl rule__SubmodelElementCollectionFurtherInformation__Group__2 )
            // InternalDsl.g:5278:2: rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl rule__SubmodelElementCollectionFurtherInformation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__1"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl"
    // InternalDsl.g:5285:1: rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl : ( ':' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5289:1: ( ( ':' ) )
            // InternalDsl.g:5290:1: ( ':' )
            {
            // InternalDsl.g:5290:1: ( ':' )
            // InternalDsl.g:5291:2: ':'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__1__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__2"
    // InternalDsl.g:5300:1: rule__SubmodelElementCollectionFurtherInformation__Group__2 : rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl rule__SubmodelElementCollectionFurtherInformation__Group__3 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5304:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl rule__SubmodelElementCollectionFurtherInformation__Group__3 )
            // InternalDsl.g:5305:2: rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl rule__SubmodelElementCollectionFurtherInformation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__2"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl"
    // InternalDsl.g:5312:1: rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl : ( ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 ) ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5316:1: ( ( ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 ) ) )
            // InternalDsl.g:5317:1: ( ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 ) )
            {
            // InternalDsl.g:5317:1: ( ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 ) )
            // InternalDsl.g:5318:2: ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 )
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getNameAssignment_2()); 
            // InternalDsl.g:5319:2: ( rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 )
            // InternalDsl.g:5319:3: rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__2__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__3"
    // InternalDsl.g:5327:1: rule__SubmodelElementCollectionFurtherInformation__Group__3 : rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl rule__SubmodelElementCollectionFurtherInformation__Group__4 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5331:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl rule__SubmodelElementCollectionFurtherInformation__Group__4 )
            // InternalDsl.g:5332:2: rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl rule__SubmodelElementCollectionFurtherInformation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__3"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl"
    // InternalDsl.g:5339:1: rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl : ( '[[' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5343:1: ( ( '[[' ) )
            // InternalDsl.g:5344:1: ( '[[' )
            {
            // InternalDsl.g:5344:1: ( '[[' )
            // InternalDsl.g:5345:2: '[['
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__3__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__4"
    // InternalDsl.g:5354:1: rule__SubmodelElementCollectionFurtherInformation__Group__4 : rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl rule__SubmodelElementCollectionFurtherInformation__Group__5 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5358:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl rule__SubmodelElementCollectionFurtherInformation__Group__5 )
            // InternalDsl.g:5359:2: rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl rule__SubmodelElementCollectionFurtherInformation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__4"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl"
    // InternalDsl.g:5366:1: rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl : ( ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 ) ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5370:1: ( ( ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:5371:1: ( ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:5371:1: ( ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 ) )
            // InternalDsl.g:5372:2: ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:5373:2: ( rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 )
            // InternalDsl.g:5373:3: rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__4__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__5"
    // InternalDsl.g:5381:1: rule__SubmodelElementCollectionFurtherInformation__Group__5 : rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl rule__SubmodelElementCollectionFurtherInformation__Group__6 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5385:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl rule__SubmodelElementCollectionFurtherInformation__Group__6 )
            // InternalDsl.g:5386:2: rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl rule__SubmodelElementCollectionFurtherInformation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__5"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl"
    // InternalDsl.g:5393:1: rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl : ( ']]' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5397:1: ( ( ']]' ) )
            // InternalDsl.g:5398:1: ( ']]' )
            {
            // InternalDsl.g:5398:1: ( ']]' )
            // InternalDsl.g:5399:2: ']]'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__5__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__6"
    // InternalDsl.g:5408:1: rule__SubmodelElementCollectionFurtherInformation__Group__6 : rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl rule__SubmodelElementCollectionFurtherInformation__Group__7 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5412:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl rule__SubmodelElementCollectionFurtherInformation__Group__7 )
            // InternalDsl.g:5413:2: rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl rule__SubmodelElementCollectionFurtherInformation__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__6"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl"
    // InternalDsl.g:5420:1: rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl : ( '{' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5424:1: ( ( '{' ) )
            // InternalDsl.g:5425:1: ( '{' )
            {
            // InternalDsl.g:5425:1: ( '{' )
            // InternalDsl.g:5426:2: '{'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__6__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__7"
    // InternalDsl.g:5435:1: rule__SubmodelElementCollectionFurtherInformation__Group__7 : rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl rule__SubmodelElementCollectionFurtherInformation__Group__8 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5439:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl rule__SubmodelElementCollectionFurtherInformation__Group__8 )
            // InternalDsl.g:5440:2: rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl rule__SubmodelElementCollectionFurtherInformation__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__7"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl"
    // InternalDsl.g:5447:1: rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl : ( ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )* ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5451:1: ( ( ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )* ) )
            // InternalDsl.g:5452:1: ( ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )* )
            {
            // InternalDsl.g:5452:1: ( ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )* )
            // InternalDsl.g:5453:2: ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )*
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getGroup_7()); 
            // InternalDsl.g:5454:2: ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:5454:3: rule__SubmodelElementCollectionFurtherInformation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SubmodelElementCollectionFurtherInformation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__7__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__8"
    // InternalDsl.g:5462:1: rule__SubmodelElementCollectionFurtherInformation__Group__8 : rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl rule__SubmodelElementCollectionFurtherInformation__Group__9 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5466:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl rule__SubmodelElementCollectionFurtherInformation__Group__9 )
            // InternalDsl.g:5467:2: rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl rule__SubmodelElementCollectionFurtherInformation__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__8"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl"
    // InternalDsl.g:5474:1: rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl : ( ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 ) ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5478:1: ( ( ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 ) ) )
            // InternalDsl.g:5479:1: ( ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 ) )
            {
            // InternalDsl.g:5479:1: ( ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 ) )
            // InternalDsl.g:5480:2: ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 )
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getValidDateAssignment_8()); 
            // InternalDsl.g:5481:2: ( rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 )
            // InternalDsl.g:5481:3: rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getValidDateAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__8__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__9"
    // InternalDsl.g:5489:1: rule__SubmodelElementCollectionFurtherInformation__Group__9 : rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl rule__SubmodelElementCollectionFurtherInformation__Group__10 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5493:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl rule__SubmodelElementCollectionFurtherInformation__Group__10 )
            // InternalDsl.g:5494:2: rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl rule__SubmodelElementCollectionFurtherInformation__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__9"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl"
    // InternalDsl.g:5501:1: rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5505:1: ( ( ';' ) )
            // InternalDsl.g:5506:1: ( ';' )
            {
            // InternalDsl.g:5506:1: ( ';' )
            // InternalDsl.g:5507:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__9__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__10"
    // InternalDsl.g:5516:1: rule__SubmodelElementCollectionFurtherInformation__Group__10 : rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5520:1: ( rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl )
            // InternalDsl.g:5521:2: rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__10"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl"
    // InternalDsl.g:5527:1: rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl : ( '}' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5531:1: ( ( '}' ) )
            // InternalDsl.g:5532:1: ( '}' )
            {
            // InternalDsl.g:5532:1: ( '}' )
            // InternalDsl.g:5533:2: '}'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group__10__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group_7__0"
    // InternalDsl.g:5543:1: rule__SubmodelElementCollectionFurtherInformation__Group_7__0 : rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group_7__1 ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5547:1: ( rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group_7__1 )
            // InternalDsl.g:5548:2: rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl rule__SubmodelElementCollectionFurtherInformation__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group_7__0"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl"
    // InternalDsl.g:5555:1: rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl : ( ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 ) ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5559:1: ( ( ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 ) ) )
            // InternalDsl.g:5560:1: ( ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 ) )
            {
            // InternalDsl.g:5560:1: ( ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 ) )
            // InternalDsl.g:5561:2: ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 )
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getTextStatementAssignment_7_0()); 
            // InternalDsl.g:5562:2: ( rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 )
            // InternalDsl.g:5562:3: rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getTextStatementAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group_7__0__Impl"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group_7__1"
    // InternalDsl.g:5570:1: rule__SubmodelElementCollectionFurtherInformation__Group_7__1 : rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5574:1: ( rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl )
            // InternalDsl.g:5575:2: rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group_7__1"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl"
    // InternalDsl.g:5581:1: rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl : ( ';' ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5585:1: ( ( ';' ) )
            // InternalDsl.g:5586:1: ( ';' )
            {
            // InternalDsl.g:5586:1: ( ';' )
            // InternalDsl.g:5587:2: ';'
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__Group_7__1__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__0"
    // InternalDsl.g:5597:1: rule__MultiLanguagePropertyTextStatement__Group__0 : rule__MultiLanguagePropertyTextStatement__Group__0__Impl rule__MultiLanguagePropertyTextStatement__Group__1 ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5601:1: ( rule__MultiLanguagePropertyTextStatement__Group__0__Impl rule__MultiLanguagePropertyTextStatement__Group__1 )
            // InternalDsl.g:5602:2: rule__MultiLanguagePropertyTextStatement__Group__0__Impl rule__MultiLanguagePropertyTextStatement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MultiLanguagePropertyTextStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__0"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__0__Impl"
    // InternalDsl.g:5609:1: rule__MultiLanguagePropertyTextStatement__Group__0__Impl : ( 'TextStatement' ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5613:1: ( ( 'TextStatement' ) )
            // InternalDsl.g:5614:1: ( 'TextStatement' )
            {
            // InternalDsl.g:5614:1: ( 'TextStatement' )
            // InternalDsl.g:5615:2: 'TextStatement'
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getTextStatementKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getTextStatementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__0__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__1"
    // InternalDsl.g:5624:1: rule__MultiLanguagePropertyTextStatement__Group__1 : rule__MultiLanguagePropertyTextStatement__Group__1__Impl rule__MultiLanguagePropertyTextStatement__Group__2 ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5628:1: ( rule__MultiLanguagePropertyTextStatement__Group__1__Impl rule__MultiLanguagePropertyTextStatement__Group__2 )
            // InternalDsl.g:5629:2: rule__MultiLanguagePropertyTextStatement__Group__1__Impl rule__MultiLanguagePropertyTextStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiLanguagePropertyTextStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__1"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__1__Impl"
    // InternalDsl.g:5636:1: rule__MultiLanguagePropertyTextStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5640:1: ( ( ':' ) )
            // InternalDsl.g:5641:1: ( ':' )
            {
            // InternalDsl.g:5641:1: ( ':' )
            // InternalDsl.g:5642:2: ':'
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__1__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__2"
    // InternalDsl.g:5651:1: rule__MultiLanguagePropertyTextStatement__Group__2 : rule__MultiLanguagePropertyTextStatement__Group__2__Impl rule__MultiLanguagePropertyTextStatement__Group__3 ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5655:1: ( rule__MultiLanguagePropertyTextStatement__Group__2__Impl rule__MultiLanguagePropertyTextStatement__Group__3 )
            // InternalDsl.g:5656:2: rule__MultiLanguagePropertyTextStatement__Group__2__Impl rule__MultiLanguagePropertyTextStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MultiLanguagePropertyTextStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__2"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__2__Impl"
    // InternalDsl.g:5663:1: rule__MultiLanguagePropertyTextStatement__Group__2__Impl : ( ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 ) ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5667:1: ( ( ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 ) ) )
            // InternalDsl.g:5668:1: ( ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 ) )
            {
            // InternalDsl.g:5668:1: ( ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 ) )
            // InternalDsl.g:5669:2: ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 )
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getNameAssignment_2()); 
            // InternalDsl.g:5670:2: ( rule__MultiLanguagePropertyTextStatement__NameAssignment_2 )
            // InternalDsl.g:5670:3: rule__MultiLanguagePropertyTextStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__3"
    // InternalDsl.g:5678:1: rule__MultiLanguagePropertyTextStatement__Group__3 : rule__MultiLanguagePropertyTextStatement__Group__3__Impl rule__MultiLanguagePropertyTextStatement__Group__4 ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5682:1: ( rule__MultiLanguagePropertyTextStatement__Group__3__Impl rule__MultiLanguagePropertyTextStatement__Group__4 )
            // InternalDsl.g:5683:2: rule__MultiLanguagePropertyTextStatement__Group__3__Impl rule__MultiLanguagePropertyTextStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MultiLanguagePropertyTextStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__3"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__3__Impl"
    // InternalDsl.g:5690:1: rule__MultiLanguagePropertyTextStatement__Group__3__Impl : ( '[[' ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5694:1: ( ( '[[' ) )
            // InternalDsl.g:5695:1: ( '[[' )
            {
            // InternalDsl.g:5695:1: ( '[[' )
            // InternalDsl.g:5696:2: '[['
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__3__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__4"
    // InternalDsl.g:5705:1: rule__MultiLanguagePropertyTextStatement__Group__4 : rule__MultiLanguagePropertyTextStatement__Group__4__Impl rule__MultiLanguagePropertyTextStatement__Group__5 ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5709:1: ( rule__MultiLanguagePropertyTextStatement__Group__4__Impl rule__MultiLanguagePropertyTextStatement__Group__5 )
            // InternalDsl.g:5710:2: rule__MultiLanguagePropertyTextStatement__Group__4__Impl rule__MultiLanguagePropertyTextStatement__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__MultiLanguagePropertyTextStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__4"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__4__Impl"
    // InternalDsl.g:5717:1: rule__MultiLanguagePropertyTextStatement__Group__4__Impl : ( ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 ) ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5721:1: ( ( ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:5722:1: ( ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:5722:1: ( ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 ) )
            // InternalDsl.g:5723:2: ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:5724:2: ( rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 )
            // InternalDsl.g:5724:3: rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__4__Impl"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__5"
    // InternalDsl.g:5732:1: rule__MultiLanguagePropertyTextStatement__Group__5 : rule__MultiLanguagePropertyTextStatement__Group__5__Impl ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5736:1: ( rule__MultiLanguagePropertyTextStatement__Group__5__Impl )
            // InternalDsl.g:5737:2: rule__MultiLanguagePropertyTextStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLanguagePropertyTextStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__5"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__Group__5__Impl"
    // InternalDsl.g:5743:1: rule__MultiLanguagePropertyTextStatement__Group__5__Impl : ( ']]' ) ;
    public final void rule__MultiLanguagePropertyTextStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5747:1: ( ( ']]' ) )
            // InternalDsl.g:5748:1: ( ']]' )
            {
            // InternalDsl.g:5748:1: ( ']]' )
            // InternalDsl.g:5749:2: ']]'
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__Group__5__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__0"
    // InternalDsl.g:5759:1: rule__PropertyValidDate__Group__0 : rule__PropertyValidDate__Group__0__Impl rule__PropertyValidDate__Group__1 ;
    public final void rule__PropertyValidDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5763:1: ( rule__PropertyValidDate__Group__0__Impl rule__PropertyValidDate__Group__1 )
            // InternalDsl.g:5764:2: rule__PropertyValidDate__Group__0__Impl rule__PropertyValidDate__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyValidDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__0"


    // $ANTLR start "rule__PropertyValidDate__Group__0__Impl"
    // InternalDsl.g:5771:1: rule__PropertyValidDate__Group__0__Impl : ( 'ValidDate' ) ;
    public final void rule__PropertyValidDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5775:1: ( ( 'ValidDate' ) )
            // InternalDsl.g:5776:1: ( 'ValidDate' )
            {
            // InternalDsl.g:5776:1: ( 'ValidDate' )
            // InternalDsl.g:5777:2: 'ValidDate'
            {
             before(grammarAccess.getPropertyValidDateAccess().getValidDateKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPropertyValidDateAccess().getValidDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__0__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__1"
    // InternalDsl.g:5786:1: rule__PropertyValidDate__Group__1 : rule__PropertyValidDate__Group__1__Impl rule__PropertyValidDate__Group__2 ;
    public final void rule__PropertyValidDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5790:1: ( rule__PropertyValidDate__Group__1__Impl rule__PropertyValidDate__Group__2 )
            // InternalDsl.g:5791:2: rule__PropertyValidDate__Group__1__Impl rule__PropertyValidDate__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyValidDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__1"


    // $ANTLR start "rule__PropertyValidDate__Group__1__Impl"
    // InternalDsl.g:5798:1: rule__PropertyValidDate__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyValidDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5802:1: ( ( ':' ) )
            // InternalDsl.g:5803:1: ( ':' )
            {
            // InternalDsl.g:5803:1: ( ':' )
            // InternalDsl.g:5804:2: ':'
            {
             before(grammarAccess.getPropertyValidDateAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyValidDateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__1__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__2"
    // InternalDsl.g:5813:1: rule__PropertyValidDate__Group__2 : rule__PropertyValidDate__Group__2__Impl rule__PropertyValidDate__Group__3 ;
    public final void rule__PropertyValidDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5817:1: ( rule__PropertyValidDate__Group__2__Impl rule__PropertyValidDate__Group__3 )
            // InternalDsl.g:5818:2: rule__PropertyValidDate__Group__2__Impl rule__PropertyValidDate__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyValidDate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__2"


    // $ANTLR start "rule__PropertyValidDate__Group__2__Impl"
    // InternalDsl.g:5825:1: rule__PropertyValidDate__Group__2__Impl : ( ( rule__PropertyValidDate__NameAssignment_2 ) ) ;
    public final void rule__PropertyValidDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5829:1: ( ( ( rule__PropertyValidDate__NameAssignment_2 ) ) )
            // InternalDsl.g:5830:1: ( ( rule__PropertyValidDate__NameAssignment_2 ) )
            {
            // InternalDsl.g:5830:1: ( ( rule__PropertyValidDate__NameAssignment_2 ) )
            // InternalDsl.g:5831:2: ( rule__PropertyValidDate__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyValidDateAccess().getNameAssignment_2()); 
            // InternalDsl.g:5832:2: ( rule__PropertyValidDate__NameAssignment_2 )
            // InternalDsl.g:5832:3: rule__PropertyValidDate__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValidDateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__2__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__3"
    // InternalDsl.g:5840:1: rule__PropertyValidDate__Group__3 : rule__PropertyValidDate__Group__3__Impl rule__PropertyValidDate__Group__4 ;
    public final void rule__PropertyValidDate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5844:1: ( rule__PropertyValidDate__Group__3__Impl rule__PropertyValidDate__Group__4 )
            // InternalDsl.g:5845:2: rule__PropertyValidDate__Group__3__Impl rule__PropertyValidDate__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PropertyValidDate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__3"


    // $ANTLR start "rule__PropertyValidDate__Group__3__Impl"
    // InternalDsl.g:5852:1: rule__PropertyValidDate__Group__3__Impl : ( '[[' ) ;
    public final void rule__PropertyValidDate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5856:1: ( ( '[[' ) )
            // InternalDsl.g:5857:1: ( '[[' )
            {
            // InternalDsl.g:5857:1: ( '[[' )
            // InternalDsl.g:5858:2: '[['
            {
             before(grammarAccess.getPropertyValidDateAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyValidDateAccess().getLeftSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__3__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__4"
    // InternalDsl.g:5867:1: rule__PropertyValidDate__Group__4 : rule__PropertyValidDate__Group__4__Impl rule__PropertyValidDate__Group__5 ;
    public final void rule__PropertyValidDate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5871:1: ( rule__PropertyValidDate__Group__4__Impl rule__PropertyValidDate__Group__5 )
            // InternalDsl.g:5872:2: rule__PropertyValidDate__Group__4__Impl rule__PropertyValidDate__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PropertyValidDate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__4"


    // $ANTLR start "rule__PropertyValidDate__Group__4__Impl"
    // InternalDsl.g:5879:1: rule__PropertyValidDate__Group__4__Impl : ( ( rule__PropertyValidDate__SemanticIdAssignment_4 ) ) ;
    public final void rule__PropertyValidDate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5883:1: ( ( ( rule__PropertyValidDate__SemanticIdAssignment_4 ) ) )
            // InternalDsl.g:5884:1: ( ( rule__PropertyValidDate__SemanticIdAssignment_4 ) )
            {
            // InternalDsl.g:5884:1: ( ( rule__PropertyValidDate__SemanticIdAssignment_4 ) )
            // InternalDsl.g:5885:2: ( rule__PropertyValidDate__SemanticIdAssignment_4 )
            {
             before(grammarAccess.getPropertyValidDateAccess().getSemanticIdAssignment_4()); 
            // InternalDsl.g:5886:2: ( rule__PropertyValidDate__SemanticIdAssignment_4 )
            // InternalDsl.g:5886:3: rule__PropertyValidDate__SemanticIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__SemanticIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValidDateAccess().getSemanticIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__4__Impl"


    // $ANTLR start "rule__PropertyValidDate__Group__5"
    // InternalDsl.g:5894:1: rule__PropertyValidDate__Group__5 : rule__PropertyValidDate__Group__5__Impl ;
    public final void rule__PropertyValidDate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5898:1: ( rule__PropertyValidDate__Group__5__Impl )
            // InternalDsl.g:5899:2: rule__PropertyValidDate__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValidDate__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__5"


    // $ANTLR start "rule__PropertyValidDate__Group__5__Impl"
    // InternalDsl.g:5905:1: rule__PropertyValidDate__Group__5__Impl : ( ']]' ) ;
    public final void rule__PropertyValidDate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5909:1: ( ( ']]' ) )
            // InternalDsl.g:5910:1: ( ']]' )
            {
            // InternalDsl.g:5910:1: ( ']]' )
            // InternalDsl.g:5911:2: ']]'
            {
             before(grammarAccess.getPropertyValidDateAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyValidDateAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__Group__5__Impl"


    // $ANTLR start "rule__SID__Group__0"
    // InternalDsl.g:5921:1: rule__SID__Group__0 : rule__SID__Group__0__Impl rule__SID__Group__1 ;
    public final void rule__SID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5925:1: ( rule__SID__Group__0__Impl rule__SID__Group__1 )
            // InternalDsl.g:5926:2: rule__SID__Group__0__Impl rule__SID__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__0"


    // $ANTLR start "rule__SID__Group__0__Impl"
    // InternalDsl.g:5933:1: rule__SID__Group__0__Impl : ( 'SemanticId' ) ;
    public final void rule__SID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5937:1: ( ( 'SemanticId' ) )
            // InternalDsl.g:5938:1: ( 'SemanticId' )
            {
            // InternalDsl.g:5938:1: ( 'SemanticId' )
            // InternalDsl.g:5939:2: 'SemanticId'
            {
             before(grammarAccess.getSIDAccess().getSemanticIdKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSIDAccess().getSemanticIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__0__Impl"


    // $ANTLR start "rule__SID__Group__1"
    // InternalDsl.g:5948:1: rule__SID__Group__1 : rule__SID__Group__1__Impl rule__SID__Group__2 ;
    public final void rule__SID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5952:1: ( rule__SID__Group__1__Impl rule__SID__Group__2 )
            // InternalDsl.g:5953:2: rule__SID__Group__1__Impl rule__SID__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SID__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SID__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__1"


    // $ANTLR start "rule__SID__Group__1__Impl"
    // InternalDsl.g:5960:1: rule__SID__Group__1__Impl : ( ':' ) ;
    public final void rule__SID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5964:1: ( ( ':' ) )
            // InternalDsl.g:5965:1: ( ':' )
            {
            // InternalDsl.g:5965:1: ( ':' )
            // InternalDsl.g:5966:2: ':'
            {
             before(grammarAccess.getSIDAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSIDAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__1__Impl"


    // $ANTLR start "rule__SID__Group__2"
    // InternalDsl.g:5975:1: rule__SID__Group__2 : rule__SID__Group__2__Impl rule__SID__Group__3 ;
    public final void rule__SID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5979:1: ( rule__SID__Group__2__Impl rule__SID__Group__3 )
            // InternalDsl.g:5980:2: rule__SID__Group__2__Impl rule__SID__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SID__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SID__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__2"


    // $ANTLR start "rule__SID__Group__2__Impl"
    // InternalDsl.g:5987:1: rule__SID__Group__2__Impl : ( ( rule__SID__NameAssignment_2 ) ) ;
    public final void rule__SID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5991:1: ( ( ( rule__SID__NameAssignment_2 ) ) )
            // InternalDsl.g:5992:1: ( ( rule__SID__NameAssignment_2 ) )
            {
            // InternalDsl.g:5992:1: ( ( rule__SID__NameAssignment_2 ) )
            // InternalDsl.g:5993:2: ( rule__SID__NameAssignment_2 )
            {
             before(grammarAccess.getSIDAccess().getNameAssignment_2()); 
            // InternalDsl.g:5994:2: ( rule__SID__NameAssignment_2 )
            // InternalDsl.g:5994:3: rule__SID__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SID__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSIDAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__2__Impl"


    // $ANTLR start "rule__SID__Group__3"
    // InternalDsl.g:6002:1: rule__SID__Group__3 : rule__SID__Group__3__Impl rule__SID__Group__4 ;
    public final void rule__SID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6006:1: ( rule__SID__Group__3__Impl rule__SID__Group__4 )
            // InternalDsl.g:6007:2: rule__SID__Group__3__Impl rule__SID__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SID__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SID__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__3"


    // $ANTLR start "rule__SID__Group__3__Impl"
    // InternalDsl.g:6014:1: rule__SID__Group__3__Impl : ( '|' ) ;
    public final void rule__SID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6018:1: ( ( '|' ) )
            // InternalDsl.g:6019:1: ( '|' )
            {
            // InternalDsl.g:6019:1: ( '|' )
            // InternalDsl.g:6020:2: '|'
            {
             before(grammarAccess.getSIDAccess().getVerticalLineKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSIDAccess().getVerticalLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__3__Impl"


    // $ANTLR start "rule__SID__Group__4"
    // InternalDsl.g:6029:1: rule__SID__Group__4 : rule__SID__Group__4__Impl ;
    public final void rule__SID__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6033:1: ( rule__SID__Group__4__Impl )
            // InternalDsl.g:6034:2: rule__SID__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SID__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__4"


    // $ANTLR start "rule__SID__Group__4__Impl"
    // InternalDsl.g:6040:1: rule__SID__Group__4__Impl : ( ( rule__SID__IIAssignment_4 ) ) ;
    public final void rule__SID__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6044:1: ( ( ( rule__SID__IIAssignment_4 ) ) )
            // InternalDsl.g:6045:1: ( ( rule__SID__IIAssignment_4 ) )
            {
            // InternalDsl.g:6045:1: ( ( rule__SID__IIAssignment_4 ) )
            // InternalDsl.g:6046:2: ( rule__SID__IIAssignment_4 )
            {
             before(grammarAccess.getSIDAccess().getIIAssignment_4()); 
            // InternalDsl.g:6047:2: ( rule__SID__IIAssignment_4 )
            // InternalDsl.g:6047:3: rule__SID__IIAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SID__IIAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSIDAccess().getIIAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__Group__4__Impl"


    // $ANTLR start "rule__Model__TechnicaldataAssignment"
    // InternalDsl.g:6056:1: rule__Model__TechnicaldataAssignment : ( ruleTechnicaldataSubmodel ) ;
    public final void rule__Model__TechnicaldataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6060:1: ( ( ruleTechnicaldataSubmodel ) )
            // InternalDsl.g:6061:2: ( ruleTechnicaldataSubmodel )
            {
            // InternalDsl.g:6061:2: ( ruleTechnicaldataSubmodel )
            // InternalDsl.g:6062:3: ruleTechnicaldataSubmodel
            {
             before(grammarAccess.getModelAccess().getTechnicaldataTechnicaldataSubmodelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnicaldataSubmodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTechnicaldataTechnicaldataSubmodelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TechnicaldataAssignment"


    // $ANTLR start "rule__TechnicaldataSubmodel__NameAssignment_3"
    // InternalDsl.g:6071:1: rule__TechnicaldataSubmodel__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TechnicaldataSubmodel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6075:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6076:2: ( RULE_STRING )
            {
            // InternalDsl.g:6076:2: ( RULE_STRING )
            // InternalDsl.g:6077:3: RULE_STRING
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTechnicaldataSubmodelAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__NameAssignment_3"


    // $ANTLR start "rule__TechnicaldataSubmodel__SemanticIdAssignment_5"
    // InternalDsl.g:6086:1: rule__TechnicaldataSubmodel__SemanticIdAssignment_5 : ( ruleSID ) ;
    public final void rule__TechnicaldataSubmodel__SemanticIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6090:1: ( ( ruleSID ) )
            // InternalDsl.g:6091:2: ( ruleSID )
            {
            // InternalDsl.g:6091:2: ( ruleSID )
            // InternalDsl.g:6092:3: ruleSID
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getSemanticIdSIDParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelAccess().getSemanticIdSIDParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__SemanticIdAssignment_5"


    // $ANTLR start "rule__TechnicaldataSubmodel__GeneralInformationAssignment_8"
    // InternalDsl.g:6101:1: rule__TechnicaldataSubmodel__GeneralInformationAssignment_8 : ( ruleSubmodelElementCollectionGeneralInformation ) ;
    public final void rule__TechnicaldataSubmodel__GeneralInformationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6105:1: ( ( ruleSubmodelElementCollectionGeneralInformation ) )
            // InternalDsl.g:6106:2: ( ruleSubmodelElementCollectionGeneralInformation )
            {
            // InternalDsl.g:6106:2: ( ruleSubmodelElementCollectionGeneralInformation )
            // InternalDsl.g:6107:3: ruleSubmodelElementCollectionGeneralInformation
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getGeneralInformationSubmodelElementCollectionGeneralInformationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionGeneralInformation();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelAccess().getGeneralInformationSubmodelElementCollectionGeneralInformationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__GeneralInformationAssignment_8"


    // $ANTLR start "rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0"
    // InternalDsl.g:6116:1: rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0 : ( ruleSubmodelElementCollectionProductClassifications ) ;
    public final void rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6120:1: ( ( ruleSubmodelElementCollectionProductClassifications ) )
            // InternalDsl.g:6121:2: ( ruleSubmodelElementCollectionProductClassifications )
            {
            // InternalDsl.g:6121:2: ( ruleSubmodelElementCollectionProductClassifications )
            // InternalDsl.g:6122:3: ruleSubmodelElementCollectionProductClassifications
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getProductClassificationsSubmodelElementCollectionProductClassificationsParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionProductClassifications();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelAccess().getProductClassificationsSubmodelElementCollectionProductClassificationsParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__ProductClassificationsAssignment_10_0"


    // $ANTLR start "rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11"
    // InternalDsl.g:6131:1: rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11 : ( ruleSubmodelElementCollectionTechnicalProperties ) ;
    public final void rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6135:1: ( ( ruleSubmodelElementCollectionTechnicalProperties ) )
            // InternalDsl.g:6136:2: ( ruleSubmodelElementCollectionTechnicalProperties )
            {
            // InternalDsl.g:6136:2: ( ruleSubmodelElementCollectionTechnicalProperties )
            // InternalDsl.g:6137:3: ruleSubmodelElementCollectionTechnicalProperties
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalPropertiesSubmodelElementCollectionTechnicalPropertiesParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionTechnicalProperties();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelAccess().getTechnicalPropertiesSubmodelElementCollectionTechnicalPropertiesParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__TechnicalPropertiesAssignment_11"


    // $ANTLR start "rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0"
    // InternalDsl.g:6146:1: rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0 : ( ruleSubmodelElementCollectionFurtherInformation ) ;
    public final void rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6150:1: ( ( ruleSubmodelElementCollectionFurtherInformation ) )
            // InternalDsl.g:6151:2: ( ruleSubmodelElementCollectionFurtherInformation )
            {
            // InternalDsl.g:6151:2: ( ruleSubmodelElementCollectionFurtherInformation )
            // InternalDsl.g:6152:3: ruleSubmodelElementCollectionFurtherInformation
            {
             before(grammarAccess.getTechnicaldataSubmodelAccess().getFurtherInformationSubmodelElementCollectionFurtherInformationParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionFurtherInformation();

            state._fsp--;

             after(grammarAccess.getTechnicaldataSubmodelAccess().getFurtherInformationSubmodelElementCollectionFurtherInformationParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TechnicaldataSubmodel__FurtherInformationAssignment_13_0"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2"
    // InternalDsl.g:6161:1: rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6165:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6166:2: ( RULE_STRING )
            {
            // InternalDsl.g:6166:2: ( RULE_STRING )
            // InternalDsl.g:6167:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4"
    // InternalDsl.g:6176:1: rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6180:1: ( ( ruleSID ) )
            // InternalDsl.g:6181:2: ( ruleSID )
            {
            // InternalDsl.g:6181:2: ( ruleSID )
            // InternalDsl.g:6182:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7"
    // InternalDsl.g:6191:1: rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7 : ( rulePropertyManufacturerName ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6195:1: ( ( rulePropertyManufacturerName ) )
            // InternalDsl.g:6196:2: ( rulePropertyManufacturerName )
            {
            // InternalDsl.g:6196:2: ( rulePropertyManufacturerName )
            // InternalDsl.g:6197:3: rulePropertyManufacturerName
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerNamePropertyManufacturerNameParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyManufacturerName();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerNamePropertyManufacturerNameParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ManufacturerNameAssignment_7"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0"
    // InternalDsl.g:6206:1: rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0 : ( ruleFileManufacturerLogo ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6210:1: ( ( ruleFileManufacturerLogo ) )
            // InternalDsl.g:6211:2: ( ruleFileManufacturerLogo )
            {
            // InternalDsl.g:6211:2: ( ruleFileManufacturerLogo )
            // InternalDsl.g:6212:3: ruleFileManufacturerLogo
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerLogoFileManufacturerLogoParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFileManufacturerLogo();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerLogoFileManufacturerLogoParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ManufacturerLogoAssignment_9_0"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10"
    // InternalDsl.g:6221:1: rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10 : ( ruleMultiLanguagePropertyManufacturerProductDesignation ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6225:1: ( ( ruleMultiLanguagePropertyManufacturerProductDesignation ) )
            // InternalDsl.g:6226:2: ( ruleMultiLanguagePropertyManufacturerProductDesignation )
            {
            // InternalDsl.g:6226:2: ( ruleMultiLanguagePropertyManufacturerProductDesignation )
            // InternalDsl.g:6227:3: ruleMultiLanguagePropertyManufacturerProductDesignation
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerProductDesignationMultiLanguagePropertyManufacturerProductDesignationParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiLanguagePropertyManufacturerProductDesignation();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerProductDesignationMultiLanguagePropertyManufacturerProductDesignationParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ManufacturerProductDesignationAssignment_10"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12"
    // InternalDsl.g:6236:1: rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12 : ( rulePropertyManufacturerPartNumber ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6240:1: ( ( rulePropertyManufacturerPartNumber ) )
            // InternalDsl.g:6241:2: ( rulePropertyManufacturerPartNumber )
            {
            // InternalDsl.g:6241:2: ( rulePropertyManufacturerPartNumber )
            // InternalDsl.g:6242:3: rulePropertyManufacturerPartNumber
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerPartNumberPropertyManufacturerPartNumberParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyManufacturerPartNumber();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerPartNumberPropertyManufacturerPartNumberParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ManufacturerPartNumberAssignment_12"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14"
    // InternalDsl.g:6251:1: rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14 : ( rulePropertyManufacturerOrderCode ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6255:1: ( ( rulePropertyManufacturerOrderCode ) )
            // InternalDsl.g:6256:2: ( rulePropertyManufacturerOrderCode )
            {
            // InternalDsl.g:6256:2: ( rulePropertyManufacturerOrderCode )
            // InternalDsl.g:6257:3: rulePropertyManufacturerOrderCode
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerOrderCodePropertyManufacturerOrderCodeParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyManufacturerOrderCode();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getManufacturerOrderCodePropertyManufacturerOrderCodeParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ManufacturerOrderCodeAssignment_14"


    // $ANTLR start "rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0"
    // InternalDsl.g:6266:1: rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0 : ( ruleFileProductImage ) ;
    public final void rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6270:1: ( ( ruleFileProductImage ) )
            // InternalDsl.g:6271:2: ( ruleFileProductImage )
            {
            // InternalDsl.g:6271:2: ( ruleFileProductImage )
            // InternalDsl.g:6272:3: ruleFileProductImage
            {
             before(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getProductImageFileProductImageParserRuleCall_16_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFileProductImage();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionGeneralInformationAccess().getProductImageFileProductImageParserRuleCall_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionGeneralInformation__ProductImageAssignment_16_0"


    // $ANTLR start "rule__PropertyManufacturerName__NameAssignment_2"
    // InternalDsl.g:6281:1: rule__PropertyManufacturerName__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyManufacturerName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6285:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6286:2: ( RULE_STRING )
            {
            // InternalDsl.g:6286:2: ( RULE_STRING )
            // InternalDsl.g:6287:3: RULE_STRING
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__NameAssignment_2"


    // $ANTLR start "rule__PropertyManufacturerName__SemanticIdAssignment_4"
    // InternalDsl.g:6296:1: rule__PropertyManufacturerName__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyManufacturerName__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6300:1: ( ( ruleSID ) )
            // InternalDsl.g:6301:2: ( ruleSID )
            {
            // InternalDsl.g:6301:2: ( ruleSID )
            // InternalDsl.g:6302:3: ruleSID
            {
             before(grammarAccess.getPropertyManufacturerNameAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerNameAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerName__SemanticIdAssignment_4"


    // $ANTLR start "rule__FileManufacturerLogo__NameAssignment_2"
    // InternalDsl.g:6311:1: rule__FileManufacturerLogo__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileManufacturerLogo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6315:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6316:2: ( RULE_STRING )
            {
            // InternalDsl.g:6316:2: ( RULE_STRING )
            // InternalDsl.g:6317:3: RULE_STRING
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileManufacturerLogoAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__NameAssignment_2"


    // $ANTLR start "rule__FileManufacturerLogo__SemanticIdAssignment_4"
    // InternalDsl.g:6326:1: rule__FileManufacturerLogo__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__FileManufacturerLogo__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6330:1: ( ( ruleSID ) )
            // InternalDsl.g:6331:2: ( ruleSID )
            {
            // InternalDsl.g:6331:2: ( ruleSID )
            // InternalDsl.g:6332:3: ruleSID
            {
             before(grammarAccess.getFileManufacturerLogoAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getFileManufacturerLogoAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileManufacturerLogo__SemanticIdAssignment_4"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2"
    // InternalDsl.g:6341:1: rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6345:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6346:2: ( RULE_STRING )
            {
            // InternalDsl.g:6346:2: ( RULE_STRING )
            // InternalDsl.g:6347:3: RULE_STRING
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__NameAssignment_2"


    // $ANTLR start "rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4"
    // InternalDsl.g:6356:1: rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6360:1: ( ( ruleSID ) )
            // InternalDsl.g:6361:2: ( ruleSID )
            {
            // InternalDsl.g:6361:2: ( ruleSID )
            // InternalDsl.g:6362:3: ruleSID
            {
             before(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getMultiLanguagePropertyManufacturerProductDesignationAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyManufacturerProductDesignation__SemanticIdAssignment_4"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__NameAssignment_2"
    // InternalDsl.g:6371:1: rule__PropertyManufacturerPartNumber__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyManufacturerPartNumber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6375:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6376:2: ( RULE_STRING )
            {
            // InternalDsl.g:6376:2: ( RULE_STRING )
            // InternalDsl.g:6377:3: RULE_STRING
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__NameAssignment_2"


    // $ANTLR start "rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4"
    // InternalDsl.g:6386:1: rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6390:1: ( ( ruleSID ) )
            // InternalDsl.g:6391:2: ( ruleSID )
            {
            // InternalDsl.g:6391:2: ( ruleSID )
            // InternalDsl.g:6392:3: ruleSID
            {
             before(grammarAccess.getPropertyManufacturerPartNumberAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerPartNumberAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerPartNumber__SemanticIdAssignment_4"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__NameAssignment_2"
    // InternalDsl.g:6401:1: rule__PropertyManufacturerOrderCode__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyManufacturerOrderCode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6405:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6406:2: ( RULE_STRING )
            {
            // InternalDsl.g:6406:2: ( RULE_STRING )
            // InternalDsl.g:6407:3: RULE_STRING
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__NameAssignment_2"


    // $ANTLR start "rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4"
    // InternalDsl.g:6416:1: rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6420:1: ( ( ruleSID ) )
            // InternalDsl.g:6421:2: ( ruleSID )
            {
            // InternalDsl.g:6421:2: ( ruleSID )
            // InternalDsl.g:6422:3: ruleSID
            {
             before(grammarAccess.getPropertyManufacturerOrderCodeAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyManufacturerOrderCodeAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyManufacturerOrderCode__SemanticIdAssignment_4"


    // $ANTLR start "rule__FileProductImage__NameAssignment_2"
    // InternalDsl.g:6431:1: rule__FileProductImage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileProductImage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6435:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6436:2: ( RULE_STRING )
            {
            // InternalDsl.g:6436:2: ( RULE_STRING )
            // InternalDsl.g:6437:3: RULE_STRING
            {
             before(grammarAccess.getFileProductImageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileProductImageAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__NameAssignment_2"


    // $ANTLR start "rule__FileProductImage__SemanticIdAssignment_4"
    // InternalDsl.g:6446:1: rule__FileProductImage__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__FileProductImage__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6450:1: ( ( ruleSID ) )
            // InternalDsl.g:6451:2: ( ruleSID )
            {
            // InternalDsl.g:6451:2: ( ruleSID )
            // InternalDsl.g:6452:3: ruleSID
            {
             before(grammarAccess.getFileProductImageAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getFileProductImageAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileProductImage__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__NameAssignment_2"
    // InternalDsl.g:6461:1: rule__SubmodelElementCollectionProductClassifications__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6465:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6466:2: ( RULE_STRING )
            {
            // InternalDsl.g:6466:2: ( RULE_STRING )
            // InternalDsl.g:6467:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4"
    // InternalDsl.g:6476:1: rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6480:1: ( ( ruleSID ) )
            // InternalDsl.g:6481:2: ( ruleSID )
            {
            // InternalDsl.g:6481:2: ( ruleSID )
            // InternalDsl.g:6482:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0"
    // InternalDsl.g:6491:1: rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0 : ( ruleSubmodelElementCollectionProductClassificationItem ) ;
    public final void rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6495:1: ( ( ruleSubmodelElementCollectionProductClassificationItem ) )
            // InternalDsl.g:6496:2: ( ruleSubmodelElementCollectionProductClassificationItem )
            {
            // InternalDsl.g:6496:2: ( ruleSubmodelElementCollectionProductClassificationItem )
            // InternalDsl.g:6497:3: ruleSubmodelElementCollectionProductClassificationItem
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationItemSubmodelElementCollectionProductClassificationItemParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionProductClassificationItem();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationsAccess().getProductClassificationItemSubmodelElementCollectionProductClassificationItemParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassifications__ProductClassificationItemAssignment_7_0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2"
    // InternalDsl.g:6506:1: rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6510:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6511:2: ( RULE_STRING )
            {
            // InternalDsl.g:6511:2: ( RULE_STRING )
            // InternalDsl.g:6512:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4"
    // InternalDsl.g:6521:1: rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6525:1: ( ( ruleSID ) )
            // InternalDsl.g:6526:2: ( ruleSID )
            {
            // InternalDsl.g:6526:2: ( ruleSID )
            // InternalDsl.g:6527:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7"
    // InternalDsl.g:6536:1: rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7 : ( rulePropertyProductClassificationSystem ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6540:1: ( ( rulePropertyProductClassificationSystem ) )
            // InternalDsl.g:6541:2: ( rulePropertyProductClassificationSystem )
            {
            // InternalDsl.g:6541:2: ( rulePropertyProductClassificationSystem )
            // InternalDsl.g:6542:3: rulePropertyProductClassificationSystem
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationSystemPropertyProductClassificationSystemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyProductClassificationSystem();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassificationSystemPropertyProductClassificationSystemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__ProductClassificationSystemAssignment_7"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0"
    // InternalDsl.g:6551:1: rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0 : ( rulePropertyClassificationSystemVersion ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6555:1: ( ( rulePropertyClassificationSystemVersion ) )
            // InternalDsl.g:6556:2: ( rulePropertyClassificationSystemVersion )
            {
            // InternalDsl.g:6556:2: ( rulePropertyClassificationSystemVersion )
            // InternalDsl.g:6557:3: rulePropertyClassificationSystemVersion
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getClassificationSystemVersionPropertyClassificationSystemVersionParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyClassificationSystemVersion();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getClassificationSystemVersionPropertyClassificationSystemVersionParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__ClassificationSystemVersionAssignment_9_0"


    // $ANTLR start "rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10"
    // InternalDsl.g:6566:1: rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10 : ( rulePropertyProductClassId ) ;
    public final void rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6570:1: ( ( rulePropertyProductClassId ) )
            // InternalDsl.g:6571:2: ( rulePropertyProductClassId )
            {
            // InternalDsl.g:6571:2: ( rulePropertyProductClassId )
            // InternalDsl.g:6572:3: rulePropertyProductClassId
            {
             before(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassIdPropertyProductClassIdParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyProductClassId();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionProductClassificationItemAccess().getProductClassIdPropertyProductClassIdParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionProductClassificationItem__ProductClassIdAssignment_10"


    // $ANTLR start "rule__PropertyProductClassificationSystem__NameAssignment_2"
    // InternalDsl.g:6581:1: rule__PropertyProductClassificationSystem__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyProductClassificationSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6585:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6586:2: ( RULE_STRING )
            {
            // InternalDsl.g:6586:2: ( RULE_STRING )
            // InternalDsl.g:6587:3: RULE_STRING
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassificationSystemAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__NameAssignment_2"


    // $ANTLR start "rule__PropertyProductClassificationSystem__SemanticIdAssignment_4"
    // InternalDsl.g:6596:1: rule__PropertyProductClassificationSystem__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyProductClassificationSystem__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6600:1: ( ( ruleSID ) )
            // InternalDsl.g:6601:2: ( ruleSID )
            {
            // InternalDsl.g:6601:2: ( ruleSID )
            // InternalDsl.g:6602:3: ruleSID
            {
             before(grammarAccess.getPropertyProductClassificationSystemAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyProductClassificationSystemAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassificationSystem__SemanticIdAssignment_4"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__NameAssignment_2"
    // InternalDsl.g:6611:1: rule__PropertyClassificationSystemVersion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyClassificationSystemVersion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6615:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6616:2: ( RULE_STRING )
            {
            // InternalDsl.g:6616:2: ( RULE_STRING )
            // InternalDsl.g:6617:3: RULE_STRING
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__NameAssignment_2"


    // $ANTLR start "rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4"
    // InternalDsl.g:6626:1: rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6630:1: ( ( ruleSID ) )
            // InternalDsl.g:6631:2: ( ruleSID )
            {
            // InternalDsl.g:6631:2: ( ruleSID )
            // InternalDsl.g:6632:3: ruleSID
            {
             before(grammarAccess.getPropertyClassificationSystemVersionAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyClassificationSystemVersionAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyClassificationSystemVersion__SemanticIdAssignment_4"


    // $ANTLR start "rule__PropertyProductClassId__NameAssignment_2"
    // InternalDsl.g:6641:1: rule__PropertyProductClassId__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyProductClassId__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6645:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6646:2: ( RULE_STRING )
            {
            // InternalDsl.g:6646:2: ( RULE_STRING )
            // InternalDsl.g:6647:3: RULE_STRING
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyProductClassIdAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__NameAssignment_2"


    // $ANTLR start "rule__PropertyProductClassId__SemanticIdAssignment_4"
    // InternalDsl.g:6656:1: rule__PropertyProductClassId__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyProductClassId__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6660:1: ( ( ruleSID ) )
            // InternalDsl.g:6661:2: ( ruleSID )
            {
            // InternalDsl.g:6661:2: ( ruleSID )
            // InternalDsl.g:6662:3: ruleSID
            {
             before(grammarAccess.getPropertyProductClassIdAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyProductClassIdAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyProductClassId__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2"
    // InternalDsl.g:6671:1: rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6675:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6676:2: ( RULE_STRING )
            {
            // InternalDsl.g:6676:2: ( RULE_STRING )
            // InternalDsl.g:6677:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4"
    // InternalDsl.g:6686:1: rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6690:1: ( ( ruleSID ) )
            // InternalDsl.g:6691:2: ( ruleSID )
            {
            // InternalDsl.g:6691:2: ( ruleSID )
            // InternalDsl.g:6692:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0"
    // InternalDsl.g:6701:1: rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0 : ( ruleSubmodelElementArbitrary ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6705:1: ( ( ruleSubmodelElementArbitrary ) )
            // InternalDsl.g:6706:2: ( ruleSubmodelElementArbitrary )
            {
            // InternalDsl.g:6706:2: ( ruleSubmodelElementArbitrary )
            // InternalDsl.g:6707:3: ruleSubmodelElementArbitrary
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementArbitrary();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__ArbitraryAssignment_7_0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0"
    // InternalDsl.g:6716:1: rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0 : ( ruleSubmodelElementCollectionSection ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6720:1: ( ( ruleSubmodelElementCollectionSection ) )
            // InternalDsl.g:6721:2: ( ruleSubmodelElementCollectionSection )
            {
            // InternalDsl.g:6721:2: ( ruleSubmodelElementCollectionSection )
            // InternalDsl.g:6722:3: ruleSubmodelElementCollectionSection
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSectionSubmodelElementCollectionSectionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSectionSubmodelElementCollectionSectionParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__SectionAssignment_8_0"


    // $ANTLR start "rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0"
    // InternalDsl.g:6731:1: rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0 : ( ruleSubmodelElementCollectionSubSection ) ;
    public final void rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6735:1: ( ( ruleSubmodelElementCollectionSubSection ) )
            // InternalDsl.g:6736:2: ( ruleSubmodelElementCollectionSubSection )
            {
            // InternalDsl.g:6736:2: ( ruleSubmodelElementCollectionSubSection )
            // InternalDsl.g:6737:3: ruleSubmodelElementCollectionSubSection
            {
             before(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionSubSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionTechnicalPropertiesAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionTechnicalProperties__SubSectionAssignment_9_0"


    // $ANTLR start "rule__SubmodelElementArbitrary__NameAssignment_2"
    // InternalDsl.g:6746:1: rule__SubmodelElementArbitrary__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementArbitrary__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6750:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6751:2: ( RULE_STRING )
            {
            // InternalDsl.g:6751:2: ( RULE_STRING )
            // InternalDsl.g:6752:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementArbitraryAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementArbitrary__SemanticIdAssignment_4"
    // InternalDsl.g:6761:1: rule__SubmodelElementArbitrary__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementArbitrary__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6765:1: ( ( ruleSID ) )
            // InternalDsl.g:6766:2: ( ruleSID )
            {
            // InternalDsl.g:6766:2: ( ruleSID )
            // InternalDsl.g:6767:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementArbitraryAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementArbitraryAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementArbitrary__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionSection__NameAssignment_2"
    // InternalDsl.g:6776:1: rule__SubmodelElementCollectionSection__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionSection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6780:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6781:2: ( RULE_STRING )
            {
            // InternalDsl.g:6781:2: ( RULE_STRING )
            // InternalDsl.g:6782:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionSection__SemanticIdAssignment_4"
    // InternalDsl.g:6791:1: rule__SubmodelElementCollectionSection__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionSection__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6795:1: ( ( ruleSID ) )
            // InternalDsl.g:6796:2: ( ruleSID )
            {
            // InternalDsl.g:6796:2: ( ruleSID )
            // InternalDsl.g:6797:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0"
    // InternalDsl.g:6806:1: rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0 : ( ruleSubmodelElementArbitrary ) ;
    public final void rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6810:1: ( ( ruleSubmodelElementArbitrary ) )
            // InternalDsl.g:6811:2: ( ruleSubmodelElementArbitrary )
            {
            // InternalDsl.g:6811:2: ( ruleSubmodelElementArbitrary )
            // InternalDsl.g:6812:3: ruleSubmodelElementArbitrary
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementArbitrary();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__ArbitraryAssignment_7_0"


    // $ANTLR start "rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0"
    // InternalDsl.g:6821:1: rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0 : ( ruleSubmodelElementCollectionSubSection ) ;
    public final void rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6825:1: ( ( ruleSubmodelElementCollectionSubSection ) )
            // InternalDsl.g:6826:2: ( ruleSubmodelElementCollectionSubSection )
            {
            // InternalDsl.g:6826:2: ( ruleSubmodelElementCollectionSubSection )
            // InternalDsl.g:6827:3: ruleSubmodelElementCollectionSubSection
            {
             before(grammarAccess.getSubmodelElementCollectionSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionSubSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSection__SubSectionAssignment_8_0"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__NameAssignment_2"
    // InternalDsl.g:6836:1: rule__SubmodelElementCollectionSubSection__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionSubSection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6840:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6841:2: ( RULE_STRING )
            {
            // InternalDsl.g:6841:2: ( RULE_STRING )
            // InternalDsl.g:6842:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4"
    // InternalDsl.g:6851:1: rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6855:1: ( ( ruleSID ) )
            // InternalDsl.g:6856:2: ( ruleSID )
            {
            // InternalDsl.g:6856:2: ( ruleSID )
            // InternalDsl.g:6857:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0"
    // InternalDsl.g:6866:1: rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0 : ( ruleSubmodelElementArbitrary ) ;
    public final void rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6870:1: ( ( ruleSubmodelElementArbitrary ) )
            // InternalDsl.g:6871:2: ( ruleSubmodelElementArbitrary )
            {
            // InternalDsl.g:6871:2: ( ruleSubmodelElementArbitrary )
            // InternalDsl.g:6872:3: ruleSubmodelElementArbitrary
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementArbitrary();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getArbitrarySubmodelElementArbitraryParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__ArbitraryAssignment_7_0"


    // $ANTLR start "rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0"
    // InternalDsl.g:6881:1: rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0 : ( ruleSubmodelElementCollectionSubSection ) ;
    public final void rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6885:1: ( ( ruleSubmodelElementCollectionSubSection ) )
            // InternalDsl.g:6886:2: ( ruleSubmodelElementCollectionSubSection )
            {
            // InternalDsl.g:6886:2: ( ruleSubmodelElementCollectionSubSection )
            // InternalDsl.g:6887:3: ruleSubmodelElementCollectionSubSection
            {
             before(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodelElementCollectionSubSection();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionSubSectionAccess().getSubSectionSubmodelElementCollectionSubSectionParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionSubSection__SubSectionAssignment_8_0"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2"
    // InternalDsl.g:6896:1: rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6900:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6901:2: ( RULE_STRING )
            {
            // InternalDsl.g:6901:2: ( RULE_STRING )
            // InternalDsl.g:6902:3: RULE_STRING
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__NameAssignment_2"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4"
    // InternalDsl.g:6911:1: rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6915:1: ( ( ruleSID ) )
            // InternalDsl.g:6916:2: ( ruleSID )
            {
            // InternalDsl.g:6916:2: ( ruleSID )
            // InternalDsl.g:6917:3: ruleSID
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__SemanticIdAssignment_4"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0"
    // InternalDsl.g:6926:1: rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0 : ( ruleMultiLanguagePropertyTextStatement ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6930:1: ( ( ruleMultiLanguagePropertyTextStatement ) )
            // InternalDsl.g:6931:2: ( ruleMultiLanguagePropertyTextStatement )
            {
            // InternalDsl.g:6931:2: ( ruleMultiLanguagePropertyTextStatement )
            // InternalDsl.g:6932:3: ruleMultiLanguagePropertyTextStatement
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getTextStatementMultiLanguagePropertyTextStatementParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiLanguagePropertyTextStatement();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getTextStatementMultiLanguagePropertyTextStatementParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__TextStatementAssignment_7_0"


    // $ANTLR start "rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8"
    // InternalDsl.g:6941:1: rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8 : ( rulePropertyValidDate ) ;
    public final void rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6945:1: ( ( rulePropertyValidDate ) )
            // InternalDsl.g:6946:2: ( rulePropertyValidDate )
            {
            // InternalDsl.g:6946:2: ( rulePropertyValidDate )
            // InternalDsl.g:6947:3: rulePropertyValidDate
            {
             before(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getValidDatePropertyValidDateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValidDate();

            state._fsp--;

             after(grammarAccess.getSubmodelElementCollectionFurtherInformationAccess().getValidDatePropertyValidDateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubmodelElementCollectionFurtherInformation__ValidDateAssignment_8"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__NameAssignment_2"
    // InternalDsl.g:6956:1: rule__MultiLanguagePropertyTextStatement__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiLanguagePropertyTextStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6960:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6961:2: ( RULE_STRING )
            {
            // InternalDsl.g:6961:2: ( RULE_STRING )
            // InternalDsl.g:6962:3: RULE_STRING
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__NameAssignment_2"


    // $ANTLR start "rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4"
    // InternalDsl.g:6971:1: rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6975:1: ( ( ruleSID ) )
            // InternalDsl.g:6976:2: ( ruleSID )
            {
            // InternalDsl.g:6976:2: ( ruleSID )
            // InternalDsl.g:6977:3: ruleSID
            {
             before(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getMultiLanguagePropertyTextStatementAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLanguagePropertyTextStatement__SemanticIdAssignment_4"


    // $ANTLR start "rule__PropertyValidDate__NameAssignment_2"
    // InternalDsl.g:6986:1: rule__PropertyValidDate__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyValidDate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6990:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6991:2: ( RULE_STRING )
            {
            // InternalDsl.g:6991:2: ( RULE_STRING )
            // InternalDsl.g:6992:3: RULE_STRING
            {
             before(grammarAccess.getPropertyValidDateAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyValidDateAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__NameAssignment_2"


    // $ANTLR start "rule__PropertyValidDate__SemanticIdAssignment_4"
    // InternalDsl.g:7001:1: rule__PropertyValidDate__SemanticIdAssignment_4 : ( ruleSID ) ;
    public final void rule__PropertyValidDate__SemanticIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7005:1: ( ( ruleSID ) )
            // InternalDsl.g:7006:2: ( ruleSID )
            {
            // InternalDsl.g:7006:2: ( ruleSID )
            // InternalDsl.g:7007:3: ruleSID
            {
             before(grammarAccess.getPropertyValidDateAccess().getSemanticIdSIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSID();

            state._fsp--;

             after(grammarAccess.getPropertyValidDateAccess().getSemanticIdSIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValidDate__SemanticIdAssignment_4"


    // $ANTLR start "rule__SID__NameAssignment_2"
    // InternalDsl.g:7016:1: rule__SID__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SID__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7020:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7021:2: ( RULE_STRING )
            {
            // InternalDsl.g:7021:2: ( RULE_STRING )
            // InternalDsl.g:7022:3: RULE_STRING
            {
             before(grammarAccess.getSIDAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSIDAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__NameAssignment_2"


    // $ANTLR start "rule__SID__IIAssignment_4"
    // InternalDsl.g:7031:1: rule__SID__IIAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SID__IIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7035:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7036:2: ( RULE_STRING )
            {
            // InternalDsl.g:7036:2: ( RULE_STRING )
            // InternalDsl.g:7037:3: RULE_STRING
            {
             before(grammarAccess.getSIDAccess().getIISTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSIDAccess().getIISTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SID__IIAssignment_4"

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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000E00040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000A00040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});

}
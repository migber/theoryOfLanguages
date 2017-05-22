package org.projektas.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.projektas.services.MMKGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMMKParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_VAR_NAME", "RULE_ML_COMMENT", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<MMK'", "'MMK>'", "'c.getLine'", "'c.getNum'", "'c.printL'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'='", "'check'", "'<'", "'>'", "'else'", "'<='", "'>='", "'=='", "'!='", "'<F'", "','", "':'", "'F>'", "'till'", "'num'", "'line'", "'++'", "'--'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int RULE_VAR_NAME=6;
    public static final int T__18=18;
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
    public static final int RULE_ID=8;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalMMKParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMMKParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMMKParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMMK.g"; }



     	private MMKGrammarAccess grammarAccess;

        public InternalMMKParser(TokenStream input, MMKGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MMKGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMMK.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMMK.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMMK.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMMK.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= '<MMK' ( (lv_elements_1_0= ruleAbstractElement ) )* otherlv_2= 'MMK>' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:77:2: ( (otherlv_0= '<MMK' ( (lv_elements_1_0= ruleAbstractElement ) )* otherlv_2= 'MMK>' ) )
            // InternalMMK.g:78:2: (otherlv_0= '<MMK' ( (lv_elements_1_0= ruleAbstractElement ) )* otherlv_2= 'MMK>' )
            {
            // InternalMMK.g:78:2: (otherlv_0= '<MMK' ( (lv_elements_1_0= ruleAbstractElement ) )* otherlv_2= 'MMK>' )
            // InternalMMK.g:79:3: otherlv_0= '<MMK' ( (lv_elements_1_0= ruleAbstractElement ) )* otherlv_2= 'MMK>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getMMKKeyword_0());
              		
            }
            // InternalMMK.g:83:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_VAR_NAME)||(LA1_0>=14 && LA1_0<=16)||LA1_0==24||LA1_0==32||(LA1_0>=36 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMMK.g:84:4: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // InternalMMK.g:84:4: (lv_elements_1_0= ruleAbstractElement )
            	    // InternalMMK.g:85:5: lv_elements_1_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_1_0,
            	      						"org.projektas.MMK.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getMMKKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMMK.g:110:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalMMK.g:110:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalMMK.g:111:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMMK.g:117:1: ruleAbstractElement returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Condition_1= ruleCondition | this_WhileExpression_2= ruleWhileExpression | this_Operation_3= ruleOperation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Condition_1 = null;

        EObject this_WhileExpression_2 = null;

        EObject this_Operation_3 = null;



        	enterRule();

        try {
            // InternalMMK.g:123:2: ( (this_Statement_0= ruleStatement | this_Condition_1= ruleCondition | this_WhileExpression_2= ruleWhileExpression | this_Operation_3= ruleOperation ) )
            // InternalMMK.g:124:2: (this_Statement_0= ruleStatement | this_Condition_1= ruleCondition | this_WhileExpression_2= ruleWhileExpression | this_Operation_3= ruleOperation )
            {
            // InternalMMK.g:124:2: (this_Statement_0= ruleStatement | this_Condition_1= ruleCondition | this_WhileExpression_2= ruleWhileExpression | this_Operation_3= ruleOperation )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_VAR_NAME:
            case 14:
            case 15:
            case 16:
            case 37:
            case 38:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMMK.g:125:3: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Statement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:134:3: this_Condition_1= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Condition_1=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Condition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMMK.g:143:3: this_WhileExpression_2= ruleWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getWhileExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileExpression_2=ruleWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMMK.g:152:3: this_Operation_3= ruleOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getOperationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operation_3=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleStatement"
    // InternalMMK.g:164:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMMK.g:164:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMMK.g:165:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMMK.g:171:1: ruleStatement returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:177:2: (this_Expression_0= ruleExpression )
            // InternalMMK.g:178:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMMK.g:189:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMMK.g:189:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMMK.g:190:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMMK.g:196:1: ruleExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_CreationExpression_1= ruleCreationExpression | this_AssignmentExpression_2= ruleAssignmentExpression | this_GetLineExpression_3= ruleGetLineExpression | this_GetNumExpression_4= ruleGetNumExpression | this_PrintExpression_5= rulePrintExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_CreationExpression_1 = null;

        EObject this_AssignmentExpression_2 = null;

        EObject this_GetLineExpression_3 = null;

        EObject this_GetNumExpression_4 = null;

        EObject this_PrintExpression_5 = null;



        	enterRule();

        try {
            // InternalMMK.g:202:2: ( (this_UnaryExpression_0= ruleUnaryExpression | this_CreationExpression_1= ruleCreationExpression | this_AssignmentExpression_2= ruleAssignmentExpression | this_GetLineExpression_3= ruleGetLineExpression | this_GetNumExpression_4= ruleGetNumExpression | this_PrintExpression_5= rulePrintExpression ) )
            // InternalMMK.g:203:2: (this_UnaryExpression_0= ruleUnaryExpression | this_CreationExpression_1= ruleCreationExpression | this_AssignmentExpression_2= ruleAssignmentExpression | this_GetLineExpression_3= ruleGetLineExpression | this_GetNumExpression_4= ruleGetNumExpression | this_PrintExpression_5= rulePrintExpression )
            {
            // InternalMMK.g:203:2: (this_UnaryExpression_0= ruleUnaryExpression | this_CreationExpression_1= ruleCreationExpression | this_AssignmentExpression_2= ruleAssignmentExpression | this_GetLineExpression_3= ruleGetLineExpression | this_GetNumExpression_4= ruleGetNumExpression | this_PrintExpression_5= rulePrintExpression )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_VAR_NAME:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_INT && LA3_1<=RULE_VAR_NAME)||(LA3_1>=13 && LA3_1<=16)||LA3_1==24||LA3_1==26||LA3_1==32||(LA3_1>=36 && LA3_1<=40)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==23) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 37:
            case 38:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMMK.g:204:3: this_UnaryExpression_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:213:3: this_CreationExpression_1= ruleCreationExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCreationExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CreationExpression_1=ruleCreationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CreationExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMMK.g:222:3: this_AssignmentExpression_2= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssignmentExpression_2=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssignmentExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMMK.g:231:3: this_GetLineExpression_3= ruleGetLineExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getGetLineExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetLineExpression_3=ruleGetLineExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetLineExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMMK.g:240:3: this_GetNumExpression_4= ruleGetNumExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getGetNumExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GetNumExpression_4=ruleGetNumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GetNumExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMMK.g:249:3: this_PrintExpression_5= rulePrintExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getPrintExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrintExpression_5=rulePrintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrintExpression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleType"
    // InternalMMK.g:261:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMMK.g:261:44: (iv_ruleType= ruleType EOF )
            // InternalMMK.g:262:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMMK.g:268:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PrimitiveType_0= rulePrimitiveType ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:274:2: (this_PrimitiveType_0= rulePrimitiveType )
            // InternalMMK.g:275:2: this_PrimitiveType_0= rulePrimitiveType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_PrimitiveType_0=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PrimitiveType_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleGetLineExpression"
    // InternalMMK.g:288:1: entryRuleGetLineExpression returns [EObject current=null] : iv_ruleGetLineExpression= ruleGetLineExpression EOF ;
    public final EObject entryRuleGetLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetLineExpression = null;


        try {
            // InternalMMK.g:288:58: (iv_ruleGetLineExpression= ruleGetLineExpression EOF )
            // InternalMMK.g:289:2: iv_ruleGetLineExpression= ruleGetLineExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetLineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetLineExpression=ruleGetLineExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetLineExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGetLineExpression"


    // $ANTLR start "ruleGetLineExpression"
    // InternalMMK.g:295:1: ruleGetLineExpression returns [EObject current=null] : (otherlv_0= 'c.getLine' ( (lv_what_1_0= ruleValue ) ) ) ;
    public final EObject ruleGetLineExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_what_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:301:2: ( (otherlv_0= 'c.getLine' ( (lv_what_1_0= ruleValue ) ) ) )
            // InternalMMK.g:302:2: (otherlv_0= 'c.getLine' ( (lv_what_1_0= ruleValue ) ) )
            {
            // InternalMMK.g:302:2: (otherlv_0= 'c.getLine' ( (lv_what_1_0= ruleValue ) ) )
            // InternalMMK.g:303:3: otherlv_0= 'c.getLine' ( (lv_what_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetLineExpressionAccess().getCGetLineKeyword_0());
              		
            }
            // InternalMMK.g:307:3: ( (lv_what_1_0= ruleValue ) )
            // InternalMMK.g:308:4: (lv_what_1_0= ruleValue )
            {
            // InternalMMK.g:308:4: (lv_what_1_0= ruleValue )
            // InternalMMK.g:309:5: lv_what_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetLineExpressionAccess().getWhatValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_what_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGetLineExpressionRule());
              					}
              					set(
              						current,
              						"what",
              						lv_what_1_0,
              						"org.projektas.MMK.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGetLineExpression"


    // $ANTLR start "entryRuleGetNumExpression"
    // InternalMMK.g:330:1: entryRuleGetNumExpression returns [EObject current=null] : iv_ruleGetNumExpression= ruleGetNumExpression EOF ;
    public final EObject entryRuleGetNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetNumExpression = null;


        try {
            // InternalMMK.g:330:57: (iv_ruleGetNumExpression= ruleGetNumExpression EOF )
            // InternalMMK.g:331:2: iv_ruleGetNumExpression= ruleGetNumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetNumExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGetNumExpression=ruleGetNumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetNumExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGetNumExpression"


    // $ANTLR start "ruleGetNumExpression"
    // InternalMMK.g:337:1: ruleGetNumExpression returns [EObject current=null] : (otherlv_0= 'c.getNum' ( (lv_what_1_0= ruleValue ) ) ) ;
    public final EObject ruleGetNumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_what_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:343:2: ( (otherlv_0= 'c.getNum' ( (lv_what_1_0= ruleValue ) ) ) )
            // InternalMMK.g:344:2: (otherlv_0= 'c.getNum' ( (lv_what_1_0= ruleValue ) ) )
            {
            // InternalMMK.g:344:2: (otherlv_0= 'c.getNum' ( (lv_what_1_0= ruleValue ) ) )
            // InternalMMK.g:345:3: otherlv_0= 'c.getNum' ( (lv_what_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGetNumExpressionAccess().getCGetNumKeyword_0());
              		
            }
            // InternalMMK.g:349:3: ( (lv_what_1_0= ruleValue ) )
            // InternalMMK.g:350:4: (lv_what_1_0= ruleValue )
            {
            // InternalMMK.g:350:4: (lv_what_1_0= ruleValue )
            // InternalMMK.g:351:5: lv_what_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGetNumExpressionAccess().getWhatValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_what_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGetNumExpressionRule());
              					}
              					set(
              						current,
              						"what",
              						lv_what_1_0,
              						"org.projektas.MMK.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGetNumExpression"


    // $ANTLR start "entryRulePrintExpression"
    // InternalMMK.g:372:1: entryRulePrintExpression returns [EObject current=null] : iv_rulePrintExpression= rulePrintExpression EOF ;
    public final EObject entryRulePrintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintExpression = null;


        try {
            // InternalMMK.g:372:56: (iv_rulePrintExpression= rulePrintExpression EOF )
            // InternalMMK.g:373:2: iv_rulePrintExpression= rulePrintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrintExpression=rulePrintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrintExpression"


    // $ANTLR start "rulePrintExpression"
    // InternalMMK.g:379:1: rulePrintExpression returns [EObject current=null] : (otherlv_0= 'c.printL' ( (lv_what_1_0= ruleValue ) ) ) ;
    public final EObject rulePrintExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_what_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:385:2: ( (otherlv_0= 'c.printL' ( (lv_what_1_0= ruleValue ) ) ) )
            // InternalMMK.g:386:2: (otherlv_0= 'c.printL' ( (lv_what_1_0= ruleValue ) ) )
            {
            // InternalMMK.g:386:2: (otherlv_0= 'c.printL' ( (lv_what_1_0= ruleValue ) ) )
            // InternalMMK.g:387:3: otherlv_0= 'c.printL' ( (lv_what_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintExpressionAccess().getCPrintLKeyword_0());
              		
            }
            // InternalMMK.g:391:3: ( (lv_what_1_0= ruleValue ) )
            // InternalMMK.g:392:4: (lv_what_1_0= ruleValue )
            {
            // InternalMMK.g:392:4: (lv_what_1_0= ruleValue )
            // InternalMMK.g:393:5: lv_what_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintExpressionAccess().getWhatValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_what_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintExpressionRule());
              					}
              					set(
              						current,
              						"what",
              						lv_what_1_0,
              						"org.projektas.MMK.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrintExpression"


    // $ANTLR start "entryRuleVariable"
    // InternalMMK.g:414:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMMK.g:414:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMMK.g:415:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMMK.g:421:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:427:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalMMK.g:428:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalMMK.g:428:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalMMK.g:429:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalMMK.g:429:3: (lv_name_0_0= ruleQualifiedName )
            // InternalMMK.g:430:4: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVariableAccess().getNameQualifiedNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getVariableRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.projektas.MMK.QualifiedName");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExprBody"
    // InternalMMK.g:450:1: entryRuleExprBody returns [EObject current=null] : iv_ruleExprBody= ruleExprBody EOF ;
    public final EObject entryRuleExprBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBody = null;


        try {
            // InternalMMK.g:450:49: (iv_ruleExprBody= ruleExprBody EOF )
            // InternalMMK.g:451:2: iv_ruleExprBody= ruleExprBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprBody=ruleExprBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprBody"


    // $ANTLR start "ruleExprBody"
    // InternalMMK.g:457:1: ruleExprBody returns [EObject current=null] : ( (lv_expr_0_0= ruleFactorExpression ) )+ ;
    public final EObject ruleExprBody() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:463:2: ( ( (lv_expr_0_0= ruleFactorExpression ) )+ )
            // InternalMMK.g:464:2: ( (lv_expr_0_0= ruleFactorExpression ) )+
            {
            // InternalMMK.g:464:2: ( (lv_expr_0_0= ruleFactorExpression ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case RULE_VAR_NAME:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_STRING:
                case 21:
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalMMK.g:465:3: (lv_expr_0_0= ruleFactorExpression )
            	    {
            	    // InternalMMK.g:465:3: (lv_expr_0_0= ruleFactorExpression )
            	    // InternalMMK.g:466:4: lv_expr_0_0= ruleFactorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprBodyAccess().getExprFactorExpressionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_expr_0_0=ruleFactorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getExprBodyRule());
            	      				}
            	      				add(
            	      					current,
            	      					"expr",
            	      					lv_expr_0_0,
            	      					"org.projektas.MMK.FactorExpression");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprBody"


    // $ANTLR start "entryRuleFactorExpression"
    // InternalMMK.g:486:1: entryRuleFactorExpression returns [EObject current=null] : iv_ruleFactorExpression= ruleFactorExpression EOF ;
    public final EObject entryRuleFactorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorExpression = null;


        try {
            // InternalMMK.g:486:57: (iv_ruleFactorExpression= ruleFactorExpression EOF )
            // InternalMMK.g:487:2: iv_ruleFactorExpression= ruleFactorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactorExpression=ruleFactorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactorExpression"


    // $ANTLR start "ruleFactorExpression"
    // InternalMMK.g:493:1: ruleFactorExpression returns [EObject current=null] : ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* ) ;
    public final EObject ruleFactorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_l_0_0 = null;

        EObject lv_a_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:499:2: ( ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* ) )
            // InternalMMK.g:500:2: ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* )
            {
            // InternalMMK.g:500:2: ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* )
            // InternalMMK.g:501:3: ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )*
            {
            // InternalMMK.g:501:3: ( (lv_l_0_0= rulePrimary ) )
            // InternalMMK.g:502:4: (lv_l_0_0= rulePrimary )
            {
            // InternalMMK.g:502:4: (lv_l_0_0= rulePrimary )
            // InternalMMK.g:503:5: lv_l_0_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFactorExpressionAccess().getLPrimaryParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_l_0_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFactorExpressionRule());
              					}
              					set(
              						current,
              						"l",
              						lv_l_0_0,
              						"org.projektas.MMK.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:520:3: ( (lv_a_1_0= ruleArithmetics ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMMK.g:521:4: (lv_a_1_0= ruleArithmetics )
            	    {
            	    // InternalMMK.g:521:4: (lv_a_1_0= ruleArithmetics )
            	    // InternalMMK.g:522:5: lv_a_1_0= ruleArithmetics
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFactorExpressionAccess().getAArithmeticsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_a_1_0=ruleArithmetics();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFactorExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"a",
            	      						lv_a_1_0,
            	      						"org.projektas.MMK.Arithmetics");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFactorExpression"


    // $ANTLR start "entryRuleArithmetics"
    // InternalMMK.g:543:1: entryRuleArithmetics returns [EObject current=null] : iv_ruleArithmetics= ruleArithmetics EOF ;
    public final EObject entryRuleArithmetics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetics = null;


        try {
            // InternalMMK.g:543:52: (iv_ruleArithmetics= ruleArithmetics EOF )
            // InternalMMK.g:544:2: iv_ruleArithmetics= ruleArithmetics EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmetics=ruleArithmetics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmetics; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmetics"


    // $ANTLR start "ruleArithmetics"
    // InternalMMK.g:550:1: ruleArithmetics returns [EObject current=null] : ( ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) ) ( (lv_r_1_0= rulePrimary ) ) ) ;
    public final EObject ruleArithmetics() throws RecognitionException {
        EObject current = null;

        Token lv_m_0_1=null;
        Token lv_m_0_2=null;
        Token lv_m_0_3=null;
        Token lv_m_0_4=null;
        EObject lv_r_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:556:2: ( ( ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) ) ( (lv_r_1_0= rulePrimary ) ) ) )
            // InternalMMK.g:557:2: ( ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) ) ( (lv_r_1_0= rulePrimary ) ) )
            {
            // InternalMMK.g:557:2: ( ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) ) ( (lv_r_1_0= rulePrimary ) ) )
            // InternalMMK.g:558:3: ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) ) ( (lv_r_1_0= rulePrimary ) )
            {
            // InternalMMK.g:558:3: ( ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) ) )
            // InternalMMK.g:559:4: ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) )
            {
            // InternalMMK.g:559:4: ( (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' ) )
            // InternalMMK.g:560:5: (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' )
            {
            // InternalMMK.g:560:5: (lv_m_0_1= '*' | lv_m_0_2= '/' | lv_m_0_3= '+' | lv_m_0_4= '-' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMMK.g:561:6: lv_m_0_1= '*'
                    {
                    lv_m_0_1=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_m_0_1, grammarAccess.getArithmeticsAccess().getMAsteriskKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArithmeticsRule());
                      						}
                      						setWithLastConsumed(current, "m", lv_m_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:572:6: lv_m_0_2= '/'
                    {
                    lv_m_0_2=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_m_0_2, grammarAccess.getArithmeticsAccess().getMSolidusKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArithmeticsRule());
                      						}
                      						setWithLastConsumed(current, "m", lv_m_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMMK.g:583:6: lv_m_0_3= '+'
                    {
                    lv_m_0_3=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_m_0_3, grammarAccess.getArithmeticsAccess().getMPlusSignKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArithmeticsRule());
                      						}
                      						setWithLastConsumed(current, "m", lv_m_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalMMK.g:594:6: lv_m_0_4= '-'
                    {
                    lv_m_0_4=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_m_0_4, grammarAccess.getArithmeticsAccess().getMHyphenMinusKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArithmeticsRule());
                      						}
                      						setWithLastConsumed(current, "m", lv_m_0_4, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalMMK.g:607:3: ( (lv_r_1_0= rulePrimary ) )
            // InternalMMK.g:608:4: (lv_r_1_0= rulePrimary )
            {
            // InternalMMK.g:608:4: (lv_r_1_0= rulePrimary )
            // InternalMMK.g:609:5: lv_r_1_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticsAccess().getRPrimaryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_r_1_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithmeticsRule());
              					}
              					set(
              						current,
              						"r",
              						lv_r_1_0,
              						"org.projektas.MMK.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithmetics"


    // $ANTLR start "entryRulePrimary"
    // InternalMMK.g:630:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMMK.g:630:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMMK.g:631:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMMK.g:637:1: rulePrimary returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_UnaryExpression_0 = null;

        EObject this_FactorExpr_2 = null;



        	enterRule();

        try {
            // InternalMMK.g:643:2: ( (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' ) ) )
            // InternalMMK.g:644:2: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' ) )
            {
            // InternalMMK.g:644:2: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_VAR_NAME)) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMMK.g:645:3: this_UnaryExpression_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:654:3: (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' )
                    {
                    // InternalMMK.g:654:3: (otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')' )
                    // InternalMMK.g:655:4: otherlv_1= '(' this_FactorExpr_2= ruleFactorExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getFactorExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_FactorExpr_2=ruleFactorExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FactorExpr_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFactorExpr"
    // InternalMMK.g:676:1: entryRuleFactorExpr returns [EObject current=null] : iv_ruleFactorExpr= ruleFactorExpr EOF ;
    public final EObject entryRuleFactorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorExpr = null;


        try {
            // InternalMMK.g:676:51: (iv_ruleFactorExpr= ruleFactorExpr EOF )
            // InternalMMK.g:677:2: iv_ruleFactorExpr= ruleFactorExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactorExpr=ruleFactorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactorExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactorExpr"


    // $ANTLR start "ruleFactorExpr"
    // InternalMMK.g:683:1: ruleFactorExpr returns [EObject current=null] : ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* ) ;
    public final EObject ruleFactorExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_l_0_0 = null;

        EObject lv_a_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:689:2: ( ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* ) )
            // InternalMMK.g:690:2: ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* )
            {
            // InternalMMK.g:690:2: ( ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )* )
            // InternalMMK.g:691:3: ( (lv_l_0_0= rulePrimary ) ) ( (lv_a_1_0= ruleArithmetics ) )*
            {
            // InternalMMK.g:691:3: ( (lv_l_0_0= rulePrimary ) )
            // InternalMMK.g:692:4: (lv_l_0_0= rulePrimary )
            {
            // InternalMMK.g:692:4: (lv_l_0_0= rulePrimary )
            // InternalMMK.g:693:5: lv_l_0_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFactorExprAccess().getLPrimaryParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_l_0_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFactorExprRule());
              					}
              					set(
              						current,
              						"l",
              						lv_l_0_0,
              						"org.projektas.MMK.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:710:3: ( (lv_a_1_0= ruleArithmetics ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=17 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMMK.g:711:4: (lv_a_1_0= ruleArithmetics )
            	    {
            	    // InternalMMK.g:711:4: (lv_a_1_0= ruleArithmetics )
            	    // InternalMMK.g:712:5: lv_a_1_0= ruleArithmetics
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFactorExprAccess().getAArithmeticsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_a_1_0=ruleArithmetics();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFactorExprRule());
            	      					}
            	      					add(
            	      						current,
            	      						"a",
            	      						lv_a_1_0,
            	      						"org.projektas.MMK.Arithmetics");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFactorExpr"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalMMK.g:733:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalMMK.g:733:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalMMK.g:734:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalMMK.g:740:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_val_0_0= ruleValue ) ) ( (lv_us_1_0= ruleUnarySuffix ) )? ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_val_0_0 = null;

        AntlrDatatypeRuleToken lv_us_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:746:2: ( ( ( (lv_val_0_0= ruleValue ) ) ( (lv_us_1_0= ruleUnarySuffix ) )? ) )
            // InternalMMK.g:747:2: ( ( (lv_val_0_0= ruleValue ) ) ( (lv_us_1_0= ruleUnarySuffix ) )? )
            {
            // InternalMMK.g:747:2: ( ( (lv_val_0_0= ruleValue ) ) ( (lv_us_1_0= ruleUnarySuffix ) )? )
            // InternalMMK.g:748:3: ( (lv_val_0_0= ruleValue ) ) ( (lv_us_1_0= ruleUnarySuffix ) )?
            {
            // InternalMMK.g:748:3: ( (lv_val_0_0= ruleValue ) )
            // InternalMMK.g:749:4: (lv_val_0_0= ruleValue )
            {
            // InternalMMK.g:749:4: (lv_val_0_0= ruleValue )
            // InternalMMK.g:750:5: lv_val_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getValValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_val_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_0_0,
              						"org.projektas.MMK.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:767:3: ( (lv_us_1_0= ruleUnarySuffix ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=39 && LA9_0<=40)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMMK.g:768:4: (lv_us_1_0= ruleUnarySuffix )
                    {
                    // InternalMMK.g:768:4: (lv_us_1_0= ruleUnarySuffix )
                    // InternalMMK.g:769:5: lv_us_1_0= ruleUnarySuffix
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUsUnarySuffixParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_us_1_0=ruleUnarySuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      					}
                      					set(
                      						current,
                      						"us",
                      						lv_us_1_0,
                      						"org.projektas.MMK.UnarySuffix");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleValue"
    // InternalMMK.g:790:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMMK.g:790:46: (iv_ruleValue= ruleValue EOF )
            // InternalMMK.g:791:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMMK.g:797:1: ruleValue returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( (lv_val_1_0= rulePrimitiveValue ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:803:2: ( ( ( ( ruleQualifiedName ) ) | ( (lv_val_1_0= rulePrimitiveValue ) ) ) )
            // InternalMMK.g:804:2: ( ( ( ruleQualifiedName ) ) | ( (lv_val_1_0= rulePrimitiveValue ) ) )
            {
            // InternalMMK.g:804:2: ( ( ( ruleQualifiedName ) ) | ( (lv_val_1_0= rulePrimitiveValue ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_VAR_NAME) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMMK.g:805:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalMMK.g:805:3: ( ( ruleQualifiedName ) )
                    // InternalMMK.g:806:4: ( ruleQualifiedName )
                    {
                    // InternalMMK.g:806:4: ( ruleQualifiedName )
                    // InternalMMK.g:807:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValueRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getVarVariableCrossReference_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMMK.g:822:3: ( (lv_val_1_0= rulePrimitiveValue ) )
                    {
                    // InternalMMK.g:822:3: ( (lv_val_1_0= rulePrimitiveValue ) )
                    // InternalMMK.g:823:4: (lv_val_1_0= rulePrimitiveValue )
                    {
                    // InternalMMK.g:823:4: (lv_val_1_0= rulePrimitiveValue )
                    // InternalMMK.g:824:5: lv_val_1_0= rulePrimitiveValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getValPrimitiveValueParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=rulePrimitiveValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"val",
                      						lv_val_1_0,
                      						"org.projektas.MMK.PrimitiveValue");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCreationExpression"
    // InternalMMK.g:845:1: entryRuleCreationExpression returns [EObject current=null] : iv_ruleCreationExpression= ruleCreationExpression EOF ;
    public final EObject entryRuleCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationExpression = null;


        try {
            // InternalMMK.g:845:59: (iv_ruleCreationExpression= ruleCreationExpression EOF )
            // InternalMMK.g:846:2: iv_ruleCreationExpression= ruleCreationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCreationExpression=ruleCreationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreationExpression"


    // $ANTLR start "ruleCreationExpression"
    // InternalMMK.g:852:1: ruleCreationExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )? ) ;
    public final EObject ruleCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:858:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )? ) )
            // InternalMMK.g:859:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )? )
            {
            // InternalMMK.g:859:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )? )
            // InternalMMK.g:860:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )?
            {
            // InternalMMK.g:860:3: ( (lv_type_0_0= ruleType ) )
            // InternalMMK.g:861:4: (lv_type_0_0= ruleType )
            {
            // InternalMMK.g:861:4: (lv_type_0_0= ruleType )
            // InternalMMK.g:862:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCreationExpressionAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCreationExpressionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.projektas.MMK.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:879:3: ( (lv_name_1_0= ruleVariable ) )
            // InternalMMK.g:880:4: (lv_name_1_0= ruleVariable )
            {
            // InternalMMK.g:880:4: (lv_name_1_0= ruleVariable )
            // InternalMMK.g:881:5: lv_name_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCreationExpressionAccess().getNameVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCreationExpressionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.projektas.MMK.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:898:3: (otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMMK.g:899:4: otherlv_2= '=' ( (lv_val_3_0= ruleExprBody ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCreationExpressionAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMMK.g:903:4: ( (lv_val_3_0= ruleExprBody ) )
                    // InternalMMK.g:904:5: (lv_val_3_0= ruleExprBody )
                    {
                    // InternalMMK.g:904:5: (lv_val_3_0= ruleExprBody )
                    // InternalMMK.g:905:6: lv_val_3_0= ruleExprBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCreationExpressionAccess().getValExprBodyParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_3_0=ruleExprBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCreationExpressionRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_3_0,
                      							"org.projektas.MMK.ExprBody");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCreationExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalMMK.g:927:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // InternalMMK.g:927:61: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalMMK.g:928:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalMMK.g:934:1: ruleAssignmentExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExprBody ) ) ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:940:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExprBody ) ) ) )
            // InternalMMK.g:941:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExprBody ) ) )
            {
            // InternalMMK.g:941:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExprBody ) ) )
            // InternalMMK.g:942:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExprBody ) )
            {
            // InternalMMK.g:942:3: ( ( ruleQualifiedName ) )
            // InternalMMK.g:943:4: ( ruleQualifiedName )
            {
            // InternalMMK.g:943:4: ( ruleQualifiedName )
            // InternalMMK.g:944:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignmentExpressionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getNameVariableCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMMK.g:962:3: ( (lv_val_2_0= ruleExprBody ) )
            // InternalMMK.g:963:4: (lv_val_2_0= ruleExprBody )
            {
            // InternalMMK.g:963:4: (lv_val_2_0= ruleExprBody )
            // InternalMMK.g:964:5: lv_val_2_0= ruleExprBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getValExprBodyParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_val_2_0=ruleExprBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_2_0,
              						"org.projektas.MMK.ExprBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleCondition"
    // InternalMMK.g:985:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMMK.g:985:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMMK.g:986:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMMK.g:992:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'check' ( (lv_cond_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_then_3_0= ruleAbstractElement ) )* otherlv_4= '>' ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_7_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:998:2: ( (otherlv_0= 'check' ( (lv_cond_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_then_3_0= ruleAbstractElement ) )* otherlv_4= '>' ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )? ) )
            // InternalMMK.g:999:2: (otherlv_0= 'check' ( (lv_cond_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_then_3_0= ruleAbstractElement ) )* otherlv_4= '>' ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )? )
            {
            // InternalMMK.g:999:2: (otherlv_0= 'check' ( (lv_cond_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_then_3_0= ruleAbstractElement ) )* otherlv_4= '>' ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )? )
            // InternalMMK.g:1000:3: otherlv_0= 'check' ( (lv_cond_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_then_3_0= ruleAbstractElement ) )* otherlv_4= '>' ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getCheckKeyword_0());
              		
            }
            // InternalMMK.g:1004:3: ( (lv_cond_1_0= ruleConditionalExpr ) )
            // InternalMMK.g:1005:4: (lv_cond_1_0= ruleConditionalExpr )
            {
            // InternalMMK.g:1005:4: (lv_cond_1_0= ruleConditionalExpr )
            // InternalMMK.g:1006:5: lv_cond_1_0= ruleConditionalExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getCondConditionalExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_cond_1_0=ruleConditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.projektas.MMK.ConditionalExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalMMK.g:1027:3: ( (lv_then_3_0= ruleAbstractElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_VAR_NAME)||(LA12_0>=14 && LA12_0<=16)||LA12_0==24||LA12_0==32||(LA12_0>=36 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMMK.g:1028:4: (lv_then_3_0= ruleAbstractElement )
            	    {
            	    // InternalMMK.g:1028:4: (lv_then_3_0= ruleAbstractElement )
            	    // InternalMMK.g:1029:5: lv_then_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getThenAbstractElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_then_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConditionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_3_0,
            	      						"org.projektas.MMK.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_4());
              		
            }
            // InternalMMK.g:1050:3: ( ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) && (synpred1_InternalMMK())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMMK.g:1051:4: ( ( 'else' )=>otherlv_5= 'else' ) otherlv_6= '<' ( (lv_else_7_0= ruleAbstractElement ) )* otherlv_8= '>'
                    {
                    // InternalMMK.g:1051:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMMK.g:1052:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getLessThanSignKeyword_5_1());
                      			
                    }
                    // InternalMMK.g:1062:4: ( (lv_else_7_0= ruleAbstractElement ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_VAR_NAME)||(LA13_0>=14 && LA13_0<=16)||LA13_0==24||LA13_0==32||(LA13_0>=36 && LA13_0<=38)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMMK.g:1063:5: (lv_else_7_0= ruleAbstractElement )
                    	    {
                    	    // InternalMMK.g:1063:5: (lv_else_7_0= ruleAbstractElement )
                    	    // InternalMMK.g:1064:6: lv_else_7_0= ruleAbstractElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConditionAccess().getElseAbstractElementParserRuleCall_5_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_else_7_0=ruleAbstractElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getConditionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"else",
                    	      							lv_else_7_0,
                    	      							"org.projektas.MMK.AbstractElement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_5_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionalExpr"
    // InternalMMK.g:1090:1: entryRuleConditionalExpr returns [EObject current=null] : iv_ruleConditionalExpr= ruleConditionalExpr EOF ;
    public final EObject entryRuleConditionalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpr = null;


        try {
            // InternalMMK.g:1090:56: (iv_ruleConditionalExpr= ruleConditionalExpr EOF )
            // InternalMMK.g:1091:2: iv_ruleConditionalExpr= ruleConditionalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpr=ruleConditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalExpr"


    // $ANTLR start "ruleConditionalExpr"
    // InternalMMK.g:1097:1: ruleConditionalExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleExprBody ) ) ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleExprBody ) ) ) ;
    public final EObject ruleConditionalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        Token lv_op_1_5=null;
        Token lv_op_1_6=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:1103:2: ( ( ( (lv_left_0_0= ruleExprBody ) ) ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleExprBody ) ) ) )
            // InternalMMK.g:1104:2: ( ( (lv_left_0_0= ruleExprBody ) ) ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleExprBody ) ) )
            {
            // InternalMMK.g:1104:2: ( ( (lv_left_0_0= ruleExprBody ) ) ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleExprBody ) ) )
            // InternalMMK.g:1105:3: ( (lv_left_0_0= ruleExprBody ) ) ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleExprBody ) )
            {
            // InternalMMK.g:1105:3: ( (lv_left_0_0= ruleExprBody ) )
            // InternalMMK.g:1106:4: (lv_left_0_0= ruleExprBody )
            {
            // InternalMMK.g:1106:4: (lv_left_0_0= ruleExprBody )
            // InternalMMK.g:1107:5: lv_left_0_0= ruleExprBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalExprAccess().getLeftExprBodyParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_left_0_0=ruleExprBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalExprRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"org.projektas.MMK.ExprBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMMK.g:1124:3: ( ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) ) )
            // InternalMMK.g:1125:4: ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) )
            {
            // InternalMMK.g:1125:4: ( (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' ) )
            // InternalMMK.g:1126:5: (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' )
            {
            // InternalMMK.g:1126:5: (lv_op_1_1= '<' | lv_op_1_2= '<=' | lv_op_1_3= '>' | lv_op_1_4= '>=' | lv_op_1_5= '==' | lv_op_1_6= '!=' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 30:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMMK.g:1127:6: lv_op_1_1= '<'
                    {
                    lv_op_1_1=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_1, grammarAccess.getConditionalExprAccess().getOpLessThanSignKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:1138:6: lv_op_1_2= '<='
                    {
                    lv_op_1_2=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_2, grammarAccess.getConditionalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMMK.g:1149:6: lv_op_1_3= '>'
                    {
                    lv_op_1_3=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_3, grammarAccess.getConditionalExprAccess().getOpGreaterThanSignKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalMMK.g:1160:6: lv_op_1_4= '>='
                    {
                    lv_op_1_4=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_4, grammarAccess.getConditionalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalMMK.g:1171:6: lv_op_1_5= '=='
                    {
                    lv_op_1_5=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_5, grammarAccess.getConditionalExprAccess().getOpEqualsSignEqualsSignKeyword_1_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalMMK.g:1182:6: lv_op_1_6= '!='
                    {
                    lv_op_1_6=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_6, grammarAccess.getConditionalExprAccess().getOpExclamationMarkEqualsSignKeyword_1_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConditionalExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_6, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalMMK.g:1195:3: ( (lv_right_2_0= ruleExprBody ) )
            // InternalMMK.g:1196:4: (lv_right_2_0= ruleExprBody )
            {
            // InternalMMK.g:1196:4: (lv_right_2_0= ruleExprBody )
            // InternalMMK.g:1197:5: lv_right_2_0= ruleExprBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionalExprAccess().getRightExprBodyParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExprBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionalExprRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.projektas.MMK.ExprBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConditionalExpr"


    // $ANTLR start "entryRuleOperation"
    // InternalMMK.g:1218:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMMK.g:1218:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMMK.g:1219:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMMK.g:1225:1: ruleOperation returns [EObject current=null] : (otherlv_0= '<F' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) otherlv_9= '<' ( (lv_body_10_0= ruleExpression ) ) otherlv_11= '>' otherlv_12= 'F>' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_params_3_0 = null;

        AntlrDatatypeRuleToken lv_params_5_0 = null;

        AntlrDatatypeRuleToken lv_type_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:1231:2: ( (otherlv_0= '<F' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) otherlv_9= '<' ( (lv_body_10_0= ruleExpression ) ) otherlv_11= '>' otherlv_12= 'F>' ) )
            // InternalMMK.g:1232:2: (otherlv_0= '<F' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) otherlv_9= '<' ( (lv_body_10_0= ruleExpression ) ) otherlv_11= '>' otherlv_12= 'F>' )
            {
            // InternalMMK.g:1232:2: (otherlv_0= '<F' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) otherlv_9= '<' ( (lv_body_10_0= ruleExpression ) ) otherlv_11= '>' otherlv_12= 'F>' )
            // InternalMMK.g:1233:3: otherlv_0= '<F' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) otherlv_9= '<' ( (lv_body_10_0= ruleExpression ) ) otherlv_11= '>' otherlv_12= 'F>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getFKeyword_0());
              		
            }
            // InternalMMK.g:1237:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMMK.g:1238:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMMK.g:1238:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMMK.g:1239:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.projektas.MMK.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMMK.g:1260:3: ( ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_VAR_NAME) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMMK.g:1261:4: ( (lv_params_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )*
                    {
                    // InternalMMK.g:1261:4: ( (lv_params_3_0= ruleQualifiedName ) )
                    // InternalMMK.g:1262:5: (lv_params_3_0= ruleQualifiedName )
                    {
                    // InternalMMK.g:1262:5: (lv_params_3_0= ruleQualifiedName )
                    // InternalMMK.g:1263:6: lv_params_3_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationAccess().getParamsQualifiedNameParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_params_3_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.projektas.MMK.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMMK.g:1280:4: (otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==33) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMMK.g:1281:5: otherlv_4= ',' ( (lv_params_5_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMMK.g:1285:5: ( (lv_params_5_0= ruleQualifiedName ) )
                    	    // InternalMMK.g:1286:6: (lv_params_5_0= ruleQualifiedName )
                    	    {
                    	    // InternalMMK.g:1286:6: (lv_params_5_0= ruleQualifiedName )
                    	    // InternalMMK.g:1287:7: lv_params_5_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationAccess().getParamsQualifiedNameParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_params_5_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.projektas.MMK.QualifiedName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
              		
            }
            // InternalMMK.g:1314:3: ( (lv_type_8_0= ruleType ) )
            // InternalMMK.g:1315:4: (lv_type_8_0= ruleType )
            {
            // InternalMMK.g:1315:4: (lv_type_8_0= ruleType )
            // InternalMMK.g:1316:5: lv_type_8_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getTypeTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_type_8_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"org.projektas.MMK.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getLessThanSignKeyword_7());
              		
            }
            // InternalMMK.g:1337:3: ( (lv_body_10_0= ruleExpression ) )
            // InternalMMK.g:1338:4: (lv_body_10_0= ruleExpression )
            {
            // InternalMMK.g:1338:4: (lv_body_10_0= ruleExpression )
            // InternalMMK.g:1339:5: lv_body_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getBodyExpressionParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_body_10_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"org.projektas.MMK.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getGreaterThanSignKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getFKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleWhileExpression"
    // InternalMMK.g:1368:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpression = null;


        try {
            // InternalMMK.g:1368:56: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // InternalMMK.g:1369:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhileExpression"


    // $ANTLR start "ruleWhileExpression"
    // InternalMMK.g:1375:1: ruleWhileExpression returns [EObject current=null] : (otherlv_0= 'till' ( (lv_end_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_loop_3_0= ruleAbstractElement ) )* otherlv_4= '>' ) ;
    public final EObject ruleWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_end_1_0 = null;

        EObject lv_loop_3_0 = null;



        	enterRule();

        try {
            // InternalMMK.g:1381:2: ( (otherlv_0= 'till' ( (lv_end_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_loop_3_0= ruleAbstractElement ) )* otherlv_4= '>' ) )
            // InternalMMK.g:1382:2: (otherlv_0= 'till' ( (lv_end_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_loop_3_0= ruleAbstractElement ) )* otherlv_4= '>' )
            {
            // InternalMMK.g:1382:2: (otherlv_0= 'till' ( (lv_end_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_loop_3_0= ruleAbstractElement ) )* otherlv_4= '>' )
            // InternalMMK.g:1383:3: otherlv_0= 'till' ( (lv_end_1_0= ruleConditionalExpr ) ) otherlv_2= '<' ( (lv_loop_3_0= ruleAbstractElement ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileExpressionAccess().getTillKeyword_0());
              		
            }
            // InternalMMK.g:1387:3: ( (lv_end_1_0= ruleConditionalExpr ) )
            // InternalMMK.g:1388:4: (lv_end_1_0= ruleConditionalExpr )
            {
            // InternalMMK.g:1388:4: (lv_end_1_0= ruleConditionalExpr )
            // InternalMMK.g:1389:5: lv_end_1_0= ruleConditionalExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileExpressionAccess().getEndConditionalExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_end_1_0=ruleConditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
              					}
              					set(
              						current,
              						"end",
              						lv_end_1_0,
              						"org.projektas.MMK.ConditionalExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileExpressionAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalMMK.g:1410:3: ( (lv_loop_3_0= ruleAbstractElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_VAR_NAME)||(LA18_0>=14 && LA18_0<=16)||LA18_0==24||LA18_0==32||(LA18_0>=36 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMMK.g:1411:4: (lv_loop_3_0= ruleAbstractElement )
            	    {
            	    // InternalMMK.g:1411:4: (lv_loop_3_0= ruleAbstractElement )
            	    // InternalMMK.g:1412:5: lv_loop_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileExpressionAccess().getLoopAbstractElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_loop_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"loop",
            	      						lv_loop_3_0,
            	      						"org.projektas.MMK.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileExpressionAccess().getGreaterThanSignKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWhileExpression"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMMK.g:1437:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // InternalMMK.g:1437:53: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMMK.g:1438:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMMK.g:1444:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'num' | kw= 'line' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMMK.g:1450:2: ( (kw= 'num' | kw= 'line' ) )
            // InternalMMK.g:1451:2: (kw= 'num' | kw= 'line' )
            {
            // InternalMMK.g:1451:2: (kw= 'num' | kw= 'line' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMMK.g:1452:3: kw= 'num'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getNumKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:1458:3: kw= 'line'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getLineKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRulePrimitiveValue"
    // InternalMMK.g:1467:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalMMK.g:1467:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalMMK.g:1468:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // InternalMMK.g:1474:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMMK.g:1480:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalMMK.g:1481:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalMMK.g:1481:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMMK.g:1482:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:1490:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getPrimitiveValueAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMMK.g:1501:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMMK.g:1501:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMMK.g:1502:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMMK.g:1508:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VAR_NAME_0= RULE_VAR_NAME ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_NAME_0=null;


        	enterRule();

        try {
            // InternalMMK.g:1514:2: (this_VAR_NAME_0= RULE_VAR_NAME )
            // InternalMMK.g:1515:2: this_VAR_NAME_0= RULE_VAR_NAME
            {
            this_VAR_NAME_0=(Token)match(input,RULE_VAR_NAME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VAR_NAME_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_VAR_NAME_0, grammarAccess.getQualifiedNameAccess().getVAR_NAMETerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleUnarySuffix"
    // InternalMMK.g:1525:1: entryRuleUnarySuffix returns [String current=null] : iv_ruleUnarySuffix= ruleUnarySuffix EOF ;
    public final String entryRuleUnarySuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnarySuffix = null;


        try {
            // InternalMMK.g:1525:51: (iv_ruleUnarySuffix= ruleUnarySuffix EOF )
            // InternalMMK.g:1526:2: iv_ruleUnarySuffix= ruleUnarySuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnarySuffixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnarySuffix=ruleUnarySuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnarySuffix.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnarySuffix"


    // $ANTLR start "ruleUnarySuffix"
    // InternalMMK.g:1532:1: ruleUnarySuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleUnarySuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMMK.g:1538:2: ( (kw= '++' | kw= '--' ) )
            // InternalMMK.g:1539:2: (kw= '++' | kw= '--' )
            {
            // InternalMMK.g:1539:2: (kw= '++' | kw= '--' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            else if ( (LA21_0==40) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMMK.g:1540:3: kw= '++'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnarySuffixAccess().getPlusSignPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMMK.g:1546:3: kw= '--'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnarySuffixAccess().getHyphenMinusHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnarySuffix"

    // $ANTLR start synpred1_InternalMMK
    public final void synpred1_InternalMMK_fragment() throws RecognitionException {   
        // InternalMMK.g:1052:5: ( 'else' )
        // InternalMMK.g:1052:6: 'else'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMMK

    // Delegated rules

    public final boolean synpred1_InternalMMK() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMMK_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000710101E070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200072L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000710501C070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000F6000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000600001C070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});

}
package org.projektas.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMKLexer extends Lexer {
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

    public InternalMMKLexer() {;} 
    public InternalMMKLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMMKLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMMK.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:11:7: ( '<MMK' )
            // InternalMMK.g:11:9: '<MMK'
            {
            match("<MMK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:12:7: ( 'MMK>' )
            // InternalMMK.g:12:9: 'MMK>'
            {
            match("MMK>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:13:7: ( 'c.getLine' )
            // InternalMMK.g:13:9: 'c.getLine'
            {
            match("c.getLine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:14:7: ( 'c.getNum' )
            // InternalMMK.g:14:9: 'c.getNum'
            {
            match("c.getNum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:15:7: ( 'c.printL' )
            // InternalMMK.g:15:9: 'c.printL'
            {
            match("c.printL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:16:7: ( '*' )
            // InternalMMK.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:17:7: ( '/' )
            // InternalMMK.g:17:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:18:7: ( '+' )
            // InternalMMK.g:18:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:19:7: ( '-' )
            // InternalMMK.g:19:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:20:7: ( '(' )
            // InternalMMK.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:21:7: ( ')' )
            // InternalMMK.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:22:7: ( '=' )
            // InternalMMK.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:23:7: ( 'check' )
            // InternalMMK.g:23:9: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:24:7: ( '<' )
            // InternalMMK.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:25:7: ( '>' )
            // InternalMMK.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:26:7: ( 'else' )
            // InternalMMK.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:27:7: ( '<=' )
            // InternalMMK.g:27:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:28:7: ( '>=' )
            // InternalMMK.g:28:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:29:7: ( '==' )
            // InternalMMK.g:29:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:30:7: ( '!=' )
            // InternalMMK.g:30:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:31:7: ( '<F' )
            // InternalMMK.g:31:9: '<F'
            {
            match("<F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:32:7: ( ',' )
            // InternalMMK.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:33:7: ( ':' )
            // InternalMMK.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:34:7: ( 'F>' )
            // InternalMMK.g:34:9: 'F>'
            {
            match("F>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:35:7: ( 'till' )
            // InternalMMK.g:35:9: 'till'
            {
            match("till"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:36:7: ( 'num' )
            // InternalMMK.g:36:9: 'num'
            {
            match("num"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:37:7: ( 'line' )
            // InternalMMK.g:37:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:38:7: ( '++' )
            // InternalMMK.g:38:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:39:7: ( '--' )
            // InternalMMK.g:39:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_VAR_NAME"
    public final void mRULE_VAR_NAME() throws RecognitionException {
        try {
            int _type = RULE_VAR_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1554:15: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMMK.g:1554:17: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // InternalMMK.g:1554:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMMK.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR_NAME"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1556:17: ( '#MMK' ( options {greedy=false; } : . )* 'MMK#' )
            // InternalMMK.g:1556:19: '#MMK' ( options {greedy=false; } : . )* 'MMK#'
            {
            match("#MMK"); 

            // InternalMMK.g:1556:26: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='M') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='M') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='K') ) {
                            int LA2_4 = input.LA(4);

                            if ( (LA2_4=='#') ) {
                                alt2=2;
                            }
                            else if ( ((LA2_4>='\u0000' && LA2_4<='\"')||(LA2_4>='$' && LA2_4<='\uFFFF')) ) {
                                alt2=1;
                            }


                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='J')||(LA2_3>='L' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='L')||(LA2_1>='N' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='L')||(LA2_0>='N' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMMK.g:1556:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("MMK#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1558:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMMK.g:1558:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMMK.g:1558:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMMK.g:1558:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMMK.g:1558:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMMK.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1560:10: ( ( '0' .. '9' )+ )
            // InternalMMK.g:1560:12: ( '0' .. '9' )+
            {
            // InternalMMK.g:1560:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMMK.g:1560:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1562:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMMK.g:1562:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMMK.g:1562:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMMK.g:1562:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMMK.g:1562:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMMK.g:1562:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMMK.g:1562:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMMK.g:1562:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMMK.g:1562:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMMK.g:1562:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMMK.g:1562:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1564:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMMK.g:1564:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMMK.g:1564:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMMK.g:1564:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMMK.g:1564:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMMK.g:1564:41: ( '\\r' )? '\\n'
                    {
                    // InternalMMK.g:1564:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMMK.g:1564:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1566:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMMK.g:1566:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMMK.g:1566:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMMK.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMMK.g:1568:16: ( . )
            // InternalMMK.g:1568:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMMK.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_VAR_NAME | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=37;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMMK.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMMK.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMMK.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMMK.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMMK.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMMK.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMMK.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMMK.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMMK.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMMK.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMMK.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMMK.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMMK.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMMK.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMMK.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMMK.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMMK.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMMK.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMMK.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMMK.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMMK.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMMK.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMMK.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMMK.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMMK.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMMK.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMMK.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMMK.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMMK.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMMK.g:1:184: RULE_VAR_NAME
                {
                mRULE_VAR_NAME(); 

                }
                break;
            case 31 :
                // InternalMMK.g:1:198: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalMMK.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalMMK.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalMMK.g:1:231: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalMMK.g:1:243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMMK.g:1:259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalMMK.g:1:267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\40\1\42\1\46\1\uffff\1\51\1\53\1\55\2\uffff\1\61\1\63\1\46\1\34\2\uffff\1\42\4\46\2\34\2\uffff\2\34\6\uffff\1\42\2\uffff\2\46\16\uffff\1\46\4\uffff\3\46\4\uffff\1\42\2\uffff\3\46\1\115\1\46\2\uffff\1\46\1\121\1\122\1\uffff\1\123\1\uffff\1\126\6\uffff";
    static final String DFA13_eofS =
        "\127\uffff";
    static final String DFA13_minS =
        "\1\0\1\75\1\115\1\56\1\uffff\1\57\1\53\1\55\2\uffff\2\75\1\60\1\75\2\uffff\1\76\4\60\1\115\1\101\2\uffff\2\0\6\uffff\1\113\1\uffff\1\147\2\60\16\uffff\1\60\4\uffff\3\60\4\uffff\1\76\1\145\1\uffff\5\60\1\uffff\1\164\3\60\1\uffff\1\60\1\114\1\60\6\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\115\1\172\1\uffff\1\57\1\53\1\55\2\uffff\2\75\1\172\1\75\2\uffff\1\76\4\172\1\115\1\172\2\uffff\2\uffff\6\uffff\1\113\1\uffff\1\160\2\172\16\uffff\1\172\4\uffff\3\172\4\uffff\1\76\1\145\1\uffff\5\172\1\uffff\1\164\3\172\1\uffff\1\172\1\116\1\172\6\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\6\3\uffff\1\12\1\13\4\uffff\1\26\1\27\7\uffff\1\40\1\41\2\uffff\1\44\1\45\1\1\1\21\1\25\1\16\1\uffff\1\40\3\uffff\1\36\1\6\1\43\1\7\1\34\1\10\1\35\1\11\1\12\1\13\1\23\1\14\1\22\1\17\1\uffff\1\24\1\26\1\27\1\30\3\uffff\1\37\1\41\1\42\1\44\2\uffff\1\5\5\uffff\1\2\4\uffff\1\32\3\uffff\1\20\1\31\1\33\1\3\1\4\1\15";
    static final String DFA13_specialS =
        "\1\0\30\uffff\1\1\1\2\74\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\15\1\31\1\25\3\34\1\32\1\10\1\11\1\4\1\6\1\16\1\7\1\34\1\5\12\30\1\17\1\34\1\1\1\12\1\13\2\34\5\27\1\20\6\27\1\2\15\27\3\34\1\26\1\27\1\34\2\24\1\3\1\24\1\14\6\24\1\23\1\24\1\22\5\24\1\21\6\24\uff85\34",
            "\1\36\10\uffff\1\37\6\uffff\1\35",
            "\1\41",
            "\1\43\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\44\22\45",
            "",
            "\1\50",
            "\1\52",
            "\1\54",
            "",
            "",
            "\1\60",
            "\1\62",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\64\16\45",
            "\1\65",
            "",
            "",
            "\1\70",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\71\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\72\5\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\73\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\74",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\76",
            "\0\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "\1\101\10\uffff\1\102",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\103\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\104\7\45",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\105\16\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\106\15\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\107\14\45",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45\1\112\27\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\113\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\114\16\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\116\25\45",
            "",
            "\1\117",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\12\45\1\120\17\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\124\1\uffff\1\125",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_VAR_NAME | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='<') ) {s = 1;}

                        else if ( (LA13_0=='M') ) {s = 2;}

                        else if ( (LA13_0=='c') ) {s = 3;}

                        else if ( (LA13_0=='*') ) {s = 4;}

                        else if ( (LA13_0=='/') ) {s = 5;}

                        else if ( (LA13_0=='+') ) {s = 6;}

                        else if ( (LA13_0=='-') ) {s = 7;}

                        else if ( (LA13_0=='(') ) {s = 8;}

                        else if ( (LA13_0==')') ) {s = 9;}

                        else if ( (LA13_0=='=') ) {s = 10;}

                        else if ( (LA13_0=='>') ) {s = 11;}

                        else if ( (LA13_0=='e') ) {s = 12;}

                        else if ( (LA13_0=='!') ) {s = 13;}

                        else if ( (LA13_0==',') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='F') ) {s = 16;}

                        else if ( (LA13_0=='t') ) {s = 17;}

                        else if ( (LA13_0=='n') ) {s = 18;}

                        else if ( (LA13_0=='l') ) {s = 19;}

                        else if ( ((LA13_0>='a' && LA13_0<='b')||LA13_0=='d'||(LA13_0>='f' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='o' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='z')) ) {s = 20;}

                        else if ( (LA13_0=='#') ) {s = 21;}

                        else if ( (LA13_0=='^') ) {s = 22;}

                        else if ( ((LA13_0>='A' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='Z')||LA13_0=='_') ) {s = 23;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 24;}

                        else if ( (LA13_0=='\"') ) {s = 25;}

                        else if ( (LA13_0=='\'') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='$' && LA13_0<='&')||LA13_0=='.'||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 62;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_26 = input.LA(1);

                        s = -1;
                        if ( ((LA13_26>='\u0000' && LA13_26<='\uFFFF')) ) {s = 62;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
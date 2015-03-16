package apple.foundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSLinguisticTag 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagWord")
    protected static native NSString WordValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPunctuation")
    protected static native NSString PunctuationValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagWhitespace")
    protected static native NSString WhitespaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOther")
    protected static native NSString OtherValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagNoun")
    protected static native NSString NounValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagVerb")
    protected static native NSString VerbValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagAdjective")
    protected static native NSString AdjectiveValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagAdverb")
    protected static native NSString AdverbValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPronoun")
    protected static native NSString PronounValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagDeterminer")
    protected static native NSString DeterminerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagParticle")
    protected static native NSString ParticleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPreposition")
    protected static native NSString PrepositionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagNumber")
    protected static native NSString NumberValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagConjunction")
    protected static native NSString ConjunctionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagInterjection")
    protected static native NSString InterjectionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagClassifier")
    protected static native NSString ClassifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagIdiom")
    protected static native NSString IdiomValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherWord")
    protected static native NSString OtherWordValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSentenceTerminator")
    protected static native NSString SentenceTerminatorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOpenQuote")
    protected static native NSString OpenQuoteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagCloseQuote")
    protected static native NSString CloseQuoteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOpenParenthesis")
    protected static native NSString OpenParenthesisValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagCloseParenthesis")
    protected static native NSString CloseParenthesisValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagWordJoiner")
    protected static native NSString WordJoinerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagDash")
    protected static native NSString DashValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherPunctuation")
    protected static native NSString OtherPunctuationValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagParagraphBreak")
    protected static native NSString ParagraphBreakValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherWhitespace")
    protected static native NSString OtherWhitespaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPersonalName")
    protected static native NSString PersonalNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPlaceName")
    protected static native NSString PlaceNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOrganizationName")
    protected static native NSString OrganizationNameValue();
    
}

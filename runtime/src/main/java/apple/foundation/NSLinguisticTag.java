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
    public static native NSString WordValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPunctuation")
    public static native NSString PunctuationValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagWhitespace")
    public static native NSString WhitespaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOther")
    public static native NSString OtherValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagNoun")
    public static native NSString NounValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagVerb")
    public static native NSString VerbValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagAdjective")
    public static native NSString AdjectiveValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagAdverb")
    public static native NSString AdverbValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPronoun")
    public static native NSString PronounValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagDeterminer")
    public static native NSString DeterminerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagParticle")
    public static native NSString ParticleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPreposition")
    public static native NSString PrepositionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagNumber")
    public static native NSString NumberValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagConjunction")
    public static native NSString ConjunctionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagInterjection")
    public static native NSString InterjectionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagClassifier")
    public static native NSString ClassifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagIdiom")
    public static native NSString IdiomValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherWord")
    public static native NSString OtherWordValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSentenceTerminator")
    public static native NSString SentenceTerminatorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOpenQuote")
    public static native NSString OpenQuoteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagCloseQuote")
    public static native NSString CloseQuoteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOpenParenthesis")
    public static native NSString OpenParenthesisValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagCloseParenthesis")
    public static native NSString CloseParenthesisValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagWordJoiner")
    public static native NSString WordJoinerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagDash")
    public static native NSString DashValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherPunctuation")
    public static native NSString OtherPunctuationValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagParagraphBreak")
    public static native NSString ParagraphBreakValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOtherWhitespace")
    public static native NSString OtherWhitespaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPersonalName")
    public static native NSString PersonalNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagPlaceName")
    public static native NSString PlaceNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagOrganizationName")
    public static native NSString OrganizationNameValue();

}

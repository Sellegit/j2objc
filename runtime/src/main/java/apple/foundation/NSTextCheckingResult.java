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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation") @Mapping("NSTextCheckingResult")
public class NSTextCheckingResult 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public NSTextCheckingResult() {}
    
    
    @Mapping("resultType")
    public native @Representing("NSTextCheckingType") long getResultType();
    @Mapping("range")
    public native NSRange getRange();
    @Mapping("orthography")
    public native NSOrthography getOrthography();
    @Mapping("grammarDetails")
    public native List<String> getGrammarDetails();
    @Mapping("date")
    public native NSDate getDate();
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    @Mapping("duration")
    public native double getDuration();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("components")
    public native NSTextCheckingTransitComponents getComponents();
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("replacementString")
    public native String getReplacementString();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("alternativeStrings")
    public native List<String> getAlternativeStrings();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("regularExpression")
    public native NSRegularExpression getRegularExpression();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("phoneNumber")
    public native String getPhoneNumber();
    @Mapping("addressComponents")
    public native NSTextCheckingAddressComponents getAddressComponents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("numberOfRanges")
    public native @MachineSizedUInt long getNumberOfRanges();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("rangeAtIndex:")
    public native NSRange getRangeAt(@MachineSizedUInt long idx);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("resultByAdjustingRangesWithOffset:")
    public native NSTextCheckingResult newResultByAdjustingRanges(@MachineSizedSInt long offset);
    @Mapping("orthographyCheckingResultWithRange:orthography:")
    public static native NSTextCheckingResult createOrthographyCheckingResult(NSRange range, NSOrthography orthography);
    @Mapping("spellCheckingResultWithRange:")
    public static native NSTextCheckingResult createSpellCheckingResult(NSRange range);
    @Mapping("grammarCheckingResultWithRange:details:")
    public static native NSTextCheckingResult createGrammarCheckingResult(NSRange range, NSArray<?> details);
    @Mapping("dateCheckingResultWithRange:date:")
    public static native NSTextCheckingResult createDateCheckingResult(NSRange range, NSDate date);
    @Mapping("dateCheckingResultWithRange:date:timeZone:duration:")
    public static native NSTextCheckingResult createDateCheckingResult(NSRange range, NSDate date, NSTimeZone timeZone, double duration);
    @Mapping("addressCheckingResultWithRange:components:")
    public static native NSTextCheckingResult createAddressCheckingResult(NSRange range, NSDictionary<?, ?> components);
    @Mapping("linkCheckingResultWithRange:URL:")
    public static native NSTextCheckingResult createLinkCheckingResult(NSRange range, NSURL url);
    @Mapping("quoteCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult createQuoteCheckingResult(NSRange range, String replacementString);
    @Mapping("dashCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult createDashCheckingResult(NSRange range, String replacementString);
    @Mapping("replacementCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult createReplacementCheckingResult(NSRange range, String replacementString);
    @Mapping("correctionCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult createCorrectionCheckingResult(NSRange range, String replacementString);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("correctionCheckingResultWithRange:replacementString:alternativeStrings:")
    public static native NSTextCheckingResult createCorrectionCheckingResult(NSRange range, String replacementString, NSArray<?> alternativeStrings);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("regularExpressionCheckingResultWithRanges:count:regularExpression:")
    protected static native NSTextCheckingResult createRegularExpressionCheckingResult(NSRange ranges, @MachineSizedUInt long count, NSRegularExpression regularExpression);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("phoneNumberCheckingResultWithRange:phoneNumber:")
    public static native NSTextCheckingResult createPhoneNumberCheckingResult(NSRange range, String phoneNumber);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("transitInformationCheckingResultWithRange:components:")
    public static native NSTextCheckingResult createTransitInformationCheckingResult(NSRange range, NSDictionary<?, ?> components);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}

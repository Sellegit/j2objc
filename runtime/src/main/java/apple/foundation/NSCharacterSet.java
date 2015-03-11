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





@Library("Foundation") @Mapping("NSCharacterSet")
public class NSCharacterSet 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    public static final int OpenStepUnicodeReservedBase = 62464;
    
    
    public NSCharacterSet() {}
    @Mapping("initWithCoder:")
    public NSCharacterSet(NSCoder aDecoder) { }
    
    
    @Mapping("bitmapRepresentation")
    public native NSData getBitmapRepresentation();
    @Mapping("invertedSet")
    public native NSCharacterSet getInvertedSet();
    
    
    
    @Mapping("characterIsMember:")
    public native boolean isMember(short aCharacter);
    @Mapping("longCharacterIsMember:")
    public native boolean isMember(int theLongChar);
    @Mapping("isSupersetOfSet:")
    public native boolean isSuperset(NSCharacterSet theOtherSet);
    @Mapping("hasMemberInPlane:")
    public native boolean hasMemberInPlane(byte thePlane);
    @Mapping("controlCharacterSet")
    public static native NSCharacterSet getControlCharacterSet();
    @Mapping("whitespaceCharacterSet")
    public static native NSCharacterSet getWhitespaceCharacterSet();
    @Mapping("whitespaceAndNewlineCharacterSet")
    public static native NSCharacterSet getWhitespaceAndNewlineCharacterSet();
    @Mapping("decimalDigitCharacterSet")
    public static native NSCharacterSet getDecimalDigitCharacterSet();
    @Mapping("letterCharacterSet")
    public static native NSCharacterSet getLetterCharacterSet();
    @Mapping("lowercaseLetterCharacterSet")
    public static native NSCharacterSet getLowercaseLetterCharacterSet();
    @Mapping("uppercaseLetterCharacterSet")
    public static native NSCharacterSet getUppercaseLetterCharacterSet();
    @Mapping("nonBaseCharacterSet")
    public static native NSCharacterSet getNonBaseCharacterSet();
    @Mapping("alphanumericCharacterSet")
    public static native NSCharacterSet getAlphanumericCharacterSet();
    @Mapping("decomposableCharacterSet")
    public static native NSCharacterSet getDecomposableCharacterSet();
    @Mapping("illegalCharacterSet")
    public static native NSCharacterSet getIllegalCharacterSet();
    @Mapping("punctuationCharacterSet")
    public static native NSCharacterSet getPunctuationCharacterSet();
    @Mapping("capitalizedLetterCharacterSet")
    public static native NSCharacterSet getCapitalizedLetterCharacterSet();
    @Mapping("symbolCharacterSet")
    public static native NSCharacterSet getSymbolCharacterSet();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("newlineCharacterSet")
    public static native NSCharacterSet getNewlineCharacterSet();
    @Mapping("characterSetWithRange:")
    public static native NSCharacterSet create(NSRange aRange);
    @Mapping("characterSetWithCharactersInString:")
    public static native NSCharacterSet create(String aString);
    @Mapping("characterSetWithBitmapRepresentation:")
    public static native NSCharacterSet create(NSData data);
    @Mapping("characterSetWithContentsOfFile:")
    private static native NSCharacterSet createWithFile(String fName);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLUserAllowedCharacterSet")
    public static native NSCharacterSet getURLUserAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLPasswordAllowedCharacterSet")
    public static native NSCharacterSet getURLPasswordAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLHostAllowedCharacterSet")
    public static native NSCharacterSet getURLHostAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLPathAllowedCharacterSet")
    public static native NSCharacterSet getURLPathAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLQueryAllowedCharacterSet")
    public static native NSCharacterSet getURLQueryAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLFragmentAllowedCharacterSet")
    public static native NSCharacterSet getURLFragmentAllowedCharacterSet();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}

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





@Library("Foundation/Foundation.h") @Mapping("NSMutableCharacterSet")
public class NSMutableCharacterSet 
    extends NSCharacterSet 
    implements NSCopying {

    
    
    @Mapping("initWithCoder:")
    public NSMutableCharacterSet(NSCoder aDecoder) { }
    @Mapping("init")
    public NSMutableCharacterSet() { }
    
    
    
    
    
    
    @Mapping("addCharactersInRange:")
    public native void addCharacters(NSRange aRange);
    @Mapping("removeCharactersInRange:")
    public native void removeCharacters(NSRange aRange);
    @Mapping("addCharactersInString:")
    public native void addCharacters(String aString);
    @Mapping("removeCharactersInString:")
    public native void removeCharacters(String aString);
    @Mapping("formUnionWithCharacterSet:")
    public native void formUnion(NSCharacterSet otherSet);
    @Mapping("formIntersectionWithCharacterSet:")
    public native void formIntersection(NSCharacterSet otherSet);
    @Mapping("invert")
    public native void invert();
    @Mapping("controlCharacterSet")
    public static native NSMutableCharacterSet getControlCharacterSet();
    @Mapping("whitespaceCharacterSet")
    public static native NSMutableCharacterSet getWhitespaceCharacterSet();
    @Mapping("whitespaceAndNewlineCharacterSet")
    public static native NSMutableCharacterSet getWhitespaceAndNewlineCharacterSet();
    @Mapping("decimalDigitCharacterSet")
    public static native NSMutableCharacterSet getDecimalDigitCharacterSet();
    @Mapping("letterCharacterSet")
    public static native NSMutableCharacterSet getLetterCharacterSet();
    @Mapping("lowercaseLetterCharacterSet")
    public static native NSMutableCharacterSet getLowercaseLetterCharacterSet();
    @Mapping("uppercaseLetterCharacterSet")
    public static native NSMutableCharacterSet getUppercaseLetterCharacterSet();
    @Mapping("nonBaseCharacterSet")
    public static native NSMutableCharacterSet getNonBaseCharacterSet();
    @Mapping("alphanumericCharacterSet")
    public static native NSMutableCharacterSet getAlphanumericCharacterSet();
    @Mapping("decomposableCharacterSet")
    public static native NSMutableCharacterSet getDecomposableCharacterSet();
    @Mapping("illegalCharacterSet")
    public static native NSMutableCharacterSet getIllegalCharacterSet();
    @Mapping("punctuationCharacterSet")
    public static native NSMutableCharacterSet getPunctuationCharacterSet();
    @Mapping("capitalizedLetterCharacterSet")
    public static native NSMutableCharacterSet getCapitalizedLetterCharacterSet();
    @Mapping("symbolCharacterSet")
    public static native NSMutableCharacterSet getSymbolCharacterSet();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("newlineCharacterSet")
    public static native NSMutableCharacterSet getNewlineCharacterSet();
    @Mapping("characterSetWithRange:")
    public static native NSMutableCharacterSet create(NSRange aRange);
    @Mapping("characterSetWithCharactersInString:")
    public static native NSMutableCharacterSet create(String aString);
    @Mapping("characterSetWithBitmapRepresentation:")
    public static native NSMutableCharacterSet create(NSData data);
    @Mapping("characterSetWithContentsOfFile:")
    public static native NSMutableCharacterSet createWithFile(String fName);
    
}

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






@Mapping("NSTextCheckingType")
public final class NSTextCheckingType extends ObjCEnum {
    
    @GlobalConstant("NSTextCheckingTypeOrthography")
    public static final long Orthography = 1L;
    @GlobalConstant("NSTextCheckingTypeSpelling")
    public static final long Spelling = 2L;
    @GlobalConstant("NSTextCheckingTypeGrammar")
    public static final long Grammar = 4L;
    @GlobalConstant("NSTextCheckingTypeDate")
    public static final long Date = 8L;
    @GlobalConstant("NSTextCheckingTypeAddress")
    public static final long Address = 16L;
    @GlobalConstant("NSTextCheckingTypeLink")
    public static final long Link = 32L;
    @GlobalConstant("NSTextCheckingTypeQuote")
    public static final long Quote = 64L;
    @GlobalConstant("NSTextCheckingTypeDash")
    public static final long Dash = 128L;
    @GlobalConstant("NSTextCheckingTypeReplacement")
    public static final long Replacement = 256L;
    @GlobalConstant("NSTextCheckingTypeCorrection")
    public static final long Correction = 512L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingTypeRegularExpression")
    public static final long RegularExpression = 1024L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingTypePhoneNumber")
    public static final long PhoneNumber = 2048L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingTypeTransitInformation")
    public static final long TransitInformation = 4096L;
    

}

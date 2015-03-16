package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFCharacterSetPredefinedSet")
public final class CFCharacterSetPredefinedSet extends ObjCEnum {
    
    @GlobalConstant("kCFCharacterSetControl")
    public static final long Control = 1L;
    @GlobalConstant("kCFCharacterSetWhitespace")
    public static final long Whitespace = 2L;
    @GlobalConstant("kCFCharacterSetWhitespaceAndNewline")
    public static final long WhitespaceAndNewline = 3L;
    @GlobalConstant("kCFCharacterSetDecimalDigit")
    public static final long DecimalDigit = 4L;
    @GlobalConstant("kCFCharacterSetLetter")
    public static final long Letter = 5L;
    @GlobalConstant("kCFCharacterSetLowercaseLetter")
    public static final long LowercaseLetter = 6L;
    @GlobalConstant("kCFCharacterSetUppercaseLetter")
    public static final long UppercaseLetter = 7L;
    @GlobalConstant("kCFCharacterSetNonBase")
    public static final long NonBase = 8L;
    @GlobalConstant("kCFCharacterSetDecomposable")
    public static final long Decomposable = 9L;
    @GlobalConstant("kCFCharacterSetAlphaNumeric")
    public static final long AlphaNumeric = 10L;
    @GlobalConstant("kCFCharacterSetPunctuation")
    public static final long Punctuation = 11L;
    @GlobalConstant("kCFCharacterSetCapitalizedLetter")
    public static final long CapitalizedLetter = 13L;
    @GlobalConstant("kCFCharacterSetSymbol")
    public static final long Symbol = 14L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFCharacterSetNewline")
    public static final long Newline = 15L;
    @GlobalConstant("kCFCharacterSetIllegal")
    public static final long Illegal = 12L;
    

}

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





@Library("CoreFoundation")
@Mapping("CFStringCompareFlags")
public final class CFStringCompareFlags extends ObjCEnum {
    
    @GlobalConstant("kCFCompareCaseInsensitive")
    public static final long CaseInsensitive = 1L;
    @GlobalConstant("kCFCompareBackwards")
    public static final long Backwards = 4L;
    @GlobalConstant("kCFCompareAnchored")
    public static final long Anchored = 8L;
    @GlobalConstant("kCFCompareNonliteral")
    public static final long Nonliteral = 16L;
    @GlobalConstant("kCFCompareLocalized")
    public static final long Localized = 32L;
    @GlobalConstant("kCFCompareNumerically")
    public static final long Numerically = 64L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFCompareDiacriticInsensitive")
    public static final long DiacriticInsensitive = 128L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFCompareWidthInsensitive")
    public static final long WidthInsensitive = 256L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFCompareForcedOrdering")
    public static final long ForcedOrdering = 512L;
    

}

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





@Library("Foundation")
@Mapping("NSStringCompareOptions")
public final class NSStringCompareOptions extends ObjCEnum {
    
    @GlobalConstant("NSCaseInsensitiveSearch")
    public static final long CaseInsensitive = 1L;
    @GlobalConstant("NSLiteralSearch")
    public static final long Literal = 2L;
    @GlobalConstant("NSBackwardsSearch")
    public static final long Backwards = 4L;
    @GlobalConstant("NSAnchoredSearch")
    public static final long Anchored = 8L;
    @GlobalConstant("NSNumericSearch")
    public static final long Numeric = 64L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSDiacriticInsensitiveSearch")
    public static final long DiacriticInsensitive = 128L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSWidthInsensitiveSearch")
    public static final long WidthInsensitive = 256L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSForcedOrderingSearch")
    public static final long ForcedOrdering = 512L;
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("NSRegularExpressionSearch")
    public static final long RegularExpression = 1024L;
    

}

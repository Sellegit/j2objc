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
@Mapping("NSComparisonPredicateOptions")
public final class NSComparisonPredicateOptions extends ObjCEnum {
    
    @GlobalConstant("NSCaseInsensitivePredicateOption")
    public static final long CaseInsensitive = 1L;
    @GlobalConstant("NSDiacriticInsensitivePredicateOption")
    public static final long DiacriticInsensitive = 2L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSNormalizedPredicateOption")
    public static final long Normalized = 4L;
    

}

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






@Mapping("NSDataReadingOptions")
public final class NSDataReadingOptions extends ObjCEnum {
    
    @GlobalConstant("NSDataReadingMappedIfSafe")
    public static final long DataReadingMappedIfSafe = 1L;
    @GlobalConstant("NSDataReadingUncached")
    public static final long DataReadingUncached = 2L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSDataReadingMappedAlways")
    public static final long DataReadingMappedAlways = 8L;
    @GlobalConstant("NSDataReadingMapped")
    public static final long DataReadingMapped = 1L;
    @GlobalConstant("NSMappedRead")
    public static final long MappedRead = 1L;
    @GlobalConstant("NSUncachedRead")
    public static final long UncachedRead = 2L;
    

}

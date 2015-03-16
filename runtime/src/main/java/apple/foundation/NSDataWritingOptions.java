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





@Library("Foundation/Foundation.h")
@Mapping("NSDataWritingOptions")
public final class NSDataWritingOptions extends ObjCEnum {
    
    @GlobalConstant("NSDataWritingAtomic")
    public static final long DataWritingAtomic = 1L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSDataWritingWithoutOverwriting")
    public static final long DataWritingWithoutOverwriting = 2L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSDataWritingFileProtectionNone")
    public static final long DataWritingFileProtectionNone = 268435456L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSDataWritingFileProtectionComplete")
    public static final long DataWritingFileProtectionComplete = 536870912L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSDataWritingFileProtectionCompleteUnlessOpen")
    public static final long DataWritingFileProtectionCompleteUnlessOpen = 805306368L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication")
    public static final long DataWritingFileProtectionCompleteUntilFirstUserAuthentication = 1073741824L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSDataWritingFileProtectionMask")
    public static final long DataWritingFileProtectionMask = -268435456L;
    @GlobalConstant("NSAtomicWrite")
    public static final long AtomicWrite = 1L;
    

}

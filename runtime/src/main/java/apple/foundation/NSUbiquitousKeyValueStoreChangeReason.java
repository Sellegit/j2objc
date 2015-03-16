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
@Mapping("NSUbiquitousKeyValueStoreChangeReason")
public final class NSUbiquitousKeyValueStoreChangeReason extends ObjCEnum {
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSUbiquitousKeyValueStoreServerChange")
    public static final long ServerChange = 0L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSUbiquitousKeyValueStoreInitialSyncChange")
    public static final long InitialSyncChange = 1L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSUbiquitousKeyValueStoreQuotaViolationChange")
    public static final long QuotaViolationChange = 2L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSUbiquitousKeyValueStoreAccountChange")
    public static final long AccountChange = 3L;
    

}

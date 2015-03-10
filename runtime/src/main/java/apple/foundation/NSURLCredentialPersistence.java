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






@Mapping("NSURLCredentialPersistence")
public final class NSURLCredentialPersistence extends ObjCEnum {
    
    @GlobalConstant("NSURLCredentialPersistenceNone")
    public static final long None = 0L;
    @GlobalConstant("NSURLCredentialPersistenceForSession")
    public static final long ForSession = 1L;
    @GlobalConstant("NSURLCredentialPersistencePermanent")
    public static final long Permanent = 2L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSURLCredentialPersistenceSynchronizable")
    public static final long Synchronizable = 3L;
    

}

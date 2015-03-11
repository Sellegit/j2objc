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






@Mapping("NSURLCacheStoragePolicy")
public final class NSURLCacheStoragePolicy extends ObjCEnum {
    
    @GlobalConstant("NSURLCacheStorageAllowed")
    public static final long Allowed = 0L;
    @GlobalConstant("NSURLCacheStorageAllowedInMemoryOnly")
    public static final long AllowedInMemoryOnly = 1L;
    @GlobalConstant("NSURLCacheStorageNotAllowed")
    public static final long NotAllowed = 2L;
    

}

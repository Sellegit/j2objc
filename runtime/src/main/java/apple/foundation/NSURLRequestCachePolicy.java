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






@Mapping("NSURLRequestCachePolicy")
public final class NSURLRequestCachePolicy extends ObjCEnum {
    
    @GlobalConstant("NSURLRequestUseProtocolCachePolicy")
    public static final long UseProtocolCachePolicy = 0L;
    @GlobalConstant("NSURLRequestReloadIgnoringLocalCacheData")
    public static final long ReloadIgnoringLocalCacheData = 1L;
    @GlobalConstant("NSURLRequestReloadIgnoringLocalAndRemoteCacheData")
    public static final long ReloadIgnoringLocalAndRemoteCacheData = 4L;
    @GlobalConstant("NSURLRequestReloadIgnoringCacheData")
    public static final long ReloadIgnoringCacheData = 1L;
    @GlobalConstant("NSURLRequestReturnCacheDataElseLoad")
    public static final long ReturnCacheDataElseLoad = 2L;
    @GlobalConstant("NSURLRequestReturnCacheDataDontLoad")
    public static final long ReturnCacheDataDontLoad = 3L;
    @GlobalConstant("NSURLRequestReloadRevalidatingCacheData")
    public static final long ReloadRevalidatingCacheData = 5L;
    

}

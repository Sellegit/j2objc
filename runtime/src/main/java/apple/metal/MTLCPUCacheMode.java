package apple.metal;


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
import apple.foundation.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("MTLCPUCacheMode")
public final class MTLCPUCacheMode extends ObjCEnum {
    
    @GlobalConstant("MTLCPUCacheModeDefaultCache")
    public static final long DefaultCache = 0L;
    @GlobalConstant("MTLCPUCacheModeWriteCombined")
    public static final long WriteCombined = 1L;
    

}

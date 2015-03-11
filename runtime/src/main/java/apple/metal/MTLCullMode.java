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

@Library("Metal")
@Mapping("MTLCullMode")
public final class MTLCullMode extends ObjCEnum {
    
    @GlobalConstant("MTLCullModeNone")
    public static final long None = 0L;
    @GlobalConstant("MTLCullModeFront")
    public static final long Front = 1L;
    @GlobalConstant("MTLCullModeBack")
    public static final long Back = 2L;
    

}

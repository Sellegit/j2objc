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
@Mapping("MTLFunctionType")
public final class MTLFunctionType extends ObjCEnum {
    
    @GlobalConstant("MTLFunctionTypeVertex")
    public static final long Vertex = 1L;
    @GlobalConstant("MTLFunctionTypeFragment")
    public static final long Fragment = 2L;
    @GlobalConstant("MTLFunctionTypeKernel")
    public static final long Kernel = 3L;
    

}

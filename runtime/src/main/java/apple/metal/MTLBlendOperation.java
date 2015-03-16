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

@Library("Metal/Metal.h")
@Mapping("MTLBlendOperation")
public final class MTLBlendOperation extends ObjCEnum {
    
    @GlobalConstant("MTLBlendOperationAdd")
    public static final long Add = 0L;
    @GlobalConstant("MTLBlendOperationSubtract")
    public static final long Subtract = 1L;
    @GlobalConstant("MTLBlendOperationReverseSubtract")
    public static final long ReverseSubtract = 2L;
    @GlobalConstant("MTLBlendOperationMin")
    public static final long Min = 3L;
    @GlobalConstant("MTLBlendOperationMax")
    public static final long Max = 4L;
    

}

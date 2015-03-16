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
@Mapping("MTLRenderPipelineErrorCode")
public final class MTLRenderPipelineErrorCode extends ObjCEnum {
    
    @GlobalConstant("MTLRenderPipelineErrorInternal")
    public static final long Internal = 1L;
    @GlobalConstant("MTLRenderPipelineErrorUnsupported")
    public static final long Unsupported = 2L;
    @GlobalConstant("MTLRenderPipelineErrorInvalidInput")
    public static final long InvalidInput = 3L;
    

}

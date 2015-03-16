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
@Mapping("MTLLibraryErrorCode")
public final class MTLLibraryErrorCode extends ObjCEnum {
    
    @GlobalConstant("MTLLibraryErrorUnsupported")
    public static final long Unsupported = 1L;
    @GlobalConstant("MTLLibraryErrorInternal")
    public static final long Internal = 2L;
    @GlobalConstant("MTLLibraryErrorCompileFailure")
    public static final long CompileFailure = 3L;
    @GlobalConstant("MTLLibraryErrorCompileWarning")
    public static final long CompileWarning = 4L;
    

}

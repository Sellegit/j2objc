package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;


@Library("CoreVideo/CoreVideo.h")
@Mapping("CVReturn")
public final class CVReturn extends ObjCEnum {
    
    @GlobalConstant("kCVReturnSuccess")
    public static final long Success = 0L;
    @GlobalConstant("kCVReturnFirst")
    public static final long First = -6660L;
    @GlobalConstant("kCVReturnError")
    public static final long Error = -6660L;
    @GlobalConstant("kCVReturnInvalidArgument")
    public static final long InvalidArgument = -6661L;
    @GlobalConstant("kCVReturnAllocationFailed")
    public static final long AllocationFailed = -6662L;
    @GlobalConstant("kCVReturnInvalidDisplay")
    public static final long InvalidDisplay = -6670L;
    @GlobalConstant("kCVReturnDisplayLinkAlreadyRunning")
    public static final long DisplayLinkAlreadyRunning = -6671L;
    @GlobalConstant("kCVReturnDisplayLinkNotRunning")
    public static final long DisplayLinkNotRunning = -6672L;
    @GlobalConstant("kCVReturnDisplayLinkCallbacksNotSet")
    public static final long DisplayLinkCallbacksNotSet = -6673L;
    @GlobalConstant("kCVReturnInvalidPixelFormat")
    public static final long InvalidPixelFormat = -6680L;
    @GlobalConstant("kCVReturnInvalidSize")
    public static final long InvalidSize = -6681L;
    @GlobalConstant("kCVReturnInvalidPixelBufferAttributes")
    public static final long InvalidPixelBufferAttributes = -6682L;
    @GlobalConstant("kCVReturnPixelBufferNotOpenGLCompatible")
    public static final long PixelBufferNotOpenGLCompatible = -6683L;
    @GlobalConstant("kCVReturnPixelBufferNotMetalCompatible")
    public static final long PixelBufferNotMetalCompatible = -6684L;
    @GlobalConstant("kCVReturnWouldExceedAllocationThreshold")
    public static final long WouldExceedAllocationThreshold = -6689L;
    @GlobalConstant("kCVReturnPoolAllocationFailed")
    public static final long PoolAllocationFailed = -6690L;
    @GlobalConstant("kCVReturnInvalidPoolAttributes")
    public static final long InvalidPoolAttributes = -6691L;
    @GlobalConstant("kCVReturnLast")
    public static final long Last = -6699L;


}

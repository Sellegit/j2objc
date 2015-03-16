package apple.coregraphics;


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
import apple.uikit.*;





@Library("CoreGraphics/CoreGraphics.h")
@Mapping("CGError")
public final class CGError extends ObjCEnum {
    
    @GlobalConstant("kCGErrorSuccess")
    public static final long Success = 0L;
    @GlobalConstant("kCGErrorFailure")
    public static final long Failure = 1000L;
    @GlobalConstant("kCGErrorIllegalArgument")
    public static final long IllegalArgument = 1001L;
    @GlobalConstant("kCGErrorInvalidConnection")
    public static final long InvalidConnection = 1002L;
    @GlobalConstant("kCGErrorInvalidContext")
    public static final long InvalidContext = 1003L;
    @GlobalConstant("kCGErrorCannotComplete")
    public static final long CannotComplete = 1004L;
    @GlobalConstant("kCGErrorNotImplemented")
    public static final long NotImplemented = 1006L;
    @GlobalConstant("kCGErrorRangeCheck")
    public static final long RangeCheck = 1007L;
    @GlobalConstant("kCGErrorTypeCheck")
    public static final long TypeCheck = 1008L;
    @GlobalConstant("kCGErrorInvalidOperation")
    public static final long InvalidOperation = 1010L;
    @GlobalConstant("kCGErrorNoneAvailable")
    public static final long NoneAvailable = 1011L;
    

}

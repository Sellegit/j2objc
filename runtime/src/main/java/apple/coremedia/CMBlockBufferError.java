package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;






@Mapping("CMBlockBufferError")
public final class CMBlockBufferError extends ObjCEnum {
    
    @GlobalConstant("kCMBlockBufferNoErr")
    public static final long No = 0L;
    @GlobalConstant("kCMBlockBufferStructureAllocationFailedErr")
    public static final long StructureAllocationFailed = -12700L;
    @GlobalConstant("kCMBlockBufferBlockAllocationFailedErr")
    public static final long BlockAllocationFailed = -12701L;
    @GlobalConstant("kCMBlockBufferBadCustomBlockSourceErr")
    public static final long BadCustomBlockSource = -12702L;
    @GlobalConstant("kCMBlockBufferBadOffsetParameterErr")
    public static final long BadOffsetParameter = -12703L;
    @GlobalConstant("kCMBlockBufferBadLengthParameterErr")
    public static final long BadLengthParameter = -12704L;
    @GlobalConstant("kCMBlockBufferBadPointerParameterErr")
    public static final long BadPointerParameter = -12705L;
    @GlobalConstant("kCMBlockBufferEmptyBBufErr")
    public static final long EmptyBBuf = -12706L;
    @GlobalConstant("kCMBlockBufferUnallocatedBlockErr")
    public static final long UnallocatedBlock = -12707L;
    @GlobalConstant("kCMBlockBufferInsufficientSpaceErr")
    public static final long InsufficientSpace = -12708L;
    

}

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






@Mapping("CMSampleBufferError")
public final class CMSampleBufferError extends ObjCEnum {
    
    @GlobalConstant("kCMSampleBufferError_AllocationFailed")
    public static final long AllocationFailed = -12730L;
    @GlobalConstant("kCMSampleBufferError_RequiredParameterMissing")
    public static final long RequiredParameterMissing = -12731L;
    @GlobalConstant("kCMSampleBufferError_AlreadyHasDataBuffer")
    public static final long AlreadyHasDataBuffer = -12732L;
    @GlobalConstant("kCMSampleBufferError_BufferNotReady")
    public static final long BufferNotReady = -12733L;
    @GlobalConstant("kCMSampleBufferError_SampleIndexOutOfRange")
    public static final long SampleIndexOutOfRange = -12734L;
    @GlobalConstant("kCMSampleBufferError_BufferHasNoSampleSizes")
    public static final long BufferHasNoSampleSizes = -12735L;
    @GlobalConstant("kCMSampleBufferError_BufferHasNoSampleTimingInfo")
    public static final long BufferHasNoSampleTimingInfo = -12736L;
    @GlobalConstant("kCMSampleBufferError_ArrayTooSmall")
    public static final long ArrayTooSmall = -12737L;
    @GlobalConstant("kCMSampleBufferError_InvalidEntryCount")
    public static final long InvalidEntryCount = -12738L;
    @GlobalConstant("kCMSampleBufferError_CannotSubdivide")
    public static final long CannotSubdivide = -12739L;
    @GlobalConstant("kCMSampleBufferError_SampleTimingInfoInvalid")
    public static final long SampleTimingInfoInvalid = -12740L;
    @GlobalConstant("kCMSampleBufferError_InvalidMediaTypeForOperation")
    public static final long InvalidMediaTypeForOperation = -12741L;
    @GlobalConstant("kCMSampleBufferError_InvalidSampleData")
    public static final long InvalidSampleData = -12742L;
    @GlobalConstant("kCMSampleBufferError_InvalidMediaFormat")
    public static final long InvalidMediaFormat = -12743L;
    @GlobalConstant("kCMSampleBufferError_Invalidated")
    public static final long Invalidated = -12744L;
    @GlobalConstant("kCMSampleBufferError_DataFailed")
    public static final long DataFailed = -12745L;
    @GlobalConstant("kCMSampleBufferError_DataCanceled")
    public static final long DataCanceled = -12746L;
    

}

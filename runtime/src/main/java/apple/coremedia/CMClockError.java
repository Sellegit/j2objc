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






@Mapping("CMClockError")
public final class CMClockError extends ObjCEnum {
    
    @GlobalConstant("kCMClockError_MissingRequiredParameter")
    public static final long MissingRequiredParameter = -12745L;
    @GlobalConstant("kCMClockError_InvalidParameter")
    public static final long InvalidParameter = -12746L;
    @GlobalConstant("kCMClockError_AllocationFailed")
    public static final long AllocationFailed = -12747L;
    @GlobalConstant("kCMClockError_UnsupportedOperation")
    public static final long UnsupportedOperation = -12756L;
    

}

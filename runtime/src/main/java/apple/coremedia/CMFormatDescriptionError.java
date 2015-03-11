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





@Library("CoreMedia")
@Mapping("CMFormatDescriptionError")
public final class CMFormatDescriptionError extends ObjCEnum {
    
    @GlobalConstant("kCMFormatDescriptionError_InvalidParameter")
    public static final long InvalidParameter = -12710L;
    @GlobalConstant("kCMFormatDescriptionError_AllocationFailed")
    public static final long AllocationFailed = -12711L;
    @GlobalConstant("kCMFormatDescriptionError_ValueNotAvailable")
    public static final long ValueNotAvailable = -12718L;
    

}

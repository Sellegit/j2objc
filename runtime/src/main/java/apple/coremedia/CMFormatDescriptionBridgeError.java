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





@Library("CoreMedia/CoreMedia.h")
@Mapping("CMFormatDescriptionBridgeError")
public final class CMFormatDescriptionBridgeError extends ObjCEnum {
    
    @GlobalConstant("kCMFormatDescriptionBridgeError_InvalidParameter")
    public static final long InvalidParameter = -12712L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_AllocationFailed")
    public static final long AllocationFailed = -12713L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_InvalidSerializedSampleDescription")
    public static final long InvalidSerializedSampleDescription = -12714L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_InvalidFormatDescription")
    public static final long InvalidFormatDescription = -12715L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_IncompatibleFormatDescription")
    public static final long IncompatibleFormatDescription = -12716L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_UnsupportedSampleDescriptionFlavor")
    public static final long UnsupportedSampleDescriptionFlavor = -12717L;
    @GlobalConstant("kCMFormatDescriptionBridgeError_InvalidSlice")
    public static final long InvalidSlice = -12719L;
    

}

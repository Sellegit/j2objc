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
@Mapping("CMBlockBufferFlag")
public final class CMBlockBufferFlag extends ObjCEnum {
    
    @GlobalConstant("kCMBlockBufferAssureMemoryNowFlag")
    public static final long AssureMemoryNow = 1L;
    @GlobalConstant("kCMBlockBufferAlwaysCopyDataFlag")
    public static final long AlwaysCopyData = 2L;
    @GlobalConstant("kCMBlockBufferDontOptimizeDepthFlag")
    public static final long DontOptimizeDepth = 4L;
    @GlobalConstant("kCMBlockBufferPermitEmptyReferenceFlag")
    public static final long PermitEmptyReference = 8L;
    

}

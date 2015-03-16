package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation/AVFoundation.h")
@Mapping("AVQueuedSampleBufferRenderingStatus")
public final class AVQueuedSampleBufferRenderingStatus extends ObjCEnum {
    
    @GlobalConstant("AVQueuedSampleBufferRenderingStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVQueuedSampleBufferRenderingStatusRendering")
    public static final long Rendering = 1L;
    @GlobalConstant("AVQueuedSampleBufferRenderingStatusFailed")
    public static final long Failed = 2L;
    

}

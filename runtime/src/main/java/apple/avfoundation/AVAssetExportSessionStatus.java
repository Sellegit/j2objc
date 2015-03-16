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





@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAssetExportSessionStatus")
public final class AVAssetExportSessionStatus extends ObjCEnum {
    
    @GlobalConstant("AVAssetExportSessionStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVAssetExportSessionStatusWaiting")
    public static final long Waiting = 1L;
    @GlobalConstant("AVAssetExportSessionStatusExporting")
    public static final long Exporting = 2L;
    @GlobalConstant("AVAssetExportSessionStatusCompleted")
    public static final long Completed = 3L;
    @GlobalConstant("AVAssetExportSessionStatusFailed")
    public static final long Failed = 4L;
    @GlobalConstant("AVAssetExportSessionStatusCancelled")
    public static final long Cancelled = 5L;
    

}

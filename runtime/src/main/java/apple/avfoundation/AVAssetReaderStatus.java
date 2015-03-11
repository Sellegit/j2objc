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





@Library("AVFoundation")
@Mapping("AVAssetReaderStatus")
public final class AVAssetReaderStatus extends ObjCEnum {
    
    @GlobalConstant("AVAssetReaderStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVAssetReaderStatusReading")
    public static final long Reading = 1L;
    @GlobalConstant("AVAssetReaderStatusCompleted")
    public static final long Completed = 2L;
    @GlobalConstant("AVAssetReaderStatusFailed")
    public static final long Failed = 3L;
    @GlobalConstant("AVAssetReaderStatusCancelled")
    public static final long Cancelled = 4L;
    

}

package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;






@Mapping("MusicTrackProperty")
public final class MusicTrackProperty extends ObjCEnum {
    
    @GlobalConstant("kSequenceTrackProperty_LoopInfo")
    public static final long LoopInfo = 0L;
    @GlobalConstant("kSequenceTrackProperty_OffsetTime")
    public static final long OffsetTime = 1L;
    @GlobalConstant("kSequenceTrackProperty_MuteStatus")
    public static final long MuteStatus = 2L;
    @GlobalConstant("kSequenceTrackProperty_SoloStatus")
    public static final long SoloStatus = 3L;
    @GlobalConstant("kSequenceTrackProperty_AutomatedParameters")
    public static final long AutomatedParameters = 4L;
    @GlobalConstant("kSequenceTrackProperty_TrackLength")
    public static final long TrackLength = 5L;
    @GlobalConstant("kSequenceTrackProperty_TimeResolution")
    public static final long TimeResolution = 6L;
    

}

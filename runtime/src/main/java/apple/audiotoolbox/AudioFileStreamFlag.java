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





@Library("AudioToolbox")
@Mapping("AudioFileStreamFlag")
public final class AudioFileStreamFlag extends ObjCEnum {
    
    @GlobalConstant("kAudioFileStreamPropertyFlag_PropertyIsCached")
    public static final long PropertyFlag_PropertyIsCached = 1L;
    @GlobalConstant("kAudioFileStreamPropertyFlag_CacheProperty")
    public static final long PropertyFlag_CacheProperty = 2L;
    @GlobalConstant("kAudioFileStreamParseFlag_Discontinuity")
    public static final long ParseFlag_Discontinuity = 1L;
    @GlobalConstant("kAudioFileStreamSeekFlag_OffsetIsEstimated")
    public static final long SeekFlag_OffsetIsEstimated = 1L;
    

}

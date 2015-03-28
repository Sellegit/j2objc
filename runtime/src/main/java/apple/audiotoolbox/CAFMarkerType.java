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


@Library("AudioToolbox/AudioToolbox.h")
@Mapping("CAFMarkerType")
public final class CAFMarkerType extends ObjCEnum {
    
    @GlobalConstant("kCAFMarkerType_Generic")
    public static final long Generic = 0L;
    @GlobalConstant("kCAFMarkerType_ProgramStart")
    public static final long ProgramStart = 1885496679L;
    @GlobalConstant("kCAFMarkerType_ProgramEnd")
    public static final long ProgramEnd = 1885695588L;
    @GlobalConstant("kCAFMarkerType_TrackStart")
    public static final long TrackStart = 1952605543L;
    @GlobalConstant("kCAFMarkerType_TrackEnd")
    public static final long TrackEnd = 1952804452L;
    @GlobalConstant("kCAFMarkerType_Index")
    public static final long Index = 1768842360L;
    @GlobalConstant("kCAFMarkerType_RegionStart")
    public static final long RegionStart = 1919051111L;
    @GlobalConstant("kCAFMarkerType_RegionEnd")
    public static final long RegionEnd = 1919250020L;
    @GlobalConstant("kCAFMarkerType_RegionSyncPoint")
    public static final long RegionSyncPoint = 1920170339L;
    @GlobalConstant("kCAFMarkerType_SelectionStart")
    public static final long SelectionStart = 1935828327L;
    @GlobalConstant("kCAFMarkerType_SelectionEnd")
    public static final long SelectionEnd = 1936027236L;
    @GlobalConstant("kCAFMarkerType_EditSourceBegin")
    public static final long EditSourceBegin = 1667392871L;
    @GlobalConstant("kCAFMarkerType_EditSourceEnd")
    public static final long EditSourceEnd = 1667591780L;
    @GlobalConstant("kCAFMarkerType_EditDestinationBegin")
    public static final long EditDestinationBegin = 1684170087L;
    @GlobalConstant("kCAFMarkerType_EditDestinationEnd")
    public static final long EditDestinationEnd = 1684368996L;
    @GlobalConstant("kCAFMarkerType_SustainLoopStart")
    public static final long SustainLoopStart = 1936482919L;
    @GlobalConstant("kCAFMarkerType_SustainLoopEnd")
    public static final long SustainLoopEnd = 1936483694L;
    @GlobalConstant("kCAFMarkerType_ReleaseLoopStart")
    public static final long ReleaseLoopStart = 1919705703L;
    @GlobalConstant("kCAFMarkerType_ReleaseLoopEnd")
    public static final long ReleaseLoopEnd = 1919706478L;
    @GlobalConstant("kCAFMarkerType_SavedPlayPosition")
    public static final long SavedPlayPosition = 1936747641L;
    @GlobalConstant("kCAFMarkerType_Tempo")
    public static final long Tempo = 1953329263L;
    @GlobalConstant("kCAFMarkerType_TimeSignature")
    public static final long TimeSignature = 1953720679L;
    @GlobalConstant("kCAFMarkerType_KeySignature")
    public static final long KeySignature = 1802725735L;


}

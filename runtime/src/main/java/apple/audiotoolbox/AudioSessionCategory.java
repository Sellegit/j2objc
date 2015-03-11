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
@Mapping("AudioSessionCategory")
public final class AudioSessionCategory extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionCategory_AmbientSound")
    public static final long AmbientSound = 1634558569L;
    @GlobalConstant("kAudioSessionCategory_SoloAmbientSound")
    public static final long SoloAmbientSound = 1936682095L;
    @GlobalConstant("kAudioSessionCategory_MediaPlayback")
    public static final long MediaPlayback = 1835361385L;
    @GlobalConstant("kAudioSessionCategory_RecordAudio")
    public static final long RecordAudio = 1919247201L;
    @GlobalConstant("kAudioSessionCategory_PlayAndRecord")
    public static final long PlayAndRecord = 1886151026L;
    @GlobalConstant("kAudioSessionCategory_AudioProcessing")
    public static final long AudioProcessing = 1886547811L;
    

}

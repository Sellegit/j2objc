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
@Mapping("AudioServicesProperty")
public final class AudioServicesProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioServicesPropertyIsUISound")
    public static final long IsUISound = 1769174377L;
    @GlobalConstant("kAudioServicesPropertyCompletePlaybackIfAppDies")
    public static final long CompletePlaybackIfAppDies = 1768318057L;
    

}

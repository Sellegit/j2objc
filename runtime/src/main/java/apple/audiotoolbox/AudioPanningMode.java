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
@Mapping("AudioPanningMode")
public final class AudioPanningMode extends ObjCEnum {
    
    @GlobalConstant("kPanningMode_SoundField")
    public static final long SoundField = 3L;
    @GlobalConstant("kPanningMode_VectorBasedPanning")
    public static final long VectorBasedPanning = 4L;
    

}

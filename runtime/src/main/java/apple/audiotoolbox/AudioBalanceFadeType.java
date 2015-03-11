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
@Mapping("AudioBalanceFadeType")
public final class AudioBalanceFadeType extends ObjCEnum {
    
    @GlobalConstant("kAudioBalanceFadeType_MaxUnityGain")
    public static final long MaxUnityGain = 0L;
    @GlobalConstant("kAudioBalanceFadeType_EqualPower")
    public static final long EqualPower = 1L;
    

}

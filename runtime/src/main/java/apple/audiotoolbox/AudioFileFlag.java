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
@Mapping("AudioFileFlag")
public final class AudioFileFlag extends ObjCEnum {
    
    @GlobalConstant("kAudioFileFlags_EraseFile")
    public static final long EraseFile = 1L;
    @GlobalConstant("kAudioFileFlags_DontPageAlignAudioData")
    public static final long DontPageAlignAudioData = 2L;
    

}

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
@Mapping("AudioFilePermission")
public final class AudioFilePermission extends ObjCEnum {
    
    @GlobalConstant("kAudioFileReadPermission")
    public static final long ReadPermission = 1L;
    @GlobalConstant("kAudioFileWritePermission")
    public static final long WritePermission = 2L;
    @GlobalConstant("kAudioFileReadWritePermission")
    public static final long ReadWritePermission = 3L;
    

}

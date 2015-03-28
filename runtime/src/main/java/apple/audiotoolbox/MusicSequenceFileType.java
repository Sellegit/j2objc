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
@Mapping("MusicSequenceFileType")
public final class MusicSequenceFileType extends ObjCEnum {
    
    @GlobalConstant("kMusicSequenceFile_MIDIType")
    public static final long MIDIType = 1835623529L;
    @GlobalConstant("kMusicSequenceFile_iMelodyType")
    public static final long iMelodyType = 1768777068L;


}

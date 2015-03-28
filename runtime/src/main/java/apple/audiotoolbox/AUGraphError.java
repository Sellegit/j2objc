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
@Mapping("AUGraphError")
public final class AUGraphError extends ObjCEnum {
    
    @GlobalConstant("kAUGraphErr_NodeNotFound")
    public static final long NodeNotFound = -10860L;
    @GlobalConstant("kAUGraphErr_InvalidConnection")
    public static final long InvalidConnection = -10861L;
    @GlobalConstant("kAUGraphErr_OutputNodeErr")
    public static final long OutputNodeErr = -10862L;
    @GlobalConstant("kAUGraphErr_CannotDoInCurrentContext")
    public static final long CannotDoInCurrentContext = -10863L;
    @GlobalConstant("kAUGraphErr_InvalidAudioUnit")
    public static final long InvalidAudioUnit = -10864L;


}

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
@Mapping("AUNodeInteraction")
public final class AUNodeInteraction extends ObjCEnum {
    
    @GlobalConstant("kAUNodeInteraction_Connection")
    public static final long Connection = 1L;
    @GlobalConstant("kAUNodeInteraction_InputCallback")
    public static final long InputCallback = 2L;


}

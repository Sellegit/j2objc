package apple.coremidi;


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





@Library("CoreMIDI/CoreMIDI.h")
@Mapping("MIDITransformControlType")
public final class MIDITransformControlType extends ObjCEnum {
    
    @GlobalConstant("kMIDIControlType_7Bit")
    public static final long _7Bit = 0L;
    @GlobalConstant("kMIDIControlType_14Bit")
    public static final long _14Bit = 1L;
    @GlobalConstant("kMIDIControlType_7BitRPN")
    public static final long _7BitRPN = 2L;
    @GlobalConstant("kMIDIControlType_14BitRPN")
    public static final long _14BitRPN = 3L;
    @GlobalConstant("kMIDIControlType_7BitNRPN")
    public static final long _7BitNRPN = 4L;
    @GlobalConstant("kMIDIControlType_14BitNRPN")
    public static final long _14BitNRPN = 5L;
    

}

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
@Mapping("MIDITransformType")
public final class MIDITransformType extends ObjCEnum {
    
    @GlobalConstant("kMIDITransform_None")
    public static final long None = 0L;
    @GlobalConstant("kMIDITransform_FilterOut")
    public static final long FilterOut = 1L;
    @GlobalConstant("kMIDITransform_MapControl")
    public static final long MapControl = 2L;
    @GlobalConstant("kMIDITransform_Add")
    public static final long Add = 8L;
    @GlobalConstant("kMIDITransform_Scale")
    public static final long Scale = 9L;
    @GlobalConstant("kMIDITransform_MinValue")
    public static final long MinValue = 10L;
    @GlobalConstant("kMIDITransform_MaxValue")
    public static final long MaxValue = 11L;
    @GlobalConstant("kMIDITransform_MapValue")
    public static final long MapValue = 12L;


}

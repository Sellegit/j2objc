package apple.mediatoolbox;


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
import apple.coremedia.*;
import apple.coreaudio.*;


@Library("MediaToolbox/MediaToolbox.h")
@Mapping("MTAudioProcessingTapFlag")
public final class MTAudioProcessingTapFlag extends ObjCEnum {
    
    @GlobalConstant("kMTAudioProcessingTapFlag_StartOfStream")
    public static final long StartOfStream = 256L;
    @GlobalConstant("kMTAudioProcessingTapFlag_EndOfStream")
    public static final long EndOfStream = 512L;


}

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
@Mapping("MTAudioProcessingTapCreationFlag")
public final class MTAudioProcessingTapCreationFlag extends ObjCEnum {
    
    @GlobalConstant("kMTAudioProcessingTapCreationFlag_PreEffects")
    public static final long reEffects = 1L;
    @GlobalConstant("kMTAudioProcessingTapCreationFlag_PostEffects")
    public static final long ostEffects = 2L;
    

}

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





@Mapping("AudioFileRegionList")
public class AudioFileRegionList 
    extends Struct 
     {

    
    protected AudioFileRegionList() {}
    
    
    @DotMapping("mSMPTE_TimeType")
    public native int getMSMPTE_TimeType();
    @DotMapping("mNumberRegions")
    public native int getMNumberRegions();
    @DotMapping("mRegions")
    public native AudioFileRegion getMRegions();
    
    public static native AudioFileRegionList create(int mSMPTE_TimeType, int mNumberRegions, AudioFileRegion mRegions) /*-[
        AudioFileRegionList __new = { .mSMPTE_TimeType = mSMPTE_TimeType, .mNumberRegions = mNumberRegions, .mRegions = mRegions };
        return __new;
    ]-*/;
    public static native AudioFileRegionList copyWithmSMPTE_TimeType(AudioFileRegionList original, int mSMPTE_TimeType) /*-[
        original.mSMPTE_TimeType = mSMPTE_TimeType;
        return original;
    ]-*/;

    
    public static native AudioFileRegionList copyWithmNumberRegions(AudioFileRegionList original, int mNumberRegions) /*-[
        original.mNumberRegions = mNumberRegions;
        return original;
    ]-*/;

    
    public static native AudioFileRegionList copyWithmRegions(AudioFileRegionList original, AudioFileRegion mRegions) /*-[
        original.mRegions = mRegions;
        return original;
    ]-*/;

    
}

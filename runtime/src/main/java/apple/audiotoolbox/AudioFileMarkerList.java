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





@Mapping("AudioFileMarkerList")
public class AudioFileMarkerList 
    extends Struct 
     {

    
    protected AudioFileMarkerList() {}
    
    
    @DotMapping("mSMPTE_TimeType")
    public native int getMSMPTE_TimeType();
    @DotMapping("mNumberMarkers")
    public native int getMNumberMarkers();
    @DotMapping("mMarkers")
    public native AudioFileMarker getMMarkers();
    
    public static native AudioFileMarkerList create(int mSMPTE_TimeType, int mNumberMarkers, AudioFileMarker mMarkers) /*-[
        AudioFileMarkerList __new = { .mSMPTE_TimeType = mSMPTE_TimeType, .mNumberMarkers = mNumberMarkers, .mMarkers = mMarkers };
        return __new;
    ]-*/;
    public static native AudioFileMarkerList copyWithmSMPTE_TimeType(AudioFileMarkerList original, int mSMPTE_TimeType) /*-[
        original.mSMPTE_TimeType = mSMPTE_TimeType;
        return original;
    ]-*/;

    
    public static native AudioFileMarkerList copyWithmNumberMarkers(AudioFileMarkerList original, int mNumberMarkers) /*-[
        original.mNumberMarkers = mNumberMarkers;
        return original;
    ]-*/;

    
    public static native AudioFileMarkerList copyWithmMarkers(AudioFileMarkerList original, AudioFileMarker mMarkers) /*-[
        original.mMarkers = mMarkers;
        return original;
    ]-*/;

    
}

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





@Mapping("AudioFileRegion")
public class AudioFileRegion 
    extends Struct 
     {

    
    protected AudioFileRegion() {}
    
    
    @DotMapping("mRegionID")
    public native int getMRegionID();
    @DotMapping("mName")
    public native CFString getMName();
    @DotMapping("mFlags")
    public native int getMFlags();
    @DotMapping("mNumberMarkers")
    public native int getMNumberMarkers();
    @DotMapping("mMarkers")
    public native AudioFileMarker getMMarkers();
    
    public static native AudioFileRegion create(int mRegionID, CFString mName, int mFlags, int mNumberMarkers, AudioFileMarker mMarkers) /*-[
        AudioFileRegion __new = { .mRegionID = mRegionID, .mName = mName, .mFlags = mFlags, .mNumberMarkers = mNumberMarkers, .mMarkers = mMarkers };
        return __new;
    ]-*/;
    public static native AudioFileRegion copyWithmRegionID(AudioFileRegion original, int mRegionID) /*-[
        original.mRegionID = mRegionID;
        return original;
    ]-*/;

    
    public static native AudioFileRegion copyWithmName(AudioFileRegion original, CFString mName) /*-[
        original.mName = mName;
        return original;
    ]-*/;

    
    public static native AudioFileRegion copyWithmFlags(AudioFileRegion original, int mFlags) /*-[
        original.mFlags = mFlags;
        return original;
    ]-*/;

    
    public static native AudioFileRegion copyWithmNumberMarkers(AudioFileRegion original, int mNumberMarkers) /*-[
        original.mNumberMarkers = mNumberMarkers;
        return original;
    ]-*/;

    
    public static native AudioFileRegion copyWithmMarkers(AudioFileRegion original, AudioFileMarker mMarkers) /*-[
        original.mMarkers = mMarkers;
        return original;
    ]-*/;

    
}

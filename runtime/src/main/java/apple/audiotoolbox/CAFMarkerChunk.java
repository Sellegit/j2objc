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





@Mapping("CAFMarkerChunk")
public class CAFMarkerChunk 
    extends Struct 
     {

    
    protected CAFMarkerChunk() {}
    
    
    @DotMapping("mSMPTE_TimeType")
    public native int getMSMPTE_TimeType();
    @DotMapping("mNumberMarkers")
    public native int getMNumberMarkers();
    @DotMapping("mMarkers")
    public native CAFMarker getMMarkers();
    
    public static native CAFMarkerChunk create(int mSMPTE_TimeType, int mNumberMarkers, CAFMarker mMarkers) /*-[
        CAFMarkerChunk __new = { .mSMPTE_TimeType = mSMPTE_TimeType, .mNumberMarkers = mNumberMarkers, .mMarkers = mMarkers };
        return __new;
    ]-*/;
    public static native CAFMarkerChunk copyWithmSMPTE_TimeType(CAFMarkerChunk original, int mSMPTE_TimeType) /*-[
        original.mSMPTE_TimeType = mSMPTE_TimeType;
        return __new;
    ]-*/;

    
    public static native CAFMarkerChunk copyWithmNumberMarkers(CAFMarkerChunk original, int mNumberMarkers) /*-[
        original.mNumberMarkers = mNumberMarkers;
        return __new;
    ]-*/;

    
    public static native CAFMarkerChunk copyWithmMarkers(CAFMarkerChunk original, CAFMarker mMarkers) /*-[
        original.mMarkers = mMarkers;
        return __new;
    ]-*/;

    
}

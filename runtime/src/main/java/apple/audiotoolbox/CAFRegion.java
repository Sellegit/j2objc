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





@Mapping("CAFRegion")
public class CAFRegion 
    extends Struct 
     {

    
    protected CAFRegion() {}
    
    
    @DotMapping("mRegionID")
    public native int getMRegionID();
    @DotMapping("mFlags")
    public native int getMFlags();
    @DotMapping("mNumberMarkers")
    public native int getMNumberMarkers();
    @DotMapping("mMarkers")
    public native CAFMarker getMMarkers();
    
    public static native CAFRegion create(int mRegionID, int mFlags, int mNumberMarkers, CAFMarker mMarkers) /*-[
        CAFRegion __new = { .mRegionID = mRegionID, .mFlags = mFlags, .mNumberMarkers = mNumberMarkers, .mMarkers = mMarkers };
        return __new;
    ]-*/;
    public static native CAFRegion copyWithmRegionID(CAFRegion original, int mRegionID) /*-[
        original.mRegionID = mRegionID;
        return original;
    ]-*/;

    
    public static native CAFRegion copyWithmFlags(CAFRegion original, int mFlags) /*-[
        original.mFlags = mFlags;
        return original;
    ]-*/;

    
    public static native CAFRegion copyWithmNumberMarkers(CAFRegion original, int mNumberMarkers) /*-[
        original.mNumberMarkers = mNumberMarkers;
        return original;
    ]-*/;

    
    public static native CAFRegion copyWithmMarkers(CAFRegion original, CAFMarker mMarkers) /*-[
        original.mMarkers = mMarkers;
        return original;
    ]-*/;

    
}

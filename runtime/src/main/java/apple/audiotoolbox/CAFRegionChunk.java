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





@Mapping("CAFRegionChunk")
public class CAFRegionChunk 
    extends Struct 
     {

    
    protected CAFRegionChunk() {}
    
    
    @DotMapping("mSMPTE_TimeType")
    public native int getMSMPTE_TimeType();
    @DotMapping("mNumberRegions")
    public native int getMNumberRegions();
    @DotMapping("mRegions")
    public native CAFRegion getMRegions();
    
    public static native CAFRegionChunk create(int mSMPTE_TimeType, int mNumberRegions, CAFRegion mRegions) /*-[
        CAFRegionChunk __new = { .mSMPTE_TimeType = mSMPTE_TimeType, .mNumberRegions = mNumberRegions, .mRegions = mRegions };
        return __new;
    ]-*/;
    public static native CAFRegionChunk copyWithmSMPTE_TimeType(CAFRegionChunk original, int mSMPTE_TimeType) /*-[
        original.mSMPTE_TimeType = mSMPTE_TimeType;
        return __new;
    ]-*/;

    
    public static native CAFRegionChunk copyWithmNumberRegions(CAFRegionChunk original, int mNumberRegions) /*-[
        original.mNumberRegions = mNumberRegions;
        return __new;
    ]-*/;

    
    public static native CAFRegionChunk copyWithmRegions(CAFRegionChunk original, CAFRegion mRegions) /*-[
        original.mRegions = mRegions;
        return __new;
    ]-*/;

    
}

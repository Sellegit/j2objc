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





@Mapping("CAFOverviewSample") @Library("AudioToolbox/AudioToolbox.h")
public class CAFOverviewSample 
    extends Struct 
     {

    
    protected CAFOverviewSample() {}
    
    
    @DotMapping("mMinValue")
    public native short getMMinValue();
    @DotMapping("mMaxValue")
    public native short getMMaxValue();
    
    public static native CAFOverviewSample create(short mMinValue, short mMaxValue) /*-[
        CAFOverviewSample __new = { .mMinValue = mMinValue, .mMaxValue = mMaxValue };
        return __new;
    ]-*/;
    public static native CAFOverviewSample copyWithmMinValue(CAFOverviewSample original, short mMinValue) /*-[
        CAFOverviewSample __new = { .mMinValue = mMinValue, .mMaxValue = original.mMaxValue };
        return __new;
    ]-*/;

    
    public static native CAFOverviewSample copyWithmMaxValue(CAFOverviewSample original, short mMaxValue) /*-[
        CAFOverviewSample __new = { .mMinValue = original.mMinValue, .mMaxValue = mMaxValue };
        return __new;
    ]-*/;

    
}

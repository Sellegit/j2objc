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





@Mapping("CAFMarker") @Library("AudioToolbox/AudioToolbox.h")
public class CAFMarker 
    extends Struct 
     {

    
    protected CAFMarker() {}
    
    
    @DotMapping("mType")
    public native int getMType();
    @DotMapping("mFramePosition")
    public native double getMFramePosition();
    @DotMapping("mMarkerID")
    public native int getMMarkerID();
    @DotMapping("mSMPTETime")
    public native CAF_SMPTE_Time getMSMPTETime();
    @DotMapping("mChannel")
    public native int getMChannel();
    
    public static native CAFMarker create(int mType, double mFramePosition, int mMarkerID, CAF_SMPTE_Time mSMPTETime, int mChannel) /*-[
        CAFMarker __new = { .mType = mType, .mFramePosition = mFramePosition, .mMarkerID = mMarkerID, .mSMPTETime = mSMPTETime, .mChannel = mChannel };
        return __new;
    ]-*/;
    public static native CAFMarker copyWithmType(CAFMarker original, int mType) /*-[
        CAFMarker __new = { .mType = mType, .mFramePosition = original.mFramePosition, .mMarkerID = original.mMarkerID, .mSMPTETime = original.mSMPTETime, .mChannel = original.mChannel };
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmFramePosition(CAFMarker original, double mFramePosition) /*-[
        CAFMarker __new = { .mType = original.mType, .mFramePosition = mFramePosition, .mMarkerID = original.mMarkerID, .mSMPTETime = original.mSMPTETime, .mChannel = original.mChannel };
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmMarkerID(CAFMarker original, int mMarkerID) /*-[
        CAFMarker __new = { .mType = original.mType, .mFramePosition = original.mFramePosition, .mMarkerID = mMarkerID, .mSMPTETime = original.mSMPTETime, .mChannel = original.mChannel };
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmSMPTETime(CAFMarker original, CAF_SMPTE_Time mSMPTETime) /*-[
        CAFMarker __new = { .mType = original.mType, .mFramePosition = original.mFramePosition, .mMarkerID = original.mMarkerID, .mSMPTETime = mSMPTETime, .mChannel = original.mChannel };
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmChannel(CAFMarker original, int mChannel) /*-[
        CAFMarker __new = { .mType = original.mType, .mFramePosition = original.mFramePosition, .mMarkerID = original.mMarkerID, .mSMPTETime = original.mSMPTETime, .mChannel = mChannel };
        return __new;
    ]-*/;

    
}

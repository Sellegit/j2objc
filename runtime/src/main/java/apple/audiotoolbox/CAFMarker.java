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





@Mapping("CAFMarker")
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
    public native CAFSMPTETime getMSMPTETime();
    @DotMapping("mChannel")
    public native int getMChannel();
    
    public static native CAFMarker create(int mType, double mFramePosition, int mMarkerID, CAFSMPTETime mSMPTETime, int mChannel) /*-[
        CAFMarker __new = { .mType = mType, .mFramePosition = mFramePosition, .mMarkerID = mMarkerID, .mSMPTETime = mSMPTETime, .mChannel = mChannel };
        return __new;
    ]-*/;
    public static native CAFMarker copyWithmType(CAFMarker original, int mType) /*-[
        original.mType = mType;
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmFramePosition(CAFMarker original, double mFramePosition) /*-[
        original.mFramePosition = mFramePosition;
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmMarkerID(CAFMarker original, int mMarkerID) /*-[
        original.mMarkerID = mMarkerID;
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmSMPTETime(CAFMarker original, CAFSMPTETime mSMPTETime) /*-[
        original.mSMPTETime = mSMPTETime;
        return __new;
    ]-*/;

    
    public static native CAFMarker copyWithmChannel(CAFMarker original, int mChannel) /*-[
        original.mChannel = mChannel;
        return __new;
    ]-*/;

    
}

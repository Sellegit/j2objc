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





@Mapping("AudioFileMarker")
public class AudioFileMarker 
    extends Struct 
     {

    
    protected AudioFileMarker() {}
    
    
    @DotMapping("mFramePosition")
    public native double getMFramePosition();
    @DotMapping("mName")
    public native CFString getMName();
    @DotMapping("mMarkerID")
    public native int getMMarkerID();
    @DotMapping("mSMPTETime")
    public native AudioFileSMPTETime getMSMPTETime();
    @DotMapping("mType")
    public native int getMType();
    @DotMapping("mReserved")
    public native short getMReserved();
    @DotMapping("mChannel")
    public native short getMChannel();
    
    public static native AudioFileMarker create(double mFramePosition, CFString mName, int mMarkerID, AudioFileSMPTETime mSMPTETime, int mType, short mReserved, short mChannel) /*-[
        AudioFileMarker __new = { .mFramePosition = mFramePosition, .mName = mName, .mMarkerID = mMarkerID, .mSMPTETime = mSMPTETime, .mType = mType, .mReserved = mReserved, .mChannel = mChannel };
        return __new;
    ]-*/;
    public static native AudioFileMarker copyWithmFramePosition(AudioFileMarker original, double mFramePosition) /*-[
        original.mFramePosition = mFramePosition;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmName(AudioFileMarker original, CFString mName) /*-[
        original.mName = mName;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmMarkerID(AudioFileMarker original, int mMarkerID) /*-[
        original.mMarkerID = mMarkerID;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmSMPTETime(AudioFileMarker original, AudioFileSMPTETime mSMPTETime) /*-[
        original.mSMPTETime = mSMPTETime;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmType(AudioFileMarker original, int mType) /*-[
        original.mType = mType;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmReserved(AudioFileMarker original, short mReserved) /*-[
        original.mReserved = mReserved;
        return original;
    ]-*/;

    
    public static native AudioFileMarker copyWithmChannel(AudioFileMarker original, short mChannel) /*-[
        original.mChannel = mChannel;
        return original;
    ]-*/;

    
}

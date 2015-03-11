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





@Mapping("AudioPanningInfo")
public class AudioPanningInfo 
    extends Struct 
     {

    
    protected AudioPanningInfo() {}
    
    
    @DotMapping("mPanningMode")
    public native int getMPanningMode();
    @DotMapping("mCoordinateFlags")
    public native int getMCoordinateFlags();
    @DotMapping("mCoordinates")
    public native FloatBuffer getMCoordinates();
    @DotMapping("mGainScale")
    public native float getMGainScale();
    @DotMapping("mOutputChannelMap")
    public native AudioChannelLayout getMOutputChannelMap();
    
    public static native AudioPanningInfo create(int mPanningMode, int mCoordinateFlags, FloatBuffer mCoordinates, float mGainScale, AudioChannelLayout mOutputChannelMap) /*-[
        AudioPanningInfo __new = { .mPanningMode = mPanningMode, .mCoordinateFlags = mCoordinateFlags, .mCoordinates = mCoordinates, .mGainScale = mGainScale, .mOutputChannelMap = mOutputChannelMap };
        return __new;
    ]-*/;
    public static native AudioPanningInfo copyWithmPanningMode(AudioPanningInfo original, int mPanningMode) /*-[
        original.mPanningMode = mPanningMode;
        return __new;
    ]-*/;

    
    public static native AudioPanningInfo copyWithmCoordinateFlags(AudioPanningInfo original, int mCoordinateFlags) /*-[
        original.mCoordinateFlags = mCoordinateFlags;
        return __new;
    ]-*/;

    
    public static native AudioPanningInfo copyWithmCoordinates(AudioPanningInfo original, FloatBuffer mCoordinates) /*-[
        original.mCoordinates = mCoordinates;
        return __new;
    ]-*/;

    
    public static native AudioPanningInfo copyWithmGainScale(AudioPanningInfo original, float mGainScale) /*-[
        original.mGainScale = mGainScale;
        return __new;
    ]-*/;

    
    public static native AudioPanningInfo copyWithmOutputChannelMap(AudioPanningInfo original, AudioChannelLayout mOutputChannelMap) /*-[
        original.mOutputChannelMap = mOutputChannelMap;
        return __new;
    ]-*/;

    
}

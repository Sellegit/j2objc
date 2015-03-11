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





@Mapping("AudioQueueLevelMeterState")
public class AudioQueueLevelMeterState 
    extends Struct 
     {

    
    protected AudioQueueLevelMeterState() {}
    
    
    @DotMapping("mAveragePower")
    public native float getMAveragePower();
    @DotMapping("mPeakPower")
    public native float getMPeakPower();
    
    public static native AudioQueueLevelMeterState create(float mAveragePower, float mPeakPower) /*-[
        AudioQueueLevelMeterState __new = { .mAveragePower = mAveragePower, .mPeakPower = mPeakPower };
        return __new;
    ]-*/;
    public static native AudioQueueLevelMeterState copyWithmAveragePower(AudioQueueLevelMeterState original, float mAveragePower) /*-[
        original.mAveragePower = mAveragePower;
        return __new;
    ]-*/;

    
    public static native AudioQueueLevelMeterState copyWithmPeakPower(AudioQueueLevelMeterState original, float mPeakPower) /*-[
        original.mPeakPower = mPeakPower;
        return __new;
    ]-*/;

    
}

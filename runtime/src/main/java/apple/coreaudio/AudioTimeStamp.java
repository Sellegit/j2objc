package apple.coreaudio;


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





@Mapping("AudioTimeStamp") @Library("CoreAudio/CoreAudioTypes.h")
public class AudioTimeStamp 
    extends Struct 
     {

    
    private AudioTimeStamp() {}
    
    
    @DotMapping("mSampleTime")
    public native double getMSampleTime();
    @DotMapping("mHostTime")
    public native long getMHostTime();
    @DotMapping("mRateScalar")
    public native double getMRateScalar();
    @DotMapping("mWordClockTime")
    public native long getMWordClockTime();
    @DotMapping("mSMPTETime")
    public native SMPTETime getMSMPTETime();
    @DotMapping("mFlags")
    public native int getMFlags();
    @DotMapping("mReserved")
    public native int getMReserved();
    
    public static native AudioTimeStamp create(double mSampleTime, long mHostTime, double mRateScalar, long mWordClockTime, SMPTETime mSMPTETime, int mFlags, int mReserved) /*-[
        AudioTimeStamp __new = { .mSampleTime = mSampleTime, .mHostTime = mHostTime, .mRateScalar = mRateScalar, .mWordClockTime = mWordClockTime, .mSMPTETime = mSMPTETime, .mFlags = mFlags, .mReserved = mReserved };
        return __new;
    ]-*/;
    public static native AudioTimeStamp copyWithmSampleTime(AudioTimeStamp original, double mSampleTime) /*-[
        AudioTimeStamp __new = { .mSampleTime = mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = original.mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmHostTime(AudioTimeStamp original, long mHostTime) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = original.mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmRateScalar(AudioTimeStamp original, double mRateScalar) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = original.mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmWordClockTime(AudioTimeStamp original, long mWordClockTime) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = original.mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmSMPTETime(AudioTimeStamp original, SMPTETime mSMPTETime) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = mSMPTETime, .mFlags = original.mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmFlags(AudioTimeStamp original, int mFlags) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = mFlags, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioTimeStamp copyWithmReserved(AudioTimeStamp original, int mReserved) /*-[
        AudioTimeStamp __new = { .mSampleTime = original.mSampleTime, .mHostTime = original.mHostTime, .mRateScalar = original.mRateScalar, .mWordClockTime = original.mWordClockTime, .mSMPTETime = original.mSMPTETime, .mFlags = original.mFlags, .mReserved = mReserved };
        return __new;
    ]-*/;

    
}

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





@Mapping("SMPTETime")
public class SMPTETime 
    extends Struct 
     {

    
    protected SMPTETime() {}
    
    
    @DotMapping("mSubframes")
    public native short getMSubframes();
    @DotMapping("mSubframeDivisor")
    public native short getMSubframeDivisor();
    @DotMapping("mCounter")
    public native int getMCounter();
    @DotMapping("mType")
    public native SMPTETimeType getMType();
    @DotMapping("mFlags")
    public native SMPTEStateFlags getMFlags();
    @DotMapping("mHours")
    public native short getMHours();
    @DotMapping("mMinutes")
    public native short getMMinutes();
    @DotMapping("mSeconds")
    public native short getMSeconds();
    @DotMapping("mFrames")
    public native short getMFrames();
    
    public static native SMPTETime create(short mSubframes, short mSubframeDivisor, int mCounter, SMPTETimeType mType, SMPTEStateFlags mFlags, short mHours, short mMinutes, short mSeconds, short mFrames) /*-[
        SMPTETime __new = { .mSubframes = mSubframes, .mSubframeDivisor = mSubframeDivisor, .mCounter = mCounter, .mType = mType, .mFlags = mFlags, .mHours = mHours, .mMinutes = mMinutes, .mSeconds = mSeconds, .mFrames = mFrames };
        return __new;
    ]-*/;
    public static native SMPTETime copyWithmSubframes(SMPTETime original, short mSubframes) /*-[
        original.mSubframes = mSubframes;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmSubframeDivisor(SMPTETime original, short mSubframeDivisor) /*-[
        original.mSubframeDivisor = mSubframeDivisor;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmCounter(SMPTETime original, int mCounter) /*-[
        original.mCounter = mCounter;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmType(SMPTETime original, SMPTETimeType mType) /*-[
        original.mType = mType;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmFlags(SMPTETime original, SMPTEStateFlags mFlags) /*-[
        original.mFlags = mFlags;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmHours(SMPTETime original, short mHours) /*-[
        original.mHours = mHours;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmMinutes(SMPTETime original, short mMinutes) /*-[
        original.mMinutes = mMinutes;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmSeconds(SMPTETime original, short mSeconds) /*-[
        original.mSeconds = mSeconds;
        return __new;
    ]-*/;

    
    public static native SMPTETime copyWithmFrames(SMPTETime original, short mFrames) /*-[
        original.mFrames = mFrames;
        return __new;
    ]-*/;

    
}

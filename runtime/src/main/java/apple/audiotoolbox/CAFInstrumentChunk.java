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





@Mapping("CAFInstrumentChunk")
public class CAFInstrumentChunk 
    extends Struct 
     {

    
    protected CAFInstrumentChunk() {}
    
    
    @DotMapping("mBaseNote")
    public native float getMBaseNote();
    @DotMapping("mMIDILowNote")
    public native byte getMMIDILowNote();
    @DotMapping("mMIDIHighNote")
    public native byte getMMIDIHighNote();
    @DotMapping("mMIDILowVelocity")
    public native byte getMMIDILowVelocity();
    @DotMapping("mMIDIHighVelocity")
    public native byte getMMIDIHighVelocity();
    @DotMapping("mdBGain")
    public native float getMdBGain();
    @DotMapping("mStartRegionID")
    public native int getMStartRegionID();
    @DotMapping("mSustainRegionID")
    public native int getMSustainRegionID();
    @DotMapping("mReleaseRegionID")
    public native int getMReleaseRegionID();
    @DotMapping("mInstrumentID")
    public native int getMInstrumentID();
    
    public static native CAFInstrumentChunk create(float mBaseNote, byte mMIDILowNote, byte mMIDIHighNote, byte mMIDILowVelocity, byte mMIDIHighVelocity, float mdBGain, int mStartRegionID, int mSustainRegionID, int mReleaseRegionID, int mInstrumentID) /*-[
        CAFInstrumentChunk __new = { .mBaseNote = mBaseNote, .mMIDILowNote = mMIDILowNote, .mMIDIHighNote = mMIDIHighNote, .mMIDILowVelocity = mMIDILowVelocity, .mMIDIHighVelocity = mMIDIHighVelocity, .mdBGain = mdBGain, .mStartRegionID = mStartRegionID, .mSustainRegionID = mSustainRegionID, .mReleaseRegionID = mReleaseRegionID, .mInstrumentID = mInstrumentID };
        return __new;
    ]-*/;
    public static native CAFInstrumentChunk copyWithmBaseNote(CAFInstrumentChunk original, float mBaseNote) /*-[
        original.mBaseNote = mBaseNote;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmMIDILowNote(CAFInstrumentChunk original, byte mMIDILowNote) /*-[
        original.mMIDILowNote = mMIDILowNote;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmMIDIHighNote(CAFInstrumentChunk original, byte mMIDIHighNote) /*-[
        original.mMIDIHighNote = mMIDIHighNote;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmMIDILowVelocity(CAFInstrumentChunk original, byte mMIDILowVelocity) /*-[
        original.mMIDILowVelocity = mMIDILowVelocity;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmMIDIHighVelocity(CAFInstrumentChunk original, byte mMIDIHighVelocity) /*-[
        original.mMIDIHighVelocity = mMIDIHighVelocity;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmdBGain(CAFInstrumentChunk original, float mdBGain) /*-[
        original.mdBGain = mdBGain;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmStartRegionID(CAFInstrumentChunk original, int mStartRegionID) /*-[
        original.mStartRegionID = mStartRegionID;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmSustainRegionID(CAFInstrumentChunk original, int mSustainRegionID) /*-[
        original.mSustainRegionID = mSustainRegionID;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmReleaseRegionID(CAFInstrumentChunk original, int mReleaseRegionID) /*-[
        original.mReleaseRegionID = mReleaseRegionID;
        return __new;
    ]-*/;

    
    public static native CAFInstrumentChunk copyWithmInstrumentID(CAFInstrumentChunk original, int mInstrumentID) /*-[
        original.mInstrumentID = mInstrumentID;
        return __new;
    ]-*/;

    
}

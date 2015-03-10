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





@Mapping("CAFPeakChunk")
public class CAFPeakChunk 
    extends Struct 
     {

    
    protected CAFPeakChunk() {}
    
    
    @DotMapping("mEditCount")
    public native int getMEditCount();
    @DotMapping("mPeaks")
    public native CAFPositionPeak getMPeaks();
    
    public static native CAFPeakChunk create(int mEditCount, CAFPositionPeak mPeaks) /*-[
        CAFPeakChunk __new = { .mEditCount = mEditCount, .mPeaks = mPeaks };
        return __new;
    ]-*/;
    public static native CAFPeakChunk copyWithmEditCount(CAFPeakChunk original, int mEditCount) /*-[
        original.mEditCount = mEditCount;
        return __new;
    ]-*/;

    
    public static native CAFPeakChunk copyWithmPeaks(CAFPeakChunk original, CAFPositionPeak mPeaks) /*-[
        original.mPeaks = mPeaks;
        return __new;
    ]-*/;

    
}

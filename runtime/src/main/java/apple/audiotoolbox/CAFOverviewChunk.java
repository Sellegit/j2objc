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





@Mapping("CAFOverviewChunk")
public class CAFOverviewChunk 
    extends Struct 
     {

    
    protected CAFOverviewChunk() {}
    
    
    @DotMapping("mEditCount")
    public native int getMEditCount();
    @DotMapping("mNumFramesPerOVWSample")
    public native int getMNumFramesPerOVWSample();
    @DotMapping("mData")
    public native CAFOverviewSample getMData();
    
    public static native CAFOverviewChunk create(int mEditCount, int mNumFramesPerOVWSample, CAFOverviewSample mData) /*-[
        CAFOverviewChunk __new = { .mEditCount = mEditCount, .mNumFramesPerOVWSample = mNumFramesPerOVWSample, .mData = mData };
        return __new;
    ]-*/;
    public static native CAFOverviewChunk copyWithmEditCount(CAFOverviewChunk original, int mEditCount) /*-[
        original.mEditCount = mEditCount;
        return original;
    ]-*/;

    
    public static native CAFOverviewChunk copyWithmNumFramesPerOVWSample(CAFOverviewChunk original, int mNumFramesPerOVWSample) /*-[
        original.mNumFramesPerOVWSample = mNumFramesPerOVWSample;
        return original;
    ]-*/;

    
    public static native CAFOverviewChunk copyWithmData(CAFOverviewChunk original, CAFOverviewSample mData) /*-[
        original.mData = mData;
        return original;
    ]-*/;

    
}

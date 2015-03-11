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





@Mapping("CAFDataChunk")
public class CAFDataChunk 
    extends Struct 
     {

    
    protected CAFDataChunk() {}
    
    
    @DotMapping("mEditCount")
    public native int getMEditCount();
    @DotMapping("mData")
    public native ByteBuffer getMData();
    
    public static native CAFDataChunk create(int mEditCount, ByteBuffer mData) /*-[
        CAFDataChunk __new = { .mEditCount = mEditCount, .mData = mData };
        return __new;
    ]-*/;
    public static native CAFDataChunk copyWithmEditCount(CAFDataChunk original, int mEditCount) /*-[
        original.mEditCount = mEditCount;
        return __new;
    ]-*/;

    
    public static native CAFDataChunk copyWithmData(CAFDataChunk original, ByteBuffer mData) /*-[
        original.mData = mData;
        return __new;
    ]-*/;

    
}

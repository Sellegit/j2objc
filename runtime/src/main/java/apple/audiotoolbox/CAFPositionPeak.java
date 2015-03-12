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





@Mapping("CAFPositionPeak")
public class CAFPositionPeak 
    extends Struct 
     {

    
    protected CAFPositionPeak() {}
    
    
    @DotMapping("mValue")
    public native float getMValue();
    @DotMapping("mFrameNumber")
    public native long getMFrameNumber();
    
    public static native CAFPositionPeak create(float mValue, long mFrameNumber) /*-[
        CAFPositionPeak __new = { .mValue = mValue, .mFrameNumber = mFrameNumber };
        return __new;
    ]-*/;
    public static native CAFPositionPeak copyWithmValue(CAFPositionPeak original, float mValue) /*-[
        original.mValue = mValue;
        return original;
    ]-*/;

    
    public static native CAFPositionPeak copyWithmFrameNumber(CAFPositionPeak original, long mFrameNumber) /*-[
        original.mFrameNumber = mFrameNumber;
        return original;
    ]-*/;

    
}

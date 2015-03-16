package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Mapping("AVCaptureWhiteBalanceGains") @Library("AVFoundation/AVFoundation.h")
public class AVCaptureWhiteBalanceGains 
    extends Struct 
     {

    
    protected AVCaptureWhiteBalanceGains() {}
    
    
    @DotMapping("redGain")
    public native float getRedGain();
    @DotMapping("greenGain")
    public native float getGreenGain();
    @DotMapping("blueGain")
    public native float getBlueGain();
    
    public static native AVCaptureWhiteBalanceGains create(float redGain, float greenGain, float blueGain) /*-[
        AVCaptureWhiteBalanceGains __new = { .redGain = redGain, .greenGain = greenGain, .blueGain = blueGain };
        return __new;
    ]-*/;
    public static native AVCaptureWhiteBalanceGains copyWithredGain(AVCaptureWhiteBalanceGains original, float redGain) /*-[
        original.redGain = redGain;
        return original;
    ]-*/;

    
    public static native AVCaptureWhiteBalanceGains copyWithgreenGain(AVCaptureWhiteBalanceGains original, float greenGain) /*-[
        original.greenGain = greenGain;
        return original;
    ]-*/;

    
    public static native AVCaptureWhiteBalanceGains copyWithblueGain(AVCaptureWhiteBalanceGains original, float blueGain) /*-[
        original.blueGain = blueGain;
        return original;
    ]-*/;

    
}

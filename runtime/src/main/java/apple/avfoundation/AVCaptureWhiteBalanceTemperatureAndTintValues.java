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





@Mapping("AVCaptureWhiteBalanceTemperatureAndTintValues")
public class AVCaptureWhiteBalanceTemperatureAndTintValues 
    extends Struct 
     {

    
    protected AVCaptureWhiteBalanceTemperatureAndTintValues() {}
    
    
    @DotMapping("temperature")
    public native float getTemperature();
    @DotMapping("tint")
    public native float getTint();
    
    public static native AVCaptureWhiteBalanceTemperatureAndTintValues create(float temperature, float tint) /*-[
        AVCaptureWhiteBalanceTemperatureAndTintValues __new = { .temperature = temperature, .tint = tint };
        return __new;
    ]-*/;
    public static native AVCaptureWhiteBalanceTemperatureAndTintValues copyWithtemperature(AVCaptureWhiteBalanceTemperatureAndTintValues original, float temperature) /*-[
        original.temperature = temperature;
        return __new;
    ]-*/;

    
    public static native AVCaptureWhiteBalanceTemperatureAndTintValues copyWithtint(AVCaptureWhiteBalanceTemperatureAndTintValues original, float tint) /*-[
        original.tint = tint;
        return __new;
    ]-*/;

    
}

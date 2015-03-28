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


@Mapping("AVCaptureWhiteBalanceTemperatureAndTintValues") @Library("AVFoundation/AVFoundation.h")
public class AVCaptureWhiteBalanceTemperatureAndTintValues 
    extends Struct 
     {

    
    private AVCaptureWhiteBalanceTemperatureAndTintValues() {}
    
    
    @DotMapping("temperature")
    public native float getTemperature();
    @DotMapping("tint")
    public native float getTint();

    public static native AVCaptureWhiteBalanceTemperatureAndTintValues create(float temperature, float tint) /*-[
        AVCaptureWhiteBalanceTemperatureAndTintValues __new = { .temperature = temperature, .tint = tint };
        return __new;
    ]-*/;
    public static native AVCaptureWhiteBalanceTemperatureAndTintValues copyWithtemperature(AVCaptureWhiteBalanceTemperatureAndTintValues original, float temperature) /*-[
        AVCaptureWhiteBalanceTemperatureAndTintValues __new = { .temperature = temperature, .tint = original.tint };
        return __new;
    ]-*/;


    public static native AVCaptureWhiteBalanceTemperatureAndTintValues copyWithtint(AVCaptureWhiteBalanceTemperatureAndTintValues original, float tint) /*-[
        AVCaptureWhiteBalanceTemperatureAndTintValues __new = { .temperature = original.temperature, .tint = tint };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float temperature;
        public float tint;
        public Adapter(float temperature, float tint) {
            this.temperature = temperature;
            this.tint = tint;
        }
        public Adapter(AVCaptureWhiteBalanceTemperatureAndTintValues original) {
            this.temperature = original.getTemperature();
            this.tint = original.getTint();
        }
        public AVCaptureWhiteBalanceTemperatureAndTintValues convert() {
            return create(temperature, tint);
        }
    }
}

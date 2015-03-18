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





@Mapping("AVAudio3DAngularOrientation") @Library("AVFoundation/AVFoundation.h")
public class AVAudio3DAngularOrientation 
    extends Struct 
     {

    
    private AVAudio3DAngularOrientation() {}
    
    
    @DotMapping("yaw")
    public native float getYaw();
    @DotMapping("pitch")
    public native float getPitch();
    @DotMapping("roll")
    public native float getRoll();
    
    public static native AVAudio3DAngularOrientation create(float yaw, float pitch, float roll) /*-[
        AVAudio3DAngularOrientation __new = { .yaw = yaw, .pitch = pitch, .roll = roll };
        return __new;
    ]-*/;
    public static native AVAudio3DAngularOrientation copyWithyaw(AVAudio3DAngularOrientation original, float yaw) /*-[
        AVAudio3DAngularOrientation __new = { .yaw = yaw, .pitch = original.pitch, .roll = original.roll };
        return __new;
    ]-*/;

    
    public static native AVAudio3DAngularOrientation copyWithpitch(AVAudio3DAngularOrientation original, float pitch) /*-[
        AVAudio3DAngularOrientation __new = { .yaw = original.yaw, .pitch = pitch, .roll = original.roll };
        return __new;
    ]-*/;

    
    public static native AVAudio3DAngularOrientation copyWithroll(AVAudio3DAngularOrientation original, float roll) /*-[
        AVAudio3DAngularOrientation __new = { .yaw = original.yaw, .pitch = original.pitch, .roll = roll };
        return __new;
    ]-*/;

    
}

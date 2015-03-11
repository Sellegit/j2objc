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





@Mapping("AudioQueueChannelAssignment")
public class AudioQueueChannelAssignment 
    extends Struct 
     {

    
    protected AudioQueueChannelAssignment() {}
    
    
    @DotMapping("mDeviceUID")
    public native CFString getMDeviceUID();
    @DotMapping("mChannelNumber")
    public native int getMChannelNumber();
    
    public static native AudioQueueChannelAssignment create(CFString mDeviceUID, int mChannelNumber) /*-[
        AudioQueueChannelAssignment __new = { .mDeviceUID = mDeviceUID, .mChannelNumber = mChannelNumber };
        return __new;
    ]-*/;
    public static native AudioQueueChannelAssignment copyWithmDeviceUID(AudioQueueChannelAssignment original, CFString mDeviceUID) /*-[
        original.mDeviceUID = mDeviceUID;
        return __new;
    ]-*/;

    
    public static native AudioQueueChannelAssignment copyWithmChannelNumber(AudioQueueChannelAssignment original, int mChannelNumber) /*-[
        original.mChannelNumber = mChannelNumber;
        return __new;
    ]-*/;

    
}

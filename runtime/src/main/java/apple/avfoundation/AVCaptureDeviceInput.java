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


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureDeviceInput")
public class AVCaptureDeviceInput 
    extends AVCaptureInput 
     {

    
    
    @Mapping("init")
    public AVCaptureDeviceInput() { }

    
    @Mapping("device")
    public native AVCaptureDevice getDevice();

    
    
    @Mapping("deviceInputWithDevice:error:")
    public static native AVCaptureDeviceInput create(AVCaptureDevice device, Todo outError);

}

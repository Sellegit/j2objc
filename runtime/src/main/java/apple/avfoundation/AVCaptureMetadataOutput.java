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
 * @since Available in iOS 6.0 and later.
 */

@Library("AVFoundation") @Mapping("AVCaptureMetadataOutput")
public class AVCaptureMetadataOutput 
    extends AVCaptureOutput 
     {

    
    
    public AVCaptureMetadataOutput() {}
    
    
    @Mapping("metadataObjectsDelegate")
    public native AVCaptureMetadataOutputObjectsDelegate getMetadataObjectsDelegate();
    @Mapping("metadataObjectsCallbackQueue")
    public native DispatchQueue getMetadataObjectsCallbackQueue();
    @Mapping("availableMetadataObjectTypes")
    public native List<AVMetadataObjectType> getAvailableMetadataObjectTypes();
    @Mapping("metadataObjectTypes")
    public native List<AVMetadataObjectType> getMetadataObjectTypes();
    @Mapping("setMetadataObjectTypes:")
    public native void setMetadataObjectTypes(List<AVMetadataObjectType> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rectOfInterest")
    public native CGRect getRectOfInterest();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setRectOfInterest:")
    public native void setRectOfInterest(CGRect v);
    
    
    
    @Mapping("setMetadataObjectsDelegate:queue:")
    public native void setMetadataObjectsDelegate(AVCaptureMetadataOutputObjectsDelegate objectsDelegate, DispatchQueue objectsCallbackQueue);
    
}

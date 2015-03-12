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

@Library("AVFoundation") @Mapping("AVCaptureOutput")
public class AVCaptureOutput 
    extends NSObject 
     {

    
    
    public AVCaptureOutput() {}
    
    
    @Mapping("connections")
    public native NSArray<AVCaptureConnection> getConnections();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("connectionWithMediaType:")
    public native AVCaptureConnection getConnection(String mediaType);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("transformedMetadataObjectForMetadataObject:connection:")
    public native AVMetadataObject getTransformedMetadataObject(AVMetadataObject metadataObject, AVCaptureConnection connection);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("metadataOutputRectOfInterestForRect:")
    public native CGRect getRectOfInterestInOutputCoordinates(CGRect rectInOutputCoordinates);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rectForMetadataOutputRectOfInterest:")
    public native CGRect getRectOfInterestInMetadataOutputCoordinates(CGRect rectInMetadataOutputCoordinates);
    
}

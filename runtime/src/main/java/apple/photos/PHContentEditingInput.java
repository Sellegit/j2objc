package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Photos/Photos.h") @Mapping("PHContentEditingInput")
public class PHContentEditingInput 
    extends NSObject 
     {

    
    
    public PHContentEditingInput() {}
    
    
    @Mapping("mediaType")
    public native @Representing("PHAssetMediaType") @MachineSizedSInt long getMediaType();
    @Mapping("mediaSubtypes")
    public native @Representing("PHAssetMediaSubtype") @MachineSizedUInt long getMediaSubtypes();
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    @Mapping("location")
    public native CLLocation getLocation();
    @Mapping("uniformTypeIdentifier")
    public native String getUniformTypeIdentifier();
    @Mapping("adjustmentData")
    public native PHAdjustmentData getAdjustmentData();
    @Mapping("displaySizeImage")
    public native UIImage getDisplaySizeImage();
    @Mapping("fullSizeImageURL")
    public native NSURL getFullSizeImageURL();
    @Mapping("fullSizeImageOrientation")
    public native apple.imageio.CGImagePropertyOrientation getFullSizeImageOrientation();
    @Mapping("avAsset")
    public native AVAsset getAvAsset();
    
    
    
    
    
}

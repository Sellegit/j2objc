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

@Library("Photos") @Mapping("PHAssetChangeRequest")
public class PHAssetChangeRequest 
    extends NSObject 
     {

    
    
    public PHAssetChangeRequest() {}
    
    
    @Mapping("placeholderForCreatedAsset")
    public native PHObjectPlaceholder getPlaceholderForCreatedAsset();
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    @Mapping("setCreationDate:")
    public native void setCreationDate(NSDate v);
    @Mapping("location")
    public native CLLocation getLocation();
    @Mapping("setLocation:")
    public native void setLocation(CLLocation v);
    @Mapping("isFavorite")
    public native boolean isFavorite();
    @Mapping("setFavorite:")
    public native void setFavorite(boolean v);
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("contentEditingOutput")
    public native PHContentEditingOutput getContentEditingOutput();
    @Mapping("setContentEditingOutput:")
    public native void setContentEditingOutput(PHContentEditingOutput v);
    
    
    
    @Mapping("revertAssetContentToOriginal")
    public native void revertAssetContentToOriginal();
    @Mapping("creationRequestForAssetFromImage:")
    public static native PHAssetChangeRequest createImageAssetCreationRequest(UIImage image);
    @Mapping("creationRequestForAssetFromImageAtFileURL:")
    public static native PHAssetChangeRequest createImageAssetCreationRequest(NSURL fileURL);
    @Mapping("creationRequestForAssetFromVideoAtFileURL:")
    public static native PHAssetChangeRequest createVideoAssetCreationRequest(NSURL fileURL);
    @Mapping("deleteAssets:")
    public static native void deleteAssets(NSFastEnumeration assets);
    @Mapping("changeRequestForAsset:")
    public static native PHAssetChangeRequest create(PHAsset asset);
    
}

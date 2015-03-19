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

@Library("Photos/Photos.h") @Mapping("PHImageManager")
public class PHImageManager 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PHImageManager() { }
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageManagerMaximumSize")
    public static native CGSize getMaximumSize();
    
    @Mapping("requestImageForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestImageForAsset(PHAsset asset, CGSize targetSize, @Representing("PHImageContentMode") long contentMode, PHImageRequestOptions options, @Block VoidBlock2<UIImage, NSDictionary<NSString, NSObject>> resultHandler);
    @Mapping("requestImageDataForAsset:options:resultHandler:")
    public native int requestImageDataForAsset(PHAsset asset, PHImageRequestOptions options, @Block VoidBlock4<NSData, String, UIImageOrientation, NSDictionary<NSString, NSObject>> resultHandler);
    @Mapping("cancelImageRequest:")
    public native void cancelImageRequest(int requestID);
    @Mapping("requestPlayerItemForVideo:options:resultHandler:")
    public native int requestPlayerItemForVideo(PHAsset asset, PHVideoRequestOptions options, @Block VoidBlock2<AVPlayerItem, NSDictionary<NSString, NSObject>> resultHandler);
    @Mapping("requestExportSessionForVideo:options:exportPreset:resultHandler:")
    public native int requestExportSessionForVideo(PHAsset asset, PHVideoRequestOptions options, String exportPreset, @Block VoidBlock2<AVAssetExportSession, NSDictionary<NSString, NSObject>> resultHandler);
    @Mapping("requestAVAssetForVideo:options:resultHandler:")
    public native int requestAVAssetForVideo(PHAsset asset, PHVideoRequestOptions options, @Block VoidBlock3<AVAsset, AVAudioMix, NSDictionary<NSString, NSObject>> resultHandler);
    @Mapping("defaultManager")
    public static native PHImageManager getDefaultManager();
    
}

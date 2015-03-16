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

@Library("Photos/Photos.h") @Mapping("PHAsset")
public class PHAsset 
    extends PHObject 
     {

    
    
    public PHAsset() {}
    
    
    @Mapping("mediaType")
    public native @Representing("PHAssetMediaType") @MachineSizedSInt long getMediaType();
    @Mapping("mediaSubtypes")
    public native @Representing("PHAssetMediaSubtype") @MachineSizedUInt long getMediaSubtypes();
    @Mapping("pixelWidth")
    public native @MachineSizedUInt long getPixelWidth();
    @Mapping("pixelHeight")
    public native @MachineSizedUInt long getPixelHeight();
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    @Mapping("modificationDate")
    public native NSDate getModificationDate();
    @Mapping("location")
    public native CLLocation getLocation();
    @Mapping("duration")
    public native double getDuration();
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("isFavorite")
    public native boolean isFavorite();
    @Mapping("burstIdentifier")
    public native String getBurstIdentifier();
    @Mapping("burstSelectionTypes")
    public native @Representing("PHAssetBurstSelectionType") @MachineSizedUInt long getBurstSelectionTypes();
    @Mapping("representsBurst")
    public native boolean representsBurst();
    
    
    
    @Mapping("canPerformEditOperation:")
    public native boolean canPerformEditOperation(@Representing("PHAssetEditOperation") @MachineSizedSInt long editOperation);
    @Mapping("fetchAssetsInAssetCollection:options:")
    public static native PHFetchResult fetchAssetsInAssetCollection(PHAssetCollection assetCollection, PHFetchOptions options);
    @Mapping("fetchAssetsWithMediaType:options:")
    public static native PHFetchResult fetchAssetsWithMediaType(@Representing("PHAssetMediaType") @MachineSizedSInt long mediaType, PHFetchOptions options);
    @Mapping("fetchAssetsWithLocalIdentifiers:options:")
    public static native PHFetchResult fetchAssetsWithLocalIdentifiers(NSArray<?> identifiers, PHFetchOptions options);
    @Mapping("fetchKeyAssetsInAssetCollection:options:")
    public static native PHFetchResult fetchKeyAssetsInAssetCollection(PHAssetCollection assetCollection, PHFetchOptions options);
    @Mapping("fetchAssetsWithBurstIdentifier:options:")
    public static native PHFetchResult fetchAssetsWithBurstIdentifier(String burstIdentifier, PHFetchOptions options);
    @Mapping("fetchAssetsWithOptions:")
    public static native PHFetchResult fetchAssets(PHFetchOptions options);
    @Mapping("fetchAssetsWithALAssetURLs:options:")
    public static native PHFetchResult fetchAssetsWithALAssetURLs(NSArray<?> assetURLs, PHFetchOptions options);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("requestContentEditingInputWithOptions:completionHandler:")
    public native @MachineSizedUInt long requestContentEditingInput(PHContentEditingInputRequestOptions options, @Block VoidBlock2<PHContentEditingInput, NSDictionary<NSString, NSObject>> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("cancelContentEditingInputRequest:")
    public native void cancelContentEditingInputRequest(@MachineSizedUInt long requestID);
    
}

package apple.assetslibrary;


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
import apple.imageio.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("AssetsLibrary") @Mapping("ALAssetsLibrary")
public class ALAssetsLibrary 
    extends NSObject 
     {

    
    
    public ALAssetsLibrary() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetsLibraryChangedNotification")
    public static native NSString ChangedNotification();
    
    @Mapping("enumerateGroupsWithTypes:usingBlock:failureBlock:")
    public native void enumerateGroups(@Representing("ALAssetsGroupType") int types, @Block VoidBlock2<ALAssetsGroup, Todo> enumerationBlock, @Block VoidBlock1<NSError> failureBlock);
    @Mapping("assetForURL:resultBlock:failureBlock:")
    public native void getAsset(NSURL assetURL, @Block VoidBlock1<ALAsset> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("groupForURL:resultBlock:failureBlock:")
    public native void getGroup(NSURL groupURL, @Block VoidBlock1<ALAssetsGroup> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("addAssetsGroupAlbumWithName:resultBlock:failureBlock:")
    public native void addAssetsGroupAlbum(String name, @Block VoidBlock1<ALAssetsGroup> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    @Mapping("writeImageToSavedPhotosAlbum:orientation:completionBlock:")
    public native void writeImageToSavedPhotosAlbum(CGImage imageRef, @Representing("ALAssetOrientation") @MachineSizedSInt long orientation, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("writeImageToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageToSavedPhotosAlbum(CGImage imageRef, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("writeImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageDataToSavedPhotosAlbum(NSData imageData, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    @Mapping("writeVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeVideoToSavedPhotosAlbum(NSURL videoPathURL, @Block VoidBlock2<NSURL, NSError> completionBlock);
    @Mapping("videoAtPathIsCompatibleWithSavedPhotosAlbum:")
    public native boolean isVideoCompatibleWithSavedPhotosAlbum(NSURL videoPathURL);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("authorizationStatus")
    public static native @Representing("ALAuthorizationStatus") @MachineSizedSInt long getAuthorizationStatus();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("disableSharedPhotoStreamsSupport")
    public static native void disableSharedPhotoStreamsSupport();
    
}

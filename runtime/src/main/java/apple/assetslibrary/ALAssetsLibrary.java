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
@Library("AssetsLibrary/AssetsLibrary.h") @Mapping("ALAssetsLibrary")
public class ALAssetsLibrary 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public ALAssetsLibrary() { }

    


    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetsLibraryChangedNotification")
    public static native NSString ChangedNotification();

    @Mapping("videoAtPathIsCompatibleWithSavedPhotosAlbum:")
    public native boolean isVideoCompatibleWithSavedPhotosAlbum(NSURL videoPathURL);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("authorizationStatus")
    public static native @Representing("ALAuthorizationStatus") long getAuthorizationStatus();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("disableSharedPhotoStreamsSupport")
    public static native void disableSharedPhotoStreamsSupport();

}

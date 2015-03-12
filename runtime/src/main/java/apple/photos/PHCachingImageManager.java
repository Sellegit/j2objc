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

@Library("Photos") @Mapping("PHCachingImageManager")
public class PHCachingImageManager 
    extends PHImageManager 
     {

    
    
    public PHCachingImageManager() {}
    
    
    @Mapping("allowsCachingHighQualityImages")
    public native boolean allowsCachingHighQualityImages();
    @Mapping("setAllowsCachingHighQualityImages:")
    public native void setAllowsCachingHighQualityImages(boolean v);
    
    
    
    @Mapping("startCachingImagesForAssets:targetSize:contentMode:options:")
    public native void startCachingImagesForAssets(NSArray<?> assets, CGSize targetSize, @Representing("PHImageContentMode") @MachineSizedSInt long contentMode, PHImageRequestOptions options);
    @Mapping("stopCachingImagesForAssets:targetSize:contentMode:options:")
    public native void stopCachingImagesForAssets(NSArray<?> assets, CGSize targetSize, @Representing("PHImageContentMode") @MachineSizedSInt long contentMode, PHImageRequestOptions options);
    @Mapping("stopCachingImagesForAllAssets")
    public native void stopCachingImagesForAllAssets();
    
}

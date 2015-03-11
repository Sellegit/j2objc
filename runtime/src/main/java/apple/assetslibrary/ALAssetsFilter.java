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

@Library("AssetsLibrary") @Mapping("ALAssetsFilter")
public class ALAssetsFilter 
    extends NSObject 
     {

    
    
    public ALAssetsFilter() {}
    
    
    
    
    
    
    @Mapping("allPhotos")
    public static native ALAssetsFilter allPhotos();
    @Mapping("allVideos")
    public static native ALAssetsFilter allVideos();
    @Mapping("allAssets")
    public static native ALAssetsFilter allAssets();
    
}

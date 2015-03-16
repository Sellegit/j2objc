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

@Library("AssetsLibrary/AssetsLibrary.h") @Mapping("ALAssetsGroup")
public class ALAssetsGroup 
    extends NSObject 
     {

    
    
    public ALAssetsGroup() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isEditable")
    public native boolean isEditable();
    
    
    
    @Mapping("valueForProperty:")
    public native Object getValue(String property);
    @Mapping("posterImage")
    public native CGImage getPosterImage();
    @Mapping("setAssetsFilter:")
    public native void setAssetsFilter(ALAssetsFilter filter);
    @Mapping("numberOfAssets")
    public native @MachineSizedSInt long getNumberOfAssets();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("addAsset:")
    public native boolean addAsset(ALAsset asset);
    
}

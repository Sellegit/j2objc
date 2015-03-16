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

@Library("AssetsLibrary/AssetsLibrary.h") @Mapping("ALAssetRepresentation")
public class ALAssetRepresentation 
    extends NSObject 
     {

    
    
    public ALAssetRepresentation() {}
    
    
    
    
    
    
    @Mapping("UTI")
    public native String getUTI();
    @Mapping("dimensions")
    public native CGSize getDimensions();
    @Mapping("size")
    public native long getSize();
    @Mapping("getBytes:fromOffset:length:error:")
    protected native @MachineSizedUInt long getBytes(Todo buffer, long offset, @MachineSizedUInt long length, Todo error);
    @Mapping("fullResolutionImage")
    public native CGImage getFullResolutionImage();
    @Mapping("CGImageWithOptions:")
    public native CGImage getCGImage(NSDictionary<?, ?> options);
    @Mapping("fullScreenImage")
    public native CGImage getFullScreenImage();
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("metadata")
    public native CGImageProperties getMetadata();
    @Mapping("orientation")
    public native @Representing("ALAssetOrientation") @MachineSizedSInt long getOrientation();
    @Mapping("scale")
    public native float getScale();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("filename")
    public native String getFilename();
    
}

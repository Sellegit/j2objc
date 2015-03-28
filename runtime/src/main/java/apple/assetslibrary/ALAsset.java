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
@Library("AssetsLibrary/AssetsLibrary.h") @Mapping("ALAsset")
public class ALAsset 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public ALAsset() { }

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("originalAsset")
    public native ALAsset getOriginalAsset();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isEditable")
    public native boolean isEditable();

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALErrorInvalidProperty")
    public static native NSString getInvalidProperty();

    @Mapping("valueForProperty:")
    public native Object getValue(String property);
    @Mapping("defaultRepresentation")
    public native ALAssetRepresentation getDefaultRepresentation();
    @Mapping("representationForUTI:")
    public native ALAssetRepresentation getRepresentation(String representationUTI);
    @Mapping("thumbnail")
    public native CGImage getThumbnail();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("aspectRatioThumbnail")
    public native CGImage getAspectRatioThumbnail();

}

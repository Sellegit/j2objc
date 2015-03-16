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


/*<javadoc>*/
/*</javadoc>*/
@Library("AssetsLibrary/AssetsLibrary.h")
public class ALAssetType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetTypePhoto")
    protected static native NSString PhotoValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetTypeVideo")
    protected static native NSString VideoValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetTypeUnknown")
    protected static native NSString UnknownValue();
    
}

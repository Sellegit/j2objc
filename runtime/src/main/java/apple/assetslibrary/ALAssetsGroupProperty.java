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
@Library("AssetsLibrary")
public class ALAssetsGroupProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetsGroupPropertyName")
    protected static native NSString NameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetsGroupPropertyType")
    protected static native NSString TypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetsGroupPropertyPersistentID")
    protected static native NSString PersistentIDValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("ALAssetsGroupPropertyURL")
    protected static native NSString URLValue();
    
}

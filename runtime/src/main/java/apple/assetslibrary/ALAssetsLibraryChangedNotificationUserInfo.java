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
public class ALAssetsLibraryChangedNotificationUserInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetLibraryUpdatedAssetsKey")
    public static native NSString UpdatedAssetsKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetLibraryInsertedAssetGroupsKey")
    public static native NSString InsertedAssetGroupsKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetLibraryUpdatedAssetGroupsKey")
    public static native NSString UpdatedAssetGroupsKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetLibraryDeletedAssetGroupsKey")
    public static native NSString DeletedAssetGroupsKey();
    
}

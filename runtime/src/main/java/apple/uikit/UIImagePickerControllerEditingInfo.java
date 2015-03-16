package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class UIImagePickerControllerEditingInfo 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("UIImagePickerControllerMediaType")
    protected static native NSString MediaTypeKey();
    @GlobalConstant("UIImagePickerControllerOriginalImage")
    protected static native NSString OriginalImageKey();
    @GlobalConstant("UIImagePickerControllerEditedImage")
    protected static native NSString EditedImageKey();
    @GlobalConstant("UIImagePickerControllerCropRect")
    protected static native NSString CropRectKey();
    @GlobalConstant("UIImagePickerControllerMediaURL")
    protected static native NSString MediaURLKey();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalConstant("UIImagePickerControllerReferenceURL")
    protected static native NSString ReferenceURLKey();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalConstant("UIImagePickerControllerMediaMetadata")
    protected static native NSString MediaMetadataKey();
    
}

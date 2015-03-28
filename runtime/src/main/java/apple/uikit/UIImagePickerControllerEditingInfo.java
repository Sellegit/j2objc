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
    public static native NSString MediaTypeKey();
    @GlobalConstant("UIImagePickerControllerOriginalImage")
    public static native NSString OriginalImageKey();
    @GlobalConstant("UIImagePickerControllerEditedImage")
    public static native NSString EditedImageKey();
    @GlobalConstant("UIImagePickerControllerCropRect")
    public static native NSString CropRectKey();
    @GlobalConstant("UIImagePickerControllerMediaURL")
    public static native NSString MediaURLKey();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalConstant("UIImagePickerControllerReferenceURL")
    public static native NSString ReferenceURLKey();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalConstant("UIImagePickerControllerMediaMetadata")
    public static native NSString MediaMetadataKey();

}

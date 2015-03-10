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
@Library("UIKit")
public class UIActivityType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToFacebook")
    public static native String PostToFacebook();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToTwitter")
    public static native String PostToTwitter();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToWeibo")
    public static native String PostToWeibo();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypeMessage")
    public static native String Message();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypeMail")
    public static native String Mail();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypePrint")
    public static native String Print();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypeCopyToPasteboard")
    public static native String CopyToPasteboard();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypeAssignToContact")
    public static native String AssignToContact();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIActivityTypeSaveToCameraRoll")
    public static native String SaveToCameraRoll();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIActivityTypeAddToReadingList")
    public static native String AddToReadingList();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToFlickr")
    public static native String PostToFlickr();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToVimeo")
    public static native String PostToVimeo();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIActivityTypePostToTencentWeibo")
    public static native String PostToTencentWeibo();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIActivityTypeAirDrop")
    public static native String AirDrop();
    
}

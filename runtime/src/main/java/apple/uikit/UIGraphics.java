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
public class UIGraphics 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("UIGraphicsGetCurrentContext")
    public static native CGContext getCurrentContext();
    @GlobalFunction("UIGraphicsPushContext")
    public static native void pushContext(CGContext context);
    @GlobalFunction("UIGraphicsPopContext")
    public static native void popContext();
    @GlobalFunction("UIRectFillUsingBlendMode")
    public static native void rectFill(CGRect rect, @Representing("CGBlendMode") long blendMode);
    @GlobalFunction("UIRectFill")
    public static native void rectFill(CGRect rect);
    @GlobalFunction("UIRectFrameUsingBlendMode")
    public static native void rectFrame(CGRect rect, @Representing("CGBlendMode") long blendMode);
    @GlobalFunction("UIRectFrame")
    public static native void rectFrame(CGRect rect);
    @GlobalFunction("UIRectClip")
    public static native void rectClip(CGRect rect);
    @GlobalFunction("UIGraphicsBeginImageContext")
    public static native void beginImageContext(CGSize size);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("UIGraphicsBeginImageContextWithOptions")
    public static native void beginImageContext(CGSize size, boolean opaque, @MachineSizedFloat double scale);
    @GlobalFunction("UIGraphicsGetImageFromCurrentImageContext")
    public static native UIImage getImageFromCurrentImageContext();
    @GlobalFunction("UIGraphicsEndImageContext")
    public static native void endImageContext();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsBeginPDFContextToFile")
    public static native boolean beginPDFContextToFile(String path, CGRect bounds, NSDictionary<?, ?> documentInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsBeginPDFContextToData")
    public static native void beginPDFContextToData(NSMutableData data, CGRect bounds, NSDictionary<?, ?> documentInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsEndPDFContext")
    public static native void endPDFContext();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsBeginPDFPage")
    public static native void beginPDFPage();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsBeginPDFPageWithInfo")
    public static native void beginPDFPage(CGRect bounds, NSDictionary<?, ?> pageInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsGetPDFContextBounds")
    public static native CGRect getPDFContextBounds();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsSetPDFContextURLForRect")
    public static native void setPDFContextURLForRect(NSURL url, CGRect rect);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsAddPDFContextDestinationAtPoint")
    public static native void addPDFContextDestinationAtPoint(String name, CGPoint point);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("UIGraphicsSetPDFContextDestinationForRect")
    public static native void setPDFContextDestinationForRect(String name, CGRect rect);

}

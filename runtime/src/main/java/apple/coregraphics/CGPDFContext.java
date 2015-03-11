package apple.coregraphics;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics")
public class CGPDFContext 
    extends CGContext 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextCreate")
    public static native CGPDFContext create(CGDataConsumer consumer, CGRect mediaBox, CGPDFContextOptions auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextCreateWithURL")
    public static native CGPDFContext createWithURL(NSURL url, CGRect mediaBox, CGPDFContextOptions auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextClose")
    public native void closeContext();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextBeginPage")
    public static native void beginPage(CGContext context, CGPDFBoxOptions pageInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextEndPage")
    public native void endPage();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGPDFContextAddDocumentMetadata")
    public native void addDocumentMetadata(NSData metadata);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextSetURLForRect")
    public native void setURLForRect(NSURL url, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextAddDestinationAtPoint")
    public native void addDestinationAtPoint(String name, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextSetDestinationForRect")
    public native void setDestinationForRect(String name, CGRect rect);
    
}

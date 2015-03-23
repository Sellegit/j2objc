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
@Library("CoreGraphics/CoreGraphics.h")
public class CGPDFContext 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextCreate")
    public static native CGPDFContext create(CGDataConsumer consumer, CGRect mediaBox, CFDictionary auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextCreateWithURL")
    public static native CGPDFContext createWithURL(CFURL url, CGRect mediaBox, CFDictionary auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextClose")
    public static native void closeContext(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextBeginPage")
    public static native void beginPage(CGContext context, CFDictionary pageInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextEndPage")
    public static native void endPage(CGContext context);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGPDFContextAddDocumentMetadata")
    public static native void addDocumentMetadata(CGContext context, CFData metadata);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextSetURLForRect")
    public static native void setURLForRect(CGContext context, CFURL url, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextAddDestinationAtPoint")
    public static native void addDestinationAtPoint(CGContext context, CFString name, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFContextSetDestinationForRect")
    public static native void setDestinationForRect(CGContext context, CFString name, CGRect rect);

}

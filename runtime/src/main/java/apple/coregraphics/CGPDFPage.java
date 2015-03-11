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
public class CGPDFPage 
    extends CFType 
     {

    
    
    protected CGPDFPage() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetDocument")
    public native CGPDFDocument getDocument();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetPageNumber")
    public native @MachineSizedUInt long getPageNumber();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetBoxRect")
    public native CGRect getBoxRect(CGPDFBox box);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetRotationAngle")
    public native int getRotationAngle();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetDrawingTransform")
    public native CGAffineTransform getDrawingTransform(CGPDFBox box, CGRect rect, int rotate, boolean preserveAspectRatio);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    
}

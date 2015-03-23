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
@Mapping("CGPDFPageRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGPDFPage 
    extends CFType 
     {

    
    
    protected CGPDFPage() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetDocument")
    public static native CGPDFDocument getDocument(CGPDFPage page);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetPageNumber")
    public static native @MachineSizedUInt long getPageNumber(CGPDFPage page);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetBoxRect")
    public static native CGRect getBoxRect(CGPDFPage page, @Representing("CGPDFBox") long box);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetRotationAngle")
    public static native int getRotationAngle(CGPDFPage page);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetDrawingTransform")
    public static native CGAffineTransform getDrawingTransform(CGPDFPage page, @Representing("CGPDFBox") long box, CGRect rect, int rotate, boolean preserveAspectRatio);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFPageGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();

}

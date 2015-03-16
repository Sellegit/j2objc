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
public class CGPDFBoxOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextMediaBox")
    protected static native CFString MediaBoxKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextCropBox")
    protected static native CFString CropBoxKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextBleedBox")
    protected static native CFString BleedBoxKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextTrimBox")
    protected static native CFString TrimBoxKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextArtBox")
    protected static native CFString ArtBoxKey();
    
}

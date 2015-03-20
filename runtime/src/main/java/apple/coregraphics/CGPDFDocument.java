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
@Mapping("CGPDFDocumentRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGPDFDocument 
    extends CFType 
     {

    
    
    protected CGPDFDocument() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentCreateWithProvider")
    public static native CGPDFDocument createWithProvider(CGDataProvider provider);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentCreateWithURL")
    public static native CGPDFDocument createWithURL(CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetVersion")
    public static native void getVersion(CGPDFDocument document, Todo majorVersion, Todo minorVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentIsEncrypted")
    public static native boolean isEncrypted(CGPDFDocument document);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentUnlockWithPassword")
    public static native boolean unlockWithPassword(CGPDFDocument document, Todo password);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentIsUnlocked")
    public static native boolean isUnlocked(CGPDFDocument document);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentAllowsPrinting")
    public static native boolean allowsPrinting(CGPDFDocument document);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentAllowsCopying")
    public static native boolean allowsCopying(CGPDFDocument document);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetNumberOfPages")
    public static native @MachineSizedUInt long getNumberOfPages(CGPDFDocument document);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetPage")
    public static native CGPDFPage getPage(CGPDFDocument document, @MachineSizedUInt long pageNumber);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    
}

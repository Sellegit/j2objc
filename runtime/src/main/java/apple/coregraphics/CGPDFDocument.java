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
    public static native CGPDFDocument createWithURL(NSURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetVersion")
    protected native void getVersion(Todo majorVersion, Todo minorVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentIsEncrypted")
    public native boolean isEncrypted();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentUnlockWithPassword")
    public native boolean unlockWithPassword(Todo password);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentIsUnlocked")
    public native boolean isUnlocked();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentAllowsPrinting")
    public native boolean allowsPrinting();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentAllowsCopying")
    public native boolean allowsCopying();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetNumberOfPages")
    public native @MachineSizedUInt long getNumberOfPages();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetPage")
    public native CGPDFPage getPage(@MachineSizedUInt long pageNumber);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPDFDocumentGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    
}

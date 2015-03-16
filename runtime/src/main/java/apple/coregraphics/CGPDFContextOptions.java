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
public class CGPDFContextOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextTitle")
    protected static native CFString TitleKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAuthor")
    protected static native CFString AuthorKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextSubject")
    protected static native CFString SubjectKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextKeywords")
    protected static native CFString KeywordsKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextCreator")
    protected static native CFString CreatorKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextOwnerPassword")
    protected static native CFString OwnerPasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextUserPassword")
    protected static native CFString UserPasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextEncryptionKeyLength")
    protected static native CFString EncryptionKeyLengthKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAllowsPrinting")
    protected static native CFString AllowsPrintingKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAllowsCopying")
    protected static native CFString AllowsCopyingKey();
    
}

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
    public static native CFString TitleKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAuthor")
    public static native CFString AuthorKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextSubject")
    public static native CFString SubjectKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextKeywords")
    public static native CFString KeywordsKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextCreator")
    public static native CFString CreatorKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextOwnerPassword")
    public static native CFString OwnerPasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextUserPassword")
    public static native CFString UserPasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextEncryptionKeyLength")
    public static native CFString EncryptionKeyLengthKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAllowsPrinting")
    public static native CFString AllowsPrintingKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGPDFContextAllowsCopying")
    public static native CFString AllowsCopyingKey();

}

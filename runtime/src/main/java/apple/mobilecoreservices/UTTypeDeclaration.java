package apple.mobilecoreservices;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("MobileCoreServices/MobileCoreServices.h")
public class UTTypeDeclaration 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTExportedTypeDeclarationsKey")
    public static native NSString ExportedTypeDeclarationsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTImportedTypeDeclarationsKey")
    public static native NSString ImportedTypeDeclarationsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeIdentifierKey")
    public static native NSString TypeIdentifierKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeTagSpecificationKey")
    public static native NSString TypeTagSpecificationKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeConformsToKey")
    public static native NSString TypeConformsToKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeDescriptionKey")
    public static native NSString TypeDescriptionKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeIconFileKey")
    public static native NSString TypeIconFileKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeReferenceURLKey")
    public static native NSString TypeReferenceURLKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeVersionKey")
    public static native NSString TypeVersionKey();

}

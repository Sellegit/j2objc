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
@Library("MobileCoreServices")
public class UTTypeDeclaration 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTExportedTypeDeclarationsKey")
    protected static native NSString ExportedTypeDeclarationsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTImportedTypeDeclarationsKey")
    protected static native NSString ImportedTypeDeclarationsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeIdentifierKey")
    protected static native NSString TypeIdentifierKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeTagSpecificationKey")
    protected static native NSString TypeTagSpecificationKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeConformsToKey")
    protected static native NSString TypeConformsToKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeDescriptionKey")
    protected static native NSString TypeDescriptionKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeIconFileKey")
    protected static native NSString TypeIconFileKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeReferenceURLKey")
    protected static native NSString TypeReferenceURLKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTypeVersionKey")
    protected static native NSString TypeVersionKey();
    
}

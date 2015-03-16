package apple.passkit;


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
import apple.addressbook.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("PassKit/PassKit.h")
public class PKRemovedPassInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibraryPassTypeIdentifierUserInfoKey")
    protected static native NSString PassTypeIdentifierKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibrarySerialNumberUserInfoKey")
    protected static native NSString SerialNumberKey();
    
}

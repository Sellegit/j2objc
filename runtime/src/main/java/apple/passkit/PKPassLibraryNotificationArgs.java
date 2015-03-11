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
@Library("PassKit")
public class PKPassLibraryNotificationArgs 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibraryAddedPassesUserInfoKey")
    protected static native NSString AddedPassesKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibraryReplacementPassesUserInfoKey")
    protected static native NSString ReplacementPassesKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibraryRemovedPassInfosUserInfoKey")
    protected static native NSString RemovedPassInfosKey();
    
}

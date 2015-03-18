package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSMetadataQueryUpdatedItems 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataQueryUpdateAddedItemsKey")
    public static native NSString UpdateAddedItemsKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataQueryUpdateChangedItemsKey")
    public static native NSString UpdateChangedItemsKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataQueryUpdateRemovedItemsKey")
    public static native NSString UpdateRemovedItemsKey();
    
}

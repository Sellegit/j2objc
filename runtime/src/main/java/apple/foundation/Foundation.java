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
@Library("Foundation")
public class Foundation 
    extends Object 
     {

    
    public static final long PropertyListImmutable = 0L;
    public static final long PropertyListMutableContainers = 1L;
    public static final long PropertyListMutableContainersAndLeaves = 2L;
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeURLKey")
    protected static native NSString VolumeURLValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIdentifierKey")
    protected static native NSString VolumeIdentifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeKey")
    protected static native NSString FileResourceTypeValue();
    
}

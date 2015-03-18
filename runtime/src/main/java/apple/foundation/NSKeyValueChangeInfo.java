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
public class NSKeyValueChangeInfo 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSKeyValueChangeKindKey")
    public static native NSString KindKey();
    @GlobalConstant("NSKeyValueChangeNewKey")
    public static native NSString NewKey();
    @GlobalConstant("NSKeyValueChangeOldKey")
    public static native NSString OldKey();
    @GlobalConstant("NSKeyValueChangeIndexesKey")
    public static native NSString IndexesKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSKeyValueChangeNotificationIsPriorKey")
    public static native NSString NotificationIsPriorKey();
    
}

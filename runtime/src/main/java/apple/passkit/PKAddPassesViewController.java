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



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("PassKit/PassKit.h") @Mapping("PKAddPassesViewController")
public class PKAddPassesViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithPass:")
    public PKAddPassesViewController(Object pass) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithPasses:")
    public PKAddPassesViewController(NSArray<?> passes) { }
    @Mapping("initWithNibName:bundle:")
    public PKAddPassesViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public PKAddPassesViewController() { }
    
    
    @Mapping("delegate")
    public native PKAddPassesViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(PKAddPassesViewControllerDelegate v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canAddPasses")
    public static native boolean canAddPasses();
    
}

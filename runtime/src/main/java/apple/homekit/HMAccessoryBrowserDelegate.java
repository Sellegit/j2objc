package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HomeKit/HomeKit.h") @Mapping("HMAccessoryBrowserDelegate")
public interface HMAccessoryBrowserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("accessoryBrowser:didFindNewAccessory:")
    void didFindNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory);
    @Mapping("accessoryBrowser:didRemoveNewAccessory:")
    void didRemoveNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory);
    
    /*<adapter>*/
    /*</adapter>*/
}

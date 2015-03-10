package apple.externalaccessory;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class EAWiFiUnconfiguredAccessoryBrowserDelegateAdapter 
    extends Object 
    implements EAWiFiUnconfiguredAccessoryBrowserDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessoryBrowser:didUpdateState:")
    public void didUpdateState(EAWiFiUnconfiguredAccessoryBrowser browser, @Representing("EAWiFiUnconfiguredAccessoryBrowserState") @MachineSizedSInt long state) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessoryBrowser:didFindUnconfiguredAccessories:")
    public void didFindUnconfiguredAccessories(EAWiFiUnconfiguredAccessoryBrowser browser, NSSet<EAWiFiUnconfiguredAccessory> accessories) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessoryBrowser:didRemoveUnconfiguredAccessories:")
    public void didRemoveUnconfiguredAccessories(EAWiFiUnconfiguredAccessoryBrowser browser, NSSet<EAWiFiUnconfiguredAccessory> accessories) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessoryBrowser:didFinishConfiguringAccessory:withStatus:")
    public void didFinishConfiguringAccessory(EAWiFiUnconfiguredAccessoryBrowser browser, EAWiFiUnconfiguredAccessory accessory, @Representing("EAWiFiUnconfiguredAccessoryConfigurationStatus") @MachineSizedSInt long status) { throw new UnsupportedOperationException(); }
    
}

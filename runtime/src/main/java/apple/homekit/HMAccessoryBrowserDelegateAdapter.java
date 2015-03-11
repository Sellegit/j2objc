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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class HMAccessoryBrowserDelegateAdapter 
    extends Object 
    implements HMAccessoryBrowserDelegate {

    
    
    
    
    
    
    
    @NotImplemented("accessoryBrowser:didFindNewAccessory:")
    public void didFindNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessoryBrowser:didRemoveNewAccessory:")
    public void didRemoveNewAccessory(HMAccessoryBrowser browser, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    
}

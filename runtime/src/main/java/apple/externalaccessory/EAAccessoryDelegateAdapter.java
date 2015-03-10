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

public abstract class EAAccessoryDelegateAdapter 
    extends Object 
    implements EAAccessoryDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("accessoryDidDisconnect:")
    public void didDisconnect(EAAccessory accessory) { throw new UnsupportedOperationException(); }
    
}

package apple.storekit;


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
import apple.accounts.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class SKRequestDelegateAdapter 
    extends Object 
    implements SKRequestDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("requestDidFinish:")
    public void didFinish(SKRequest request) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("request:didFailWithError:")
    public void didFail(SKRequest request, NSError error) { throw new UnsupportedOperationException(); }
    
}

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

public abstract class HMHomeManagerDelegateAdapter 
    extends Object 
    implements HMHomeManagerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("homeManagerDidUpdateHomes:")
    public void didUpdateHomes(HMHomeManager manager) { throw new UnsupportedOperationException(); }
    @NotImplemented("homeManagerDidUpdatePrimaryHome:")
    public void didUpdatePrimaryHome(HMHomeManager manager) { throw new UnsupportedOperationException(); }
    @NotImplemented("homeManager:didAddHome:")
    public void didAddHome(HMHomeManager manager, HMHome home) { throw new UnsupportedOperationException(); }
    @NotImplemented("homeManager:didRemoveHome:")
    public void didRemoveHome(HMHomeManager manager, HMHome home) { throw new UnsupportedOperationException(); }
    
}

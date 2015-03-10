package apple.metal;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class MTLResourceAdapter 
    extends Object 
    implements MTLResource {

    
    
    
    @NotImplemented("label")
    public String getLabel() { throw new UnsupportedOperationException(); }
    public void setLabel(String v) { throw new UnsupportedOperationException(); }
    @NotImplemented("device")
    public MTLDevice getDevice() { throw new UnsupportedOperationException(); }
    @NotImplemented("cpuCacheMode")
    public @Representing("MTLCPUCacheMode") @MachineSizedUInt long getCpuCacheMode() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("setPurgeableState:")
    public @Representing("MTLPurgeableState") @MachineSizedUInt long setPurgeableState(@Representing("MTLPurgeableState") @MachineSizedUInt long state) { throw new UnsupportedOperationException(); }
    
}

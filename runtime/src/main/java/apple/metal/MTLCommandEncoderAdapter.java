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

public abstract class MTLCommandEncoderAdapter 
    extends Object 
    implements MTLCommandEncoder {

    
    
    
    @NotImplemented("device")
    public MTLDevice getDevice() { throw new UnsupportedOperationException(); }
    @NotImplemented("label")
    public String getLabel() { throw new UnsupportedOperationException(); }
    public void setLabel(String v) { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("endEncoding")
    public void endEncoding() { throw new UnsupportedOperationException(); }
    @NotImplemented("insertDebugSignpost:")
    public void insertDebugSignpost(String string) { throw new UnsupportedOperationException(); }
    @NotImplemented("pushDebugGroup:")
    public void pushDebugGroup(String string) { throw new UnsupportedOperationException(); }
    @NotImplemented("popDebugGroup")
    public void popDebugGroup() { throw new UnsupportedOperationException(); }
    
}

package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class CALayerDelegateAdapter 
    extends Object 
    implements CALayerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("displayLayer:")
    public void displayLayer(CALayer layer) { throw new UnsupportedOperationException(); }
    @NotImplemented("drawLayer:inContext:")
    public void drawLayer(CALayer layer, CGContext ctx) { throw new UnsupportedOperationException(); }
    @NotImplemented("layoutSublayersOfLayer:")
    public void layoutSublayers(CALayer layer) { throw new UnsupportedOperationException(); }
    @NotImplemented("actionForLayer:forKey:")
    public CAAction getAction(CALayer layer, String event) { throw new UnsupportedOperationException(); }
    
}

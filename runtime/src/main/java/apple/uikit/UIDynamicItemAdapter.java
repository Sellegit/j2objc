package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIDynamicItemAdapter 
    extends Object 
    implements UIDynamicItem {

    
    
    
    @NotImplemented("center")
    public CGPoint getCenter() { throw new UnsupportedOperationException(); }
    @Mapping("setCenter:")
    public void setCenter(CGPoint v) { throw new UnsupportedOperationException(); }
    @NotImplemented("bounds")
    public CGRect getBounds() { throw new UnsupportedOperationException(); }
    @NotImplemented("transform")
    public CGAffineTransform getTransform() { throw new UnsupportedOperationException(); }
    @Mapping("setTransform:")
    public void setTransform(CGAffineTransform v) { throw new UnsupportedOperationException(); }

    
    


}

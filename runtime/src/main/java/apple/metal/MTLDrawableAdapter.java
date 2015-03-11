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
@Adapter
public abstract class MTLDrawableAdapter 
    extends Object 
    implements MTLDrawable {

    
    
    
    
    
    
    
    @NotImplemented("present")
    public void present() { throw new UnsupportedOperationException(); }
    @NotImplemented("presentAtTime:")
    public void presentAtTime(double presentationTime) { throw new UnsupportedOperationException(); }
    
}

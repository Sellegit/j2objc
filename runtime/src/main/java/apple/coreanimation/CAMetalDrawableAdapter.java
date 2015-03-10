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
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class CAMetalDrawableAdapter 
    extends MTLDrawableAdapter 
    implements CAMetalDrawable {

    
    
    
    @NotImplemented("texture")
    public MTLTexture getTexture() { throw new UnsupportedOperationException(); }
    @NotImplemented("layer")
    public CAMetalLayer getLayer() { throw new UnsupportedOperationException(); }
    
    
    
    
    
}

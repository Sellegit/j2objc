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
public abstract class UITextDocumentProxyAdapter 
    extends UIKeyInputAdapter 
    implements UITextDocumentProxy {

    
    
    
    @NotImplemented("documentContextBeforeInput")
    public String getDocumentContextBeforeInput() { throw new UnsupportedOperationException(); }
    @NotImplemented("documentContextAfterInput")
    public String getDocumentContextAfterInput() { throw new UnsupportedOperationException(); }

    
    
    @NotImplemented("adjustTextPositionByCharacterOffset:")
    public void adjustTextPosition(@MachineSizedSInt long offset) { throw new UnsupportedOperationException(); }

}

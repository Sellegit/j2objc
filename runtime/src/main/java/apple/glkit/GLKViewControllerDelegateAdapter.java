package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class GLKViewControllerDelegateAdapter 
    extends Object 
    implements GLKViewControllerDelegate {

    
    
    


    
    
    @NotImplemented("glkViewControllerUpdate:")
    public void update(GLKViewController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("glkViewController:willPause:")
    public void willPause(GLKViewController controller, boolean pause) { throw new UnsupportedOperationException(); }

}

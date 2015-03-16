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





@Library("GLKit/GLKit.h") @Mapping("GLKViewControllerDelegate")
public interface GLKViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("glkViewControllerUpdate:")
    void update(GLKViewController controller);
    @Mapping("glkViewController:willPause:")
    void willPause(GLKViewController controller, boolean pause);
    
    /*<adapter>*/
    /*</adapter>*/
}

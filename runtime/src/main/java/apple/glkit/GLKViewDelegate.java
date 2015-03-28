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


@Library("GLKit/GLKit.h") @Mapping("GLKViewDelegate")
public interface GLKViewDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("glkView:drawInRect:")
    void draw(GLKView view, CGRect rect);

    /*<adapter>*/
    /*</adapter>*/
}

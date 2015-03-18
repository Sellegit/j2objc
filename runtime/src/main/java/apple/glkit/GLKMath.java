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
@Library("GLKit/GLKit.h")
public class GLKMath 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("GLKMathProject")
    public static native GLKVector3 project(GLKVector3 object, GLKMatrix4 model, GLKMatrix4 projection, Todo viewport);
    @GlobalFunction("GLKMathUnproject")
    public static native GLKVector3 unproject(GLKVector3 window, GLKMatrix4 model, GLKMatrix4 projection, Todo viewport, Todo success);
    
}

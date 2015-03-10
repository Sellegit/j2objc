package apple.opengles;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("OpenGLES")
public class OpenGLES 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("EAGLGetVersion")
    private static native void getVersion(Todo major, Todo minor);
    
}

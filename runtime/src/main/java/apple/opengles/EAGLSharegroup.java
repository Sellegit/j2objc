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





@Library("OpenGLES/EAGL.h") @Mapping("EAGLSharegroup")
public class EAGLSharegroup 
    extends NSObject 
     {

    
    
    public EAGLSharegroup() {}
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("debugLabel")
    public native String getDebugLabel();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setDebugLabel:")
    public native void setDebugLabel(String v);
    
    
    
    
    
}

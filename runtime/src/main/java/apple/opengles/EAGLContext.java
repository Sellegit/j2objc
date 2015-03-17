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





@Library("OpenGLES/EAGL.h") @Mapping("EAGLContext")
public class EAGLContext 
    extends NSObject 
     {

    
    
    public EAGLContext() {}
    @Mapping("initWithAPI:")
    public EAGLContext(@Representing("EAGLRenderingAPI") @MachineSizedUInt long api) { }
    @Mapping("initWithAPI:sharegroup:")
    public EAGLContext(@Representing("EAGLRenderingAPI") @MachineSizedUInt long api, EAGLSharegroup sharegroup) { }
    
    
    @Mapping("API")
    public native @Representing("EAGLRenderingAPI") @MachineSizedUInt long getAPI();
    @Mapping("sharegroup")
    public native EAGLSharegroup getSharegroup();
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
    /**
     * @since Available in iOS 7.1 and later.
     */
    @Mapping("isMultiThreaded")
    public native boolean isMultiThreaded();
    /**
     * @since Available in iOS 7.1 and later.
     */
    @Mapping("setMultiThreaded:")
    public native void setMultiThreaded(boolean v);
    
    
    
    @Mapping("setCurrentContext:")
    public static native boolean setCurrentContext(EAGLContext context);
    @Mapping("currentContext")
    public static native EAGLContext getCurrentContext();
    @Mapping("renderbufferStorage:fromDrawable:")
    public native boolean renderbufferStorage(@MachineSizedUInt long target, EAGLDrawable drawable);
    @Mapping("presentRenderbuffer:")
    public native boolean presentRenderbuffer(@MachineSizedUInt long target);
    
}
